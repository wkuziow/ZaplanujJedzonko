package pl.coderslab.dietPlanner.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.dietPlanner.user.CurrentUser;
import pl.coderslab.dietPlanner.utils.Utils;

import javax.servlet.http.HttpSession;

@Controller
public class RecipeController {
    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    private Utils utils;

    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    public String recipeListGet(Model model) {
        model.addAttribute("recipeList", recipeRepository.findAll());
        return "home/recipes";
    }

    @RequestMapping(value = "/recipes", method = RequestMethod.POST)
    public String recipeListPOst (@RequestParam Long recipeDetailId, HttpSession session) {
        session.setAttribute("recipeDetailId", recipeDetailId);
        return "redirect:/recipes/details";
    }


    @ModelAttribute("currentUserFullName")
    public String currentUser(@AuthenticationPrincipal CurrentUser customUser) {
        return utils.currentUser(customUser);
    }

    @RequestMapping(value = "/recipes/details", method = RequestMethod.GET)
    public String recipeDetailsGet(HttpSession session, Model model) {
        Long recipeDetailId = (Long) session.getAttribute("recipeDetailId");
        model.addAttribute("recipeDetails", recipeRepository.findRecipeById(recipeDetailId));
        session.removeAttribute("recipeDetailId");
        return "recipe/details";
    }

}
