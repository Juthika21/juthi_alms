
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class javaconnect {
    Connection conn;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/atbs","root","");
            System.out.println("Connection Established");
            Statement s = conn.createStatement();
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
            
        }
        
        
        
    }
    
}
