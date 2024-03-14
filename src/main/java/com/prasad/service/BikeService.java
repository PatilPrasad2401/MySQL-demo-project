package com.prasad.service;

import com.prasad.model.Bike;
import com.prasad.model.Customer;
import com.prasad.repository.BikeRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class BikeService {
        Scanner scanner = new Scanner(System.in);
        BikeRepository bikeRepository=new BikeRepository();
        public void addBikeForNewCustomer(int customer_id, Customer customer) throws SQLException {
            Bike bike = new Bike();
            System.out.println("Pls enter Bike id:");
            int bike_id = scanner.nextInt();
            System.out.println("Pls enter make of bike :");
            String make = scanner.nextLine();
            System.out.println("Pls enter bike model name:");
            String model = scanner.next();
            System.out.println("Pls enter Bike colour:");
            String color = scanner.next();
            System.out.println("Pls enter Bike numberplate :");
            String numberplate = scanner.next();
            System.out.println("Pls enter Bike of year:");
            int year = scanner.nextInt();

            bike.setBikeId(bike_id);
            bike.setMake(make);
            bike.setModel(model);
            bike.setColour(color);
            bike.setNumber_plate(numberplate);
            bike.setYear(year);
            bikeRepository.addBikeOfNewCustomer(customer_id,bike);
            System.out.println("your bike details added successfully and your request is creating :");
            RequestService requestService=new RequestService();
            requestService.addRequest(bike_id);

        }
        public void addBikeOfExistingCustomer() throws SQLException {
            Bike bike=new Bike();
            System.out.println("Please Enter Existing customer id :");
            int customer_id=scanner.nextInt();
            System.out.println("Please enter bike Id :");
            int bike_id=scanner.nextInt();
            System.out.println("please enter make of bike/company of your bike :");
            String make=scanner.next();
            System.out.println("Please enter your bike model: ");
            String model=scanner.next();
            System.out.println("please enter your bike year");
            int year=scanner.nextInt();
            System.out.println("please enter your color");
            String color=scanner.next();
            System.out.println("please enter your number plate number");
            String number_plate=scanner.next();

            bike.setBikeId(bike_id);
            bike.setMake(make);
            bike.setModel(model);
            bike.setYear(year);
            bike.setColour(color);
            bike.setNumber_plate(number_plate);
            bikeRepository.addBikeOfNewCustomer(customer_id,bike);
            System.out.println("Bike added successfully");
        }
        public void getBike() throws SQLException {
            System.out.println("enter bike id :");
            int bike_id=scanner.nextInt();
            bikeRepository.getBike(bike_id);
        }
        public void getAllBikes() throws SQLException {
            bikeRepository.getAllBikes();
        }
    public void updateBikeDetails() throws SQLException {
        Bike bike=new Bike();
        System.out.println("Please Enter bike id whose you want to update bike data :");
        int bike_id=scanner.nextInt();
//        System.out.println("Please enter bike Id :");
//        int bike_id=scanner.nextInt();
        System.out.println("please enter make of bike/company of your bike :");
        String make=scanner.next();
        System.out.println("Please enter your bike model: ");
        String model=scanner.next();
        System.out.println("please enter your bike year");
        int year=scanner.nextInt();
        System.out.println("please enter your color");
        String color=scanner.next();
        System.out.println("please enter your number plate number");
        String number_plate=scanner.next();

        bike.setBikeId(bike_id);
        bike.setMake(make);
        bike.setModel(model);
        bike.setYear(year);
        bike.setColour(color);
        bike.setNumber_plate(number_plate);
        bikeRepository.updatebike(bike);
        System.out.println("Bike update  successfully");
    }

    }



