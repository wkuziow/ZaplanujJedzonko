package pl.coderslab.dietPlanner.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "To pole nie może być puste")
    @Size(min = 3, max = 50, message = "Minimalna wielkość pola to 3, maksymalna 50 znaków")
    private String firstName;

    @NotNull(message = "To pole nie może być puste")
    @Size(min = 3, max = 50, message = "Minimalna wielkość pola to 3, maksymalna 50 znaków")
    private String lastName;

    @NotNull(message = "To pole nie może być puste")
    @Size(min = 3, max = 50, message = "Minimalna wielkość pola to 3, maksymalna 50 znaków")
    private String email;

    @NotNull(message = "To pole nie może być puste")
    @Size(min = 3, max = 100, message = "Minimalna wielkość pola to 3 znaki")
    private String password;

    @Transient
    private String confirmPassword;

    private Role role;

    private boolean enable;

    public User() {
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getFullname() {
        return firstName + " " + lastName;
    }
}

