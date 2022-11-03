/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.DataTypes.User;
import Backend.ManagerClasses.UserManager;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.geom.FlatteningPathIterator;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Neeraav Ranjit
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form login_section
     */
    public LoginScreen() {
        initComponents();
        
        ImageIcon main = new ImageIcon("src\\main\\resources\\login_screen Images\\Ferris Wheel 64x.png");
        this.setIconImage(main.getImage());     
        this.setTitle("Login");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sign_in_panel_tab = new javax.swing.JPanel();
        panel_left = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username_text_field = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        enter_button = new javax.swing.JButton();
        password_field = new javax.swing.JTextField();
        panel_right = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LogoLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        panel_left.setBackground(new java.awt.Color(152, 64, 99));

        try {

            Font font = Font.createFont(Font.TRUETYPE_FONT,
                new File("AmbarPearlPersonalUse-0nBz.ttf"));
            Font bold = font.deriveFont(Font.BOLD, 12);
            Font plain = font.deriveFont(Font.PLAIN, 40);
            LogoLabel.setBackground(new java.awt.Color(254, 150, 103));
            LogoLabel.setFont(plain);
            LogoLabel.setForeground(new java.awt.Color(254, 150, 103));
            LogoLabel.setText("Sign In");
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

        jLabel1.setBackground(new java.awt.Color(254, 150, 103));
        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 150, 103));
        jLabel1.setText("Username:");

        username_text_field.setBackground(new java.awt.Color(246, 70, 104));
        username_text_field.setText("Enter a Valid Username");
        username_text_field.setToolTipText("Enter a valid Username");
        username_text_field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_text_fieldMouseClicked(evt);
            }
        });
        username_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_text_fieldActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(254, 150, 103));
        jSeparator1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(254, 150, 103));
        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 150, 103));
        jLabel2.setText("Password:");

        jSeparator2.setBackground(new java.awt.Color(254, 150, 103));
        jSeparator2.setForeground(new java.awt.Color(254, 150, 103));

        enter_button.setBackground(new java.awt.Color(254, 150, 103));
        enter_button.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        enter_button.setText("ENTER ");
        enter_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_buttonActionPerformed(evt);
            }
        });

        password_field.setBackground(new java.awt.Color(246, 70, 104));
        password_field.setText("Enter a Valid Password");
        password_field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_fieldMouseClicked(evt);
            }
        });
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_leftLayout = new javax.swing.GroupLayout(panel_left);
        panel_left.setLayout(panel_leftLayout);
        panel_leftLayout.setHorizontalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(password_field, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(username_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        panel_leftLayout.setVerticalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(username_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(enter_button)
                .addGap(63, 63, 63))
        );

        panel_right.setBackground(new java.awt.Color(65, 67, 106));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_screen Images/Ferris Wheel 256x.png"))); // NOI18N

        try {

            Font font = Font.createFont(Font.TRUETYPE_FONT,
                new File("AmbarPearlPersonalUse-0nBz.ttf"));
            Font bold = font.deriveFont(Font.BOLD, 12);
            Font plain = font.deriveFont(Font.PLAIN, 24);
            LogoLabel1.setBackground(new java.awt.Color(254, 150, 103));
            LogoLabel1.setFont(plain);
            LogoLabel1.setForeground(new java.awt.Color(254, 150, 103));
            LogoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            LogoLabel1.setText("MyFairLady");
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

        javax.swing.GroupLayout panel_rightLayout = new javax.swing.GroupLayout(panel_right);
        panel_right.setLayout(panel_rightLayout);
        panel_rightLayout.setHorizontalGroup(
            panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rightLayout.createSequentialGroup()
                .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_rightLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4))
                    .addGroup(panel_rightLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LogoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel_rightLayout.setVerticalGroup(
            panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rightLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(LogoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout sign_in_panel_tabLayout = new javax.swing.GroupLayout(sign_in_panel_tab);
        sign_in_panel_tab.setLayout(sign_in_panel_tabLayout);
        sign_in_panel_tabLayout.setHorizontalGroup(
            sign_in_panel_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_in_panel_tabLayout.createSequentialGroup()
                .addComponent(panel_left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sign_in_panel_tabLayout.setVerticalGroup(
            sign_in_panel_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_in_panel_tabLayout.createSequentialGroup()
                .addGroup(sign_in_panel_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sign_in_panel_tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sign_in_panel_tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_text_fieldActionPerformed

    private void username_text_fieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_text_fieldMouseClicked
        username_text_field.setText("");
    }//GEN-LAST:event_username_text_fieldMouseClicked

    private void enter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_buttonActionPerformed
        
        try {
            UserManager um = new UserManager();
            User current_user = um.searchUser(username_text_field.getText(), password_field.getText());
            System.out.println(current_user.toString());
            if(current_user != null){
                
                String acc_level = current_user.getAccount_level();
                if(acc_level.equals("StoreOwner")){
                    System.out.println("WERE IN THE STORE OWNER IF");
                    StoreManagerScreen sm = new StoreManagerScreen();
                    sm.store_name_label.setText(current_user.getStoreOrFairName());
                    System.out.println("FROM LOGIN SCREEN: ");
                    System.out.println("STORE NAME: " + current_user.getStoreOrFairName());
                    sm.setVisible(true);
                    
                    this.dispose();
                    
                }
                else if(acc_level.equals("FairOwner")){
                    System.out.println("WERE IN THE FAIR OWNER IF");
                    FairManagerScreen fm = new FairManagerScreen();
                    fm.setVisible(true);
                    fm.fair_name_label.setText(current_user.getStoreOrFairName());
                    this.dispose();
                    
                }
                else if(acc_level.equals("Admin")){
                    System.out.println("WE ARE IN THE ADMIN IF");
                    AdminManagerScreen am = new AdminManagerScreen();
                    am.setVisible(true);
                    this.dispose();
                    
                }
                
            }
            else{
                
                JOptionPane.showMessageDialog(rootPane, "User Does not exist, please enter a valid username and password");
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_enter_buttonActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        password_field.setText("");
    }//GEN-LAST:event_password_fieldActionPerformed

    private void password_fieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_fieldMouseClicked
        password_field.setText("");
    }//GEN-LAST:event_password_fieldMouseClicked

    /**
     * @param args the command line arguments
     */

        public static void main(String args[]) {
            
            FlatDarkLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel LogoLabel1;
    private javax.swing.JButton enter_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_right;
    private javax.swing.JTextField password_field;
    private javax.swing.JPanel sign_in_panel_tab;
    private javax.swing.JTextField username_text_field;
    // End of variables declaration//GEN-END:variables
}
