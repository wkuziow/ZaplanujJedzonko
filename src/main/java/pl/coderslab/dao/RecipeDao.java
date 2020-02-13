package pl.coderslab.dao;

import pl.coderslab.model.Recipe;
import pl.coderslab.utils.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecipeDao {

   private static final String CREATE_RECIPE_QUERY =
           "INSERT INTO recipe (name , ingredients, description, created, updated, preparation_time, admin_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
   private static final String READ_RECIPE_QUERY =
           "SELECT * FROM recipe WHERE id = ?";
   private static final String UPDATE_USER_QUERY =
           "UPDATE recipe SET name = ?, ingredients = ?, description = ?, created = ?, updated = ?, preparation_time = ?, admin_id = ? WHERE id = ? ";
   private static final String DELETE_RECIPE_QUERY =
           "DELETE FROM recipe WHERE id = ?";
   private static final String FIND_ALL_RECIPE_QUERY =
           "SELECT * FROM recipe";
   private static final String FIND_ALL_RECIPE_BY_ADMIN_ID_QUERY =
           "SELECT * FROM recipe WHERE admin_id = ?"; //to się chyba nam przyda później

   public Recipe create(Recipe recipe) throws SQLException {
      try (Connection connection = DbUtil.getConnection()) {
         PreparedStatement preparedStatement = connection.prepareStatement(CREATE_RECIPE_QUERY, Statement.RETURN_GENERATED_KEYS);
         preparedStatement.setString(1,recipe.getName());
         preparedStatement.setString(2,recipe.getIngredients());
         preparedStatement.setString(3,recipe.getDescription());
         preparedStatement.setString(4,recipe.getCreated());
         preparedStatement.setString(5,recipe.getUpdated());
         preparedStatement.setInt(6,recipe.getPreparationTime());
         preparedStatement.setInt(7,recipe.getAdminId());
         ResultSet resultSet = preparedStatement.getGeneratedKeys();
         if(resultSet.next()){
            recipe.setId(resultSet.getInt(1));
         }
         return recipe;
      }catch (SQLException e) {
         e.printStackTrace();
         return null;
      }
   }
   public Recipe read(int id){
      try (Connection connection = DbUtil.getConnection()){
         PreparedStatement preparedStatement = connection.prepareStatement(READ_RECIPE_QUERY);
         preparedStatement.setInt(1,id);
         ResultSet resultSet = preparedStatement.executeQuery();
         if (resultSet.next()){
            Recipe recipe = new Recipe();
            recipe.setId(resultSet.getInt("id"));
            recipe.setName(resultSet.getString("name"));
            recipe.setIngredients(resultSet.getString("ingredients"));
            recipe.setDescription(resultSet.getString("description"));
            recipe.setCreated(resultSet.getString("created"));
            recipe.setUpdated(resultSet.getString("updated"));
            recipe.setPreparationTime(resultSet.getInt("preparation_time"));
            recipe.setPreparationTime(resultSet.getInt("admin_id"));
            return recipe;
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return null;
   }

   public void update(Recipe recipe){
      try(Connection connection = DbUtil.getConnection()){
         PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_QUERY);
         preparedStatement.setString(1,recipe.getName());
         preparedStatement.setString(2,recipe.getIngredients());
         preparedStatement.setString(3,recipe.getDescription());
         preparedStatement.setString(4,recipe.getCreated());
         preparedStatement.setString(5,recipe.getUpdated());
         preparedStatement.setInt(6,recipe.getPreparationTime());
         preparedStatement.setInt(7,recipe.getAdminId());
         preparedStatement.execute();
      }catch (SQLException e){
         e.printStackTrace();
      }
   }

   public void delete(int id){
      try(Connection connection = DbUtil.getConnection()){
         PreparedStatement preparedStatement = connection.prepareStatement(DELETE_RECIPE_QUERY);
         preparedStatement.setInt(1,id);
         preparedStatement.executeUpdate();
      }catch (SQLException e ){
         e.printStackTrace();
      }
   }

   public List<Recipe> findAll(){
      List<Recipe> recipeList = new ArrayList<>();
      try (Connection connection = DbUtil.getConnection()){
         PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_RECIPE_QUERY);
         ResultSet resultSet = preparedStatement.executeQuery();

         while (resultSet.next()){
            Recipe recipeToAdd = new Recipe();
            recipeToAdd.setId(resultSet.getInt("id"));
            recipeToAdd.setName(resultSet.getString("name"));
            recipeToAdd.setIngredients(resultSet.getString("ingredients"));
            recipeToAdd.setDescription(resultSet.getString("description"));
            recipeToAdd.setCreated(resultSet.getString("created"));
            recipeToAdd.setUpdated(resultSet.getString("updated"));
            recipeToAdd.setPreparationTime(resultSet.getInt("preparation_time"));
            recipeToAdd.setPreparationTime(resultSet.getInt("admin_id"));
            recipeList.add(recipeToAdd);
         }
      }catch (SQLException e){
         e.printStackTrace();
      }
      return recipeList;
   }

}
