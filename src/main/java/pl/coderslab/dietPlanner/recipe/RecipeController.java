package pl.coderslab.dietPlanner.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RecipeController {
    @Autowired
    RecipeRepository recipeRepository;

    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    public String recipeListGet(Model model) {
        model.addAttribute("recipeList", recipeRepository.findAll());
        return "home/recipes";
    }
}
