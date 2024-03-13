package com.prasad.service;

import com.prasad.model.Part;
import com.prasad.repository.PartRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class PartService {
    Scanner scanner =  new Scanner(System.in);
    PartRepository partsRepository =  new PartRepository();

    public void addPart() throws SQLException {
        System.out.println("Enter part id ");
        int part_id = scanner.nextInt();
        System.out.println("Enter part name ");
        String part_name = scanner.next();
        System.out.println("Enter parts available quantity ");
        int part_qty = scanner.nextInt();
        System.out.println("Enter part price ");
        float part_price = scanner.nextFloat();

        Part parts =  new Part();
        parts.setPartId(part_id);
        parts.setPart_name(part_name);
        parts.setPrice(part_price);
        parts.setQuantity(part_qty);
        partsRepository.addPart(parts);

    }

    public void getPart() throws SQLException {
        System.out.println("enter part id ");
        int part_id = scanner.nextInt();
        partsRepository.getPart(part_id);
    }

    public void getAllPArts() throws SQLException {
        partsRepository.getAllParts();
    }

    public void updatePart() throws SQLException {
        System.out.println("Enter part id  whose u want to update");
        int part_id = scanner.nextInt();
        System.out.println("update part name ");
        String part_name = scanner.next();
        System.out.println("update parts available quantity ");
        int part_qty = scanner.nextInt();
        System.out.println("update part price ");
        float part_price = scanner.nextInt();

        Part parts =  new Part();
        parts.setPartId(part_id);
        parts.setPart_name(part_name);
        parts.setPrice(part_price);
        parts.setQuantity(part_qty);

        partsRepository.updatePart(parts);

    }

}
