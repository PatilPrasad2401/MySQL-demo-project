package com.prasad.repository;

import com.prasad.model.History;
import com.prasad.service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HistoryRepository {
    ConnectionService connectionService=new ConnectionService();
    public void createHistory(int requestId, int technicianId, History history, int partId) throws SQLException {
        Connection connection=connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("Insert Into service_history values (?,?,?,?,?,?)");
        statement.setInt(1, history.getHistoryId());
        statement.setInt(2, requestId);
        statement.setInt(3, technicianId);
        statement.setInt(4, partId);
        statement.setString(5, history.getService_date());
        statement.setString(6, history.getComments());
        statement.executeUpdate();
        connection.close();
    }

    public void getAllHistory() throws SQLException {
        Connection connection=connectionService.getConnection();
        PreparedStatement statement=connection.prepareStatement("Select * from service_history");
        ResultSet resultSet=statement.executeQuery();
        while (resultSet.next()){
            System.out.println("History_id     : " +resultSet.getInt(1));
            System.out.println("request_id     : " +resultSet.getInt(2));
            System.out.println("technician_id  : " +resultSet.getInt(3));
            System.out.println("part_id        : " +resultSet.getInt(4));
            System.out.println("service date   : " +resultSet.getString(5));
            System.out.println("comments       : " +resultSet.getString(6));
            connection.close();
        }
    }

    public void getHistory(int hisId) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("select * from service_history where history_id = ?");
        statement.setInt(1, hisId);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()) {
            System.out.println("--------------------> History_id     : " +resultSet.getInt(1));
            System.out.println("                      request_id     : " +resultSet.getInt(2));
            System.out.println("                      technician_id  : " +resultSet.getInt(3));
            System.out.println("                      part_id        : " +resultSet.getInt(4));
            System.out.println("                      service date   : " +resultSet.getString(5));
            System.out.println("                      comments       : " +resultSet.getString(6));
        }
        connection.close();
    }
}
