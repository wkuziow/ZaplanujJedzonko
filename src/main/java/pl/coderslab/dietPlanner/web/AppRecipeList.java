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
//@WebServlet(name = "AppRecipeList", urlPatterns = "/app/recipe/list")
//public class AppRecipeList extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//
//
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//
//        HttpSession sess = request.getSession();
//        User user = (User) sess.getAttribute("loged");
//
//     //   AdminDao adminDao = new AdminDao();
//     //   int adminId = adminDao.readEmail(user.getEmail()).getId();
//
//
//     //   RecipeDao recipeDao = new RecipeDao();
//
//     //   List<Recipe> recipeList = recipeDao.readAdminId(adminId);
//     //   request.setAttribute("recipeList", recipeList);
//
//
////        System.out.println(recipeList.size());
////
////        for (int i = 0; i < recipeList.size(); i++) {
////            System.out.println(recipeList.get(i).getId() + " " + recipeList.get(i).getName() + " " +
////                    recipeList.get(i).getDescription());
////        }
//
//
//        getServletContext().getRequestDispatcher("/appRecipeList.jsp").forward(request, response);
//
//
//    }
//}
