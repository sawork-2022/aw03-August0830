package com.example.webpos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private double price;
    private String image;

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getPrice();
    }

}
