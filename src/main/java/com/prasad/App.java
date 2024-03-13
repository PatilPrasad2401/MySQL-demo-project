package com.prasad;

import com.prasad.model.Bike;
import com.prasad.model.Customer;
import com.prasad.model.Part;
import com.prasad.model.Technicians;
import com.prasad.service.*;

import java.sql.SQLException;
import java.text.Bidi;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        BikeService bikeService = new BikeService();
        RequestService requestService = new RequestService();
        TechniciansService techniciansService = new TechniciansService();
        PartService partService = new PartService();
        HistoryService historyService = new HistoryService();
        AssignmentService assignmentService = new AssignmentService();
        int choice = 0;
        do {
            System.out.println("*************Vehicle Management System ***************");
            System.out.println("--------------------------------------\n");
            System.out.println("\b Customer");
            System.out.println("1.Register New Customer  :");
            System.out.println("2.View Customer :");
            System.out.println("3.View all Customer:");
            System.out.println("4.Update Customer:");
//            System.out.println("5.Delete  Customer:");

            System.out.println("-----------------------------------------\n");
            System.out.println("\b Bike");
            System.out.println("5.Register New bike for exiting Customer :");
            System.out.println("6.View bike Detail :");
            System.out.println("7.View all biKe details:");
            System.out.println("8.Update Bike details:");


            System.out.println("-----------------------------------------\n");
            System.out.println("\b Parts");
            System.out.println("9.Add part into the inventory :");
            System.out.println("10.View Specific Part Detail :");
            System.out.println("11.View all Part details:");
            System.out.println("12.Update Part details:");
//            System.out.println("5.Delete part :");

            System.out.println("-----------------------------------------\n");
            System.out.println("\b Assignment data");
            System.out.println("13.view assignment :");
            System.out.println("14.View all assignment :");
            System.out.println("15.Update Assignment details:");

            System.out.println("-----------------------------------------\n");
            System.out.println("\b Service Request data");
            System.out.println("16.view request details with id:");
            System.out.println("17.View all requests details:");
            System.out.println("18.Update status of Requests ");

            System.out.println("----------------------------------------------------------");
            System.out.println("Service Technician Data Related");
            System.out.println("19 Add New Technician");
            System.out.println("20 Update Existing Technician Details");
            System.out.println("21 View Technician Details");
            System.out.println("22 View All Technician In Service Station");

            System.out.println("----------------------------------------------------------");
            System.out.println("Service History Data Related");
            System.out.println("23 View History Of Service");
            System.out.println("24 View Total History");
            System.out.println("----------------------------------------------------------");

            choice=Integer.parseInt(scanner.nextLine());
            CustomerService customerService = new CustomerService();
            switch (choice) {
                case 1: {
                    customerService.addCustomer();
                    break;
                }
                case 2: {
                    customerService.getCustomer();
                    break;
                }
                case 3: {
                    customerService.getAllCustomers();
                    break;
                }
                case 4: {
                    customerService.updateCustomer();
                    break;
                }
                case 5: {
                    bikeService.addBikeOfExistingCustomer();
                    break;
                }
                case 6: {
                    bikeService.getBike();
                    break;
                }
                case 7: {
                    bikeService.getAllBikes();
                    break;
                }
                case 8: {
                    bikeService.updateBikeDetails();
                    break;
                }
                case 9: {
                    partService.addPart();
                    break;
                }
                case 10: {
                    partService.getPart();
                    break;
                }
                case 11: {
                    partService.getAllPArts();
                    break;
                }
                case 12: {
                    partService.updatePart();
                    break;
                }
                case 13: {
                    assignmentService.getAssignment();
                    break;
                }
                case 14: {
                    assignmentService.getAllAssignment();
                    break;
                }
                case 15: {
                    assignmentService.updateAssignment();
                    break;
                }
                case 16: {
                    requestService.getRequest();
                    break;
                }
                case 17: {
                    requestService.getAllRequests();
                    break;
                }
                case 18: {
                    requestService.updateRequest();
                    break;
                }
                case 19: {
                    techniciansService.addTechnician();
                    break;
                }
                case 20: {
                    techniciansService.updateTechnician();
                    break;
                }
                case 21: {
                    techniciansService.getTechnician();
                }
                case 22: {
                    techniciansService.getAllTechnicians();
                }
                case 23: {
                    historyService.getHistory();
                    break;
                }
                case 24: {
                    historyService.getAllHistory();
                    break;
                }
                default:
                    break;
            }
        } while (choice != 0);
    }
}
