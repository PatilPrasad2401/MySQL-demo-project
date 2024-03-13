package com.prasad.repository;

import com.prasad.model.Requests;
import com.prasad.service.ConnectionService;

import java.lang.ref.PhantomReference;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestsRepository {
    ConnectionService connectionService=new ConnectionService();
    public void addRequest(int bikeId, Requests requests) throws SQLException {
        Connection connection=connectionService.getConnection();
        PreparedStatement statement=connection.prepareStatement("Insert into service_request values(?,?,?,?,?)");
        statement.setInt(1, requests.getRequestId());
        statement.setInt(2, bikeId);
        statement.setString(3, requests.getStatus());
        statement.setString(4, requests.getDescription());
        statement.setString(5, requests.getRequest_date());
        statement.executeUpdate();
        connection.close();
    }

    public void getAllRequests() throws SQLException {Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("select * from service_request");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println("--------------->Request_id    : " + resultSet.getInt(1));
            System.out.println("                Bilke_id      : " + resultSet.getInt(2));
            System.out.println("                status        : " + resultSet.getString(3));
            System.out.println("                description   : " + resultSet.getString(4));
        }
        connection.close();
    }


    public void getRequest(int reqId) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("select * from service_request where request_id = ?");
        statement.setInt(1, reqId);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println("--------------->Request_id    : " + resultSet.getInt(1));
            System.out.println("                Bilke_id      : " + resultSet.getInt(2));
            System.out.println("                status        : " + resultSet.getString(3));
            System.out.println("                description   : " + resultSet.getString(4));
        }
        connection.close();
    }

    public void updateRequest(Requests requests) throws SQLException {
        Connection connection = connectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("Update  service_request set status = ? , description = ? where request_id = ?");
        statement.setString(1, requests.getStatus());
        statement.setString(2, requests.getDescription());
        statement.setInt(3, requests.getRequestId());
        statement.executeUpdate();
        connection.close();
    }
}

