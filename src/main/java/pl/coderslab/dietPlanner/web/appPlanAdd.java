//package pl.coderslab.dietPlanner.web;
//
//
//import pl.coderslab.dietPlanner.user.User;
//import pl.coderslab.dietPlanner.plan.Plan;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//@WebServlet(name = "appPlanAdd", urlPatterns = "/app/plan/add")
//public class appPlanAdd extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession sess = request.getSession();
//        User user = (User) sess.getAttribute("loged");
//     //   AdminDao adminDao = new AdminDao();
//    //    int adminId = adminDao.readEmail(user.getEmail()).getId();
//        String name = request.getParameter("name");
//        String description = request.getParameter("description");
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        String created = dtf.format(now);
//        Plan plan = new Plan();
//    ////    PlanDao planDao = new PlanDao();
//        plan.setName(name);
//        plan.setDescription(description);
//    //    plan.setCreated(created);
//      //  plan.setAdminId(adminId);
//     //   planDao.create(plan);
//        response.sendRedirect("/app/schedules");
//
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/appPlanAdd.jsp").forward(request, response);
//    }
//}
