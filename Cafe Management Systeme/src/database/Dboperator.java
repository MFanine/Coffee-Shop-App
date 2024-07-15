/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import javax.swing.JOptionPane;
import  java.sql.*;

/**
 *
 * @author DELL
 */
public class Dboperator {
    public static void setDataorDelete(String query,String msg){
        
        try {
            
            Connection con=Connect.getcon();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            if(!msg.equals(""))
            JOptionPane.showMessageDialog(null, msg);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    
    public static ResultSet getData ( String query){
        try {
            Connection con=Connect.getcon();
            Statement st = con.createStatement();
          ResultSet rs=  st.executeQuery(query);
          return rs;
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
}
