package pl.coderslab.web;

import pl.coderslab.dao.AdminDao;
import pl.coderslab.dao.RecipeDao;
import pl.coderslab.model.Recipe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

@WebServlet(name = "AppRecipeList", urlPatterns = "/app/recipe/list/")
public class AppRecipeList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        String username = (String) sess.getAttribute("username");
        AdminDao adminDao = new AdminDao();
        int adminId = adminDao.readEmail(username).getId();

        RecipeDao recipeDao = new RecipeDao();

        List<Recipe> recipeList = recipeDao.readAdminId(adminId);
        for (int i = 0; i < recipeList.size(); i++) {
            System.out.println(recipeList.get(i).getId() + " " + recipeList.get(i).getName() + " " +
                    recipeList.get(i).getDescription());
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
