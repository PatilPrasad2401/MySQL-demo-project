package com.prasad.model;

public class Part {
   private int  partId;
    private String part_name ;
    private  int quantity;
    private float price ;

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getPart_name() {
        return part_name;
    }

    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Part{" +
                "partId=" + partId +
                ", part_name='" + part_name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
