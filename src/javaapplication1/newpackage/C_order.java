/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.newpackage;
import java.util.ArrayList;


/**
 *
 * @author KING TECH
 */
public class C_order {
    private int IDorder;
    

    public C_order(int IDorder) {
        this.IDorder = IDorder;
    }

   

    public int getIDorder() {
        return IDorder;
    }

    public void setIDorder(int IDorder) {
        this.IDorder = IDorder;
    }

    @Override
    public String toString() {
        return "IDorder=" + IDorder ;
    }
   
}
