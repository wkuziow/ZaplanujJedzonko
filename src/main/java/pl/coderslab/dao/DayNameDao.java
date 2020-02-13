package pl.coderslab.dao;

import pl.coderslab.model.DayName;
import pl.coderslab.model.Recipe;
import pl.coderslab.utils.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DayNameDao {

    private static final String CREATE_DAY_NAME_QUERY =
            "INSERT INTO day_name (name , order) VALUES (?, ?)";
    private static final String READ_DAY_NAME_QUERY =
            "SELECT * FROM day_name WHERE id = ?";
    private static final String UPDATE_DAY_NAME_QUERY =
            "UPDATE day_name SET name = ?, order = ? WHERE id = ? ";
    private static final String DELETE_DAY_NAME_QUERY =
            "DELETE FROM day_name WHERE id = ?";
    private static final String FIND_ALL_DAY_NAME_QUERY =
            "SELECT * FROM day_name";


    public DayName create(DayName dayName) throws SQLException {
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_DAY_NAME_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,dayName.getName());
            preparedStatement.setInt(2,dayName.getOrder());

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if(resultSet.next()){
                dayName.setId(resultSet.getInt(1));
            }
            return dayName;
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public DayName read(int id){
        try (Connection connection = DbUtil.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(READ_DAY_NAME_QUERY);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                DayName dayName = new DayName();
                dayName.setId(resultSet.getInt("id"));
                dayName.setName(resultSet.getString("name"));
                dayName.setOrder(resultSet.getInt("order"));

                return dayName;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(DayName dayName){
        try(Connection connection = DbUtil.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_DAY_NAME_QUERY);
            preparedStatement.setString(1,dayName.getName());
            preparedStatement.setInt(2,dayName.getOrder());
            preparedStatement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(int id){
        try(Connection connection = DbUtil.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_DAY_NAME_QUERY);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }catch (SQLException e ){
            e.printStackTrace();
        }
    }

    public List<DayName> findAll(){
        List<DayName> dayNameList = new ArrayList<>();
        try (Connection connection = DbUtil.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_DAY_NAME_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                DayName dayNameToAdd = new DayName();
                dayNameToAdd.setId(resultSet.getInt("id"));
                dayNameToAdd.setName(resultSet.getString("name"));
                dayNameToAdd.setOrder(resultSet.getInt("order"));
                dayNameList.add(dayNameToAdd);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return dayNameList;
    }
}
