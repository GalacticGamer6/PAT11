package Frontend;

import Backend.DataTypes.Product;
import Backend.DataTypes.Store;
import Backend.ManagerClasses.ProductManager;
import Backend.ManagerClasses.StoreManager;
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
import javax.swing.table.DefaultTableModel;

public class StoreManagerScreen extends javax.swing.JFrame{

    private JPanel current_button;
    private JLabel current_label;
    private final DB db;
    public String store_name;
    private StoreManager sm = new StoreManager();
    private ProductManager pm = new ProductManager();
    
    public StoreManagerScreen() throws ClassNotFoundException, SQLException {
        this.db = new DB();
        
        initComponents();
        
        //setting up titles and Images 
        this.setTitle("Store Management");
        ImageIcon main = new ImageIcon("src\\main\\resources\\login_screen Images\\Ferris Wheel 64x.png");
        this.setIconImage(main.getImage());  
        
        
        //Initialising labels and panels for the onClicked Methods
        current_button = sales_button_panel;
        current_label = sales_label;
        initializeCategories(category_combo_box);
        

        
//        
//        //table
//        String [] column_names = new String[3];
//        column_names[0] = "Name";
//        column_names[1] = "Price";
//        column_names[2] = "Time";
//        
//        String [][] data = new String[50][3];
//        data[0][0] = "john";
//        data[0][1] = "shelby";
//        data[0][2] = "30";
//        data[1][0] = "Emma";
//        data[1][1] = "Watson";
//        data[1][2] = "30";
//        
//        DefaultTableModel tbl_model = new DefaultTableModel(data, column_names);
//        list_of_sales.setModel(tbl_model);
//        
//        
   
        String []column_names = new String[4];
        column_names[0] = "Product Name";
        column_names[1] = "Selling Price";
        column_names[2] = "Profit";
        column_names[4] = "Category";
        column_names[5] = "Quantity";
        
//        String [][] data
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parent_panel = new javax.swing.JPanel();
        sales_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        available_products_list = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_of_sales = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        sell_products_button = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        sales_manager_screen_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        inventory_panel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        product_list_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        product_name_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cost_price_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        selling_price_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        category_combo_box = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        quantity_spinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        add_prodcut_button = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        sales_manager_screen_label1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        statistics_panel = new javax.swing.JPanel();
        statistics_panel_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        panel_middle = new javax.swing.JPanel();
        panel_left = new javax.swing.JPanel();
        sales_button_panel = new javax.swing.JPanel();
        sales_label = new javax.swing.JLabel();
        inventory_button_panel = new javax.swing.JPanel();
        inventory_label = new javax.swing.JLabel();
        statistics_button_panel = new javax.swing.JPanel();
        statistics_label = new javax.swing.JLabel();
        logo_label = new javax.swing.JLabel();
        store_name_label = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        parent_panel.setBackground(new java.awt.Color(246, 70, 104));
        parent_panel.setLayout(new java.awt.CardLayout());

        sales_panel.setBackground(new java.awt.Color(246, 70, 104));

        available_products_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(available_products_list);

        list_of_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Price", "Time"
            }
        ));
        jScrollPane2.setViewportView(list_of_sales);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sell_products_button.setText("Sell");

        jLabel16.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(254, 150, 103));
        jLabel16.setText("CATEGORY");

        sales_manager_screen_label.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        sales_manager_screen_label.setForeground(new java.awt.Color(254, 150, 103));
        sales_manager_screen_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sales_manager_screen_label.setText("SALES MANAGER");

        jSeparator1.setForeground(new java.awt.Color(254, 150, 103));

        javax.swing.GroupLayout sales_panelLayout = new javax.swing.GroupLayout(sales_panel);
        sales_panel.setLayout(sales_panelLayout);
        sales_panelLayout.setHorizontalGroup(
            sales_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sales_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(sales_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sales_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sell_products_button))
                    .addGroup(sales_panelLayout.createSequentialGroup()
                        .addGroup(sales_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sales_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sales_manager_screen_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        sales_panelLayout.setVerticalGroup(
            sales_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sales_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sales_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sales_panelLayout.createSequentialGroup()
                        .addComponent(sales_manager_screen_label, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sales_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(sell_products_button)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        parent_panel.add(sales_panel, "card2");

        inventory_panel.setBackground(new java.awt.Color(246, 70, 104));

        product_list_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(product_list_table);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 150, 103));
        jLabel1.setText("PRODUCT LIST:");

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 150, 103));
        jLabel2.setText("ADD PRODUCT");

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel4.setText("Cost Price :");

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel5.setText("Selling Price :");

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel6.setText("Category ;");

        category_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel7.setText("Quantity");

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 150, 103));
        jLabel8.setText("REMOVE PRODUCT");

        add_prodcut_button.setText("ADD");
        add_prodcut_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_prodcut_buttonActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("REMOVE");

        sales_manager_screen_label1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        sales_manager_screen_label1.setForeground(new java.awt.Color(254, 150, 103));
        sales_manager_screen_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sales_manager_screen_label1.setText("INVENTORY MANAGER");

        jSeparator2.setForeground(new java.awt.Color(254, 150, 103));

        javax.swing.GroupLayout inventory_panelLayout = new javax.swing.GroupLayout(inventory_panel);
        inventory_panel.setLayout(inventory_panelLayout);
        inventory_panelLayout.setHorizontalGroup(
            inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventory_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inventory_panelLayout.createSequentialGroup()
                        .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(inventory_panelLayout.createSequentialGroup()
                                    .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(63, 63, 63)
                                    .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(product_name_field)
                                        .addComponent(cost_price_field)
                                        .addComponent(selling_price_field, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(category_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quantity_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add_prodcut_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(inventory_panelLayout.createSequentialGroup()
                        .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sales_manager_screen_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        inventory_panelLayout.setVerticalGroup(
            inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventory_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales_manager_screen_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inventory_panelLayout.createSequentialGroup()
                        .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(product_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cost_price_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(inventory_panelLayout.createSequentialGroup()
                                .addComponent(selling_price_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(category_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantity_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33)
                        .addComponent(add_prodcut_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        parent_panel.add(inventory_panel, "card3");

        statistics_panel.setBackground(new java.awt.Color(246, 70, 104));

        try{
            Font font = Font.createFont(Font.TRUETYPE_FONT,
                new File("AmbarPearlPersonalUse-0nBz.ttf"));
            Font bold = font.deriveFont(Font.BOLD, 12);
            Font plain = font.deriveFont(Font.PLAIN, 24);
            statistics_panel_label.setForeground(new java.awt.Color(254, 150, 103));
            statistics_panel_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            statistics_panel_label.setText("Statistics");
            statistics_panel_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        } catch (FontFormatException | IOException e){
            e.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 150, 103));
        jLabel9.setText("PERIOD");

        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 150, 103));
        jLabel10.setText("Total Profit");

        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 150, 103));
        jLabel11.setText("Total Sales");

        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 150, 103));
        jLabel12.setText("Total Product Cost");

        jLabel13.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 150, 103));
        jLabel13.setText("Least Sold Product");

        jLabel14.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 150, 103));
        jLabel14.setText("Customers Served");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 150, 103));
        jLabel15.setText("Most Sold Product");

        javax.swing.GroupLayout statistics_panelLayout = new javax.swing.GroupLayout(statistics_panel);
        statistics_panel.setLayout(statistics_panelLayout);
        statistics_panelLayout.setHorizontalGroup(
            statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statistics_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statistics_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(statistics_panelLayout.createSequentialGroup()
                        .addComponent(statistics_panel_label, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(417, Short.MAX_VALUE))
                    .addGroup(statistics_panelLayout.createSequentialGroup()
                        .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(statistics_panelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(statistics_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(statistics_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(statistics_panelLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(statistics_panelLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, statistics_panelLayout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField9))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, statistics_panelLayout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        statistics_panelLayout.setVerticalGroup(
            statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statistics_panelLayout.createSequentialGroup()
                .addComponent(statistics_panel_label, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        parent_panel.add(statistics_panel, "card4");

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

        sales_button_panel.setBackground(new java.awt.Color(65, 67, 106));
        sales_button_panel.setPreferredSize(new java.awt.Dimension(100, 50));
        sales_button_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sales_button_panelMouseClicked(evt);
            }
        });

        sales_label.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        sales_label.setForeground(new java.awt.Color(254, 150, 103));
        sales_label.setText("SALES");

        javax.swing.GroupLayout sales_button_panelLayout = new javax.swing.GroupLayout(sales_button_panel);
        sales_button_panel.setLayout(sales_button_panelLayout);
        sales_button_panelLayout.setHorizontalGroup(
            sales_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sales_button_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sales_button_panelLayout.setVerticalGroup(
            sales_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sales_button_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(sales_label)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        inventory_button_panel.setBackground(new java.awt.Color(65, 67, 106));
        inventory_button_panel.setPreferredSize(new java.awt.Dimension(100, 50));
        inventory_button_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventory_button_panelMouseClicked(evt);
            }
        });

        inventory_label.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        inventory_label.setForeground(new java.awt.Color(254, 150, 103));
        inventory_label.setText("INVENTORY");

        javax.swing.GroupLayout inventory_button_panelLayout = new javax.swing.GroupLayout(inventory_button_panel);
        inventory_button_panel.setLayout(inventory_button_panelLayout);
        inventory_button_panelLayout.setHorizontalGroup(
            inventory_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
            .addGroup(inventory_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inventory_button_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(inventory_label)
                    .addContainerGap(240, Short.MAX_VALUE)))
        );
        inventory_button_panelLayout.setVerticalGroup(
            inventory_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(inventory_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inventory_button_panelLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(inventory_label)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        statistics_button_panel.setBackground(new java.awt.Color(65, 67, 106));
        statistics_button_panel.setPreferredSize(new java.awt.Dimension(100, 50));
        statistics_button_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statistics_button_panelMouseClicked(evt);
            }
        });

        statistics_label.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        statistics_label.setForeground(new java.awt.Color(254, 150, 103));
        statistics_label.setText("STATISTICS");

        javax.swing.GroupLayout statistics_button_panelLayout = new javax.swing.GroupLayout(statistics_button_panel);
        statistics_button_panel.setLayout(statistics_button_panelLayout);
        statistics_button_panelLayout.setHorizontalGroup(
            statistics_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
            .addGroup(statistics_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(statistics_button_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(statistics_label)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
        statistics_button_panelLayout.setVerticalGroup(
            statistics_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(statistics_button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(statistics_button_panelLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(statistics_label)
                    .addContainerGap(13, Short.MAX_VALUE)))
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

        store_name_label.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        store_name_label.setText("jLabel17");

        back_button.setText("BACK");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_leftLayout = new javax.swing.GroupLayout(panel_left);
        panel_left.setLayout(panel_leftLayout);
        panel_leftLayout.setHorizontalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sales_button_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
            .addComponent(inventory_button_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
            .addComponent(statistics_button_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
            .addComponent(logo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(store_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_leftLayout.setVerticalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(store_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sales_button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventory_button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statistics_button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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

    private void statistics_button_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statistics_button_panelMouseClicked
        changeBackgroundColor(statistics_button_panel, current_button,statistics_label,current_label);
        
        current_button = statistics_button_panel;
        current_label = statistics_label;
        
        parent_panel.removeAll();
        parent_panel.add(statistics_panel);
        parent_panel.repaint();
        parent_panel.revalidate();
    }//GEN-LAST:event_statistics_button_panelMouseClicked

    private void inventory_button_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventory_button_panelMouseClicked
        changeBackgroundColor(inventory_button_panel, current_button,inventory_label,current_label);
        
        current_button = inventory_button_panel;
        current_label = inventory_label;
        
        store_name = store_name_label.getText();
        DefaultListModel lm = new DefaultListModel();
        System.out.println("STORE NAME: " + store_name);
        Product [] store_products_array = pm.getProductsOfAStore(store_name);
        for(int i = 0 ; i < store_products_array.length;i++){
            if(store_products_array[i].getProductName() == null){
                break;
            }
            else{
                lm.addElement(store_products_array[i].getProductName());
            }
        }
        available_products_list.setModel(lm);        
        
        parent_panel.removeAll();
        parent_panel.add(inventory_panel);
        parent_panel.repaint();
        parent_panel.revalidate();
    }//GEN-LAST:event_inventory_button_panelMouseClicked

    private void sales_button_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_button_panelMouseClicked
        changeBackgroundColor(sales_button_panel, current_button,sales_label,current_label);

        current_button = sales_button_panel;
        current_label = sales_label;
        
        parent_panel.removeAll();
        parent_panel.add(sales_panel);
        parent_panel.repaint();
        parent_panel.revalidate();

    }//GEN-LAST:event_sales_button_panelMouseClicked

    private void add_prodcut_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_prodcut_buttonActionPerformed

        
        
        try {
            String product_name = product_name_field.getText();
            store_name = store_name_label.getText();
            String fair_name = sm.searchStore(store_name).getFair_name();
            double cost_price = Double.parseDouble(cost_price_field.getText()) * 1.0;
            double selling_price = Double.parseDouble(selling_price_field.getText()) * 1.0;
            double profit = selling_price - cost_price;
            String category = (String)category_combo_box.getSelectedItem();
            int quantity = (int)quantity_spinner.getValue();
            
            
            Product p = new Product(product_name,store_name,fair_name,selling_price,cost_price,profit,category,quantity,0);
            System.out.println(p.toString());
            
            ProductManager pm = new ProductManager();
            pm.addProduct(p);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoreManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StoreManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_add_prodcut_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        LoginScreen ls = new LoginScreen();
        ls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

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
    
    private void initializeCategories(JComboBox box){
        
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        m.addElement("Food");
        m.addElement("Drink");
        m.addElement("Service");
        m.addElement("Electronics");
        m.addElement("Cosmetics");
        m.addElement("Appearal");
        m.addElement("Toys");
        m.addElement("Hardware");
        m.addElement("Accesories");
        m.addElement("Kitchenware");
        m.addElement("Hygiene");
        m.addElement("Toiletries");
        m.addElement("Office Supplies");
        m.addElement("Furniture");
        m.addElement("Stationery");
        m.addElement("Pets");
        m.addElement("Books");
        
        box.setModel(m);
        
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
    private javax.swing.JButton add_prodcut_button;
    private javax.swing.JList<String> available_products_list;
    private javax.swing.JButton back_button;
    private javax.swing.JComboBox<String> category_combo_box;
    private javax.swing.JTextField cost_price_field;
    private javax.swing.JPanel inventory_button_panel;
    private javax.swing.JLabel inventory_label;
    private javax.swing.JPanel inventory_panel;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable list_of_sales;
    private javax.swing.JLabel logo_label;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_middle;
    private javax.swing.JPanel parent_panel;
    private javax.swing.JTable product_list_table;
    private javax.swing.JTextField product_name_field;
    private javax.swing.JSpinner quantity_spinner;
    private javax.swing.JPanel sales_button_panel;
    private javax.swing.JLabel sales_label;
    private javax.swing.JLabel sales_manager_screen_label;
    private javax.swing.JLabel sales_manager_screen_label1;
    private javax.swing.JPanel sales_panel;
    private javax.swing.JButton sell_products_button;
    private javax.swing.JTextField selling_price_field;
    private javax.swing.JPanel statistics_button_panel;
    private javax.swing.JLabel statistics_label;
    private javax.swing.JPanel statistics_panel;
    private javax.swing.JLabel statistics_panel_label;
    public javax.swing.JLabel store_name_label;
    // End of variables declaration//GEN-END:variables
}
