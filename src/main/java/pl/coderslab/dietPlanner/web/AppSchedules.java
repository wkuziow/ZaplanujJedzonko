//package pl.coderslab.dietPlanner.web;
//
//
//import pl.coderslab.dietPlanner.user.User;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebServlet(name = "AppSchedules", urlPatterns = "/app/schedules")
//public class AppSchedules extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession sess = request.getSession();
//        User user = (User) sess.getAttribute("loged");
//      //  AdminDao adminDao = new AdminDao();
////        int adminId = adminDao.readEmail(user.getEmail()).getId();
////        PlanDao planDao = new PlanDao();
////
////        List<Plan> planList = planDao.readAdminId(adminId);
//  //      request.setAttribute("planList", planList);
//
//        getServletContext().getRequestDispatcher("/app-schedule.jsp").forward(request, response);
//    }
//}
