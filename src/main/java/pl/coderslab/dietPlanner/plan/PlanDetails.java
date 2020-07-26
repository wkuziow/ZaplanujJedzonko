package pl.coderslab.dietPlanner.plan;

import pl.coderslab.dietPlanner.recipe.Recipe;
import pl.coderslab.dietPlanner.utils.DayName;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class PlanDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private DayName dayName;

    @Size(max = 50, message = "Maksymalna wielkość pola to 50 znaków")
    private String mealName;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Recipe> recipeName;

    private MealType mealType;
}
