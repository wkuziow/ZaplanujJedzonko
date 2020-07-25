package pl.coderslab.dietPlanner.recipe;

import pl.coderslab.dietPlanner.user.User;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "To pole nie może być puste")
    @Size(min = 3, max = 50, message = "Minimalna wielkość pola to 3, maksymalna 50 znaków")
    private String name;

    @NotNull(message = "To pole nie może być puste")
    @Size(min = 3, max = 500, message = "Minimalna wielkość pola to 3, maksymalna 500 znaków")
    private String ingredients;

    @Size(max = 1000, message = "Maksymalna wielkość pola to 1000 znaków")
    private String description;

    private LocalDate createdOn;

    private LocalDate updatedOn;

    @Max(value = 1000, message = "Maksymalny czas przygotowania to 1000 minut")
    private int preparationTime;

    @Size(max = 1000, message = "Maksymalna wielkość pola to 1000 znaków")
    private String preparationDescription;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @PrePersist
    public void prePersist() {
        createdOn = LocalDate.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedOn = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDate getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getPreparationDescription() {
        return preparationDescription;
    }

    public void setPreparationDescription(String preparationDescription) {
        this.preparationDescription = preparationDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Recipe() {
    }

}
