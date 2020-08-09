package pl.coderslab.dietPlanner.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    int countAllByUserId(long userId);

    Recipe findRecipeById(long recipeId);
}
