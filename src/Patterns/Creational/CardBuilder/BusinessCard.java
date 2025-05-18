package src.Patterns.Creational.CardBuilder;

import java.util.Arrays;

public class BusinessCard {
    private String name;
    private double price;
    private int[] size;
    private String color1;
    private String color2;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor1(String color1){
        this.color1 = color1;
    }

    public void setColor2(String color2){
        this.color2 = color2;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int[] getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + Arrays.toString(size) +
                ", color1='" + color1 + '\'' +
                ", color2='" + color2 + '\'' +
                '}';
    }
}
