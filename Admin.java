/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mallari_markchristian_g_2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author STI
 */
public class Admin extends javax.swing.JFrame {

    public static String productName, price, quantity;
    public static String tblRowProductName, tblRowProductPrice, tblRowProductQuantity;
    public static int productId = 1000, tblRowProductId;
    public static Login logCheck;
    public static UpdateProduct updProduct;

    public Admin() {
        initComponents();
        tableProductData();
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
        txtFieldProductName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFieldPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFieldQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnProductAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btnLogout1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard.png"))); // NOI18N
        jLabel1.setText(" Admin Dashboard");

        jLabel2.setText("Product name");

        jLabel3.setText("Price");

        jLabel4.setText("Quantity");

        btnProductAdd.setBackground(new java.awt.Color(0, 102, 255));
        btnProductAdd.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnProductAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnProductAdd.setText("ADD");
        btnProductAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductAddActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProduct);

        btnLogout1.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Product List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogout1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(txtFieldProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                    .addComponent(txtFieldPrice)
                                    .addComponent(txtFieldQuantity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProductAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnLogout1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean isValidPrice(String textField) {
        try {
            Double.parseDouble(textField);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price must be a number.");
            return false;
        }

    }

    private boolean isValidQuantity(String textField) {
        try {
            Integer.parseInt(textField);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantity must be a number.");
            return false;
        }
    }
    private void btnProductAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductAddActionPerformed
        productName = txtFieldProductName.getText();
        price = txtFieldPrice.getText();
        quantity = txtFieldQuantity.getText();

        String[] productInfos = {productName, price, quantity};

        if (productName.isEmpty() || price.isEmpty() || quantity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "You must fill all fields");
            return;
        }

        if (!isValidPrice(price)) {
            txtFieldPrice.setText(null);
            return;
        }
        if (!isValidQuantity(quantity)) {
            txtFieldQuantity.setText(null);
            return;
        }

        Database.productDb.put(productId, productInfos);

        productId++;
        txtFieldProductName.setText(null);
        txtFieldPrice.setText(null);
        txtFieldQuantity.setText(null);

        JOptionPane.showMessageDialog(this, "Product added successfully");
        tableProductData();

    }//GEN-LAST:event_btnProductAddActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        if (logCheck == null) {
            Login login = new Login();

            JOptionPane.showMessageDialog(this, "Successfully logout");
            disposeForm();
            login.setVisible(true);
        }
    }//GEN-LAST:event_btnLogout1ActionPerformed
    private void disposeForm() {
        this.dispose();
    }

    private void tableProductData() {
        String[] colums = {"Product ID", "Product Name", "Price", "Quantity"};
        DefaultTableModel model = new DefaultTableModel(colums, 0);

        for (int tblProductId : Database.productDb.keySet()) {
            String[] productDatas = Database.productDb.get(tblProductId);

            if (productDatas != null) {

                model.addRow(new Object[]{
                    tblProductId,
                    productDatas[0],
                    productDatas[1],
                    productDatas[2]
                });

            }
        }
        tblProduct.setModel(model);

        tblProduct.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tblProduct.getSelectedRow();

                if (row != -1) {
                    tblRowProductId = (Integer) tblProduct.getValueAt(row, 0);
                    tblRowProductName = (String) tblProduct.getValueAt(row, 1);
                    tblRowProductPrice = (String) tblProduct.getValueAt(row, 2);
                    tblRowProductQuantity = (String) tblProduct.getValueAt(row, 3);

                    if (updProduct == null || !updProduct.isVisible()) {
                        updProduct = new UpdateProduct(tblRowProductId, tblRowProductName, tblRowProductPrice, tblRowProductQuantity);
                        updProduct.setVisible(true);
                        disposeForm();
                    }
                }
            }
        });
    }

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnProductAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtFieldPrice;
    private javax.swing.JTextField txtFieldProductName;
    private javax.swing.JTextField txtFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
