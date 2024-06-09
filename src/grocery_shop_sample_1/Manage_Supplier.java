/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grocery_shop_sample_1;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DILUSHA LAKSHAN
 */
public class Manage_Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Manage_Supplier
     */
    public Manage_Supplier() {
        initComponents();
        loadCompany();
        loadSuppierDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        cmbCompany = new javax.swing.JComboBox<>();
        tblSuppiers = new javax.swing.JScrollPane();
        tblSuppliers = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Last Name");

        btnUpdate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate1.setText("UPDATE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE SUPPLIERS");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel4.setText("Contact");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel5.setText("Last Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel7.setText("Company Email");

        txtEmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        txtFName.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        txtLName.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        txtContact.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        cmbCompany.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        tblSuppliers.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        tblSuppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "First Name", "Last Name", "Contact", "Company"
            }
        ));
        tblSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSuppliersMouseClicked(evt);
            }
        });
        tblSuppiers.setViewportView(tblSuppliers);

        btnAdd.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\Images\\AURORA.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(576, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(149, 149, 149)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContact, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(txtLName, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(txtFName, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(txtEmail)
                                    .addComponent(cmbCompany, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(tblSuppiers, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate))
                    .addComponent(tblSuppiers, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
            if(txtEmail.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Enter the Email Address");
            }else if(txtEmail.getText().length() > 50){
                JOptionPane.showMessageDialog(rootPane, "Email must be less than 50 characters");
            }else if(txtFName.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Enter the First Name");
            }else if(txtFName.getText().length() > 50){
                JOptionPane.showMessageDialog(rootPane, "First Name should be less than 50 characters");
            }else if(txtLName.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Enter the Last Name");
            }else if(txtLName.getText().length() > 50){
                JOptionPane.showMessageDialog(rootPane, "Last Name should be less than 50 characters");
            }else if(txtContact.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Enter the Contact Number");
            }else if(txtContact.getText().length() != 10){
                JOptionPane.showMessageDialog(rootPane, "Contact Number must have 10 numbers");
            }else if(cmbCompany.getSelectedItem().toString().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Select the Company");
            }else{
                String email = txtEmail.getText();
                String fName = txtFName.getText();
                String lName = txtLName.getText();
                String contact = txtContact.getText();
                String companyEmail = cmbCompany.getSelectedItem().toString();
                
                ResultSet rs = dbConnection.execute("SELECT  * FROM `supplier` WHERE `email`='"+email+"'");
                if(rs.next()){
                    JOptionPane.showMessageDialog(rootPane, "This suppier email has been already registered. Try anothe email...!!!");
                }else{
                    ResultSet supplierRS = dbConnection.execute("INSERT INTO `supplier` (`email`,`f_name`,`l_name`,`contact`,`company_email`) VALUES ('"+email+"','"+fName+"','"+lName+"','"+contact+"','"+companyEmail+"')");
                    JOptionPane.showMessageDialog(rootPane, "Insertion Successful");
                    
                    txtEmail.setText("");
                    txtFName.setText("");
                    txtLName.setText("");
                    txtContact.setText("");
                    
                    loadSuppierDetails();
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblSuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSuppliersMouseClicked
        try{
            DefaultTableModel model = (DefaultTableModel)tblSuppliers.getModel();
            int selectedRowIndex = tblSuppliers.getSelectedRow();
            
            txtEmail.setText(model.getValueAt(selectedRowIndex, 0).toString());
            txtFName.setText(model.getValueAt(selectedRowIndex, 1).toString());
            txtLName.setText(model.getValueAt(selectedRowIndex, 2).toString());
            txtContact.setText(model.getValueAt(selectedRowIndex, 3).toString());
            cmbCompany.setSelectedItem(model.getValueAt(selectedRowIndex, 0).toString());
            txtEmail.setEditable(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_tblSuppliersMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            if(txtEmail.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Enter the Email Address");
            }else if(txtEmail.getText().length() > 50){
                JOptionPane.showMessageDialog(rootPane, "Email must be less than 50 characters");
            }else if(txtFName.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Enter the First Name");
            }else if(txtFName.getText().length() > 50){
                JOptionPane.showMessageDialog(rootPane, "First Name should be less than 50 characters");
            }else if(txtLName.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Enter the Last Name");
            }else if(txtLName.getText().length() > 50){
                JOptionPane.showMessageDialog(rootPane, "Last Name should be less than 50 characters");
            }else if(txtContact.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Enter the Contact Number");
            }else if(txtContact.getText().length() != 10){
                JOptionPane.showMessageDialog(rootPane, "Contact Number must have 10 numbers");
            }else if(cmbCompany.getSelectedItem().toString().isEmpty() == true){
                JOptionPane.showMessageDialog(rootPane, "Select the Company");
            }else{
                String email = txtEmail.getText();
                String fName = txtFName.getText();
                String lName = txtLName.getText();
                String contact = txtContact.getText();
                String companyEmail = cmbCompany.getSelectedItem().toString();
                
                ResultSet rs = dbConnection.execute("SELECT  * FROM `supplier` WHERE `email`='"+email+"'");
                if(rs.next()){
                    ResultSet supplierRS = dbConnection.execute("UPDATE `supplier` SET `f_name`='"+fName+"', `l_name`='"+lName+"', `contact`='"+contact+"', `company_email`='"+companyEmail+"' WHERE `email`='"+email+"'");
                    JOptionPane.showMessageDialog(rootPane, "Successfully Updated");
                    loadSuppierDetails();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "This suppier email has not been registered. Try the corrcot email...!!!");
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Manage_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Supplier().setVisible(true);
            }
        });
    }
    
    //load company emails to the combo box
    private void loadCompany(){
        try{
            ResultSet companyRS = dbConnection.execute("SELECT * FROM `company`");
            while(companyRS.next()){
                String companyEmail = companyRS.getString("email");
                cmbCompany.addItem(companyEmail);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
    
    //load supplier details to the table
    private void loadSuppierDetails(){
        try{
            clearSupplierData();
            ResultSet supplierRS = dbConnection.execute("SELECT * FROM `supplier`");
            while(supplierRS.next()){
                String email = supplierRS.getString("email");
                String fName = supplierRS.getString("f_name");
                String lName = supplierRS.getString("l_name");
                String contact = supplierRS.getString("contact");
                String company = supplierRS.getString("company_email");
                
                String tblData[] = {email,fName,lName,contact,company};
                DefaultTableModel model = (DefaultTableModel)tblSuppliers.getModel();
                model.addRow(tblData);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
    
    //clear all data from the table
    private void clearSupplierData(){
        //clear data code here
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox<String> cmbCompany;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane tblSuppiers;
    private javax.swing.JTable tblSuppliers;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    // End of variables declaration//GEN-END:variables
}
