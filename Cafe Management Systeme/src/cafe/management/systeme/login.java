/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.systeme;
import Classes.User;
import database.UserDao;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
         btnLog.setEnabled(false);
    }
      
    public void clear(){
        
        txtemail.setText("");
        txtpwd.setText("");
        btnLog.setEnabled(false);
        
    }
    
     public void validateFiels(){
          String email=txtemail.getText();
        String pwd=txtpwd.getText();
       
        if(!pwd.equals(""))
            
            btnLog.setEnabled(true);
        else
            btnLog.setEnabled(false); 
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
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnCance = new javax.swing.JButton();
        btnSignin = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnForget = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 134));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Log in");

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel3.setText("Email :");

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel6.setText("Password :");

        txtpwd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpwdKeyReleased(evt);
            }
        });

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnCance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCance.setText("Cancel");
        btnCance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanceActionPerformed(evt);
            }
        });

        btnSignin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignin.setText("Sigin Page");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLog.setText("Log in");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnForget.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnForget.setForeground(new java.awt.Color(0, 204, 255));
        btnForget.setText("Forget the Password ?");
        btnForget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLog)
                        .addGap(74, 74, 74)
                        .addComponent(btnCance)
                        .addGap(66, 66, 66)
                        .addComponent(btnSignin))
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnForget, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLog)
                    .addComponent(btnCance)
                    .addComponent(btnSignin))
                .addGap(18, 18, 18)
                .addComponent(btnForget, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
       validateFiels();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtpwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpwdKeyReleased
        // TODO add your handling code here:
        validateFiels();
    }//GEN-LAST:event_txtpwdKeyReleased

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            txtpwd.setEchoChar((char)0);
        }else{
            txtpwd.setEchoChar('.');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnCanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanceActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnCanceActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed

        String email= txtemail.getText();
        String pwd=txtpwd.getText();
        User user=UserDao.loge(email, pwd);
        if(user==null)
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect Username or password</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        else{
            if(txtemail.getText().equals("admin@gmail.com")){
                JOptionPane.showMessageDialog(null, "<html><b style=\"color:green\">Login Seccessfuly !!!</b></html>","Message",JOptionPane.INFORMATION_MESSAGE);
              Home h = new Home();
               h.setVisible(true);
               h.setLocationRelativeTo(null);
               dispose();
                clear();
           }
            else{
            if(!txtemail.getText().equals("admin@gmail.com")) {
             JOptionPane.showMessageDialog(null, "<html><b style=\"color:green\">Login Seccessfuly !!!</b></html>","Message",JOptionPane.INFORMATION_MESSAGE);
              UserControlPane h = new UserControlPane();
               h.setVisible(true);
               h.setLocationRelativeTo(null);
               dispose();
                clear();
           }
        }}
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnForgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgetActionPerformed
        // TODO add your handling code here:
        ForgetPassword fp=new ForgetPassword();
        fp.setVisible(true);
        fp.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnForgetActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        // TODO add your handling code here:
         signin s=new signin();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_btnSigninActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCance;
    private javax.swing.JButton btnForget;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnSignin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpwd;
    // End of variables declaration//GEN-END:variables
}
