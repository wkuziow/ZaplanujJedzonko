package pl.coderslab.web;

import pl.coderslab.dao.AdminDao;
import pl.coderslab.model.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "Login", urlPatterns = "/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Admin admin = new Admin();
        AdminDao adao = new AdminDao();
//        String emailDao = AdminDao.login(admin);

//        if (email.equals(USER) && password.equals(PASSWORD)) {
//            // dodaj dane do sesji pod kluczem: username
//            // przekieruj na adres /admin
//            HttpSession session = request.getSession();
//            session.setAttribute("username", user);
//            session.setAttribute( "login", user);
//            response.sendRedirect(request.getContextPath() + "/admin");
//        } else {
//            request.setAttribute( "massage", "Wpisane login, lub hasło są niepoprawne, spróbuj ponownie");
//            getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
//        }


        PrintWriter writer = response.getWriter();
        response.getWriter().append(email + " " + password);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
