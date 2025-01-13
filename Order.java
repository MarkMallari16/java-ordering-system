/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mallari_markchristian_g_2;

import javax.swing.JOptionPane;

/**
 *
 * @author STI
 */
public class Order extends javax.swing.JFrame {

    public static String productName, productPrice, productQuantity, productAmount;
    public static String tblRowProductName, tblRowProductPrice, tblRowProductQuantity;
    public static int orderId = 1000;
    public static User user;

    public Order(int productId, String name, String price, String quantity) {
        initComponents();

        txtFieldProductId.setText("" + productId);
        txtFieldProductName.setText(name);
        txtFieldProductPrice.setText(price);

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
        txtFieldProductId = new javax.swing.JTextField();
        txtFieldProductName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFieldProductPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFieldProductQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        orderBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order");

        jLabel1.setText("Product ID");

        txtFieldProductId.setEnabled(false);
        txtFieldProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldProductIdActionPerformed(evt);
            }
        });

        txtFieldProductName.setEnabled(false);

        jLabel2.setText("Name");

        txtFieldProductPrice.setEnabled(false);

        jLabel3.setText("Price");

        jLabel4.setText("Quantity");

        orderBtn.setBackground(new java.awt.Color(0, 102, 255));
        orderBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        orderBtn.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn.setText("ORDER");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldProductQuantity)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldProductPrice)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldProductName)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldProductId)
                    .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldProductIdActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed

        productName = txtFieldProductName.getText();
        productPrice = txtFieldProductPrice.getText();
        productQuantity = txtFieldProductQuantity.getText();

        if (!isValidQuantity(productQuantity)) {
            return;
        }

        double price = Double.parseDouble(txtFieldProductPrice.getText());
        int quantity = Integer.parseInt(txtFieldProductQuantity.getText());

        String[] productInfos = null;

        for (int productId : Database.productDb.keySet()) {
            String[] details = Database.productDb.get(productId);
            if (details[0].equals(productName)) {
                productInfos = details;
                break;
            }

        }
        //get the quantity
        int availableQuantity = Integer.parseInt(productInfos[2]);

        if (quantity > availableQuantity) {
            JOptionPane.showMessageDialog(this, "Insufficient stock. Available quantity: " + availableQuantity);
            navigateToUserDashboard();
            return;
        }

        double totalAmount = price * quantity;

        String[] orderInfos = {productName, productPrice, productQuantity, String.valueOf(totalAmount)};
        Database.orderDb.put(orderId, orderInfos);
        orderId++;
        availableQuantity -= quantity;

        productInfos[2] = String.valueOf(availableQuantity);

        txtFieldProductQuantity.setText(null);

        JOptionPane.showMessageDialog(this, "Order added successfully! " + " Remaining stock: " + availableQuantity);
        navigateToUserDashboard();

    }//GEN-LAST:event_orderBtnActionPerformed
    private void navigateToUserDashboard() {
        if (user == null || !user.isVisible()) {
            user = new User();
            disposeForm();
            user.setVisible(true);
        }
    }

    private boolean isValidQuantity(String textField) {
        try {
            if (!textField.isEmpty()) {
                Integer.parseInt(textField);
            }
            return true;

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Quantity must be number and not empty! Try Again.");
            return false;
        }
    }

    public void disposeForm() {
        this.dispose();
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton orderBtn;
    private javax.swing.JTextField txtFieldProductId;
    private javax.swing.JTextField txtFieldProductName;
    private javax.swing.JTextField txtFieldProductPrice;
    private javax.swing.JTextField txtFieldProductQuantity;
    // End of variables declaration//GEN-END:variables
}
