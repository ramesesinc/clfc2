/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.clfc.treasury.otherreceipt;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author louie
 */

@StyleSheet
@Template(FormPage.class)
public class OtherReceiptVoidPaymentPage extends javax.swing.JPanel {

    /**
     * Creates new form OtherReceiptVoidPaymentPage
     */
    public OtherReceiptVoidPaymentPage() {
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

        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xPanel1 = new com.rameses.rcp.control.XPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xPanel2 = new com.rameses.rcp.control.XPanel();
        xPanel3 = new com.rameses.rcp.control.XPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xDecimalField1 = new com.rameses.rcp.control.XDecimalField();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        xTextArea2 = new com.rameses.rcp.control.XTextArea();

        setLayout(new java.awt.BorderLayout());

        xPanel1.setPreferredSize(new java.awt.Dimension(100, 40));

        xLabel1.setExpression("${entity.txnstate}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        xLabel1.setForeground(new java.awt.Color(255, 0, 0));
        xLabel1.setPadding(new java.awt.Insets(3, 10, 0, 0));
        xLabel1.setPreferredSize(new java.awt.Dimension(500, 30));

        javax.swing.GroupLayout xPanel1Layout = new javax.swing.GroupLayout(xPanel1);
        xPanel1.setLayout(xPanel1Layout);
        xPanel1Layout.setHorizontalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        xPanel1Layout.setVerticalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel1Layout.createSequentialGroup()
                .addComponent(xLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        add(xPanel1, java.awt.BorderLayout.NORTH);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Payment Information");
        xPanel3.setBorder(xTitledBorder1);

        xDateField1.setCaption("Date");
        xDateField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDateField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xDateField1.setName("entity.payment.dtcollected"); // NOI18N
        xDateField1.setOutputFormat("MMM-dd-yyyy");
        xFormPanel1.add(xDateField1);

        xDecimalField1.setCaption("Amount");
        xDecimalField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField1.setName("entity.payment.amount"); // NOI18N
        xFormPanel1.add(xDecimalField1);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 80));

        xTextArea1.setLineWrap(true);
        xTextArea1.setWrapStyleWord(true);
        xTextArea1.setCaption("Description");
        xTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xTextArea1.setName("entity.payment.description"); // NOI18N
        jScrollPane1.setViewportView(xTextArea1);

        xFormPanel1.add(jScrollPane1);

        javax.swing.GroupLayout xPanel3Layout = new javax.swing.GroupLayout(xPanel3);
        xPanel3.setLayout(xPanel3Layout);
        xPanel3Layout.setHorizontalGroup(
            xPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );
        xPanel3Layout.setVerticalGroup(
            xPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        xLabel2.setExpression("Reason");
        xLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        xTextArea2.setLineWrap(true);
        xTextArea2.setWrapStyleWord(true);
        xTextArea2.setCaption("Reason");
        xTextArea2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xTextArea2.setName("entity.reason"); // NOI18N
        jScrollPane2.setViewportView(xTextArea2);

        javax.swing.GroupLayout xPanel2Layout = new javax.swing.GroupLayout(xPanel2);
        xPanel2.setLayout(xPanel2Layout);
        xPanel2Layout.setHorizontalGroup(
            xPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(xPanel2Layout.createSequentialGroup()
                        .addComponent(xLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        xPanel2Layout.setVerticalGroup(
            xPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(xPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDecimalField xDecimalField1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XPanel xPanel1;
    private com.rameses.rcp.control.XPanel xPanel2;
    private com.rameses.rcp.control.XPanel xPanel3;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextArea xTextArea2;
    // End of variables declaration//GEN-END:variables
}
