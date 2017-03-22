/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.enterprise.treasury.cashreceipt;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author rameses
 */
@Template(FormPage.class)
public class CashReceiptSelectionPage extends javax.swing.JPanel {

    /**
     * Creates new form CashReceiptPOSPage
     */
    public CashReceiptSelectionPage() {
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

        xTileView1 = new com.rameses.rcp.control.XTileView();
        jPanel1 = new javax.swing.JPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setLayout(new java.awt.BorderLayout());

        xTileView1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xTileView1.setCellSize(new java.awt.Dimension(75, 80));
        xTileView1.setDepends(new String[] {"formType"});
        xTileView1.setDynamic(true);
        xTileView1.setName("model"); // NOI18N
        xTileView1.setOpaque(false);
        xTileView1.setPadding(new java.awt.Insets(10, 20, 10, 0));
        add(xTileView1, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 30));

        xFormPanel1.setOpaque(true);
        xFormPanel1.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);

        xComboBox1.setCaption("Acct. Form");
        xComboBox1.setCaptionWidth(80);
        xComboBox1.setItems("formTypes");
        xComboBox1.setName("formType"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(120, 20));
        xFormPanel1.add(xComboBox1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XTileView xTileView1;
    // End of variables declaration//GEN-END:variables
}
