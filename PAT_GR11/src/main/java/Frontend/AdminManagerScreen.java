package Frontend;

import Backend.DataTypes.Fair;
import Backend.DataTypes.Store;
import Backend.DataTypes.User;
import Backend.ManagerClasses.FairManager;
import Backend.ManagerClasses.StoreManager;
import Backend.ManagerClasses.UserManager;
import Backend.Utility.DB;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Panel;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminManagerScreen extends javax.swing.JFrame{

    private JPanel current_button;
    private JLabel current_label;
    private DB db;
    public UserManager um = new UserManager();
    public FairManager fm = new FairManager();
    public StoreManager sm = new StoreManager();
    
    
    public AdminManagerScreen() throws ClassNotFoundException, SQLException {
        this.db = new DB();
        
        initComponents();
        //setting up titles and Images 
        this.setTitle("Fair Management");
        ImageIcon main = new ImageIcon("src\\main\\resources\\login_screen Images\\Ferris Wheel 64x.png");
        this.setIconImage(main.getImage());    
        
        
        current_button = fair_management_button_panel;
        current_label = fair_management_label;
        
        //initialisizing the User Authrotiy level Combo Box
        initialiseListOfFairsToRemove(list_of_fairs_to_remove);
        initialiseListOfStoresToRemove(stores_to_delete_list);
        initialiseStoreCategoryComboBox(store_category_combo_box);
        setListOfFairsModel(store_fair_combo_box);
        
        DefaultListModel alm = new DefaultListModel();
        alm.addElement("StoreOwner");
        alm.addElement("FairOwner");
        alm.addElement("Admin");
        access_level_list.setModel(alm);
        

        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        parent_panel = new javax.swing.JPanel();
        fair_management_panel = new javax.swing.JPanel();
        fair_management_screen_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_of_fairs_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fair_entrance_fee_text_field = new javax.swing.JTextField();
        fair_name_text_field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_of_fairs_to_remove = new javax.swing.JList<>();
        delete_fair_button = new javax.swing.JButton();
        add_fair_button = new javax.swing.JButton();
        store_management_panel = new javax.swing.JPanel();
        store_management_screen_label = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        store_name_text_field = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        store_category_combo_box = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        store_fair_combo_box = new javax.swing.JComboBox<>();
        add_store_button = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        stores_to_delete_list = new javax.swing.JList<>();
        delete_store_button = new javax.swing.JButton();
        user_management_panel = new javax.swing.JPanel();
        user_management_screen_label = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        users_table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        user_username_text_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        user_password_text_field = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        user_fairorstore_combo_box = new javax.swing.JComboBox<>();
        add_user_button = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        users_combo_box = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        delete_user_button = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        access_level_list = new javax.swing.JList<>();
        panel_middle = new javax.swing.JPanel();
        panel_left = new javax.swing.JPanel();
        fair_management_button_panel = new javax.swing.JPanel();
        fair_management_label = new javax.swing.JLabel();
        store_management_button_panel = new javax.swing.JPanel();
        store_management_label = new javax.swing.JLabel();
        user_management_button_panel = new javax.swing.JPanel();
        user_management_label = new javax.swing.JLabel();
        logo_label = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        parent_panel.setBackground(new java.awt.Color(246, 70, 104));
        parent_panel.setLayout(new java.awt.CardLayout());

        fair_management_panel.setBackground(new java.awt.Color(246, 70, 104));

        fair_management_screen_label.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        fair_management_screen_label.setForeground(new java.awt.Color(254, 150, 103));
        fair_management_screen_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fair_management_screen_label.setText("FAIR MANAGEMENT");

        jSeparator1.setForeground(new java.awt.Color(254, 150, 103));

        list_of_fairs_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Number Of Stores", "Entrance Fee", "Profit", "Owner Name", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(list_of_fairs_table);

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 150, 103));
        jLabel3.setText("FAIR LIST:");

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 150, 103));
        jLabel4.setText("ADD FAIR:");

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel5.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel6.setText("Entrance Fee:");

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 150, 103));
        jLabel8.setText("DELETE FAIR:");

        list_of_fairs_to_remove.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(list_of_fairs_to_remove);

        delete_fair_button.setText("DELETE");
        delete_fair_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_fair_buttonActionPerformed(evt);
            }
        });

        add_fair_button.setText("ADD FAIR");
        add_fair_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_fair_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fair_management_panelLayout = new javax.swing.GroupLayout(fair_management_panel);
        fair_management_panel.setLayout(fair_management_panelLayout);
        fair_management_panelLayout.setHorizontalGroup(
            fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fair_management_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fair_management_screen_label, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(fair_management_panelLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fair_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fair_management_panelLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fair_entrance_fee_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4))
                    .addComponent(delete_fair_button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_fair_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        fair_management_panelLayout.setVerticalGroup(
            fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fair_management_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fair_management_screen_label, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fair_management_panelLayout.createSequentialGroup()
                        .addGroup(fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fair_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(fair_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fair_entrance_fee_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(add_fair_button)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(delete_fair_button)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        parent_panel.add(fair_management_panel, "card5");

        store_management_panel.setBackground(new java.awt.Color(246, 70, 104));

        store_management_screen_label.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        store_management_screen_label.setForeground(new java.awt.Color(254, 150, 103));
        store_management_screen_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        store_management_screen_label.setText("STORE MANAGEMENT");

        jSeparator2.setForeground(new java.awt.Color(254, 150, 103));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Store Name", "Category", "No. Customers", "Profit", "Owner", "Fair"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 150, 103));
        jLabel1.setText("STORE LIST:");

        jLabel17.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(254, 150, 103));
        jLabel17.setText("ADD STORE;");

        jLabel18.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel18.setText("Fair");

        jLabel19.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel19.setText("Store Name:");

        store_category_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel20.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel20.setText("Category");

        store_fair_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        store_fair_combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                store_fair_combo_boxActionPerformed(evt);
            }
        });

        add_store_button.setText("ADD STORE");
        add_store_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_store_buttonActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(254, 150, 103));
        jLabel21.setText("REMOVE STORE:");

        jLabel22.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel22.setText("SELECT STORE TO REMOVE");

        stores_to_delete_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(stores_to_delete_list);

        delete_store_button.setText("REMOVE STORE");
        delete_store_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_store_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout store_management_panelLayout = new javax.swing.GroupLayout(store_management_panel);
        store_management_panel.setLayout(store_management_panelLayout);
        store_management_panelLayout.setHorizontalGroup(
            store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(store_management_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(store_management_panelLayout.createSequentialGroup()
                        .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addComponent(store_management_screen_label, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addGap(631, 631, 631))
                    .addGroup(store_management_panelLayout.createSequentialGroup()
                        .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(store_management_panelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, store_management_panelLayout.createSequentialGroup()
                                .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, store_management_panelLayout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(store_name_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, store_management_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, store_management_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(store_fair_combo_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, store_management_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(store_category_combo_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(65, 65, 65))
                            .addGroup(store_management_panelLayout.createSequentialGroup()
                                .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_store_button)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete_store_button))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        store_management_panelLayout.setVerticalGroup(
            store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(store_management_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(store_management_screen_label, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(store_management_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(store_management_panelLayout.createSequentialGroup()
                        .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(store_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(store_category_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(store_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(store_fair_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(add_store_button)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_store_button)
                        .addGap(38, 38, 38))))
        );

        parent_panel.add(store_management_panel, "card2");

        user_management_panel.setBackground(new java.awt.Color(246, 70, 104));

        user_management_screen_label.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        user_management_screen_label.setForeground(new java.awt.Color(254, 150, 103));
        user_management_screen_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_management_screen_label.setText("USER MANAGEMENT");

        jSeparator3.setForeground(new java.awt.Color(254, 150, 103));

        users_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Access Level", "Store Name", "Fair Name"
            }
        ));
        jScrollPane3.setViewportView(users_table);

        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 150, 103));
        jLabel9.setText("USER LIST:");

        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 150, 103));
        jLabel10.setText("ADD USER:");

        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel11.setText("Username:");

        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel12.setText("Access Level");

        jLabel13.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel13.setText("Password");

        jLabel14.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel14.setText("CHOOSE THE FAIR / STORE YOU OWN");

        user_fairorstore_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        add_user_button.setText("ADD USER");
        add_user_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_user_buttonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 150, 103));
        jLabel15.setText("DELETE USER :");

        users_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel16.setText("SELECT THE STORE OWNER/FAIR OWNER/ADMIN");

        delete_user_button.setText("DELETE USER");

        access_level_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        access_level_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                access_level_listMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(access_level_list);

        javax.swing.GroupLayout user_management_panelLayout = new javax.swing.GroupLayout(user_management_panel);
        user_management_panel.setLayout(user_management_panelLayout);
        user_management_panelLayout.setHorizontalGroup(
            user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_management_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_management_panelLayout.createSequentialGroup()
                        .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(user_management_panelLayout.createSequentialGroup()
                                .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator3)
                                    .addComponent(user_management_screen_label, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                                .addGap(204, 204, 204))
                            .addGroup(user_management_panelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(user_management_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(229, Short.MAX_VALUE))
                            .addGroup(user_management_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(user_management_panelLayout.createSequentialGroup()
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))
                                    .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(user_management_panelLayout.createSequentialGroup()
                                            .addComponent(user_password_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addContainerGap(49, Short.MAX_VALUE))
                                        .addGroup(user_management_panelLayout.createSequentialGroup()
                                            .addComponent(user_username_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addContainerGap(49, Short.MAX_VALUE)))))
                            .addGroup(user_management_panelLayout.createSequentialGroup()
                                .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(users_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete_user_button))
                                .addContainerGap(63, Short.MAX_VALUE))))
                    .addGroup(user_management_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_fairorstore_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_user_button))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        user_management_panelLayout.setVerticalGroup(
            user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_management_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(user_management_screen_label, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(user_management_panelLayout.createSequentialGroup()
                        .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(user_username_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_password_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(user_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_fairorstore_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_user_button)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(users_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_user_button)))
                .addGap(26, 26, 26))
        );

        parent_panel.add(user_management_panel, "card3");

        panel_middle.setBackground(new java.awt.Color(65, 67, 106));
        panel_middle.setForeground(new java.awt.Color(65, 67, 106));

        javax.swing.GroupLayout panel_middleLayout = new javax.swing.GroupLayout(panel_middle);
        panel_middle.setLayout(panel_middleLayout);
        panel_middleLayout.setHorizontalGroup(
            panel_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        panel_middleLayout.setVerticalGroup(
            panel_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_left.setBackground(new java.awt.Color(152, 64, 99));

        fair_management_button_panel.setBackground(new java.awt.Color(254, 150, 103));
        fair_management_button_panel.setPreferredSize(new java.awt.Dimension(100, 50));
        fair_management_button_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fair_management_button_panelMouseClicked(evt);
            }
        });

        fair_management_label.setBackground(new java.awt.Color(254, 150, 103));
        fair_management_label.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        fair_management_label.setForeground(new java.awt.Color(255, 255, 255));
        fair_management_label.setText("FAIR MANAGEMENT");

        javax.swing.GroupLayout fair_management_button_panelLayout = new javax.swing.GroupLayout(fair_management_button_panel);
        fair_management_button_panel.setLayout(fair_management_button_panelLayout);
        fair_management_button_panelLayout.setHorizontalGroup(
            fair_management_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fair_management_button_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fair_management_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fair_management_button_panelLayout.setVerticalGroup(
            fair_management_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fair_management_button_panelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(fair_management_label)
                .addGap(16, 16, 16))
        );

        store_management_button_panel.setBackground(new java.awt.Color(65, 67, 106));
        store_management_button_panel.setPreferredSize(new java.awt.Dimension(100, 50));
        store_management_button_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                store_management_button_panelMouseClicked(evt);
            }
        });

        store_management_label.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        store_management_label.setForeground(new java.awt.Color(254, 150, 103));
        store_management_label.setText("STORE MANAGEMENT");

        javax.swing.GroupLayout store_management_button_panelLayout = new javax.swing.GroupLayout(store_management_button_panel);
        store_management_button_panel.setLayout(store_management_button_panelLayout);
        store_management_button_panelLayout.setHorizontalGroup(
            store_management_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(store_management_button_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(store_management_label)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        store_management_button_panelLayout.setVerticalGroup(
            store_management_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(store_management_button_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(store_management_label)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        user_management_button_panel.setBackground(new java.awt.Color(65, 67, 106));
        user_management_button_panel.setPreferredSize(new java.awt.Dimension(100, 50));
        user_management_button_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_management_button_panelMouseClicked(evt);
            }
        });

        user_management_label.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        user_management_label.setForeground(new java.awt.Color(254, 150, 103));
        user_management_label.setText("USER MANAGEMENT");

        javax.swing.GroupLayout user_management_button_panelLayout = new javax.swing.GroupLayout(user_management_button_panel);
        user_management_button_panel.setLayout(user_management_button_panelLayout);
        user_management_button_panelLayout.setHorizontalGroup(
            user_management_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_management_button_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_management_label)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        user_management_button_panelLayout.setVerticalGroup(
            user_management_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_management_button_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(user_management_label)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        try{
            Font font = Font.createFont(Font.TRUETYPE_FONT,
                new File("AmbarPearlPersonalUse-0nBz.ttf"));
            Font bold = font.deriveFont(Font.BOLD, 12);
            Font plain = font.deriveFont(Font.PLAIN, 24);
            logo_label.setForeground(new java.awt.Color(254, 150, 103));
            logo_label.setFont(plain);
            logo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            logo_label.setText("MyFairLady");
            logo_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        } catch (FontFormatException | IOException e){
            e.printStackTrace();
        }

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_leftLayout = new javax.swing.GroupLayout(panel_left);
        panel_left.setLayout(panel_leftLayout);
        panel_leftLayout.setHorizontalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fair_management_button_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
            .addComponent(user_management_button_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
            .addComponent(logo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(store_management_button_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_leftLayout.setVerticalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fair_management_button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(store_management_button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_management_button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_middle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(parent_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parent_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_middle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_management_button_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_management_button_panelMouseClicked
        
        //changes colour of panels and labels to show a tab is selected
        changeBackgroundColor(user_management_button_panel, current_button,user_management_label,current_label);
        current_button = user_management_button_panel;
        current_label = user_management_label;
        
        //changes the card layout to bring up the dashboard panel
        parent_panel.removeAll();
        parent_panel.add(user_management_panel);
        parent_panel.repaint();
        parent_panel.revalidate();

    }//GEN-LAST:event_user_management_button_panelMouseClicked

    private void fair_management_button_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fair_management_button_panelMouseClicked
        
        //changes colour of panels and labels to show a tab is selected
        changeBackgroundColor(fair_management_button_panel, current_button,fair_management_label,current_label);
        current_button = fair_management_button_panel;
        current_label = fair_management_label;
        
        //changes the card layout to bring up the dashboard panel
        parent_panel.removeAll();
        parent_panel.add(fair_management_panel);
        parent_panel.repaint();
        parent_panel.revalidate();

    }//GEN-LAST:event_fair_management_button_panelMouseClicked

    private void store_management_button_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_store_management_button_panelMouseClicked
        //changes colour of panels and labels to show a tab is selected
        changeBackgroundColor(store_management_button_panel, current_button,store_management_label,current_label);
        current_button = store_management_button_panel;
        current_label = store_management_label;
        
        //changes the card layout to bring up the dashboard panel
        parent_panel.removeAll();
        parent_panel.add(store_management_panel);
        parent_panel.repaint();
        parent_panel.revalidate();

    }//GEN-LAST:event_store_management_button_panelMouseClicked

    private void add_user_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_user_buttonActionPerformed
        User u = new User(user_username_text_field.getText(),user_password_text_field.getText(),access_level_list.getSelectedValue(),(String)user_fairorstore_combo_box.getSelectedItem());
        try {
            System.out.println(u.toString());
            um.addUser(u);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_user_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        LoginScreen ls = new LoginScreen();
        ls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void store_fair_combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_store_fair_combo_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_store_fair_combo_boxActionPerformed

    private void add_fair_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_fair_buttonActionPerformed
        
        String fair_name = fair_name_text_field.getText();
        double entrance_fee = Double.parseDouble(fair_entrance_fee_text_field.getText());
        
        Fair f = new Fair(fair_name,entrance_fee,0,"");
        
        try {
            fm.addFair(f);
        } catch (SQLException ex) {
            Logger.getLogger(AdminManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_fair_buttonActionPerformed

    private void delete_fair_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_fair_buttonActionPerformed
        
        String fair_name = list_of_fairs_to_remove.getSelectedValue();
        try {
            fm.deleteFair(fair_name);
        } catch (SQLException ex) {
            Logger.getLogger(AdminManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_fair_buttonActionPerformed

    private void delete_store_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_store_buttonActionPerformed
        String store_name = stores_to_delete_list.getSelectedValue();
        try {
            sm.deleteStore(store_name);
        } catch (SQLException ex) {
            Logger.getLogger(AdminManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_store_buttonActionPerformed

    private void add_store_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_store_buttonActionPerformed
        String store_name = store_name_text_field.getText();
        double profit = 0;
        int num_customers = 0;
        String category = (String)store_category_combo_box.getSelectedItem();
        String fair = (String)store_fair_combo_box.getSelectedItem();
        String owner_username = "";
        
        Store s = new Store(store_name,profit,num_customers,category,fair,owner_username);
        try {
            sm.addStore(s);
        } catch (SQLException ex) {
            Logger.getLogger(AdminManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_store_buttonActionPerformed

    private void access_level_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_access_level_listMouseClicked
        if(access_level_list.getSelectedValue().equals("StoreOwner")){
            setListOfStoresModel(user_fairorstore_combo_box);
        }
        else if(access_level_list.getSelectedValue().equals("FairOwner")){
            setListOfFairsModel(user_fairorstore_combo_box);
        }
        else{
            DefaultComboBoxModel cbm = new DefaultComboBoxModel();
            cbm.addElement("");
            user_fairorstore_combo_box.setModel(cbm);
        }
    }//GEN-LAST:event_access_level_listMouseClicked

    private void initialiseAcessLevelComboBox(JComboBox b){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.addElement("StoreOwner");
        cbm.addElement("FairOwner");
        cbm.addElement("Admin");
        
        b.setModel(cbm);
        
    }
    
    private void changeBackgroundColor(JPanel newP, JPanel oldP,JLabel newL,JLabel oldL){
        Color off = new Color(65,67,106);
        Color on = new Color(254,150,103);
        Color label_off = new Color(254,150,103);
        Color label_on = new Color(255,255,255);
        newP.setBackground(on);
        oldP.setBackground(off);
        newL.setForeground(label_on);
        oldL.setForeground(label_off);
    }    
    
    private void initialiseListOfFairsToRemove(JList l){
        
        DefaultListModel lm = new DefaultListModel();
        for(int i = 0; i < fm.getFairNames().length;i++){
            lm.addElement(fm.getFairNames()[i]);
        
        }
        l.setModel(lm);
        
    }
    
    private void initialiseListOfStoresToRemove(JList l){
        
        DefaultListModel lm = new DefaultListModel();
        for(int i = 0; i < sm.getStoreNames().length;i++){
            lm.addElement(sm.getStoreNames()[i]);
        
        }
        l.setModel(lm);
        
    }

    private void initialiseStoreCategoryComboBox(JComboBox box){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        
        cbm.addElement("Restaurant");
        cbm.addElement("Clothing Agent");
        cbm.addElement("Cosmetics");
        cbm.addElement("Religious enquiries");
        cbm.addElement("Toy Suppliers");
        cbm.addElement("Market");
        cbm.addElement("Household");
        cbm.addElement("Security");
        cbm.addElement("Food");
        cbm.addElement("Drink");
        cbm.addElement("Office");
        cbm.addElement("Music");
        cbm.addElement("Art");
        
        box.setModel(cbm);
    }
    
    
    public void setListOfStoresModel(JComboBox b){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        for(int i = 0; i < sm.getStoreNames().length;i++){
            cbm.addElement(sm.getStoreNames()[i]);
        
        }
        b.setModel(cbm);  
        
    }
    
    public void setListOfFairsModel(JComboBox b){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        for(int i = 0; i < fm.getFairNames().length;i++){
            cbm.addElement(fm.getFairNames()[i]);
        
        }
        b.setModel(cbm);  
        
    }    
    

    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(store_manager_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(store_manager_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(store_manager_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(store_manager_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new store_manager_dashboard().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> access_level_list;
    private javax.swing.JButton add_fair_button;
    private javax.swing.JButton add_store_button;
    private javax.swing.JButton add_user_button;
    private javax.swing.JButton back_button;
    private javax.swing.JButton delete_fair_button;
    private javax.swing.JButton delete_store_button;
    private javax.swing.JButton delete_user_button;
    private javax.swing.JTextField fair_entrance_fee_text_field;
    private javax.swing.JPanel fair_management_button_panel;
    private javax.swing.JLabel fair_management_label;
    private javax.swing.JPanel fair_management_panel;
    private javax.swing.JLabel fair_management_screen_label;
    private javax.swing.JTextField fair_name_text_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable list_of_fairs_table;
    private javax.swing.JList<String> list_of_fairs_to_remove;
    private javax.swing.JLabel logo_label;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_middle;
    private javax.swing.JPanel parent_panel;
    private javax.swing.JComboBox<String> store_category_combo_box;
    private javax.swing.JComboBox<String> store_fair_combo_box;
    private javax.swing.JPanel store_management_button_panel;
    private javax.swing.JLabel store_management_label;
    private javax.swing.JPanel store_management_panel;
    private javax.swing.JLabel store_management_screen_label;
    private javax.swing.JTextField store_name_text_field;
    private javax.swing.JList<String> stores_to_delete_list;
    private javax.swing.JComboBox<String> user_fairorstore_combo_box;
    private javax.swing.JPanel user_management_button_panel;
    private javax.swing.JLabel user_management_label;
    private javax.swing.JPanel user_management_panel;
    private javax.swing.JLabel user_management_screen_label;
    private javax.swing.JTextField user_password_text_field;
    private javax.swing.JTextField user_username_text_field;
    private javax.swing.JComboBox<String> users_combo_box;
    private javax.swing.JTable users_table;
    // End of variables declaration//GEN-END:variables
}
