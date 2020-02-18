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
        HttpSession session = request.getSession();
        AdminDao adminDao = new AdminDao();
        admin = adminDao.authentication(email, password);

        if (admin == null) {
            response.sendRedirect("/login");
        } else {
            session.setAttribute("loged", admin);
            response.sendRedirect("/app-home");
        }
    }

//        AdminDao adao = new AdminDao();
//        String emailDao = admin.getEmail();
//        String passwordDao = admin.getPassword();
//
//        if (email.equals(emailDao) && password.equals(passwordDao)) {
//            HttpSession session = request.getSession();
//            session.setAttribute("username", email);
//            response.sendRedirect("/login");
//        } else {
//            request.setAttribute("massage", "Wpisane login, lub hasło są niepoprawne, spróbuj ponownie");
//            getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
//        }
//        PrintWriter writer = response.getWriter();
//        response.getWriter().append(email + " " + password);

//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
