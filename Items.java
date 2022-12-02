/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureproject;

/**
 *
 * @author LEGION
 */
public class Items {
    
    package alex.lee.tutorial;

public class Items {
    private String name;
    private int price;
    static int count = 001;
    private int itemNumber;

    public Items(String name, int price) {
        this.name = name;
        this.price = price;
        this.itemNumber = count;
        count++;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

        @Override
        public String toString() {
            return "Items{" + "name=" + name + ", price=" + price + ", itemNumber=" + itemNumber + '}';
        }

}

