package pl.coderslab.dietPlanner.plan;

import pl.coderslab.dietPlanner.recipe.Recipe;
import pl.coderslab.dietPlanner.utils.DayName;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class PlanItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private DayName dayName;

    @Size(max = 50, message = "Maksymalna wielkość pola to 50 znaków")
    private String mealName;

    @ManyToOne(fetch = FetchType.EAGER)
    private Recipe recipeName;

    private MealType mealType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DayName getDayName() {
        return dayName;
    }

    public void setDayName(DayName dayName) {
        this.dayName = dayName;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public Recipe getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(Recipe recipeName) {
        this.recipeName = recipeName;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }
}
