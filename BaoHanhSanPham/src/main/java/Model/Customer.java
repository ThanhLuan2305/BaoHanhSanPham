/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LENOVO
 */
public class Customer {
    public String customer_id;
    public String name;
    public String address;
    public String phone_number;

    public Customer() {
    }

    public Customer(String customer_id, String name, String address, String phone_number) {
        this.customer_id = customer_id;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }
    
}
