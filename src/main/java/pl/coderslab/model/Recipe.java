package pl.coderslab.model;

public class Recipe {

    private int id;
    private String name;
    private String ingredients;
    private String description;
    private String created;
    private String updated;
    private int preparationTime;
    private int adminId;



    public Recipe(int id, String name, String ingredients, String description, String created, String updated, int preparationTime, int adminId) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.created = created;
        this.updated = updated;
        this.preparationTime = preparationTime;
        this.adminId = adminId;
    }

    public Recipe() {
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getIngredients() { return ingredients; }

    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getCreated() { return created; }

    public void setCreated(String created) { this.created = created; }

    public String getUpdated() { return updated; }

    public void setUpdated(String updated) { this.updated = updated; }

    public int getPreparationTime() { return preparationTime; }

    public void setPreparationTime(int preparationTime) { this.preparationTime = preparationTime; }

    public int getAdminId() { return adminId; }

    public void setAdminId(int adminId) { this.adminId = adminId; }




}
