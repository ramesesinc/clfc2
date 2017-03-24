/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.landtax.report.collection;


import com.rameses.osiris2.common.ui.ReportInitialTemplatePage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author wflores
 */
@StyleSheet
@Template(value=ReportInitialTemplatePage.class, target="content")
public class ReportInitPage extends javax.swing.JPanel {

    /**
     * Creates new form ReportInitPage
     */
    public ReportInitPage() {
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

        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        xComboBox6 = new com.rameses.rcp.control.XComboBox();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        xComboBox3.setAllowNull(false);
        xComboBox3.setCaption("Period");
        xComboBox3.setExpression("#{item.name}");
        xComboBox3.setItems("periods");
        xComboBox3.setName("entity.period"); // NOI18N
        xComboBox3.setPreferredSize(new java.awt.Dimension(200, 22));
        xComboBox3.setRequired(true);
        xFormPanel1.add(xComboBox3);

        xIntegerField1.setCaption("Year");
        xIntegerField1.setDepends(new String[] {"entity.period"});
        xIntegerField1.setName("entity.year"); // NOI18N
        xIntegerField1.setPreferredSize(new java.awt.Dimension(80, 20));
        xIntegerField1.setRequired(true);
        xFormPanel1.add(xIntegerField1);

        xComboBox5.setAllowNull(false);
        xComboBox5.setCaption("Quarter");
        xComboBox5.setDepends(new String[] {"entity.period"});
        xComboBox5.setExpression("#{item.name}");
        xComboBox5.setItemKey("code");
        xComboBox5.setItems("quarters");
        xComboBox5.setName("entity.qtr"); // NOI18N
        xComboBox5.setPreferredSize(new java.awt.Dimension(200, 22));
        xComboBox5.setRequired(true);
        xFormPanel1.add(xComboBox5);

        xComboBox6.setAllowNull(false);
        xComboBox6.setCaption("Month");
        xComboBox6.setDepends(new String[] {"entity.period", "entity.qtr"});
        xComboBox6.setDynamic(true);
        xComboBox6.setExpression("#{item.caption}");
        xComboBox6.setItems("months");
        xComboBox6.setName("entity.month"); // NOI18N
        xComboBox6.setPreferredSize(new java.awt.Dimension(200, 22));
        xComboBox6.setRequired(true);
        xFormPanel1.add(xComboBox6);

        add(xFormPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XComboBox xComboBox6;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    // End of variables declaration//GEN-END:variables
}