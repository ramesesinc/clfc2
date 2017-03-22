/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.entity.ui;

/**
 *
 * @author dell
 */
public class EntityLookupQueryForm extends javax.swing.JPanel {

    /**
     * Creates new form EntityLookupQueryForm
     */
    public EntityLookupQueryForm() {
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
        defaultLabel1 = new com.rameses.rcp.control.text.DefaultLabel();
        xActionTextField1 = new com.rameses.rcp.control.XActionTextField();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 5));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new com.rameses.rcp.control.layout.XLayout());

        defaultLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 5));
        defaultLabel1.setDisplayedMnemonic('s');
        defaultLabel1.setForeground(new java.awt.Color(80, 80, 80));
        defaultLabel1.setText("Search");
        defaultLabel1.setFontStyle("font-weight:bold;");
        defaultLabel1.setPreferredSize(new java.awt.Dimension(50, 14));
        jPanel1.add(defaultLabel1);

        xActionTextField1.setActionName("search");
        xActionTextField1.setCaption("Search");
        xActionTextField1.setFocusAccelerator('s');
        xActionTextField1.setFocusKeyStroke("F3");
        xActionTextField1.setName("query.searchtext"); // NOI18N
        xActionTextField1.setPreferredSize(new java.awt.Dimension(220, 22));
        jPanel1.add(xActionTextField1);

        xComboBox2.setCaption("Select Type");
        xComboBox2.setEmptyText("- - All Types - -");
        xComboBox2.setItems("entityTypes");
        xComboBox2.setName("selectedType"); // NOI18N
        xComboBox2.setVisibleWhen("#{allowSelectEntityType == true}");
        jPanel1.add(xComboBox2);

        add(jPanel1, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.text.DefaultLabel defaultLabel1;
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XActionTextField xActionTextField1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    // End of variables declaration//GEN-END:variables
}
