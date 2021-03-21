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
public class C_emploeey extends C_user {
    
    private String major_emploeey;

    public C_emploeey(int number, String name) {
        super(number, name);
    }

    public C_emploeey() {
    }

    
    public C_emploeey(String major_emploeey, int number, String name) {
        super(number, name);
        this.major_emploeey = major_emploeey;
    }
    


    public String getMajor_emploeey() {
        return major_emploeey;
    }

    public void setMajor_emploeey(String major_emploeey) {
        this.major_emploeey = major_emploeey;
    }

    @Override
    public String toString() {
        return super.toString() + "\n C_emploeey{" + "major_emploeey=" + major_emploeey + '}';
    }

   



   
    
    
}
