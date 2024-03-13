package com.prasad.service;

import com.prasad.model.History;
import com.prasad.repository.HistoryRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class HistoryService {
    Scanner sc=new Scanner(System.in);
    HistoryRepository historyRepository=new HistoryRepository();
    public void createHistory(int request_id,int technician_id,int part_id) throws SQLException {
        System.out.println("Enter history Id :");
        int his_Id=sc.nextInt();
        System.out.println("Enter Servicing Date");
        String  service_date=sc.next();
        System.out.println("Enter comments");
        String comment=sc.next();
        History history=new History();
        history.setHistoryId(his_Id);
        history.setService_date(service_date);
        history.setComments(comment);
        historyRepository.createHistory(request_id,technician_id,history,part_id);
        System.out.println("***************thank you!!!  Visit Again!!! ******************");
    }

    public void getAllHistory() throws SQLException {
        historyRepository.getAllHistory();
    }

    public void getHistory() throws SQLException {
        System.out.println("Enter History Id :");
        int his_id=sc.nextInt();
        historyRepository.getHistory(his_id);
    }
}
