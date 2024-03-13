package com.prasad.repository;
import com.prasad.model.Bike;
import com.prasad.service.ConnectionService;
import java.sql.*;
public class BikeRepository {

    ConnectionService connectionService = new ConnectionService();

    public void addBikeOfNewCustomer(int customer_id, Bike bike) throws SQLException {
        Connection connection = connectionService.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO bike VALUES (?,?,?,??,?,?,?)");
        preparedStatement.setInt(1, bike.getBikeId());
        preparedStatement.setString(2, bike.getMake());
        preparedStatement.setString(3, bike.getModel());
        preparedStatement.setString(4, bike.getColour());
        preparedStatement.setInt(5, bike.getYear());
        preparedStatement.setInt(7, bike.getYear());
        preparedStatement.setInt(7, customer_id);
        preparedStatement.executeUpdate();
        connection.close();
    }

    public void getBike(int bike_id) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM bike Where Bike_id=?");
        statement.setInt(1, bike_id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Bike Id is :" + resultSet.getInt(1));
            System.out.println("customer Id is :" + resultSet.getInt(2));
            System.out.println("Bike make is :" + resultSet.getInt(3));
            System.out.println("Bike model is :" + resultSet.getInt(4));
            System.out.println("Bike colour is :" + resultSet.getInt(5));
            System.out.println("Bike number_plate is :" + resultSet.getInt(6));
            System.out.println("Bike year is :" + resultSet.getInt(7));
        }
        connection.close();
    }
    public void getAllBikes() throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("Select * From Bike ");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Bike id :" + resultSet.getInt(1));
            System.out.println("Customer id :" + resultSet.getInt(2));
            System.out.println("bike make :" + resultSet.getString(3));
            System.out.println("bike model :" + resultSet.getString(4));
            System.out.println("bike color :" + resultSet.getString(5));
            System.out.println("bike number plate :" + resultSet.getString(6));
            System.out.println("bike year :" + resultSet.getString(7));
        }
        connection.close();
    }
    public void updatebike(Bike bike) throws SQLException {
        Connection connection=connectionService.getConnection();
        PreparedStatement statement=connection.prepareStatement("update bike set make=?,model=?,year=?,color=? number_plate=? where bike_id =?");
        statement.setInt(6,bike.getBikeId());
        statement.setString(1,bike.getMake());
        statement.setString(2,bike.getModel());
        statement.setInt(5,bike.getYear());
        statement.setString(3,bike.getColour());
        statement.setString(4,bike.getNumber_plate());
        statement.executeUpdate();
        connection.close();
    }
}



