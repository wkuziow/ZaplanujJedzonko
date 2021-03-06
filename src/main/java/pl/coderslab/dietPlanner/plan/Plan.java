package pl.coderslab.dietPlanner.plan;


import pl.coderslab.dietPlanner.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "To pole nie może być puste")
    @Size(min = 3, max = 50, message = "Minimalna wielkość pola to 3, maksymalna 50 znaków")
    private String name;

    @Size(max = 200, message = "Maksymalna wielkość pola to 200 znaków")
    private String description;

    private LocalDate created;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<PlanItem> planItem;

    public Plan() {
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PlanItem> getPlanDetails() {
        return planItem;
    }

    public void setPlanDetails(List<PlanItem> planDetails) {
        this.planItem = planDetails;
    }
}
