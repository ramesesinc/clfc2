/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.waterworks.account;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author Dino Quimson
 */

@Template(FormPage.class)
@StyleSheet
public class CaptureAccountPage extends javax.swing.JPanel {

    /**
     * Creates new form CaptureAccountPage
     */
    public CaptureAccountPage() {
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

        jPanel1 = new javax.swing.JPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        jScrollPane2 = new javax.swing.JScrollPane();
        xTextArea2 = new com.rameses.rcp.control.XTextArea();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xLookupField2 = new com.rameses.rcp.control.XLookupField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xIntegerField3 = new com.rameses.rcp.control.XIntegerField();
        xIntegerField4 = new com.rameses.rcp.control.XIntegerField();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xDecimalField2 = new com.rameses.rcp.control.XDecimalField();
        xPanel4 = new com.rameses.rcp.control.XPanel();
        map1 = new com.rameses.javafx.control.map.Map();
        jLabel1 = new javax.swing.JLabel();
        xLookupField3 = new com.rameses.rcp.control.XLookupField();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Account Information");
        jPanel1.setBorder(xTitledBorder1);

        xFormPanel1.setCaption("");
        xFormPanel1.setCaptionWidth(160);

        xComboBox3.setCaption("Account State");
        xComboBox3.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xComboBox3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xComboBox3.setItems("states");
        xComboBox3.setName("entity.state"); // NOI18N
        xComboBox3.setPreferredSize(new java.awt.Dimension(200, 23));
        xComboBox3.setRequired(true);
        xFormPanel1.add(xComboBox3);

        xComboBox1.setCaption("Account Type");
        xComboBox1.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xComboBox1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xComboBox1.setItems("accounttypes");
        xComboBox1.setName("entity.accounttype"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(200, 23));
        xComboBox1.setRequired(true);
        xFormPanel1.add(xComboBox1);

        xLookupField1.setCaption("Name");
        xLookupField1.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xLookupField1.setExpression("#{entity.name}");
        xLookupField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xLookupField1.setHandler("lookupEntity");
        xLookupField1.setName("entity.name"); // NOI18N
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 23));
        xLookupField1.setRequired(true);
        xFormPanel1.add(xLookupField1);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(0, 59));

        xTextArea2.setEditable(false);
        xTextArea2.setText("entity.homeaddress");
        xTextArea2.setCaption("Home Addess");
        xTextArea2.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xTextArea2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xTextArea2.setName("entity.homeaddress"); // NOI18N
        xTextArea2.setPreferredSize(new java.awt.Dimension(0, 49));
        xTextArea2.setRequired(true);
        jScrollPane2.setViewportView(xTextArea2);

        xFormPanel1.add(jScrollPane2);

        xTextField1.setCaption("Contact Number");
        xTextField1.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xTextField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xTextField1.setName("entity.contactno"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(200, 23));
        xFormPanel1.add(xTextField1);

        xLookupField2.setCaption("Serial No");
        xLookupField2.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xLookupField2.setCellPadding(new java.awt.Insets(15, 0, 0, 0));
        xLookupField2.setExpression("#{entity.meter.serialno}");
        xLookupField2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xLookupField2.setHandler("lookupMeter");
        xLookupField2.setPreferredSize(new java.awt.Dimension(300, 23));
        xLookupField2.setRequired(true);
        xFormPanel1.add(xLookupField2);

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(153, 153, 153));
        xLabel1.setBorder(xLineBorder1);
        xLabel1.setCaption("Meter Details");
        xLabel1.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xLabel1.setExpression("#{entity.meter.brand}     #{entity.meter.capacity}    #{entity.meter.size}");
        xLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xLabel1.setPreferredSize(new java.awt.Dimension(300, 23));
        xFormPanel1.add(xLabel1);

        xIntegerField3.setCaption("Previous Reading");
        xIntegerField3.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField3.setName("entity.previousreading"); // NOI18N
        xIntegerField3.setPreferredSize(new java.awt.Dimension(150, 23));
        xIntegerField3.setRequired(true);
        xFormPanel1.add(xIntegerField3);

        xIntegerField4.setCaption("Consumption");
        xIntegerField4.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField4.setName("entity.consumption"); // NOI18N
        xIntegerField4.setPreferredSize(new java.awt.Dimension(150, 23));
        xIntegerField4.setRequired(true);
        xFormPanel1.add(xIntegerField4);

        xComboBox2.setCaption("Prev. Reading Month");
        xComboBox2.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xComboBox2.setExpression("#{item.caption}");
        xComboBox2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xComboBox2.setItems("months");
        xComboBox2.setName("entity.readingmonth"); // NOI18N
        xComboBox2.setPreferredSize(new java.awt.Dimension(150, 23));
        xComboBox2.setRequired(true);
        xFormPanel1.add(xComboBox2);

        xIntegerField1.setCaption("Prev. Reading Year");
        xIntegerField1.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField1.setName("entity.readingyear"); // NOI18N
        xIntegerField1.setPreferredSize(new java.awt.Dimension(150, 23));
        xIntegerField1.setRequired(true);
        xFormPanel1.add(xIntegerField1);

        xDateField1.setText("xDateField1");
        xDateField1.setCaption("Last Txn Date");
        xDateField1.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xDateField1.setCellPadding(new java.awt.Insets(15, 0, 0, 0));
        xDateField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xDateField1.setName("entity.lasttxndate"); // NOI18N
        xDateField1.setPreferredSize(new java.awt.Dimension(150, 23));
        xDateField1.setRequired(true);
        xFormPanel1.add(xDateField1);

        xDecimalField2.setText("xDecimalField2");
        xDecimalField2.setCaption("Unpaid Balance");
        xDecimalField2.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xDecimalField2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xDecimalField2.setName("entity.balance"); // NOI18N
        xDecimalField2.setPreferredSize(new java.awt.Dimension(150, 23));
        xDecimalField2.setRequired(true);
        xFormPanel1.add(xDecimalField2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Meter Location");
        xPanel4.setBorder(xTitledBorder2);

        map1.setName("entity.location"); // NOI18N

        javax.swing.GroupLayout map1Layout = new javax.swing.GroupLayout(map1);
        map1.setLayout(map1Layout);
        map1Layout.setHorizontalGroup(
            map1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        map1Layout.setVerticalGroup(
            map1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Select the Barangay: ");

        xLookupField3.setCaption("Serial No");
        xLookupField3.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xLookupField3.setCellPadding(new java.awt.Insets(15, 0, 0, 0));
        xLookupField3.setExpression("#{item.name}");
        xLookupField3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xLookupField3.setHandler("lookupBarangay");
        xLookupField3.setName("entity.address"); // NOI18N
        xLookupField3.setPreferredSize(new java.awt.Dimension(300, 23));
        xLookupField3.setRequired(true);

        javax.swing.GroupLayout xPanel4Layout = new javax.swing.GroupLayout(xPanel4);
        xPanel4.setLayout(xPanel4Layout);
        xPanel4Layout.setHorizontalGroup(
            xPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(xPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xLookupField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(xPanel4Layout.createSequentialGroup()
                        .addComponent(map1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))))
        );
        xPanel4Layout.setVerticalGroup(
            xPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(xPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(xLookupField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(map1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.rameses.javafx.control.map.Map map1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDecimalField xDecimalField2;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XIntegerField xIntegerField3;
    private com.rameses.rcp.control.XIntegerField xIntegerField4;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XLookupField xLookupField2;
    private com.rameses.rcp.control.XLookupField xLookupField3;
    private com.rameses.rcp.control.XPanel xPanel4;
    private com.rameses.rcp.control.XTextArea xTextArea2;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
}
