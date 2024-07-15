/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import Classes.Category;
import Classes.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ProductDao {
    public static void save (Product product){
        String query="insert into product ( nom,category,price) values ('"+product.getNom()+"','"+product.getCategory()+"','"+product.getPrice()+"')";
        Dboperator.setDataorDelete(query, "Product Added Successfilly");
    }
    public static ArrayList<Product>  getAllRecord(){
        ArrayList<Product> list=new ArrayList<>();
        try {
            ResultSet rs = Dboperator.getData("select * from product");
            while(rs.next()){
               Product p=new Product();
                p.setId(rs.getInt("id"));
                p.setNom(rs.getString("nom"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getString("price"));
                list.add(p);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public static void update(Product product){
        String query =" update product set nom='"+product.getNom()+"',price='"+product.getPrice()+"',Category='"+product.getCategory()+"' where id='"+product.getId()+"'";
        Dboperator.setDataorDelete(query, "Product Update Successfully");
    }
    public static void delet (String id ){
        String query ="delet from product where id ='"+id+"'";
          Dboperator.setDataorDelete(query, "Product Deleted Successfully");
  
    }
    
    public static ArrayList<Product>  getAllRecordByCategory(String category){
         ArrayList<Product> list=new ArrayList<>();
        try {
            ResultSet rs = Dboperator.getData("select * from product where Category ='"+category+"'");
            while(rs.next()){
               Product p=new Product();
                p.setNom(rs.getString("nom"));
                list.add(p);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    public static ArrayList<Product>  filterProductByName(String name,String category){
         ArrayList<Product> list=new ArrayList<>();
        try {
            ResultSet rs = Dboperator.getData("select * from product where nom like'%"+category+"%' and Category='"+category+"'");
            while(rs.next()){
               Product p=new Product();
                p.setNom(rs.getString("nom"));
                list.add(p);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    public static Product getProductByName(String name) {
        Product p=new Product();
        try {
            ResultSet rs=Dboperator.getData("Select* from Product where nom ='"+name+"'");
             while(rs.next()){
                p.setNom(rs.getString(2));
                p.setPrice(rs.getString(3));
                p.setCategory(rs.getString(4));

        }
        
    }   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);   
        Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
}



}
