/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Neeraav Ranjit
 */
public class login_section extends javax.swing.JFrame {

    /**
     * Creates new form login_section
     */
    public login_section() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        sign_in_panel_tab = new javax.swing.JPanel();
        panel_left = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username_text_field = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        enter_button = new javax.swing.JButton();
        password_field = new javax.swing.JPasswordField();
        panel_right = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LogoLabel1 = new javax.swing.JLabel();
        sign_up_panel_tab = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTabbedPane2.setBackground(new java.awt.Color(246, 70, 104));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));

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
        enter_button.setText("ENTER");
        enter_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_buttonActionPerformed(evt);
            }
        });

        password_field.setBackground(new java.awt.Color(246, 70, 104));
        password_field.setText("***************");
        password_field.setToolTipText("Enter A Valid Password");
        password_field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_fieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_leftLayout = new javax.swing.GroupLayout(panel_left);
        panel_left.setLayout(panel_leftLayout);
        panel_leftLayout.setHorizontalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enter_button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(password_field, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(username_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(305, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
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
                .addGroup(sign_in_panel_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_left, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_right, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Sign In", sign_in_panel_tab);

        javax.swing.GroupLayout sign_up_panel_tabLayout = new javax.swing.GroupLayout(sign_up_panel_tab);
        sign_up_panel_tab.setLayout(sign_up_panel_tabLayout);
        sign_up_panel_tabLayout.setHorizontalGroup(
            sign_up_panel_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1303, Short.MAX_VALUE)
        );
        sign_up_panel_tabLayout.setVerticalGroup(
            sign_up_panel_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Sign up", sign_up_panel_tab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_fieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_fieldMouseClicked
        password_field.setText("");
    }//GEN-LAST:event_password_fieldMouseClicked

    private void username_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_text_fieldActionPerformed

    private void username_text_fieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_text_fieldMouseClicked
        username_text_field.setText("");
    }//GEN-LAST:event_username_text_fieldMouseClicked

    private void enter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_buttonActionPerformed
        store_manager_dashboard dashboard_screen = new store_manager_dashboard();
        dashboard_screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_enter_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login_section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_section().setVisible(true);
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
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_right;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JPanel sign_in_panel_tab;
    private javax.swing.JPanel sign_up_panel_tab;
    private javax.swing.JTextField username_text_field;
    // End of variables declaration//GEN-END:variables
}
