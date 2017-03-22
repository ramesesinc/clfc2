/*
 * MiscPOSPage.java
 *
 * Created on November 10, 2013, 10:44 AM
 */

package com.rameses.enterprise.treasury.cashreceipt;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  Rameses
 */
@Template(FormPage.class)
public class SingleItemCashReceiptPage extends javax.swing.JPanel {
    
    /** Creates new form MiscPOSPage */
    public SingleItemCashReceiptPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xSeparator2 = new com.rameses.rcp.control.XSeparator();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xDecimalField1 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField2 = new com.rameses.rcp.control.XDecimalField();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xSeparator3 = new com.rameses.rcp.control.XSeparator();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();

        setPreferredSize(new java.awt.Dimension(543, 376));

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Collection Information");
        jPanel1.setBorder(xTitledBorder1);

        xFormPanel1.setCaptionFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(153, 153, 153));
        xLabel2.setBorder(xLineBorder1);
        xLabel2.setCaption("Serial No.");
        xLabel2.setCaptionWidth(160);
        xLabel2.setExpression("#{entity.receiptno}");
        xLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 28));
        xFormPanel1.add(xLabel2);

        xSeparator2.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout xSeparator2Layout = new javax.swing.GroupLayout(xSeparator2);
        xSeparator2.setLayout(xSeparator2Layout);
        xSeparator2Layout.setHorizontalGroup(
            xSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        xSeparator2Layout.setVerticalGroup(
            xSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        xFormPanel1.add(xSeparator2);

        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(153, 153, 153));
        xLabel1.setBorder(xLineBorder2);
        xLabel1.setCaption("Account");
        xLabel1.setCaptionWidth(160);
        xLabel1.setExpression("#{entity.items[0].item.title}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 28));
        xFormPanel1.add(xLabel1);

        xTextField1.setCaption("Paid By");
        xTextField1.setCaptionMnemonic('b');
        xTextField1.setCaptionWidth(160);
        xTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        xTextField1.setName("entity.paidby"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 28));
        xTextField1.setRequired(true);
        xFormPanel1.add(xTextField1);

        xTextField2.setCaption("Address");
        xTextField2.setCaptionWidth(160);
        xTextField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        xTextField2.setName("entity.paidbyaddress"); // NOI18N
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 28));
        xTextField2.setRequired(true);
        xFormPanel1.add(xTextField2);

        xDecimalField1.setCaption("Amount");
        xDecimalField1.setCaptionWidth(160);
        xDecimalField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        xDecimalField1.setName("entity.amount"); // NOI18N
        xDecimalField1.setPreferredSize(new java.awt.Dimension(170, 28));
        xDecimalField1.setRequired(true);
        xFormPanel1.add(xDecimalField1);

        xDecimalField2.setCaption("Cash Received");
        xDecimalField2.setCaptionWidth(160);
        xDecimalField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        xDecimalField2.setName("entity.totalcash"); // NOI18N
        xDecimalField2.setPreferredSize(new java.awt.Dimension(170, 28));
        xDecimalField2.setRequired(true);
        xFormPanel1.add(xDecimalField2);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout xSeparator1Layout = new javax.swing.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        xFormPanel1.add(xSeparator1);

        xTextField3.setCaption("Remarks");
        xTextField3.setCaptionWidth(160);
        xTextField3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        xTextField3.setName("entity.remarks"); // NOI18N
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 28));
        xFormPanel1.add(xTextField3);

        xSeparator3.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout xSeparator3Layout = new javax.swing.GroupLayout(xSeparator3);
        xSeparator3.setLayout(xSeparator3Layout);
        xSeparator3Layout.setHorizontalGroup(
            xSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        xSeparator3Layout.setVerticalGroup(
            xSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        xFormPanel1.add(xSeparator3);

        xComboBox1.setCaption("Include Paid By Info in Remarks");
        xComboBox1.setCaptionWidth(180);
        xComboBox1.setIndex(100);
        xComboBox1.setItems("optionList");
        xComboBox1.setName("includePaidInfoInRemarks"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(100, 20));
        xFormPanel2.add(xComboBox1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(xFormPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDecimalField xDecimalField1;
    private com.rameses.rcp.control.XDecimalField xDecimalField2;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XSeparator xSeparator2;
    private com.rameses.rcp.control.XSeparator xSeparator3;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    // End of variables declaration//GEN-END:variables
    
}
