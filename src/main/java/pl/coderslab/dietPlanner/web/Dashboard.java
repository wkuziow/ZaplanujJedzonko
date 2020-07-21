package pl.coderslab.dietPlanner.web;

import pl.coderslab.dietPlanner.dao.PlanDao;
import pl.coderslab.dietPlanner.dao.RecipeDao;
import pl.coderslab.dietPlanner.model.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Dashboard", urlPatterns = "/app/home")
public class Dashboard extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Admin admin = (Admin) session.getAttribute("loged");
        RecipeDao recipeDao = new RecipeDao();
        PlanDao planDao = new PlanDao();
//        request.setAttribute("recipeCount", recipeDao.recipeCount(admin.getId()));
//        request.setAttribute("planCount", planDao.planCount(admin.getId()));
//        if (planDao.getNewestPlanByAdminId(admin.getId()).isEmpty()){
//            System.out.println("błąd");
//        } else {
//            request.setAttribute("display", "okToDisplay");
//            request.setAttribute("newestPlan", planDao.getNewestPlanByAdminId(admin.getId()));
//            request.setAttribute("newestPlanName", planDao.getNewestPlanByAdminId(admin.getId()).get(0).getPlanName());
//        }
//        for (int i = 0; i < planDao.getNewestPlanByAdminId(admin.getId()).size(); i++) {
//            System.out.println(planDao.getNewestPlanByAdminId(admin.getId()).get(i));
//        }



        getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);

    }
}
