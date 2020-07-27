package pl.coderslab.dietPlanner.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.dietPlanner.plan.PlanRepository;
import pl.coderslab.dietPlanner.recipe.RecipeRepository;
import pl.coderslab.dietPlanner.user.CurrentUser;
import pl.coderslab.dietPlanner.user.User;

@Service
public class HomeService {

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    PlanRepository planRepository;

    public int recipeCount(CurrentUser user) {
        return recipeRepository.countAllByUserId(user.getUser().getId());
    }

    public int plantCount(CurrentUser user) {
        return planRepository.countAllByUserId(user.getUser().getId());
    }
}
