/*
 * OverageDetailSummaryReportInitPage.java
 *
 * Created on June 20, 2014, 10:46 AM
 */

package com.rameses.clfc.report.treasury.overagedetailsummary;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  louie
 */

@StyleSheet
@Template(FormPage.class)
public class OverageDetailSummaryReportInitPage extends javax.swing.JPanel {
    
    /** Creates new form OverageDetailSummaryReportInitPage */
    public OverageDetailSummaryReportInitPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setPadding(new java.awt.Insets(25, 5, 5, 5));
        xTitledBorder1.setTitle("   Report Criteria Information");
        xFormPanel1.setBorder(xTitledBorder1);
        xFormPanel1.setPadding(new java.awt.Insets(5, 10, 5, 5));
        xTextField1.setCaption("Ref. No.");
        xTextField1.setFont(new java.awt.Font("Tahoma", 0, 12));
        xTextField1.setName("refno");
        xTextField1.setPreferredSize(new java.awt.Dimension(200, 20));
        xTextField1.setRequired(true);
        xFormPanel1.add(xTextField1);

        xLookupField1.setCaption("Verifier");
        xLookupField1.setExpression("#{item.name}");
        xLookupField1.setFont(new java.awt.Font("Tahoma", 0, 12));
        xLookupField1.setHandler("signatoryLookup");
        xLookupField1.setName("verifier");
        xLookupField1.setPreferredSize(new java.awt.Dimension(200, 20));
        xLookupField1.setRequired(true);
        xFormPanel1.add(xLookupField1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}