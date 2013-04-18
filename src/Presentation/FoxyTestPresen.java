/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;
import GatewayMapper.CustomerGateway;
import GatewayMapper.PackageGateway;
import javax.swing.DefaultListModel;
/**
 *
 * @author Andrew
 */
public class FoxyTestPresen extends javax.swing.JFrame {
    CustomerGateway cg = new CustomerGateway();
    PackageGateway pg = new PackageGateway();
    DefaultListModel model1, model2;
    /**
     * Creates new form FoxyTestPresen
     */
    public FoxyTestPresen() {
        initComponents();
        
        model1 = new DefaultListModel();
        model2 = new DefaultListModel();
        
        AddCustomer.setEnabled(true);
        GetCutomerList.setEnabled(true);
        EditCustomer.setEnabled(false);
        SaveChanges.setEnabled(false);
        DeleteCustomer.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        GetCutomerList = new javax.swing.JButton();
        CustomerID = new javax.swing.JTextField();
        CustomerName = new javax.swing.JTextField();
        CustomerAddress = new javax.swing.JTextField();
        PhoneID = new javax.swing.JTextField();
        CustomerEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AddCustomer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        EditCustomer = new javax.swing.JButton();
        SaveChanges = new javax.swing.JButton();
        DeleteCustomer = new javax.swing.JButton();
        PhoneNumbers = new javax.swing.JButton();
        AddPackages = new javax.swing.JButton();
        PackageID = new javax.swing.JTextField();
        PackageName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PackageDescrip = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        PackagePrice = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GetCutomerList.setText("Get Customer List");
        GetCutomerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetCutomerListActionPerformed(evt);
            }
        });

        CustomerID.setEditable(false);
        CustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIDActionPerformed(evt);
            }
        });

        PhoneID.setEditable(false);

        jLabel1.setText("CustomerID");

        jLabel2.setText("Name");

        jLabel3.setText("Customer Address");

        jLabel4.setText("PhoneID");

        jLabel5.setText("Email");

        AddCustomer.setText("Add Customer");
        AddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        EditCustomer.setText("Edit Customer");
        EditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCustomerActionPerformed(evt);
            }
        });

        SaveChanges.setText("Save Changes");
        SaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveChangesActionPerformed(evt);
            }
        });

        DeleteCustomer.setText("Delete Customer");
        DeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustomerActionPerformed(evt);
            }
        });

        PhoneNumbers.setText("See Edit Phone Numbers");
        PhoneNumbers.setEnabled(false);

        AddPackages.setText("Add Packages");
        AddPackages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPackagesActionPerformed(evt);
            }
        });

        jLabel6.setText("Package ID");

        jLabel7.setText("Name");

        jLabel8.setText("Description");

        PackageDescrip.setColumns(20);
        PackageDescrip.setRows(5);
        jScrollPane1.setViewportView(PackageDescrip);

        jLabel9.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(CustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(CustomerAddress)
                            .addComponent(CustomerEmail)
                            .addComponent(CustomerID)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhoneID, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(GetCutomerList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(AddCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PhoneNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(DeleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(EditCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaveChanges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PackageID, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(PackageName)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PackagePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPackages, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3)
                                .addGap(16, 16, 16)
                                .addComponent(CustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhoneID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(5, 5, 5)
                                .addComponent(CustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddCustomer)
                            .addComponent(EditCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GetCutomerList)
                            .addComponent(SaveChanges))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhoneNumbers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteCustomer))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(7, 7, 7)
                        .addComponent(PackageID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PackageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PackagePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddPackages)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetCutomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetCutomerListActionPerformed
      model1.clear();
      jList1.setModel(model1);
       cg.buildCustomerList();
        for (int i = 0; i < cg.getCustomerListSize(); i++) {
            
       model1.addElement(cg.getCustomerList(i).getCustomerID() + "-"+ cg.getCustomerList(i).getName());
        }
        jList1.setModel(model1);
        
        AddCustomer.setEnabled(true);
        GetCutomerList.setEnabled(true);
        EditCustomer.setEnabled(true);
        SaveChanges.setEnabled(false);
        DeleteCustomer.setEnabled(true);
    }//GEN-LAST:event_GetCutomerListActionPerformed

    private void CustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIDActionPerformed

    private void AddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerActionPerformed
        
        String cusName = CustomerName.getText();
        String cusAddress  = CustomerAddress.getText();
        String cusEmail = CustomerEmail.getText();
        
        
        cg.addCustomer(cusName,cusAddress,cusEmail);
        GetCutomerListActionPerformed(evt);
        
        CustomerID.setText(null);
        CustomerName.setText(null);
        CustomerAddress.setText(null);
        PhoneID.setText(null);
        CustomerEmail.setText(null);
        
    }//GEN-LAST:event_AddCustomerActionPerformed

    private void EditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCustomerActionPerformed
        
        CustomerID.setText(""+cg.getCustomerList(jList1.getSelectedIndex()).getCustomerID());
        CustomerName.setText(cg.getCustomerList(jList1.getSelectedIndex()).getName());
        CustomerAddress.setText(cg.getCustomerList(jList1.getSelectedIndex()).getAdress());
        PhoneID.setText(""+cg.getCustomerList(jList1.getSelectedIndex()).getPhoneID());
        CustomerEmail.setText(cg.getCustomerList(jList1.getSelectedIndex()).getEmail());
        
        AddCustomer.setEnabled(false);
        GetCutomerList.setEnabled(false);
        EditCustomer.setEnabled(true);
        SaveChanges.setEnabled(true);
    }//GEN-LAST:event_EditCustomerActionPerformed

    private void SaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveChangesActionPerformed
        int cusID = Integer.parseInt(CustomerID.getText());
        String cusName = CustomerName.getText();
        String cusAddress  = CustomerAddress.getText();
        int phoneID = Integer.parseInt(PhoneID.getText());
        String cusEmail = CustomerEmail.getText();
        
        cg.saveEditedCustomer(cusID,cusName,cusAddress,cusEmail);
        GetCutomerListActionPerformed(evt);
        
        AddCustomer.setEnabled(true);
        GetCutomerList.setEnabled(true);
        EditCustomer.setEnabled(true);
        SaveChanges.setEnabled(false);
        
        CustomerID.setText(null);
        CustomerName.setText(null);
        CustomerAddress.setText(null);
        PhoneID.setText(null);
        CustomerEmail.setText(null);
        DeleteCustomer.setEnabled(false);
    }//GEN-LAST:event_SaveChangesActionPerformed

    private void DeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerActionPerformed
        int cusID = cg.getCustomerList(jList1.getSelectedIndex()).getCustomerID();
        
        cg.deleteCustomer(cusID);
        GetCutomerListActionPerformed(evt);
        
        AddCustomer.setEnabled(true);
        GetCutomerList.setEnabled(true);
        EditCustomer.setEnabled(true);
        SaveChanges.setEnabled(false);
        DeleteCustomer.setEnabled(true);
    }//GEN-LAST:event_DeleteCustomerActionPerformed

    private void AddPackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPackagesActionPerformed
        // TODO add your handling code here:
        
        String name = PackageName.getText();
        String descrip = PackageDescrip.getText();
        int price = Integer.parseInt(PackagePrice.getText());
        pg.addPackage(name, descrip, price);
        
        
    }//GEN-LAST:event_AddPackagesActionPerformed

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
            java.util.logging.Logger.getLogger(FoxyTestPresen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoxyTestPresen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoxyTestPresen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoxyTestPresen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoxyTestPresen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomer;
    private javax.swing.JButton AddPackages;
    private javax.swing.JTextField CustomerAddress;
    private javax.swing.JTextField CustomerEmail;
    private javax.swing.JTextField CustomerID;
    private javax.swing.JTextField CustomerName;
    private javax.swing.JButton DeleteCustomer;
    private javax.swing.JButton EditCustomer;
    private javax.swing.JButton GetCutomerList;
    private javax.swing.JTextArea PackageDescrip;
    private javax.swing.JTextField PackageID;
    private javax.swing.JTextField PackageName;
    private javax.swing.JTextField PackagePrice;
    private javax.swing.JTextField PhoneID;
    private javax.swing.JButton PhoneNumbers;
    private javax.swing.JButton SaveChanges;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
