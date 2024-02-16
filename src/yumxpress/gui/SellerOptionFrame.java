/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import yumxpress.dao.CompanyDAO;
import yumxpress.dao.OrderDAO;
import yumxpress.utill.OwnerProfile;


public class SellerOptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form SellerOptionFrame
     */
    public SellerOptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.OwnerProfileLbl.setText("Hello "+OwnerProfile.getOwnerName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        LblUser = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblSellerOption = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnLogOut = new javax.swing.JButton();
        BtnDeleteAccount = new javax.swing.JButton();
        BtnAddFood = new javax.swing.JButton();
        BtnAddStaff = new javax.swing.JButton();
        BtnViewStaff = new javax.swing.JButton();
        BtnViewFood = new javax.swing.JButton();
        BtnOrderList = new javax.swing.JButton();
        OwnerProfileLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(129, 124, 178));

        LblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/user.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblSellerOption.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSellerOption.setForeground(new java.awt.Color(129, 124, 178));
        lblSellerOption.setText("Seller Options");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/seller option.png"))); // NOI18N

        BtnLogOut.setBackground(new java.awt.Color(229, 247, 165));
        BtnLogOut.setText("LogOut");
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });

        BtnDeleteAccount.setBackground(new java.awt.Color(229, 247, 165));
        BtnDeleteAccount.setText("Delete Account");
        BtnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(BtnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lblSellerOption)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblSellerOption)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLogOut)
                    .addComponent(BtnDeleteAccount))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        BtnAddFood.setBackground(new java.awt.Color(229, 247, 166));
        BtnAddFood.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnAddFood.setText("AddFood");
        BtnAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddFoodActionPerformed(evt);
            }
        });

        BtnAddStaff.setBackground(new java.awt.Color(229, 247, 166));
        BtnAddStaff.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnAddStaff.setText("Add staff");
        BtnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddStaffActionPerformed(evt);
            }
        });

        BtnViewStaff.setBackground(new java.awt.Color(229, 247, 166));
        BtnViewStaff.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnViewStaff.setText("View staff");
        BtnViewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewStaffActionPerformed(evt);
            }
        });

        BtnViewFood.setBackground(new java.awt.Color(229, 247, 166));
        BtnViewFood.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnViewFood.setText("View Food");
        BtnViewFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewFoodActionPerformed(evt);
            }
        });

        BtnOrderList.setBackground(new java.awt.Color(229, 247, 166));
        BtnOrderList.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnOrderList.setText("Order List");
        BtnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderListActionPerformed(evt);
            }
        });

        OwnerProfileLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAddFood, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnViewFood)
                            .addComponent(BtnViewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OwnerProfileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OwnerProfileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAddFood)
                .addGap(18, 18, 18)
                .addComponent(BtnAddStaff)
                .addGap(18, 18, 18)
                .addComponent(BtnViewFood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnViewStaff)
                .addGap(18, 18, 18)
                .addComponent(BtnOrderList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteAccountActionPerformed
       
        int choice=  JOptionPane.showConfirmDialog(
                null,
                "Do you want to delete your Account?",
                "Account deletion Confirmation",
                JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {

            try {

                String companyId = CompanyDAO.deactivateSellerAccount(OwnerProfile.getCompanyId());
                if (companyId == null) {
                    JOptionPane.showMessageDialog(null, "Sorry ! Account cannot be deleted");
                    return;
                }

                JOptionPane.showMessageDialog(null, "Account deleted Successfully");
                this.dispose();
                new SellerLoginFrame().setVisible(true);
            } catch (SQLException sq) {
                JOptionPane.showMessageDialog(null, "DB ERROR IN SellerOptionFrame ");
                sq.printStackTrace();
            }

        } else {

            JOptionPane.showMessageDialog(null, "Account deletion was not performed.");
        }
        
        
    }//GEN-LAST:event_BtnDeleteAccountActionPerformed

    private void BtnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderListActionPerformed
        OrderListFrame listFrame=new OrderListFrame();
        listFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnOrderListActionPerformed

    private void BtnAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddFoodActionPerformed
        AddFoodFrame foodFrame=new AddFoodFrame();
        foodFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAddFoodActionPerformed

    private void BtnViewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewFoodActionPerformed
        ViewFoodFrame foodFrame=new ViewFoodFrame();
        foodFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnViewFoodActionPerformed

    private void BtnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddStaffActionPerformed
        AddDeliveryStaffFrame foodFrame=new AddDeliveryStaffFrame();
        foodFrame.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_BtnAddStaffActionPerformed

    private void BtnViewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewStaffActionPerformed
        ViewDeliveryStaffFrame staffFrame = new ViewDeliveryStaffFrame();
        staffFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnViewStaffActionPerformed

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        SellerLoginFrame loginFrame=new SellerLoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(SellerOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddFood;
    private javax.swing.JButton BtnAddStaff;
    private javax.swing.JButton BtnDeleteAccount;
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JButton BtnOrderList;
    private javax.swing.JButton BtnViewFood;
    private javax.swing.JButton BtnViewStaff;
    private javax.swing.JLabel LblUser;
    private javax.swing.JLabel OwnerProfileLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblSellerOption;
    // End of variables declaration//GEN-END:variables
}
