/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.util.ArrayList;
import Classes.Category;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class CategoryDao {
    public static void save(Category category){
        String query ="insert into Category (nom) values ('"+category.getNom()+"')";
        Dboperator.setDataorDelete(query, "Category Added Successfilly ");
        
    }
    public static ArrayList<Category> getAllRecord(){
        ArrayList<Category> list=new ArrayList<>();
        try {
            ResultSet rs = Dboperator.getData("select * from Category");
            while(rs.next()){
                Category category = new Category();
                category.setId(rs.getInt("ID"));
                category.setNom(rs.getString("nom"));
                list.add(category);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    public static void delet(String id){
        String query="delet from Category where id ='"+id+"'";
        Dboperator.setDataorDelete(query, "Category Deleted Successfully");
    }
    
}
