//package pl.coderslab.dietPlanner.web;
//
//import pl.coderslab.dietPlanner.dao.BookDao;
//import pl.coderslab.dietPlanner.model.Book;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
///**
// * Do not change servlet address !!!
// */
//@WebServlet(name = "")
//public class HomeServlet extends HttpServlet {
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        BookDao bookDao = new BookDao();
//        List<Book> books = bookDao.findAll();
//        System.out.println(books);
//
//        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
//    }
//}
