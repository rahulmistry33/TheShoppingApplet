/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author admin
 */
public class Entry {
   public String price,brand,Model,description;
    public Entry(String price,String brand,String Model,String description)
    {
        //initComponents();
        this.price=price;
        this.Model=Model;
        this.brand=brand;
        this.description=description;
    }
}
