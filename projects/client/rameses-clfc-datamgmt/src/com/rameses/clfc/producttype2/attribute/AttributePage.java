/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.clfc.producttype2.attribute;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author louie
 */

@StyleSheet
@Template(FormPage.class)
public class AttributePage extends javax.swing.JPanel {

    /**
     * Creates new form AttributePage
     */
    public AttributePage() {
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

        xTextField2 = new com.rameses.rcp.control.XTextField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xPanel1 = new com.rameses.rcp.control.XPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xSubFormPanel2 = new com.rameses.rcp.control.XSubFormPanel();

        xTextField2.setText("xTextField2");

        setLayout(new java.awt.BorderLayout());

        xLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        xLabel1.setExpression("#{entity.txnstate}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        xLabel1.setForeground(new java.awt.Color(255, 0, 0));
        xLabel1.setPreferredSize(new java.awt.Dimension(200, 30));
        add(xLabel1, java.awt.BorderLayout.NORTH);

        xFormPanel1.setCaptionWidth(90);

        xTextField1.setCaption("Code");
        xTextField1.setName("entity.code"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField1.setRequired(true);
        xTextField1.setSpaceChar('_');
        xFormPanel1.add(xTextField1);

        xTextField3.setCaption("Title");
        xTextField3.setName("entity.title"); // NOI18N
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField3.setRequired(true);
        xFormPanel1.add(xTextField3);

        xTextField4.setCaption("Var. Name");
        xTextField4.setName("entity.varname"); // NOI18N
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField4.setRequired(true);
        xTextField4.setSpaceChar('_');
        xFormPanel1.add(xTextField4);

        xTextField5.setCaption("Field Name");
        xTextField5.setName("entity.fieldname"); // NOI18N
        xTextField5.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField5.setRequired(true);
        xTextField5.setTextCase(com.rameses.rcp.constant.TextCase.LOWER);
        xFormPanel1.add(xTextField5);

        xComboBox2.setCaption("Category");
        xComboBox2.setItems("categoryList");
        xComboBox2.setName("entity.category"); // NOI18N
        xComboBox2.setPreferredSize(new java.awt.Dimension(150, 20));
        xComboBox2.setRequired(true);
        xFormPanel1.add(xComboBox2);

        xComboBox1.setCaption("Type");
        xComboBox1.setDynamic(true);
        xComboBox1.setExpression("${item.caption}");
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("typeList");
        xComboBox1.setName("type"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(120, 20));
        xFormPanel1.add(xComboBox1);

        xComboBox3.setCaption("Data Type");
        xComboBox3.setItems("datatypeList");
        xComboBox3.setName("entity.datatype"); // NOI18N
        xComboBox3.setPreferredSize(new java.awt.Dimension(120, 20));
        xComboBox3.setRequired(true);
        xFormPanel1.add(xComboBox3);

        xSubFormPanel2.setDynamic(true);
        xSubFormPanel2.setHandler("opener");

        javax.swing.GroupLayout xSubFormPanel2Layout = new javax.swing.GroupLayout(xSubFormPanel2);
        xSubFormPanel2.setLayout(xSubFormPanel2Layout);
        xSubFormPanel2Layout.setHorizontalGroup(
            xSubFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        xSubFormPanel2Layout.setVerticalGroup(
            xSubFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout xPanel1Layout = new javax.swing.GroupLayout(xPanel1);
        xPanel1.setLayout(xPanel1Layout);
        xPanel1Layout.setHorizontalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addComponent(xSubFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                .addContainerGap())
        );
        xPanel1Layout.setVerticalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xSubFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(xPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XPanel xPanel1;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel2;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    // End of variables declaration//GEN-END:variables
}
