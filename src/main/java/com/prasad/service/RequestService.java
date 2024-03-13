package com.prasad.service;

import com.prasad.model.Requests;
import com.prasad.repository.RequestsRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class RequestService {
    Scanner sc=new Scanner(System.in);
    RequestsRepository requestsRepository=new RequestsRepository();
    public void addRequest(int bikeId) throws SQLException {
        System.out.println("please enter request id :");
        int req_id=sc.nextInt();
        System.out.println("please enter request status (in_Process || Witting || Completed) :");
        String status=sc.next();
        System.out.println("Enter Description in sort :");
        String description=sc.next();
        System.out.println("Enter date of servicing :");
        String date=sc.next();


        Requests requests=new Requests();
        requests.setRequestId(req_id);
        requests.setStatus(status);
        requests.setRequest_date(date);
        requests.setDescription(description);
        requestsRepository.addRequest(bikeId,requests);
        System.out.println("Request is created successfully .... fill the technician details");

    }
    public void getRequest() throws SQLException {
        System.out.println("Enter the request id whose you want to fetch data");
        int req_id=sc.nextInt();
        requestsRepository.getRequest(req_id);
    }
    public  void getAllRequests() throws SQLException {
        requestsRepository.getAllRequests();
    }

    public void updateRequest() throws SQLException {
        System.out.println("please enter request id who you want to update :");
        int req_id=sc.nextInt();
        System.out.println("update request status of request id (in_Process || Witting || Completed) :");
        String status=sc.next();
        System.out.println("update Description in sort :");
        String description=sc.next();
        System.out.println("update date of servicing :");
        String date=sc.next();


        Requests requests=new Requests();
        requests.setRequestId(req_id);
        requests.setStatus(status);
        requests.setRequest_date(date);
        requests.setDescription(description);
        requestsRepository.updateRequest(requests);
    }
}
