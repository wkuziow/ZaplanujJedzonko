package pl.coderslab.web;

import pl.coderslab.dao.AdminDao;
import pl.coderslab.model.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Registration", urlPatterns = "/register")
public class Registration extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");


//        request.getParameter("name");
//        request.getParameter("surname");
//        request.getParameter("email");
//        request.getParameter("password");
//        request.getParameter("repassword");


        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        PrintWriter writer = response.getWriter();
        //response.getWriter().append(name + " " + surname + " " +  email + " " + password + " " + repassword);
        AdminDao adminDao = new AdminDao();
        Admin admin = new Admin();
        admin.setFirstName(name);
        admin.setLastName(surname);
        admin.setEmail(email);
        admin.setPassword(password);
        admin.setSuperAdmin(0);
        admin.setEnable(true);
        if (adminDao.readEmail(email).getEmail() == null) {
            adminDao.create(admin);
            response.sendRedirect("/login");
        }
//        else if (adminDao.readEmail(email).getEmail() != null) {
//            request.setAttribute("user", 1);
//            getServletContext().getRequestDispatcher("/WEB-INF/view/registration.jsp")
//                    .forward(request, response);
//        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/registration.jsp").forward(request, response);
    }
}
