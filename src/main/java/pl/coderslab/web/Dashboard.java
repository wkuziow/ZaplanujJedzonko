package pl.coderslab.web;

import pl.coderslab.dao.PlanDao;
import pl.coderslab.dao.RecipeDao;
import pl.coderslab.model.Admin;

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
        request.setAttribute("recipeCount", recipeDao.recipeCount(admin.getId()));
        request.setAttribute("planCount", planDao.planCount(admin.getId()));
        getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);

    }
}
