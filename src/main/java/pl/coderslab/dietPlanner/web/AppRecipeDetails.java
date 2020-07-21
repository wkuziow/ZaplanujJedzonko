package pl.coderslab.dietPlanner.web;

import pl.coderslab.dietPlanner.dao.RecipeDao;
import pl.coderslab.dietPlanner.model.Recipe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AppRecipeDetails", urlPatterns = "/app/recipe/details")
public class AppRecipeDetails extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int recipeId = Integer.parseInt(request.getParameter("id"));
        RecipeDao recipeDao = new RecipeDao();
    //    Recipe recipe = recipeDao.read(recipeId);
      //  request.setAttribute("recipeDet", recipe);
        getServletContext().getRequestDispatcher("/appRecipeDetails.jsp").forward(request, response);


    }
}
