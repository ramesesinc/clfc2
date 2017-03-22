/*
 * LoanPostingAnalyzerPage.java
 *
 * Created on December 03, 2014, 10:56 AM
 */

package com.rameses.clfc.rules;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  Elmo
 */
@Template(FormPage.class)
@StyleSheet
public class XLoanPostingAnalyzerPage extends javax.swing.JPanel {
    
    /** Creates new form LoanPostingAnalyzerPage */
    public XLoanPostingAnalyzerPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        xFormPanel3 = new com.rameses.rcp.control.XFormPanel();
        xDecimalField5 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField6 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField4 = new com.rameses.rcp.control.XDecimalField();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xDecimalField7 = new com.rameses.rcp.control.XDecimalField();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xDateField2 = new com.rameses.rcp.control.XDateField();
        xDecimalField3 = new com.rameses.rcp.control.XDecimalField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xDecimalField1 = new com.rameses.rcp.control.XDecimalField();
        xDataTable2 = new com.rameses.rcp.control.XDataTable();

        xDataTable1.setDynamic(true);
        xDataTable1.setHandler("listModel");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Loan Information");

        xFormPanel3.setCaptionWidth(120);

        xDecimalField5.setCaption("Principal");
        xDecimalField5.setName("entity.principal"); // NOI18N
        xDecimalField5.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel3.add(xDecimalField5);

        xDecimalField6.setCaption("Interest");
        xDecimalField6.setName("entity.interest"); // NOI18N
        xDecimalField6.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel3.add(xDecimalField6);

        xDecimalField4.setCaption("Absent Penalty Rate");
        xDecimalField4.setName("entity.absentrate"); // NOI18N
        xDecimalField4.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel3.add(xDecimalField4);

        xIntegerField1.setCaption("Term");
        xIntegerField1.setName("entity.term"); // NOI18N
        xFormPanel3.add(xIntegerField1);

        xDecimalField7.setCaption("Under Payment Rate");
        xDecimalField7.setName("entity.underpytrate"); // NOI18N
        xFormPanel3.add(xDecimalField7);

        xFormPanel1.setCaptionWidth(120);

        xDateField1.setCaption("Release Date");
        xDateField1.setName("entity.dtreleased"); // NOI18N
        xDateField1.setOutputFormat("MMM-dd-yyyy");
        xDateField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xDateField1.setRequired(true);
        xFormPanel1.add(xDateField1);

        xDateField2.setCaption("Maturity Date");
        xDateField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDateField2.setEnabled(false);
        xDateField2.setName("entity.dtmatured"); // NOI18N
        xDateField2.setOutputFormat("MMM-dd-yyyy");
        xDateField2.setPreferredSize(new java.awt.Dimension(0, 20));
        xDateField2.setRequired(true);
        xFormPanel1.add(xDateField2);

        xDecimalField3.setCaption("Daily Schedule");
        xDecimalField3.setName("entity.schedule"); // NOI18N
        xDecimalField3.setRequired(true);
        xFormPanel1.add(xDecimalField3);

        xComboBox1.setAllowNull(false);
        xComboBox1.setCaption("Payment Method");
        xComboBox1.setExpression("#{item.caption}");
        xComboBox1.setImmediate(true);
        xComboBox1.setItemKey("value");
        xComboBox1.setItems("paymentMethodList");
        xComboBox1.setName("entity.paymentmethod"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(150, 20));
        xComboBox1.setRequired(true);
        xFormPanel1.add(xComboBox1);

        xDecimalField1.setCaption("Avg. Amount");
        xDecimalField1.setDepends(new String[] {"entity.paymentmethod"});
        xDecimalField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField1.setName("entity.avgamt"); // NOI18N
        xDecimalField1.setRequired(true);
        xFormPanel1.add(xDecimalField1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(xFormPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 279, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(xFormPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 275, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(xFormPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(xFormPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        xDataTable2.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "billdate"}
                , new Object[]{"caption", "Billdate"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", true}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", true}
                , new Object[]{"editableWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DateColumnHandler(null, "MMM-dd-yyyy", null)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "dtpaid"}
                , new Object[]{"caption", "Date Paid"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", true}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", true}
                , new Object[]{"editableWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DateColumnHandler(null, "MMM-dd-yyyy", null)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "amount"}
                , new Object[]{"caption", "Amount"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", true}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", true}
                , new Object[]{"editableWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DecimalColumnHandler("#,##0.00", -1.0, -1.0, false, 2)}
            })
        });
        xDataTable2.setDynamic(true);
        xDataTable2.setHandler("paymentHandler");
        xDataTable2.setImmediate(true);
        xDataTable2.setName("selectedPayment"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xDataTable2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 469, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(xDataTable1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 532, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(1019, 1019, 1019))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xDataTable2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xDataTable1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 233, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDataTable xDataTable2;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDateField xDateField2;
    private com.rameses.rcp.control.XDecimalField xDecimalField1;
    private com.rameses.rcp.control.XDecimalField xDecimalField3;
    private com.rameses.rcp.control.XDecimalField xDecimalField4;
    private com.rameses.rcp.control.XDecimalField xDecimalField5;
    private com.rameses.rcp.control.XDecimalField xDecimalField6;
    private com.rameses.rcp.control.XDecimalField xDecimalField7;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel3;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    // End of variables declaration//GEN-END:variables
    
}
