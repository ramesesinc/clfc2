/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.clfc.audit.amnesty.capture.bak;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author Administrator
 */

@StyleSheet
public class WaiveOptionPage extends javax.swing.JPanel {

    /**
     * Creates new form WaiveOption
     */
    public WaiveOptionPage() {
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

        xPanel3 = new com.rameses.rcp.control.XPanel();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        xCheckBox2 = new com.rameses.rcp.control.XCheckBox();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Waiver");
        xPanel3.setBorder(xTitledBorder1);

        xCheckBox1.setBackground(new java.awt.Color(232, 232, 226));
        xCheckBox1.setCheckValue(1);
        xCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xCheckBox1.setName("entity.iswaiveinterest"); // NOI18N
        xCheckBox1.setPreferredSize(new java.awt.Dimension(150, 23));
        xCheckBox1.setText("  Waive Interest");
        xCheckBox1.setUncheckValue(0);
        xCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xCheckBox1ActionPerformed(evt);
            }
        });

        xCheckBox2.setBackground(new java.awt.Color(232, 232, 226));
        xCheckBox2.setCheckValue(1);
        xCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xCheckBox2.setName("entity.iswaivepenalty"); // NOI18N
        xCheckBox2.setPreferredSize(new java.awt.Dimension(150, 23));
        xCheckBox2.setText("  Waive Penalty");
        xCheckBox2.setUncheckValue(0);

        javax.swing.GroupLayout xPanel3Layout = new javax.swing.GroupLayout(xPanel3);
        xPanel3.setLayout(xPanel3Layout);
        xPanel3Layout.setHorizontalGroup(
            xPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(xCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        xPanel3Layout.setVerticalGroup(
            xPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(xPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xCheckBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XCheckBox xCheckBox2;
    private com.rameses.rcp.control.XPanel xPanel3;
    // End of variables declaration//GEN-END:variables
}
