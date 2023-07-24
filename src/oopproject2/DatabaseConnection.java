/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;

/**
 *
 * @author DELL
 */
import java.sql.*;

public class DatabaseConnection {
    private static Connection con;
    public static Connection setConnection()
    {
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/DoctorFinder", "doctor","123");
            System.out.println("connected");
            return con;
        }
        catch (SQLException e)
        {
             System.out.println("Not connected");
            
            return null;
            
        }
            
        
                
    }
}
   