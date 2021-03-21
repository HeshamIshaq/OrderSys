/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author KING TECH
 */
public class C_controller {
    
    private C_customer OFcustomer;
    private C_emploeey OFemploeey;
    private C_products OFproduct; 
    private C_order    OForder;
    private ArrayList <C_products> ARRAYproduct = new ArrayList();
    private ArrayList <C_customer> ARRAYcustomer = new ArrayList();
    private ArrayList <C_order> ARRAYorder = new ArrayList();
    private ArrayList <C_depOrder> ARRAYDeporder = new ArrayList();
    private ArrayList <C_emploeey> ARRAYemploeey = new ArrayList();
    
    
   
    //method Of add Order by collection
    public void addOrder (int IDorder ,int ID_customer, String adrress_customer, int number, String name,
            int number_pro, int cost_pro, int Quantity_pro, String name_pro , String major_emploeey)
    {
       C_order C_ord = new C_order(IDorder);
       ARRAYorder.add(C_ord);
       C_customer C_cust = new C_customer(ID_customer, adrress_customer,  number,  name);
       ARRAYcustomer.add(C_cust);
       C_products C_pro = new C_products(number_pro, cost_pro,  Quantity_pro,  name_pro );
       ARRAYproduct.add(C_pro);
       C_emploeey C_emp = new C_emploeey(major_emploeey, number, name);
       ARRAYemploeey.add(C_emp);
       C_depOrder C_dep = new C_depOrder(C_ord, C_cust, C_pro, C_emp);
       ARRAYDeporder.add(C_dep);
       return;
    }
    
    //method Of View Order Of collection
    public void ViewOrder ()
    {
        for (int i = 0; i < ARRAYorder.size(); i++) {
            System.out.println(ARRAYorder.toString()); }
        for (int i = 0; i < ARRAYcustomer.size(); i++) {
            System.out.println(ARRAYcustomer.toString());}
         for (int i = 0; i < ARRAYproduct.size(); i++) {
             System.out.println(ARRAYproduct.toString());}
         for (int i = 0; i < ARRAYemploeey.size(); i++) {
             System.out.println(ARRAYemploeey.toString());}

    }
    //This method views the dependend orders.
    public void ViewOrderDependence ()
    {
        System.out.println(ARRAYDeporder.toString());
    }
    //This method views the list of customer.
    public void Viwcustomer()
    {
        for (int i = 0; i < ARRAYcustomer.size(); i++) {
            System.out.println(ARRAYcustomer.toString());}
    }
    //This method shos the list of product.
    public void Showpro()
    {
        Fproducts fpoo = new Fproducts();
                 try {
            Connection conn= DriverManager.getConnection("jdbc:ucanaccess://d:\\db1.accdb");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM PRODUCTS");
            while(rs.next()){
                String ar [] = {String.valueOf(rs.getString("Quantity")), String.valueOf(rs.getInt("SL_PRODUCT")),rs.getString("NA_PRODUCT"),
                String.valueOf(rs.getInt("NO_PRODUCT"))};
                DefaultTableModel tb = (DefaultTableModel)fpoo.jTable2.getModel();
                tb.addRow(ar);
            }}catch (SQLException e) {e.printStackTrace();}
         
    }
   //This method adds product to table.
    public void AddProToTab ()
    {
//        Fproducts fpoo = new Fproducts();
//        DefaultTableModel tb = (DefaultTableModel)fpoo.jTable2.getModel();
//        tb.insertRow(tb.getRowCount(), new Object []{fpoo.jTextField1.getText(),fpoo.jTextField2.getText(),
//        fpoo.jTextField3.getText(),fpoo.jTextField4.getText()});
        
    }
    //This method Of search Of order
    public void SearchOfOrder(int IDorder)
    {
        for (C_order ao:ARRAYorder)
        {
            if(ao.getIDorder() == IDorder) System.out.println(ao.toString());
            else System.out.println("Not fund");
        }
    }
    
    //This method Of search Of customer
     public void SearchOfcustomer(int IDcust)
    {
        for (C_customer cs:ARRAYcustomer)
        {
            if(cs.getID_customer() == IDcust) System.out.println(cs.toString());
            else System.out.println("Not fund");
        }
    }
     
     //This method Of search Of products
      public void SearchOfproducts(int IDpro)
    {
        for (C_products cp:ARRAYproduct)
        {
            if(cp.getNumber_pro() == IDpro) System.out.println(cp.toString());
            else System.out.println("Not fund");
        }
    }
     
      //This method Of removeOrder
      public void removeOrder(int removeOrdwe)
      {
          for (int i = 0; i < ARRAYorder.size(); i++) {
              if(ARRAYorder.get(i).getIDorder() == removeOrdwe)
              {ARRAYorder.remove(i);
                  System.out.println("Removed done");}
              else System.out.println("Not fund");
              }
          }
      
      public void dependenceOforder(int dord)
      {
          for (int i = 0; i < ARRAYorder.size(); i++) {
              if(ARRAYorder.get(i).getIDorder() == dord)
              {
                
                  
                  System.out.println("dependence is OK ");
              }   
              else System.out.println("Error");
              
          }
      }
      //This method shows the depended orders
      public void ARRAYDeporder()
      {
          System.out.println(ARRAYDeporder.toString());
      }
      
   



}
