/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uygulama;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
//import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author yilma
 */
public class database {
    
    public static Connection connectDb(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baglanti","root","145304");
            System.out.println("Basarili");
         } 
       catch (SQLException  e) {
         System.out.println("MySQL JDBC Driver not found !!");
         e.printStackTrace();
         }
        return null;
    }
    
   // static Statement myStat;
    
    /*
    public static ResultSet sorgu(String sqlsorgu){
        
        ResultSet myRs=null;
        
        try {
            myRs = myStat.executeQuery(sqlsorgu);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
                
        return myRs;
    }
    */
    
}
