package pl.coderslab.dietPlanner.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.dietPlanner.user.CurrentUser;
import pl.coderslab.dietPlanner.utils.Utils;

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
    @ModelAttribute("currentUserFullName")
    public String currentUser(@AuthenticationPrincipal CurrentUser customUser) {
        return utils.currentUser(customUser);
    }
}
