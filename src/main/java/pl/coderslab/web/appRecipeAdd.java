package pl.coderslab.web;

import pl.coderslab.dao.AdminDao;
import pl.coderslab.dao.RecipeDao;
import pl.coderslab.model.Admin;
import pl.coderslab.model.Recipe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "appRecipeAdd", urlPatterns = "/app/recipe/add")
public class appRecipeAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        Admin admin  = (Admin) sess.getAttribute("loged");
        AdminDao adminDao = new AdminDao();
        String name = request.getParameter("name");
        String ingredients = request.getParameter("ingredients");
        String description = request.getParameter("description");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String created = dtf.format(now);
        int preparationTime = Integer.parseInt(request.getParameter("preparationTime"));
        String preparation = request.getParameter("preparation");
        int adminId = adminDao.readEmail(admin.getEmail()).getId();
        Recipe recipe = new Recipe();
        recipe.setName(name);
        recipe.setIngredients(ingredients);
        recipe.setDescription(description);
        recipe.setCreated(created);
        recipe.setUpdated(created);
        recipe.setPreparationTime(preparationTime);
        recipe.setPreparation(preparation);
        recipe.setAdminId(adminId);
        RecipeDao recipeDao = new RecipeDao();

        recipeDao.create(recipe);
        response.sendRedirect("/app/recipe/list");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/appRecipeAdd.jsp").forward(request, response);
    }
}
