/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import Classes.Bill;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class BillDao {
    public static String getId(){
        int id=1;
        try {
            ResultSet rs=Dboperator.getData("select max(id) from bill");
            if(rs.next()){
                id=rs.getInt(1);
                id=id+1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Bill bill){
        String query="insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getTel()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreeatedBy()+"')";
        Dboperator.setDataorDelete(query, "Bill Details Added Seccessfully");
        
    }
    
    public static ArrayList<Bill> getAllRecordByInc(String date){
        ArrayList<Bill> liste= new ArrayList<>();
        try {
            ResultSet rs =Dboperator.getData("select * from bill where date like '%"+date+"%'");
            while(rs.next()){
                Bill b=new Bill();
                b.setId(rs.getInt(1));
                b.setName(rs.getString(2));
                b.setTel(rs.getString(3));
                b.setEmail(rs.getString(4));
                b.setDate(rs.getString(5));
                b.setTotal(rs.getString(6));
                b.setCreeatedBy(rs.getString(7));
                liste.add(b);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return liste;
    }
    
     public static ArrayList<Bill> getAllRecordByDesc(String date){
        ArrayList<Bill> liste= new ArrayList<>();
        try {
            ResultSet rs =Dboperator.getData("select * from bill where date like '%"+date+"%' oeder by id desc");
            while(rs.next()){
                Bill b=new Bill();
                b.setId(rs.getInt(1));
                b.setName(rs.getString(2));
                b.setTel(rs.getString(3));
                b.setEmail(rs.getString(4));
                b.setDate(rs.getString(5));
                b.setTotal(rs.getString(6));
                b.setCreeatedBy(rs.getString(7));
                liste.add(b);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return liste;
    }
    
}
