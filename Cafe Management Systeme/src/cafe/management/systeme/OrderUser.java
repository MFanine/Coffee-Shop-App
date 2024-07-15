/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.systeme;

import Classes.Bill;
import Classes.Category;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import Classes.Product;
import Classes.User;
import Common.OpenPdf;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import database.BillDao;
import database.CategoryDao;
import database.ProductDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author DELL
 */
public class OrderUser extends javax.swing.JFrame {

    public int billId = 1;
    public int grandTotal = 0;
    public int productPrice = 0;
    public int total = 0;

    /**
     * Creates new form Order
     */
    public OrderUser() {
        initComponents();
        txtPrice.setEditable(false);
        txttotal.setEditable(false);
        btnaddCard.setEnabled(false);
        btnbillM.setEnabled(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) jSpinner1.getEditor()).getTextField();
        tf.setEnabled(false);

    }

    public void productNameByCategory(String category) {
        DefaultTableModel dtm = (DefaultTableModel) tableC.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.getAllRecordByCategory(category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product catObj = itr.next();
            dtm.addRow(new Object[]{catObj.getNom()});
        }
    }

    public void filterProductByName(String name, String category) {
        DefaultTableModel dtm = (DefaultTableModel) tableC.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.filterProductByName(name, category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product catObj = itr.next();
            dtm.addRow(new Object[]{catObj.getNom()});
        }
    }

    public void clearProductFields() {
        txtnameP.setText("");
        txtPrice.setText("");
        jSpinner1.setValue(1);
        txttotal.setText("");
        btnaddCard.setEnabled(false);

    }

    public void validateField() {
        String nom = txtname.getText();
        String tel = txttel.getText();
        String email = txtemail.getText();

        if (!nom.equals("") && tel.length() == 10 && !email.equals("")) {
            btnbillM.setEnabled(true);
        } else {
            btnbillM.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbCtegory = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableC = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnameP = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        btncancel = new javax.swing.JButton();
        btnaddCard = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableP = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        lbltotale = new javax.swing.JLabel();
        btnbillM = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Place Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 119, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Bill ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 81, -1, -1));

        idlabel.setText("_ _");
        getContentPane().add(idlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 84, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Customer Details :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 116, 164, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 154, 46, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 180, 139, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tel");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 224, 30, -1));

        txttel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txttel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelKeyReleased(evt);
            }
        });
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 250, 139, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 294, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 326, 139, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Category ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 49, 65, -1));

        cmbCtegory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbCtegory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCtegoryActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCtegory, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 78, 180, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Search");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 116, -1, -1));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 148, 180, -1));

        tableC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        tableC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableC);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 185, 281));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Price");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Quantity");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Total");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, -1, -1));

        txtnameP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtnameP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 180, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 140, -1));

        txttotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 140, -1));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 80, -1));

        btncancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        btnaddCard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddCard.setText("Add to Card");
        btnaddCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddCardActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, -1, -1));

        tableP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total"
            }
        ));
        tableP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableP);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 440, 300));

        jLabel14.setText("*Grand Total Rs.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        lbltotale.setText("00000");
        getContentPane().add(lbltotale, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, -1, -1));

        btnbillM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnbillM.setText("Generate Bill & Print");
        btnbillM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbillMActionPerformed(evt);
            }
        });
        getContentPane().add(btnbillM, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, -1, -1));

        btnBack2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbillMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbillMActionPerformed
        // TODO add your handling code here:
        User user = new User();
        String customerName = txtname.getText();
        String customeremai = txtemail.getText();
        String customertel = txttel.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String todayDay = sdf.format(date);
        String total = String.valueOf(grandTotal);
        String createdBy = user.getNom();
        Bill bill = new Bill();
        bill.setId(billId);
        bill.setName(customerName);
        bill.setEmail(customeremai);
        bill.setTel(customertel);
        bill.setDate(todayDay);
        bill.setTotal(total);
        bill.setCreeatedBy(createdBy);
        BillDao.save(bill);

        //Creating document
        String path = "D:\\";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "" + billId + ".pdf"));
            doc.open();
            Paragraph cafeName = new Paragraph("Cafe Management System \n");
            doc.add(cafeName);
            Paragraph startLine = new Paragraph("*********************************************************************************************   \n");
            doc.add(startLine);
            Paragraph p = new Paragraph("\tBill id :" + billId + "\nCustomer Name : :" + customerName + "\nTotal Paid:" + grandTotal + "\n");
            doc.add(p);
            doc.add(startLine);
            PdfPTable tb = new PdfPTable(4);
            tb.addCell("Name");
            tb.addCell("Price");
            tb.addCell("Quantiy");
            tb.addCell("Total");
            for (int i = 0; i < tableP.getRowCount(); i++) {
                String n = tableP.getValueAt(i, 0).toString();
                String n1 = tableP.getValueAt(i, 0).toString();
                String n2 = tableP.getValueAt(i, 0).toString();
                String n3 = tableP.getValueAt(i, 0).toString();
                tb.addCell(n);
                tb.addCell(n1);
                tb.addCell(n2);
                tb.addCell(n3);
            }
            doc.add(tb);
            doc.add(startLine);
            Paragraph thanksmsg = new Paragraph("Thank You  For Visiting  , Hope You Visit Again(●'◡'●)   \n");
            doc.add(thanksmsg);
            //open pdf
            OpenPdf.OpenById(String.valueOf(billId));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        setVisible(false);
        new OrderUser().setVisible(true);
    }//GEN-LAST:event_btnbillMActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        clearProductFields();
    }//GEN-LAST:event_btncancelActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        billId = Integer.parseInt(BillDao.getId());
        idlabel.setText(BillDao.getId());
        ArrayList<Category> liste = CategoryDao.getAllRecord();
        Iterator<Category> itr = liste.iterator();
        while (itr.hasNext()) {
            Category catobj = itr.next();
            cmbCtegory.addItem(catobj.getNom());
        }
        String category = (String) cmbCtegory.getSelectedItem();
        productNameByCategory(category);
    }//GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String name = txtSearch.getText();
        String category = (String) cmbCtegory.getSelectedItem();
        filterProductByName(name, category);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tableCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCMouseClicked
        // TODO add your handling code here:
        int index = tableC.getSelectedRow();
        TableModel model = tableC.getModel();
        String Productname = model.getValueAt(index, 0).toString();
        Product product = ProductDao.getProductByName(Productname);
        txtnameP.setText(product.getNom());
        txtPrice.setText(product.getPrice());
        jSpinner1.setValue(1);
        txttotal.setText(product.getPrice());
        productPrice = Integer.parseInt(product.getPrice());
        btnaddCard.setEnabled(true);


    }//GEN-LAST:event_tableCMouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        int quantity = (Integer) jSpinner1.getValue();
        if (quantity <= 1) {
            jSpinner1.setValue(1);

        }
        total = productPrice * quantity;
        txttotal.setText(String.valueOf(total));

    }//GEN-LAST:event_jSpinner1StateChanged

    private void cmbCtegoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCtegoryActionPerformed
        // TODO add your handling code here:
        String category = (String) cmbCtegory.getSelectedItem();
        productNameByCategory(category);
    }//GEN-LAST:event_cmbCtegoryActionPerformed

    private void btnaddCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddCardActionPerformed
        // TODO add your handling code here:
        String name = txtnameP.getText();
        String price = txtPrice.getText();
        String quantity = String.valueOf(jSpinner1.getValue());
        DefaultTableModel dtm = (DefaultTableModel) tableP.getModel();
        dtm.addRow(new Object[]{name, price, quantity, total});
        grandTotal = grandTotal + total;
        lbltotale.setText(String.valueOf(grandTotal));
        clearProductFields();
        validateField();

    }//GEN-LAST:event_btnaddCardActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtnameKeyReleased

    private void txttelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txttelKeyReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtemailKeyReleased

    private void tablePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePMouseClicked
        // TODO add your handling code here:

        int index=tableP.getSelectedRow();
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to Remove This Product","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
           TableModel model=tableP.getModel();
           String t1 =  model.getValueAt(index, 3).toString();
           grandTotal=grandTotal - Integer.parseInt(t1);
           lbltotale.setText(String.valueOf(grandTotal));
           ((DefaultTableModel) tableP.getModel()).removeRow(index);
             }

    }//GEN-LAST:event_tablePMouseClicked

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        UserControlPane h = new UserControlPane();
        h.setVisible(true);
        h.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnBack2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnaddCard;
    private javax.swing.JButton btnbillM;
    private javax.swing.JButton btncancel;
    private javax.swing.JComboBox<String> cmbCtegory;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lbltotale;
    private javax.swing.JTable tableC;
    private javax.swing.JTable tableP;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnameP;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
};
