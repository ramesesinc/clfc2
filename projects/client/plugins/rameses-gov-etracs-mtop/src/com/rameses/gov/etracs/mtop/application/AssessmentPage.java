/*
 * ApplicationMainPage.java
 *
 * Created on December 18, 2012, 1:31 PM
 */

package com.rameses.gov.etracs.mtop.application;

import java.math.BigDecimal;

/**
 *
 * @author  rameses
 */
public class AssessmentPage extends javax.swing.JPanel {
    
    /** Creates new form ApplicationMainPage */
    public AssessmentPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        xDataTable2 = new com.rameses.rcp.control.XDataTable();
        jPanel3 = new javax.swing.JPanel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        jPanel4 = new javax.swing.JPanel();
        formPanel5 = new com.rameses.rcp.util.FormPanel();
        xLabel11 = new com.rameses.rcp.control.XLabel();
        xLabel12 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        formPanel6 = new com.rameses.rcp.util.FormPanel();
        xLabel8 = new com.rameses.rcp.control.XLabel();
        xLabel13 = new com.rameses.rcp.control.XLabel();
        xLabel14 = new com.rameses.rcp.control.XLabel();
        formPanel7 = new com.rameses.rcp.util.FormPanel();
        xLabel15 = new com.rameses.rcp.control.XLabel();
        xLabel16 = new com.rameses.rcp.control.XLabel();
        xLabel17 = new com.rameses.rcp.control.XLabel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Taxes and Fees");
        xDataTable2.setBorder(xTitledBorder1);
        xDataTable2.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "accttitle"}
                , new Object[]{"caption", "Account"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "year"}
                , new Object[]{"caption", "Year"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.IntegerColumnHandler("###0", -1, -1)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "amount"}
                , new Object[]{"caption", "Amount"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DecimalColumnHandler("#,##0.00", -1.0, -1.0, false, 2)}
            })
        });
        xDataTable2.setHandler("taxfeeListHandler");

        jPanel3.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Transaction Information");
        jPanel3.setBorder(xTitledBorder2);

        formPanel3.setPreferredSize(new java.awt.Dimension(350, 71));
        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel9.setBorder(xLineBorder1);
        xLabel9.setCaption("Application No.");
        xLabel9.setCaptionWidth(95);
        xLabel9.setExpression("#{application.txnno}");
        xLabel9.setPreferredSize(new java.awt.Dimension(250, 19));
        formPanel3.add(xLabel9);

        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel10.setBorder(xLineBorder2);
        xLabel10.setCaption("Franchise No.");
        xLabel10.setCaptionWidth(95);
        xLabel10.setExpression("#{application.appfranchiseno}");
        xLabel10.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xLabel10);

        com.rameses.rcp.control.border.XLineBorder xLineBorder3 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder3.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel2.setBorder(xLineBorder3);
        xLabel2.setCaption("Type");
        xLabel2.setCaptionWidth(95);
        xLabel2.setExpression("#{application.txntype}");
        xLabel2.setPreferredSize(new java.awt.Dimension(250, 19));
        formPanel3.add(xLabel2);

        jPanel3.add(formPanel3);
        formPanel3.setBounds(10, 20, 280, 70);

        com.rameses.rcp.control.border.XLineBorder xLineBorder4 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder4.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel4.setBorder(xLineBorder4);
        xLabel4.setCaption("Date Applied");
        xLabel4.setCaptionWidth(80);
        xLabel4.setExpression("#{application.txndate}");
        xLabel4.setPreferredSize(new java.awt.Dimension(250, 19));
        formPanel4.add(xLabel4);

        com.rameses.rcp.control.border.XLineBorder xLineBorder5 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder5.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel3.setBorder(xLineBorder5);
        xLabel3.setCaption("Mode");
        xLabel3.setCaptionWidth(80);
        xLabel3.setExpression("#{application.txnmode}");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xLabel3);

        jPanel3.add(formPanel4);
        formPanel4.setBounds(300, 20, 250, 70);

        xLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel6.setExpression("#{application.state}");
        xLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        xLabel6.setName("application.state");
        jPanel3.add(xLabel6);
        xLabel6.setBounds(340, 0, 210, 20);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Application Information");
        jPanel4.setBorder(xTitledBorder3);

        com.rameses.rcp.control.border.XLineBorder xLineBorder6 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder6.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel11.setBorder(xLineBorder6);
        xLabel11.setCaption("Unit Type");
        xLabel11.setCaptionWidth(95);
        xLabel11.setExpression("#{application.unittype}");
        xLabel11.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel5.add(xLabel11);

        com.rameses.rcp.control.border.XLineBorder xLineBorder7 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder7.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel12.setBorder(xLineBorder7);
        xLabel12.setCaption("Make");
        xLabel12.setCaptionWidth(95);
        xLabel12.setExpression("#{application.make}");
        xLabel12.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel5.add(xLabel12);

        com.rameses.rcp.control.border.XLineBorder xLineBorder8 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder8.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel7.setBorder(xLineBorder8);
        xLabel7.setCaption("Model");
        xLabel7.setCaptionWidth(95);
        xLabel7.setExpression("#{application.model}");
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel5.add(xLabel7);

        formPanel6.setPadding(new java.awt.Insets(5, 8, 5, 5));
        com.rameses.rcp.control.border.XLineBorder xLineBorder9 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder9.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel8.setBorder(xLineBorder9);
        xLabel8.setCaption("Motor No.");
        xLabel8.setExpression("#{application.motorno}");
        xLabel8.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel8);

        com.rameses.rcp.control.border.XLineBorder xLineBorder10 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder10.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel13.setBorder(xLineBorder10);
        xLabel13.setCaption("Chassis No.");
        xLabel13.setExpression("#{application.chassisno}");
        xLabel13.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel13);

        com.rameses.rcp.control.border.XLineBorder xLineBorder11 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder11.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel14.setBorder(xLineBorder11);
        xLabel14.setCaption("Plate No.");
        xLabel14.setExpression("#{application.plateno}");
        xLabel14.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel14);

        formPanel7.setPadding(new java.awt.Insets(0, 5, 5, 5));
        com.rameses.rcp.control.border.XLineBorder xLineBorder12 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder12.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel15.setBorder(xLineBorder12);
        xLabel15.setCaption("Route");
        xLabel15.setCaptionWidth(95);
        xLabel15.setExpression("#{application.route.description}");
        xLabel15.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel7.add(xLabel15);

        com.rameses.rcp.control.border.XLineBorder xLineBorder13 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder13.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel16.setBorder(xLineBorder13);
        xLabel16.setCaption("Owner Name");
        xLabel16.setCaptionWidth(95);
        xLabel16.setExpression("#{application.owner.name}");
        xLabel16.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel7.add(xLabel16);

        xLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        com.rameses.rcp.control.border.XLineBorder xLineBorder14 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder14.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel17.setBorder(xLineBorder14);
        xLabel17.setCaption("Owner Address");
        xLabel17.setCaptionWidth(95);
        xLabel17.setExpression("#{application.owner.address}");
        xLabel17.setPreferredSize(new java.awt.Dimension(0, 36));
        formPanel7.add(xLabel17);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4Layout.createSequentialGroup()
                        .add(formPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 280, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(formPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 254, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(formPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(formPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(70, 70, 70))
        );

        formPanel1.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xNumberField3.setCaption("Total Assessment");
        xNumberField3.setCaptionWidth(100);
        xNumberField3.setEnabled(false);
        xNumberField3.setFieldType(BigDecimal.class);
        xNumberField3.setFont(new java.awt.Font("Arial", 1, 12));
        xNumberField3.setName("totalAssessment");
        xNumberField3.setOpaque(false);
        xNumberField3.setPattern("#,##0.00");
        xNumberField3.setPreferredSize(new java.awt.Dimension(150, 20));
        formPanel1.add(xNumberField3);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .add(38, 38, 38))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, xDataTable2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                            .add(jPanel4, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xDataTable2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 572, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private com.rameses.rcp.util.FormPanel formPanel5;
    private com.rameses.rcp.util.FormPanel formPanel6;
    private com.rameses.rcp.util.FormPanel formPanel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.rameses.rcp.control.XDataTable xDataTable2;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel11;
    private com.rameses.rcp.control.XLabel xLabel12;
    private com.rameses.rcp.control.XLabel xLabel13;
    private com.rameses.rcp.control.XLabel xLabel14;
    private com.rameses.rcp.control.XLabel xLabel15;
    private com.rameses.rcp.control.XLabel xLabel16;
    private com.rameses.rcp.control.XLabel xLabel17;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    // End of variables declaration//GEN-END:variables
    
}
