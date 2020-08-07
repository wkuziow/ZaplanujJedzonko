package pl.coderslab.dietPlanner.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.dietPlanner.user.CurrentUser;

import java.time.LocalDate;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public void saveRecipe(Recipe recipe, CurrentUser user){
        recipe.setUser(user.getUser());
         recipeRepository.save(recipe);

    }
}
