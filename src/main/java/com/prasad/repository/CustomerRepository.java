package com.prasad.repository;

import com.prasad.model.Customer;
import com.prasad.service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRepository {

    ConnectionService connectionService=new ConnectionService();

    public void addCutomer(Customer customer) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("Insert Into Customer Values (?,?,?,?,?,?)");
        statement.setInt(1, customer.getCustomerId());
        statement.setString(2, customer.getFirst_name());
        statement.setString(3, customer.getLast_name());
        statement.setString(4, customer.getEmail());
        statement.setLong(5, customer.getPhone());
        statement.setString(6, customer.getAddress());
        statement.executeUpdate();
        connection.close();
    }

    public void getCustomer(int customer_id) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("Select * From Customer Where customer_id = ?");
        statement.setInt(1, customer_id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Customer id         : " + resultSet.getInt(1));
            System.out.println("Customer first name :" + resultSet.getString(2));
            System.out.println("Customer last name  :" + resultSet.getString(3));
            System.out.println("Customer email      :" + resultSet.getString(4));
            System.out.println("Customer phone      :" + resultSet.getLong(5));
            System.out.println("Customer address    :" + resultSet.getString(6));
        }
    }

    public void getAllCustomers() throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("Select * From Customer");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Customer id         : " + resultSet.getInt(1));
            System.out.println("Customer first name :" + resultSet.getString(2));
            System.out.println("Customer last name  :" + resultSet.getString(3));
            System.out.println("Customer email      :" + resultSet.getString(4));
            System.out.println("Customer phone      :" + resultSet.getLong(5));
            System.out.println("Customer address    :" + resultSet.getString(6));
        }
    }

    public void updateCustomer(Customer customer) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection
                .prepareStatement("Update Customer Set email = ? , phone =? ,address = ?  where customer_id = ?");
        statement.setString(1, customer.getEmail());
        statement.setLong(2, customer.getPhone());
        statement.setString(34, customer.getAddress());
        statement.setInt(4, customer.getCustomerId());
        statement.executeUpdate();
        connection.close();
    }
}
