/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.DanhMuc;
import Model.Sach;
import Model.TacGia;
import Services.DanhMucServices;
import Services.SachSerVices;
import Services.TacGiaServices;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author congt
 */
public class EditProduct extends javax.swing.JFrame {

    /**
     * Creates new form EditProduct
     */
    public Sach sach;
    public SachSerVices sachServices;
    DanhMucServices dmServices;
    TacGiaServices tgServices;
    
    public EditProduct(int id) throws SQLException {
        sachServices = new SachSerVices();
        sach = sachServices.getSachcById(id);
        
        initComponents();
        
        dmServices = new DanhMucServices();
        tgServices = new TacGiaServices();
        
        jTFMaSach.setText(sach.getMaSach());
        jTFTenSach.setText(sach.getTenSach());
        JTFSoLuongCon.setText("" + sach.getSoLuongCon());
        
        List<TacGia> tgList = tgServices.getAllTacGia();
            for (TacGia tg:tgList){
                cbTacGia.addItem(tg.getTenTG());
                if (cbTacGia.getSelectedItem().toString().equals((tg.getTenTG().toString()))){
                    jTFMaTG.setText("");
                    jTFMaTG.setText(tg.getMaTG());
                }
            }
            
            List<DanhMuc> dmList = dmServices.getAllDanhMuc();
            for (DanhMuc dm:dmList){
                cbDanhMuc.addItem(dm.getTenDM());
                if (cbDanhMuc.getSelectedItem().toString().equals((dm.getTenDM().toString()))){
                    jTFMaDM.setText("");
                    jTFMaDM.setText(dm.getMaDM());
                }
            }
        
        jTFGiaBan.setText("" + sach.getGiaBan());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTFSoLuongCon = new javax.swing.JTextField();
        jTFGiaBan = new javax.swing.JTextField();
        cbDanhMuc = new javax.swing.JComboBox<>();
        cbTacGia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTFMaDM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFMaSach = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFTenSach = new javax.swing.JTextField();
        jTFMaTG = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cập Nhật Sản Phẩm");
        setResizable(false);

        JTFSoLuongCon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFSoLuongCon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JTFSoLuongCon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTFSoLuongCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFSoLuongConActionPerformed(evt);
            }
        });

        jTFGiaBan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFGiaBan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFGiaBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFGiaBanActionPerformed(evt);
            }
        });

        cbDanhMuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDanhMuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDanhMucActionPerformed(evt);
            }
        });

        cbTacGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTacGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTacGiaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mã Danh Mục");

        jTFMaDM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTFMaDM.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFMaDM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFMaDM.setEnabled(false);
        jTFMaDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMaDMActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã Sách");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên Sách");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Số Lượn Còn");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Danh Mục");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tác Giả");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Giá Bán");

        jTFMaSach.setEditable(false);
        jTFMaSach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTFMaSach.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFMaSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFMaSach.setEnabled(false);
        jTFMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMaSachActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mã Tác Giả");

        jTFTenSach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFTenSach.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFTenSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFTenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTenSachActionPerformed(evt);
            }
        });

        jTFMaTG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTFMaTG.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFMaTG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFMaTG.setEnabled(false);
        jTFMaTG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMaTGActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFSoLuongCon, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFMaDM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFMaTG, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(83, 83, 83)
                                .addComponent(jTFMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(78, 78, 78)
                                .addComponent(jTFTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(12, 12, 12)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFSoLuongCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFMaDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFMaTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFSoLuongConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFSoLuongConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFSoLuongConActionPerformed

    private void jTFGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFGiaBanActionPerformed

    private void cbDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDanhMucActionPerformed
        try {
            List<DanhMuc> dmList = dmServices.getAllDanhMuc();
            for (DanhMuc dm:dmList){
                if (cbDanhMuc.getSelectedItem().toString().equals((dm.getTenDM().toString()))){
                    jTFMaDM.setText("");
                    jTFMaDM.setText(dm.getMaDM());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbDanhMucActionPerformed

    private void cbTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTacGiaActionPerformed
        try {
            // TODO add your handling code here:
            List<TacGia> tgList = tgServices.getAllTacGia();
            for (TacGia tg:tgList){
                if (cbTacGia.getSelectedItem().toString().equals((tg.getTenTG().toString()))){
                    jTFMaTG.setText("");
                    jTFMaTG.setText(tg.getMaTG());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbTacGiaActionPerformed

    private void jTFMaDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMaDMActionPerformed

    }//GEN-LAST:event_jTFMaDMActionPerformed

    private void jTFMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMaSachActionPerformed

    private void jTFTenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTenSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTenSachActionPerformed

    private void jTFMaTGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMaTGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMaTGActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTFTenSach.setText("");
        JTFSoLuongCon.setText("");
        jTFGiaBan.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTFMaSach.getText().equals("") || jTFTenSach.getText().equals("") || JTFSoLuongCon.getText().equals("") || jTFGiaBan.getText().equals("")){
            JOptionPane.showMessageDialog(EditProduct.this, "Không Nhận Giá Trị Rỗng","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(EditProduct.this, "Bạn Có Chắc Muốn Thay Đổi Không!","Thông Báo",JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION){
                try {
                    sach.setMaSach(jTFMaSach.getText());
                    sach.setTenSach(jTFTenSach.getText());
                    sach.setSoLuongCon(Integer.parseInt(JTFSoLuongCon.getText()));
                    sach.setMaDM(jTFMaDM.getText());
                    sach.setMaTG(jTFMaTG.getText());
                    sach.setGiaBan(Long.parseLong(jTFGiaBan.getText()));
                    
                    sachServices.update(sach);
                    
                    new Products().setVisible(true);
                    this.dispose();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(EditDanhMuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFSoLuongCon;
    private javax.swing.JComboBox<String> cbDanhMuc;
    private javax.swing.JComboBox<String> cbTacGia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTFGiaBan;
    private javax.swing.JTextField jTFMaDM;
    private javax.swing.JTextField jTFMaSach;
    private javax.swing.JTextField jTFMaTG;
    private javax.swing.JTextField jTFTenSach;
    // End of variables declaration//GEN-END:variables
}
