package pl.coderslab.dietPlanner.web;

import pl.coderslab.dietPlanner.dao.AdminDao;
import pl.coderslab.dietPlanner.dao.PlanDao;
import pl.coderslab.dietPlanner.dao.RecipeDao;
import pl.coderslab.dietPlanner.model.Admin;
import pl.coderslab.dietPlanner.model.Plan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AppSchedules", urlPatterns = "/app/schedules")
public class AppSchedules extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        Admin admin  = (Admin) sess.getAttribute("loged");
        AdminDao adminDao = new AdminDao();
//        int adminId = adminDao.readEmail(admin.getEmail()).getId();
//        PlanDao planDao = new PlanDao();
//
//        List<Plan> planList = planDao.readAdminId(adminId);
  //      request.setAttribute("planList", planList);

        getServletContext().getRequestDispatcher("/app-schedule.jsp").forward(request, response);
    }
}
