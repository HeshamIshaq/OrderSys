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
public class C_user {
    private int number;
    private String name;

    public C_user() {
    }
    

    public C_user(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "number=" + number + ", name=" + name ;
    }
    
    
    
}
