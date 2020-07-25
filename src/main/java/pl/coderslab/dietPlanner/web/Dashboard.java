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
//@WebServlet(name = "Dashboard", urlPatterns = "/app/home")
//public class Dashboard extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        HttpSession session = request.getSession();
//        User user = (User) session.getAttribute("loged");
//      //  RecipeDao recipeDao = new RecipeDao();
//     //   PlanDao planDao = new PlanDao();
////        request.setAttribute("recipeCount", recipeDao.recipeCount(user.getId()));
////        request.setAttribute("planCount", planDao.planCount(user.getId()));
////        if (planDao.getNewestPlanByAdminId(user.getId()).isEmpty()){
////            System.out.println("błąd");
////        } else {
////            request.setAttribute("display", "okToDisplay");
////            request.setAttribute("newestPlan", planDao.getNewestPlanByAdminId(user.getId()));
////            request.setAttribute("newestPlanName", planDao.getNewestPlanByAdminId(user.getId()).get(0).getPlanName());
////        }
////        for (int i = 0; i < planDao.getNewestPlanByAdminId(user.getId()).size(); i++) {
////            System.out.println(planDao.getNewestPlanByAdminId(user.getId()).get(i));
////        }
//
//
//
//        getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
//
//    }
//}
