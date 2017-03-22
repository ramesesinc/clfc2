/*
 * RPTLedgerAddItemPage.java
 *
 * Created on July 2, 2011, 2:05 PM
 */

package com.rameses.gov.etracs.rpt.ledger.ui;

import java.math.BigDecimal;

/**
 *
 * @author  jzamora
 */
public class RPTCapturePaymentPage extends javax.swing.JPanel {
    
    /** Creates new form RPTLedgerAddItemPage */
    public RPTCapturePaymentPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xDecimalField8 = new com.rameses.rcp.control.XDecimalField();
        xButton1 = new com.rameses.rcp.control.XButton();
        xButton2 = new com.rameses.rcp.control.XButton();
        jPanel1 = new javax.swing.JPanel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xDecimalField1 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField2 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField3 = new com.rameses.rcp.control.XDecimalField();
        formPanel5 = new com.rameses.rcp.util.FormPanel();
        xDecimalField4 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField5 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField6 = new com.rameses.rcp.control.XDecimalField();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xDecimalField7 = new com.rameses.rcp.control.XDecimalField();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xDecimalField9 = new com.rameses.rcp.control.XDecimalField();

        setPreferredSize(new java.awt.Dimension(553, 479));

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Receipt Information");
        formPanel1.setBorder(xTitledBorder1);

        xTextField3.setCaption("Paid By");
        xTextField3.setCaptionWidth(100);
        xTextField3.setIndex(-100);
        xTextField3.setName("payment.paidby.name"); // NOI18N
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField3.setRequired(true);
        formPanel1.add(xTextField3);

        xTextField4.setCaption("Address");
        xTextField4.setCaptionWidth(100);
        xTextField4.setIndex(-100);
        xTextField4.setName("payment.paidby.address"); // NOI18N
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField4.setRequired(true);
        formPanel1.add(xTextField4);

        xTextField1.setCaption("Receipt No.");
        xTextField1.setCaptionWidth(100);
        xTextField1.setName("payment.refno"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField1.setRequired(true);
        formPanel1.add(xTextField1);

        xDateField1.setCaption("Receipt Date");
        xDateField1.setCaptionWidth(100);
        xDateField1.setIndex(-10);
        xDateField1.setName("payment.refdate"); // NOI18N
        xDateField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xDateField1.setRequired(true);
        formPanel1.add(xDateField1);

        xTextField2.setCaption("Collector");
        xTextField2.setCaptionWidth(100);
        xTextField2.setName("payment.collector"); // NOI18N
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField2.setRequired(true);
        formPanel1.add(xTextField2);

        xDecimalField8.setCaption("Receipt Amount");
        xDecimalField8.setCaptionWidth(100);
        xDecimalField8.setEnabled(false);
        xDecimalField8.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        xDecimalField8.setName("payment.amount"); // NOI18N
        xDecimalField8.setPreferredSize(new java.awt.Dimension(120, 20));
        formPanel1.add(xDecimalField8);

        xButton1.setMnemonic('c');
        xButton1.setImmediate(true);
        xButton1.setName("_close"); // NOI18N
        xButton1.setText("Cancel");

        xButton2.setMnemonic('o');
        xButton2.setDefaultCommand(true);
        xButton2.setName("ok"); // NOI18N
        xButton2.setText("OK");

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Payment Breakdown");
        jPanel1.setBorder(xTitledBorder2);

        formPanel2.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel2.setPadding(new java.awt.Insets(0, 0, 0, 0));

        xLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("From Year");
        xLabel1.setCellPadding(new java.awt.Insets(0, 0, 0, 20));
        xLabel1.setName("payment.fromyear"); // NOI18N
        xLabel1.setPreferredSize(new java.awt.Dimension(100, 20));
        formPanel2.add(xLabel1);

        xLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("From Qtr.");
        xLabel2.setCaptionWidth(70);
        xLabel2.setName("payment.fromqtr"); // NOI18N
        xLabel2.setPreferredSize(new java.awt.Dimension(100, 20));
        formPanel2.add(xLabel2);

        formPanel3.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel3.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel3.setPreferredSize(new java.awt.Dimension(475, 23));

        xIntegerField1.setCaption("To Year");
        xIntegerField1.setCellPadding(new java.awt.Insets(0, 0, 0, 20));
        xIntegerField1.setName("payment.toyear"); // NOI18N
        xIntegerField1.setPreferredSize(new java.awt.Dimension(100, 21));
        xIntegerField1.setRequired(true);
        formPanel3.add(xIntegerField1);

        xComboBox1.setCaption("To Qtr.");
        xComboBox1.setCaptionWidth(70);
        xComboBox1.setItems("quarters");
        xComboBox1.setName("payment.toqtr"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(100, 22));
        xComboBox1.setRequired(true);
        formPanel3.add(xComboBox1);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Basic Payment Breakdown");
        formPanel4.setBorder(xTitledBorder3);

        xDecimalField1.setCaption("Basic");
        xDecimalField1.setCaptionWidth(90);
        xDecimalField1.setName("payment.basic"); // NOI18N
        xDecimalField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xDecimalField1.setRequired(true);
        formPanel4.add(xDecimalField1);

        xDecimalField2.setCaption("Discount");
        xDecimalField2.setCaptionWidth(90);
        xDecimalField2.setName("payment.basicdisc"); // NOI18N
        xDecimalField2.setPreferredSize(new java.awt.Dimension(0, 20));
        xDecimalField2.setRequired(true);
        formPanel4.add(xDecimalField2);

        xDecimalField3.setCaption("Penalty");
        xDecimalField3.setCaptionWidth(90);
        xDecimalField3.setName("payment.basicint"); // NOI18N
        xDecimalField3.setPreferredSize(new java.awt.Dimension(0, 20));
        xDecimalField3.setRequired(true);
        formPanel4.add(xDecimalField3);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder4 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder4.setTitle("SEF Payment Breakdown");
        formPanel5.setBorder(xTitledBorder4);

        xDecimalField4.setCaption("SEF");
        xDecimalField4.setCaptionWidth(90);
        xDecimalField4.setName("payment.sef"); // NOI18N
        xDecimalField4.setPreferredSize(new java.awt.Dimension(0, 20));
        xDecimalField4.setRequired(true);
        formPanel5.add(xDecimalField4);

        xDecimalField5.setCaption("Discount");
        xDecimalField5.setCaptionWidth(90);
        xDecimalField5.setName("payment.sefdisc"); // NOI18N
        xDecimalField5.setPreferredSize(new java.awt.Dimension(0, 20));
        xDecimalField5.setRequired(true);
        formPanel5.add(xDecimalField5);

        xDecimalField6.setCaption("Penalty");
        xDecimalField6.setCaptionWidth(90);
        xDecimalField6.setName("payment.sefint"); // NOI18N
        xDecimalField6.setPreferredSize(new java.awt.Dimension(0, 20));
        xDecimalField6.setRequired(true);
        formPanel5.add(xDecimalField6);

        xFormPanel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        xDecimalField7.setCaption("Fire Code");
        xDecimalField7.setCaptionWidth(92);
        xDecimalField7.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        xDecimalField7.setName("payment.firecode"); // NOI18N
        xDecimalField7.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xDecimalField7);

        xFormPanel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        xDecimalField9.setCaption("Idle Land");
        xDecimalField9.setCaptionWidth(92);
        xDecimalField9.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        xDecimalField9.setName("payment.basicidle"); // NOI18N
        xDecimalField9.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel2.add(xDecimalField9);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, formPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .add(formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(formPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .add(xFormPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, xFormPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .add(formPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                        .add(9, 9, 9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(formPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(formPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, xFormPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, xFormPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(36, 36, 36))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(xButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 169, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private com.rameses.rcp.util.FormPanel formPanel5;
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XButton xButton2;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDecimalField xDecimalField1;
    private com.rameses.rcp.control.XDecimalField xDecimalField2;
    private com.rameses.rcp.control.XDecimalField xDecimalField3;
    private com.rameses.rcp.control.XDecimalField xDecimalField4;
    private com.rameses.rcp.control.XDecimalField xDecimalField5;
    private com.rameses.rcp.control.XDecimalField xDecimalField6;
    private com.rameses.rcp.control.XDecimalField xDecimalField7;
    private com.rameses.rcp.control.XDecimalField xDecimalField8;
    private com.rameses.rcp.control.XDecimalField xDecimalField9;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    // End of variables declaration//GEN-END:variables
    
}
