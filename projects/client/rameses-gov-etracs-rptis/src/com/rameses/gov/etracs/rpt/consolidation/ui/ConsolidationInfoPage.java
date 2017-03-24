/*
 * SubdivisionPage.java
 *
 * Created on July 1, 2011, 4:55 PM
 */

package com.rameses.gov.etracs.rpt.consolidation.ui;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  rameses
 */
@Template(FormPage.class)
@StyleSheet
public class ConsolidationInfoPage extends javax.swing.JPanel {
    
    /** Creates new form SubdivisionPage */
    public ConsolidationInfoPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xFormPanel11 = new com.rameses.rcp.control.XFormPanel();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        xDateField3 = new com.rameses.rcp.control.XDateField();
        xLookupField2 = new com.rameses.rcp.control.XLookupField();
        xDateField4 = new com.rameses.rcp.control.XDateField();
        xLookupField3 = new com.rameses.rcp.control.XLookupField();
        xDateField5 = new com.rameses.rcp.control.XDateField();
        xLookupField4 = new com.rameses.rcp.control.XLookupField();
        xDateField6 = new com.rameses.rcp.control.XDateField();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xDateField1 = new com.rameses.rcp.control.XDateField();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Signatories");
        xFormPanel11.setBorder(xTitledBorder1);
        xFormPanel11.setCellspacing(1);

        xLookupField1.setCaption("Appraiser");
        xLookupField1.setCaptionWidth(115);
        xLookupField1.setExpression("#{appraiser.name}");
        xLookupField1.setHandler("lookupAppraiser");
        xLookupField1.setName("appraiser"); // NOI18N
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xLookupField1.setRequired(true);
        xFormPanel11.add(xLookupField1);

        xDateField3.setCaption("Date Appraised");
        xDateField3.setCaptionWidth(115);
        xDateField3.setName("appraiser.dtsigned"); // NOI18N
        xDateField3.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel11.add(xDateField3);

        xLookupField2.setCaption("Recommender");
        xLookupField2.setCaptionWidth(115);
        xLookupField2.setExpression("#{recommender.name}");
        xLookupField2.setHandler("lookupRecommender");
        xLookupField2.setName("recommender"); // NOI18N
        xLookupField2.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel11.add(xLookupField2);

        xDateField4.setCaption("Date Recommended");
        xDateField4.setCaptionWidth(115);
        xDateField4.setName("recommender.dtsigned"); // NOI18N
        xDateField4.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel11.add(xDateField4);

        xLookupField3.setCaption("Taxmapper");
        xLookupField3.setCaptionWidth(115);
        xLookupField3.setExpression("#{taxmapper.name}");
        xLookupField3.setHandler("lookupTaxmapper");
        xLookupField3.setName("taxmapper"); // NOI18N
        xLookupField3.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel11.add(xLookupField3);

        xDateField5.setCaption("Date Taxmapped");
        xDateField5.setCaptionWidth(115);
        xDateField5.setName("taxmapper.dtsigned"); // NOI18N
        xDateField5.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel11.add(xDateField5);

        xLookupField4.setCaption("Approver");
        xLookupField4.setCaptionWidth(115);
        xLookupField4.setExpression("#{approver.name}");
        xLookupField4.setHandler("lookupApprover");
        xLookupField4.setName("approver"); // NOI18N
        xLookupField4.setPreferredSize(new java.awt.Dimension(0, 20));
        xLookupField4.setRequired(true);
        xFormPanel11.add(xLookupField4);

        xDateField6.setCaption("Date Approved");
        xDateField6.setCaptionWidth(115);
        xDateField6.setName("approver.dtsigned"); // NOI18N
        xDateField6.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel11.add(xDateField6);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Consolidation Information");
        formPanel3.setBorder(xTitledBorder2);
        formPanel3.setCaptionWidth(120);

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Tracking No.");
        xLabel1.setExpression("#{entity.trackingno}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("Txn No.");
        xLabel2.setExpression("#{entity.txnno}");
        xLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xLabel2);

        xDateField1.setCaption("Txn Date");
        xDateField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDateField1.setEnabled(false);
        xDateField1.setName("entity.txndate"); // NOI18N
        xDateField1.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel3.add(xDateField1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 335, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDateField xDateField3;
    private com.rameses.rcp.control.XDateField xDateField4;
    private com.rameses.rcp.control.XDateField xDateField5;
    private com.rameses.rcp.control.XDateField xDateField6;
    private com.rameses.rcp.control.XFormPanel xFormPanel11;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XLookupField xLookupField2;
    private com.rameses.rcp.control.XLookupField xLookupField3;
    private com.rameses.rcp.control.XLookupField xLookupField4;
    // End of variables declaration//GEN-END:variables
    
}