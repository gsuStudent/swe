/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcsample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcsample {
     
    public static void main(String[] args) {
        Connect();
        
           

        // TODO code application logic here
    }
    public static void Connect(){
        try 
        {
           Connection connection = Db.getconnection();
         Statement stm=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=stm.executeQuery("SELECT * FROM employee");
            
            
            
                  
        } catch (SQLException ex) {
           
            System.err.println("not working");
        }
        
    }

}
