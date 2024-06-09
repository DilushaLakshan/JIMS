/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grocery_shop_sample_1;

import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DILUSHA LAKSHAN
 */
public class invoice extends javax.swing.JFrame {

    HashMap<String, invoiceItem> invoiceItemMap = new HashMap<>();
    private String proID;

    /**
     * Creates new form invoice
     */
    public invoice() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cmbPaymentMethod = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRemain = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblProName = new javax.swing.JLabel();
        btnSelectProduct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPaidAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("INVOICE");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel2.setText("Product Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel3.setText("Quantity");

        btnAdd.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tblInvoice.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblInvoice);

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel4.setText("Payment Method");

        cmbPaymentMethod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cmbPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARD", "CASH" }));
        cmbPaymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaymentMethodActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel5.setText("Paid Amount");

        lblAmount.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblAmount.setText("0.0");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel7.setText("Remain");

        lblRemain.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblRemain.setText("0.0");

        btnSave.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblProName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSelectProduct.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnSelectProduct.setText("SELECT PRODUCT");
        btnSelectProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectProductActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel6.setText("Amount");

        txtPaidAmount.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtPaidAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaidAmountActionPerformed(evt);
            }
        });
        txtPaidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidAmountKeyTyped(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\Images\\AURORA.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSelectProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                        .addComponent(lblProName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPaymentMethod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPaidAmount)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblRemain))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAmount)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelectProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblProName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cmbPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblAmount))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblRemain))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {

            if (txtPaidAmount.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(rootPane, "Enter the amount paid");
            } else {
                //get the current date and time
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();

                String employeeUserName = "dilusha";
                double discount = 0;

                //insert data to invoice table
                ResultSet invoiceRS = dbConnection.execute("INSERT INTO `invoice` "
                        + "(`date`,`employee_userName`,`paid_amount`,`discount`,`payment_method`)"
                        + " VALUES ('" + dtf.format(now) + "','" + employeeUserName + "','" + Double.valueOf(lblAmount.getText()) + "','" + discount + "','" + String.valueOf(cmbPaymentMethod.getSelectedItem()) + "')");

                //get the id of last inserted record from invoice table
                ResultSet invoiceRS2 = dbConnection.execute("SELECT * FROM `invoice` ORDER BY `id` DESC LIMIT 1");
                if (invoiceRS2.next()) {
                    long invoiceID = invoiceRS2.getLong("id");

                    for (invoiceItem inItems : invoiceItemMap.values()) {

                        //insert data to the invoice_item table
                        ResultSet invoiceItemRS = dbConnection.execute("INSERT INTO `invoice_item` (`quantity`,`stock_id`,`invoice_id`) VALUES ('" + inItems.getQuantity() + "','" + inItems.getStockID() + "','" + invoiceID + "')");
                        JOptionPane.showMessageDialog(rootPane, "Success");
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSelectProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectProductActionPerformed
        // TODO add your handling code here:
        Products products = new Products(this);
        products.setVisible(true);
    }//GEN-LAST:event_btnSelectProductActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            if (lblProName.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(rootPane, "Select the Product First");
            } else if (txtQuantity.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(rootPane, "Enter the quantity");
            } else {
                //get selling price from the stock table
                ResultSet stockRS = dbConnection.execute("SELECT * FROM `stock` WHERE `product_code`='" + Integer.valueOf(proID) + "'");
                if (stockRS.next()) {
                    long stockID = stockRS.getInt("id");
                    double sellingPrice = stockRS.getDouble("selling_price");

                    invoiceItem inItem = new invoiceItem();
                    inItem.setProName(lblProName.getText());
                    inItem.setProID(Long.valueOf(proID));
                    inItem.setSellingPrice(sellingPrice);
                    inItem.setQuantity(Integer.valueOf(txtQuantity.getText()));
                    inItem.setStockID(stockID);

                    invoiceItemMap.put(String.valueOf(stockID), inItem);
                    loadInvoiceItems();
                    calculateSum();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "There is no data in the stock reguarding this product");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtPaidAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaidAmountActionPerformed

    }//GEN-LAST:event_txtPaidAmountActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbPaymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaymentMethodActionPerformed
        String paymentMethod = String.valueOf(cmbPaymentMethod.getSelectedItem());
        if (paymentMethod == "CARD") {
            txtPaidAmount.setText(lblAmount.getText());
            txtPaidAmount.setEditable(false);
        }
    }//GEN-LAST:event_cmbPaymentMethodActionPerformed

    private void txtPaidAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidAmountKeyTyped

    }//GEN-LAST:event_txtPaidAmountKeyTyped

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
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invoice().setVisible(true);
            }
        });
    }

    //load items to the jTable
    private void loadInvoiceItems() {
        DefaultTableModel model = (DefaultTableModel) tblInvoice.getModel();

        model.setRowCount(0);
        for (invoiceItem inItem : invoiceItemMap.values()) {
            double total = inItem.getSellingPrice() * Double.valueOf(inItem.getQuantity());
            Vector<String> vector = new Vector<>();
            vector.add(inItem.getProName());
            vector.add(String.valueOf(inItem.getQuantity()));
            vector.add(String.valueOf(total));
            model.addRow(vector);
            tblInvoice.setModel(model);
        }
    }

    //calculate the sum of all products
    private void calculateSum() {
        try {
            int numRows = tblInvoice.getRowCount();
            double amount = 0.0;
            for (int i = 0; i < numRows; i++) {
                double total = Double.valueOf(tblInvoice.getValueAt(i, 2).toString());
                amount += total;
            }
            lblAmount.setText(String.valueOf(amount));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    //calculate the remain
    public void calculateRemain() {
        try {
            double remainAmount = Double.valueOf(txtPaidAmount.getText()) - Double.valueOf(lblAmount.getText());
            lblRemain.setText(String.valueOf(lblAmount.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    public void setProName(String name) {
        lblProName.setText(name);
    }

    public void setProID(String id) {
        proID = id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelectProduct;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbPaymentMethod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblProName;
    private javax.swing.JLabel lblRemain;
    private javax.swing.JTable tblInvoice;
    private javax.swing.JTextField txtPaidAmount;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}