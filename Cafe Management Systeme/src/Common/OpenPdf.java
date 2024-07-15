/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class OpenPdf {
    public static void OpenById(String id){
        try {
         if((new File("D:\\"+id+".pdf")).exists()){
             Process p=Runtime.getRuntime().exec("rundll32 url.dll.FileProtocolHandler D:\\"+id+".pdf");
         } 
         else
            JOptionPane.showMessageDialog(null, "File is not Exists");
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
