/*
 * ApplicationInitPage.java
 *
 * Created on December 18, 2012, 11:04 AM
 */

package com.rameses.gov.etracs.mtop.application;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  rameses
 */


@StyleSheet()
@Template(FormPage.class)
public class PermitPage extends javax.swing.JPanel {
    
    /** Creates new form ApplicationInitPage */
    public PermitPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        jPanel4 = new javax.swing.JPanel();
        formPanel5 = new com.rameses.rcp.util.FormPanel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        formPanel6 = new com.rameses.rcp.util.FormPanel();
        xLabel8 = new com.rameses.rcp.control.XLabel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        formPanel7 = new com.rameses.rcp.util.FormPanel();
        xLabel11 = new com.rameses.rcp.control.XLabel();
        xLabel12 = new com.rameses.rcp.control.XLabel();
        xLabel13 = new com.rameses.rcp.control.XLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Transaction Information");
        jPanel3.setBorder(xTitledBorder1);

        xTextField1.setCaption("Permit No.");
        xTextField1.setCaptionWidth(100);
        xTextField1.setName("permit.txnno");
        xTextField1.setPreferredSize(new java.awt.Dimension(180, 19));
        formPanel3.add(xTextField1);

        jPanel3.add(formPanel3);
        formPanel3.setBounds(10, 20, 290, 40);

        xDateField1.setCaption("Date");
        xDateField1.setCaptionWidth(80);
        xDateField1.setName("permit.txndate");
        xDateField1.setPreferredSize(new java.awt.Dimension(200, 19));
        formPanel4.add(xDateField1);

        jPanel3.add(formPanel4);
        formPanel4.setBounds(310, 20, 270, 40);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Franchise Information");
        jPanel4.setBorder(xTitledBorder2);

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel3.setBorder(xLineBorder1);
        xLabel3.setCaption("Franchise No.");
        xLabel3.setCaptionWidth(100);
        xLabel3.setExpression("#{permit.appfranchiseno}");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel5.add(xLabel3);

        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel5.setBorder(xLineBorder2);
        xLabel5.setCaption("Unit Type");
        xLabel5.setCaptionWidth(100);
        xLabel5.setExpression("#{permit.unittype}");
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel5.add(xLabel5);

        com.rameses.rcp.control.border.XLineBorder xLineBorder3 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder3.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel6.setBorder(xLineBorder3);
        xLabel6.setCaption("Make");
        xLabel6.setCaptionWidth(100);
        xLabel6.setExpression("#{permit.make}");
        xLabel6.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel5.add(xLabel6);

        com.rameses.rcp.control.border.XLineBorder xLineBorder4 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder4.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel7.setBorder(xLineBorder4);
        xLabel7.setCaption("Model");
        xLabel7.setCaptionWidth(100);
        xLabel7.setExpression("#{permit.model}");
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel5.add(xLabel7);

        com.rameses.rcp.control.border.XLineBorder xLineBorder5 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder5.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel8.setBorder(xLineBorder5);
        xLabel8.setCaption("Motor No.");
        xLabel8.setExpression("#{permit.motorno}");
        xLabel8.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel8);

        com.rameses.rcp.control.border.XLineBorder xLineBorder6 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder6.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel9.setBorder(xLineBorder6);
        xLabel9.setCaption("Chassis No.");
        xLabel9.setExpression("#{permit.chassisno}");
        xLabel9.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel9);

        com.rameses.rcp.control.border.XLineBorder xLineBorder7 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder7.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel10.setBorder(xLineBorder7);
        xLabel10.setCaption("Plate No.");
        xLabel10.setName("permit.plateno");
        xLabel10.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel10);

        formPanel7.setPadding(new java.awt.Insets(0, 5, 5, 5));
        com.rameses.rcp.control.border.XLineBorder xLineBorder8 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder8.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel11.setBorder(xLineBorder8);
        xLabel11.setCaption("Route");
        xLabel11.setCaptionWidth(100);
        xLabel11.setName("permit.route.description");
        xLabel11.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel7.add(xLabel11);

        com.rameses.rcp.control.border.XLineBorder xLineBorder9 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder9.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel12.setBorder(xLineBorder9);
        xLabel12.setCaption("Owner Name");
        xLabel12.setCaptionWidth(100);
        xLabel12.setName("permit.owner.name");
        xLabel12.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel7.add(xLabel12);

        com.rameses.rcp.control.border.XLineBorder xLineBorder10 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder10.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel13.setBorder(xLineBorder10);
        xLabel13.setCaption("Owner Address");
        xLabel13.setCaptionWidth(100);
        xLabel13.setName("permit.owner.address");
        xLabel13.setPreferredSize(new java.awt.Dimension(0, 36));
        formPanel7.add(xLabel13);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, formPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(formPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 292, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(formPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 271, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 588, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(80, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel4, 0, 588, Short.MAX_VALUE)
                        .add(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 211, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private com.rameses.rcp.util.FormPanel formPanel5;
    private com.rameses.rcp.util.FormPanel formPanel6;
    private com.rameses.rcp.util.FormPanel formPanel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel11;
    private com.rameses.rcp.control.XLabel xLabel12;
    private com.rameses.rcp.control.XLabel xLabel13;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}
