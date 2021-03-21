/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.newpackage;

/**
 *
 * @author KING TECH
 */
public class C_customer extends C_user {
    private int ID_customer = 20191010;
    private String adrress_customer;
    public C_customer(int number, String name) {
        super(number, name);
    }

    public C_customer() {
    }
    
   
            
    

    public C_customer(int ID_customer, String adrress_customer, int number, String name) {
        super(number, name);
        this.ID_customer = ID_customer;
        this.adrress_customer = adrress_customer;
    }

    
     
    public int getID_customer() {
        return ID_customer;
    }

    public void setID_customer(int ID_customer) {
        this.ID_customer = ID_customer;
    }

    public String getAdrress_customer() {
        return adrress_customer;
    }

    public void setAdrress_customer(String adrress_customer) {
        this.adrress_customer = adrress_customer;
    }

    @Override
    public String toString() {
        return super.toString() + "ID_customer=" + ID_customer + ", adrress_customer=" + adrress_customer ;
    }



  
    
    
}
