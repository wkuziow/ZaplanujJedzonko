package pl.coderslab.dietPlanner.web;

import pl.coderslab.dietPlanner.dao.RecipeDao;
import pl.coderslab.dietPlanner.model.Recipe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Recipes", urlPatterns = "/recipes")
public class Recipes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession sess = request.getSession();
        RecipeDao recipeDao = new RecipeDao();
        //List<Recipe> recipeAllList = recipeDao.findAll();

        //request.setAttribute("recipeAllList", recipeAllList);
        getServletContext().getRequestDispatcher("/recipes.jsp").forward(request, response);

    }
}
