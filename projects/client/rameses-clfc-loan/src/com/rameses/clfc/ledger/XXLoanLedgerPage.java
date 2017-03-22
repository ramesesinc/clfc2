/*
 * LoanLedgerPage.java
 *
 * Created on April 30, 2014, 9:54 AM
 */

package com.rameses.clfc.ledger;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  louie
 */
@StyleSheet
@Template(FormPage.class)
public class XXLoanLedgerPage extends javax.swing.JPanel {
    
    public XXLoanLedgerPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xDecimalField1 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField9 = new com.rameses.rcp.control.XDecimalField();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xDecimalField2 = new com.rameses.rcp.control.XDecimalField();
        xDateField3 = new com.rameses.rcp.control.XDateField();
        xDateField4 = new com.rameses.rcp.control.XDateField();
        xFormPanel3 = new com.rameses.rcp.control.XFormPanel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xFormPanel4 = new com.rameses.rcp.control.XFormPanel();
        xDecimalField4 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField3 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField10 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField11 = new com.rameses.rcp.control.XDecimalField();
        xTabbedPane1 = new com.rameses.rcp.control.XTabbedPane();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setPadding(new java.awt.Insets(15, 10, 10, 10));
        xTitledBorder1.setTitle(" General Information ");
        jPanel2.setBorder(xTitledBorder1);

        xFormPanel1.setCellspacing(5);
        xFormPanel1.setPadding(new java.awt.Insets(0, 0, 0, 0));

        xIntegerField1.setCaption("Term");
        xIntegerField1.setCaptionWidth(100);
        xIntegerField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xIntegerField1.setEnabled(false);
        xIntegerField1.setFontStyle("font-size:14");
        xIntegerField1.setName("entity.term"); // NOI18N
        xIntegerField1.setReadonly(true);
        xFormPanel1.add(xIntegerField1);

        xLabel3.setBackground(new java.awt.Color(250, 250, 250));
        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel3.setBorder(xLineBorder1);
        xLabel3.setCaption("Payment Method");
        xLabel3.setCaptionWidth(100);
        xLabel3.setExpression("#{entity.paymentmethod}");
        xLabel3.setFontStyle("font-size:12");
        xLabel3.setOpaque(true);
        xLabel3.setPreferredSize(new java.awt.Dimension(150, 20));
        xFormPanel1.add(xLabel3);

        xDecimalField1.setCaption("Daily Due");
        xDecimalField1.setCaptionWidth(100);
        xDecimalField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField1.setEnabled(false);
        xDecimalField1.setFontStyle("font-size:14;");
        xDecimalField1.setName("entity.dailydue"); // NOI18N
        xDecimalField1.setReadonly(true);
        xFormPanel1.add(xDecimalField1);

        xDecimalField9.setCaption("Interest");
        xDecimalField9.setCaptionWidth(100);
        xDecimalField9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField9.setEnabled(false);
        xDecimalField9.setFontStyle("font-size:14;");
        xDecimalField9.setName("entity.interestamount"); // NOI18N
        xDecimalField9.setReadonly(true);
        xFormPanel1.add(xDecimalField9);

        xFormPanel2.setCellspacing(5);
        xFormPanel2.setPadding(new java.awt.Insets(0, 0, 0, 0));

        xLabel1.setBackground(new java.awt.Color(250, 250, 250));
        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel1.setBorder(xLineBorder2);
        xLabel1.setCaption("App. No.");
        xLabel1.setCaptionWidth(100);
        xLabel1.setExpression("#{entity.appno}");
        xLabel1.setFontStyle("font-size:12");
        xLabel1.setOpaque(true);
        xLabel1.setPreferredSize(new java.awt.Dimension(150, 20));
        xFormPanel2.add(xLabel1);

        xDecimalField2.setCaption("Loan Amount");
        xDecimalField2.setCaptionWidth(100);
        xDecimalField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField2.setEnabled(false);
        xDecimalField2.setFontStyle("font-size:14;");
        xDecimalField2.setName("entity.loanamount"); // NOI18N
        xDecimalField2.setPreferredSize(new java.awt.Dimension(150, 20));
        xDecimalField2.setReadonly(true);
        xFormPanel2.add(xDecimalField2);

        xDateField3.setCaption("Date Released");
        xDateField3.setCaptionWidth(100);
        xDateField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDateField3.setEnabled(false);
        xDateField3.setFontStyle("font-size:12");
        xDateField3.setName("entity.dtreleased"); // NOI18N
        xDateField3.setOutputFormat("MMM-dd-yyyy");
        xDateField3.setPreferredSize(new java.awt.Dimension(150, 20));
        xDateField3.setReadonly(true);
        xFormPanel2.add(xDateField3);

        xDateField4.setCaption("Maturity Date");
        xDateField4.setCaptionWidth(100);
        xDateField4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDateField4.setEnabled(false);
        xDateField4.setFontStyle("font-size:12");
        xDateField4.setName("entity.dtmatured"); // NOI18N
        xDateField4.setOutputFormat("MMM-dd-yyyy");
        xDateField4.setPreferredSize(new java.awt.Dimension(150, 20));
        xDateField4.setReadonly(true);
        xFormPanel2.add(xDateField4);

        xFormPanel3.setPadding(new java.awt.Insets(0, 0, 0, 0));

        xLabel2.setBackground(new java.awt.Color(250, 250, 250));
        com.rameses.rcp.control.border.XLineBorder xLineBorder3 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder3.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel2.setBorder(xLineBorder3);
        xLabel2.setCaption("Borrower");
        xLabel2.setCaptionWidth(100);
        xLabel2.setExpression("#{entity.acctname}");
        xLabel2.setOpaque(true);
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel3.add(xLabel2);

        xFormPanel4.setCellspacing(5);
        xFormPanel4.setPadding(new java.awt.Insets(0, 0, 0, 0));

        xDecimalField4.setCaption("Principal Balance");
        xDecimalField4.setCaptionWidth(100);
        xDecimalField4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField4.setEnabled(false);
        xDecimalField4.setName("entity.balance"); // NOI18N
        xDecimalField4.setReadonly(true);
        xFormPanel4.add(xDecimalField4);

        xDecimalField3.setCaption("Updated Balance");
        xDecimalField3.setCaptionWidth(100);
        xDecimalField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField3.setEnabled(false);
        xDecimalField3.setName("entity.updatedbalance"); // NOI18N
        xFormPanel4.add(xDecimalField3);

        xDecimalField10.setCaption("Overpayment");
        xDecimalField10.setCaptionWidth(100);
        xDecimalField10.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField10.setEnabled(false);
        xDecimalField10.setName("entity.overpaymentamount"); // NOI18N
        xDecimalField10.setReadonly(true);
        xFormPanel4.add(xDecimalField10);

        xDecimalField11.setCaption("Overdue Penalty");
        xDecimalField11.setCaptionWidth(100);
        xDecimalField11.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField11.setEnabled(false);
        xDecimalField11.setName("entity.overduepenalty"); // NOI18N
        xDecimalField11.setReadonly(true);
        xFormPanel4.add(xDecimalField11);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xFormPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xFormPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xFormPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        xTabbedPane1.setDynamic(true);
        xTabbedPane1.setHandler("optionsList");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private com.rameses.rcp.control.XDateField xDateField3;
    private com.rameses.rcp.control.XDateField xDateField4;
    private com.rameses.rcp.control.XDecimalField xDecimalField1;
    private com.rameses.rcp.control.XDecimalField xDecimalField10;
    private com.rameses.rcp.control.XDecimalField xDecimalField11;
    private com.rameses.rcp.control.XDecimalField xDecimalField2;
    private com.rameses.rcp.control.XDecimalField xDecimalField3;
    private com.rameses.rcp.control.XDecimalField xDecimalField4;
    private com.rameses.rcp.control.XDecimalField xDecimalField9;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XFormPanel xFormPanel3;
    private com.rameses.rcp.control.XFormPanel xFormPanel4;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XTabbedPane xTabbedPane1;
    // End of variables declaration//GEN-END:variables
    
}
