package com.prasad.repository;

import com.prasad.model.Part;
import com.prasad.service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PartRepository{
    ConnectionService connectionService = new ConnectionService();

    public void addPart(Part parts) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("Insert Into inventory values (?,?,?,?)");
        statement.setInt(1, parts.getPartId());
        statement.setString(2, parts.getPart_name());
        statement.setInt(3, parts.getQuantity());
        statement.setFloat(4, parts.getPrice());
        statement.executeUpdate();
        connection.close();
    }

    public void getPart(int part_id) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement =  connection.prepareStatement("select * from inventory where part_id = ?");
        statement.setInt(1, part_id);
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next()) {
            System.out.println("----------------->part id             : "+resultSet.getInt(1));
            System.out.println("                  part name           : "+resultSet.getString(2));
            System.out.println("                  part qty available  : "+resultSet.getInt(3));
            System.out.println("                  part price          : "+resultSet.getInt(4));
        }
        connection.close();
    }

    public void getAllParts() throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement =  connection.prepareStatement("select * from inventory ");
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next()) {
            System.out.println("part id : "+resultSet.getInt(1));
            System.out.println("part name : "+resultSet.getString(2));
            System.out.println("part qty available : "+resultSet.getInt(3));
            System.out.println("part price : "+resultSet.getInt(4));
        }
        connection.close();
    }

    public void updatePart(Part parts) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("Update inventory set part_name = ? , quantity_available = ? , price = ? where part_id = ?");
        statement.setString(1, parts.getPart_name());
        statement.setInt(2, parts.getQuantity());
        statement.setFloat(3, parts.getPrice());
        statement.setInt(4, parts.getPartId());
        statement.executeUpdate();
        connection.close();
    }

}
