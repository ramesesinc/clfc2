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

@StyleSheet("com/rameses/gov/etracs/mtop/application/ApplicationMainPage.style")
@Template(FormPage.class)
public class ApplicationMainPage extends javax.swing.JPanel { 
    
    /** Creates new form ApplicationInitPage */
    public ApplicationMainPage() {
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
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xDateField2 = new com.rameses.rcp.control.XDateField();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        jPanel2 = new javax.swing.JPanel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        formPanel5 = new com.rameses.rcp.util.FormPanel();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        formPanel6 = new com.rameses.rcp.util.FormPanel();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        jPanel4 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        formPanel7 = new com.rameses.rcp.util.FormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField6 = new com.rameses.rcp.control.XTextField();
        formPanel8 = new com.rameses.rcp.util.FormPanel();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();

        jPanel3.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Transaction Information");
        jPanel3.setBorder(xTitledBorder1);

        xTextField5.setCaption("Application No.");
        xTextField5.setCaptionWidth(95);
        xTextField5.setName("application.txnno");
        xTextField5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xTextField5);

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel5.setBorder(xLineBorder1);
        xLabel5.setCaption("Franchise No.");
        xLabel5.setCaptionWidth(95);
        xLabel5.setName("application.appfranchiseno");
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xLabel5);

        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel2.setBorder(xLineBorder2);
        xLabel2.setCaption("Type");
        xLabel2.setCaptionWidth(95);
        xLabel2.setName("application.txntype");
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xLabel2);

        jPanel3.add(formPanel3);
        formPanel3.setBounds(10, 20, 280, 70);

        xDateField2.setCaption("Date Applied");
        xDateField2.setCaptionWidth(80);
        xDateField2.setName("application.txndate");
        xDateField2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xDateField2);

        com.rameses.rcp.control.border.XLineBorder xLineBorder3 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder3.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel3.setBorder(xLineBorder3);
        xLabel3.setCaption("Mode");
        xLabel3.setCaptionWidth(80);
        xLabel3.setName("application.txnmode");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xLabel3);

        jPanel3.add(formPanel4);
        formPanel4.setBounds(300, 20, 250, 70);

        xLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel6.setExpression("#{application.state}");
        xLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        xLabel6.setName("application.state");
        jPanel3.add(xLabel6);
        xLabel6.setBounds(330, 0, 220, 20);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Owner Information");
        jPanel2.setBorder(xTitledBorder2);

        com.rameses.rcp.control.border.XLineBorder xLineBorder4 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder4.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel9.setBorder(xLineBorder4);
        xLabel9.setCaption("Name");
        xLabel9.setCaptionWidth(95);
        xLabel9.setExpression("#{application.owner.name}");
        xLabel9.setName("application.owner.name");
        xLabel9.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel9);

        com.rameses.rcp.control.border.XLineBorder xLineBorder5 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder5.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel7.setBorder(xLineBorder5);
        xLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel7.setCaption("Address");
        xLabel7.setCaptionWidth(95);
        xLabel7.setExpression("#{application.owner.address}");
        xLabel7.setName("application.owner.address");
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 36));
        formPanel2.add(xLabel7);

        xTextField3.setCaption("CTC No.");
        xTextField3.setCaptionWidth(95);
        xTextField3.setIndex(-1);
        xTextField3.setName("application.ctcno");
        xTextField3.setPreferredSize(new java.awt.Dimension(210, 19));
        xTextField3.setRequired(true);
        formPanel5.add(xTextField3);

        xTextField4.setCaption("Place Issued");
        xTextField4.setCaptionWidth(95);
        xTextField4.setIndex(2);
        xTextField4.setName("application.ctcplaceissued");
        xTextField4.setPreferredSize(new java.awt.Dimension(210, 19));
        xTextField4.setRequired(true);
        formPanel5.add(xTextField4);

        xDateField1.setCaption("Date Issued");
        xDateField1.setCaptionWidth(80);
        xDateField1.setIndex(1);
        xDateField1.setName("application.ctcdateissued");
        xDateField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xDateField1.setRequired(true);
        formPanel6.add(xDateField1);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(formPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 544, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(formPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 282, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(formPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(formPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(formPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(formPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Unit Information");
        jPanel4.setBorder(xTitledBorder3);

        xComboBox2.setCaption("Make");
        xComboBox2.setCaptionWidth(95);
        xComboBox2.setExpression("#{name}");
        xComboBox2.setImmediate(true);
        xComboBox2.setIndex(3);
        xComboBox2.setItems("makeList");
        xComboBox2.setName("make");
        xComboBox2.setPreferredSize(new java.awt.Dimension(0, 19));
        xComboBox2.setRequired(true);
        formPanel1.add(xComboBox2);

        xComboBox3.setCaption("Model");
        xComboBox3.setCaptionWidth(95);
        xComboBox3.setDepends(new String[] {"make"});
        xComboBox3.setDynamic(true);
        xComboBox3.setExpression("#{name}");
        xComboBox3.setImmediate(true);
        xComboBox3.setIndex(4);
        xComboBox3.setItems("modelList");
        xComboBox3.setName("model");
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 19));
        xComboBox3.setRequired(true);
        formPanel1.add(xComboBox3);

        com.rameses.rcp.control.border.XLineBorder xLineBorder6 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder6.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel1.setBorder(xLineBorder6);
        xLabel1.setCaption("Type");
        xLabel1.setCaptionWidth(95);
        xLabel1.setDepends(new String[] {"model"});
        xLabel1.setExpression("#{model.unittype}");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        xTextField1.setCaption("Motor No.");
        xTextField1.setCaptionWidth(80);
        xTextField1.setIndex(5);
        xTextField1.setName("application.motorno");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField1.setRequired(true);
        formPanel7.add(xTextField1);

        xTextField2.setCaption("Chassis No.");
        xTextField2.setCaptionWidth(80);
        xTextField2.setIndex(6);
        xTextField2.setName("application.chassisno");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField2.setRequired(true);
        formPanel7.add(xTextField2);

        xTextField6.setCaption("Plate No.");
        xTextField6.setCaptionWidth(80);
        xTextField6.setIndex(7);
        xTextField6.setName("application.plateno");
        xTextField6.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField6.setRequired(true);
        formPanel7.add(xTextField6);

        formPanel8.setPadding(new java.awt.Insets(0, 5, 5, 5));
        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));
        org.jdesktop.layout.GroupLayout xSeparator1Layout = new org.jdesktop.layout.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 535, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        formPanel8.add(xSeparator1);

        xLookupField1.setCaption("Route");
        xLookupField1.setCaptionWidth(95);
        xLookupField1.setExpression("#{description}");
        xLookupField1.setHandler("lookupRoute");
        xLookupField1.setIndex(30);
        xLookupField1.setName("application.route");
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xLookupField1.setRequired(true);
        formPanel8.add(xLookupField1);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4Layout.createSequentialGroup()
                        .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 282, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(formPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(formPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel4, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(49, 49, 49))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private com.rameses.rcp.util.FormPanel formPanel5;
    private com.rameses.rcp.util.FormPanel formPanel6;
    private com.rameses.rcp.util.FormPanel formPanel7;
    private com.rameses.rcp.util.FormPanel formPanel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDateField xDateField2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    private com.rameses.rcp.control.XTextField xTextField6;
    // End of variables declaration//GEN-END:variables
    
}
