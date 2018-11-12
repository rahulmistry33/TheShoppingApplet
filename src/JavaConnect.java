/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    Connection conn;
    public static Connection ConnecrDB(){
    try{
        //Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ekart?zeroDateTimeBehavior=convertToNull","root","");
        return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
}
}
