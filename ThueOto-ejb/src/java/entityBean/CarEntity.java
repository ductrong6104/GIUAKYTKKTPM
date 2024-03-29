/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entityBean;

import javax.ejb.Remote;

/**
 *
 * @author ADMIN
 */
@Remote
public class CarEntity {
    private int id;
    private String name;
    private String position;
    private double price;

    public CarEntity() {
    }

    public CarEntity(int id, String name, String position, double price) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getPrice() {
        return price;
    }
    
    
}
