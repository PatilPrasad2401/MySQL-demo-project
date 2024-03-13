package com.prasad.service;

import com.prasad.model.Bike;
import com.prasad.model.Customer;
import com.prasad.repository.CustomerRepository;

import java.io.StringReader;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerService {
    CustomerRepository customerRepository=new CustomerRepository();
    Scanner sc=new Scanner(System.in);
    public void addCustomer() throws SQLException {
        Customer customer=new Customer();
        System.out.println("Enter customer id :");
        int customer_id=sc.nextInt();
        System.out.println("Enter First name :");
        String First_name=sc.next();
        System.out.println("Enter Last Name :");
        String Last_name=sc.next();
        System.out.println("Enter Email Address :");
        String email=sc.next();
        System.out.println("Enter Address :");
        String address=sc.next();
        System.out.println("enter Phone :");
        long phone=sc.nextLong();

        customer.setCustomerId(customer_id);
        customer.setFirst_name(First_name);
        customer.setLast_name(Last_name);
        customer.setEmail(email);
        customer.setAddress(address);
        customer.setPhone(phone);

        customerRepository.addCutomer(customer);
        System.out.println("Customer added successfully now please add  bike details ");
        BikeService bikeService=new BikeService();
        bikeService.addBikeForNewCustomer(customer_id,customer);

    }
    public void getCustomer() throws SQLException {
        System.out.println("Enter customer Id :");
        int customer_id=sc.nextInt();
        customerRepository.getCustomer(customer_id);
    }
    public void getAllCustomers() throws SQLException {
        customerRepository.getAllCustomers();
    }
    public void updateCustomer() throws SQLException {
        System.out.println("Enter customer id who you want to update data :");
        int customer_id=sc.nextInt();
        Customer customer=new Customer();
        System.out.println("Please Enter Email address :");
        String email=sc.next();
        System.out.println(" Please enter address :");
        String address=sc.next();
        System.out.println("please enter phone number :");
        long phone=sc.nextLong();

        customer.setCustomerId(customer_id);
        customer.setEmail(email);
        customer.setAddress(address);
        customer.setPhone(phone);
        customerRepository.updateCustomer(customer);
    }
}
