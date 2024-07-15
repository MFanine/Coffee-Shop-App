/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import Classes.User;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class UserDao {
    
    public static void save(User user){
        String query ="insert into user(nom,email,tel,Adresse,password,securityQuestion,answer,status)values('"+user.getNom()+"','"+user.getEmail()+"','"+user.getTel()+"','"+user.getAdresse()+"','"+user.getPwd()+"','"+user.getSeqsys()+"','"+user.getAnswer()+"','false')";
        
        Dboperator.setDataorDelete(query, "Saved Seccessfully");
    }
    public static User loge(String email , String pwd){
         User user = null;
         try {
             
             ResultSet rs=Dboperator.getData("select * from user where email='"+email+"' and password= '"+pwd+"'");
             while(rs.next()){
                 user= new User();
                 user.setStatus(rs.getString("status"));
             }
             
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, e);
        }
         return user;
    }
    
    public static User getsecurityQuetion(String email){
        User user=null;
        try {
           ResultSet rs=Dboperator.getData("select * from user where email='"+email+"' ");
             while(rs.next()){
                 user= new User();
                 user.setSeqsys(rs.getString("securityQuestion"));
                 user.setAnswer(rs.getString("answer"));
          
             }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
      
        }
        return user;
    }
    
    public static void Update(String email ,String newPassword){
        String query = "update user set password='"+newPassword+"' where email = '"+email+"' ";
        Dboperator.setDataorDelete(query,"Password Changed Successefully ");
    }
    public static ArrayList<User> getAllRecord(String email){
        ArrayList<User> list=new ArrayList<>();
        try {
            ResultSet rs = Dboperator.getData("select * from user where email like '%"+email+"%'");
            while(rs.next()){
                User category = new User();
                category.setId(rs.getInt("idUser"));
                category.setNom(rs.getString("nom"));
                category.setEmail(rs.getString("email"));
                category.setTel(rs.getString("tel"));
                category.setAdresse(rs.getString("Adresse"));
                 category.setSeqsys(rs.getString("securityQuestion"));
                 category.setStatus(rs.getString("status"));
                list.add(category);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
        
    }
    public static void changeStatus(String email,String status){
        String query=" update user set status='"+status+"' where  email='"+email+"'";
        Dboperator.setDataorDelete(query, "Status Change Successfully");
    }
    
    public static void changepwd(String email,String oldpwd,String newpwd){
        try {
            ResultSet rs=Dboperator.getData("Select * from user where email='"+email+"' and password ='"+oldpwd+"'");
            if(rs.next()){
                Update(email, newpwd);
            }
            else{
                JOptionPane.showMessageDialog(null, "Old Password is Worng ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}


