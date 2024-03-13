package com.prasad.service;

import com.prasad.model.Assigements;
import com.prasad.repository.AssignmentRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class AssignmentService {
    AssignmentRepository assignmentRepository = new AssignmentRepository();
    Scanner sc = new Scanner(System.in);

    public void createAssignment(int request_id, int technician_id,int part_id) throws SQLException {
        System.out.println("Enter Assignment Id");
        int assignment_id = sc.nextInt();
        System.out.println("Enter Status of Assignment (created / in-process / done)");
        String status = sc.next();
        System.out.println("Enter assignment date (ex.01-sep-2001)");
        String date = sc.next();

        Assigements assignment = new Assigements();
        assignment.setAssignmentId(assignment_id);
        assignment.setStatus(status);
        assignment.setAssignment_date(date);

        assignmentRepository.createAssignment(request_id, technician_id, assignment,part_id);
        HistoryService historyService = new HistoryService();
        historyService.createHistory(request_id, technician_id,part_id);
    }

    public void getAssignment() throws SQLException {
        System.out.println("    Enter assignment id whose u want to fetch data");
        int assignment_id = sc.nextInt();
        assignmentRepository.getAssignment(assignment_id);
    }

    public void getAllAssignment() throws SQLException {
        assignmentRepository.getAllAssignment();
    }

    public void updateAssignment() throws SQLException {
        System.out.println("Enter Assignment Id whose u want to update data");
        int assignment_id = sc.nextInt();
        System.out.println("Update Status of Assignment (created / in-process / done)");
        String status = sc.next();
        System.out.println("Update assignment date (ex.01-sep-2001)");
        String date = sc.next();

        Assigements assignment = new Assigements();
        assignment.setAssignmentId(assignment_id);
        assignment.setStatus(status);
        assignment.setAssignment_date(date);

        assignmentRepository.updateAssignment(assignment);
    }

}
