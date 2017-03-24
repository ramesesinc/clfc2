/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.clfc.treasury.ledger.amnesty.smc;

import com.rameses.osiris2.themes.OKCancelPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author louie
 */

@StyleSheet
@Template(OKCancelPage.class)
public class ConditionPage extends javax.swing.JPanel {

    /**
     * Creates new form ConditionPage
     */
    public ConditionPage() {
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
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xSubFormPanel1 = new com.rameses.rcp.control.XSubFormPanel();

        xFormPanel1.setCaptionWidth(150);

        xLookupField1.setCaption("Condition");
        xLookupField1.setDisableWhen("#{mode=='read' || data._allowremove==false}");
        xLookupField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xLookupField1.setExpression("#{data.title}");
        xLookupField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xLookupField1.setHandler("conditionLookup");
        xLookupField1.setPreferredSize(new java.awt.Dimension(300, 20));
        xLookupField1.setRequired(true);
        xFormPanel1.add(xLookupField1);

        xTextField1.setCaption("Var Name");
        xTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xTextField1.setName("data.varname"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(200, 20));
        xFormPanel1.add(xTextField1);

        xComboBox1.setCaption("Re-computation Term");
        xComboBox1.setDynamic(true);
        xComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xComboBox1.setItems("termList");
        xComboBox1.setName("data.computationterm"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(120, 21));
        xFormPanel1.add(xComboBox1);

        xSubFormPanel1.setDepends(new String[] {"xhandler"});
        xSubFormPanel1.setDynamic(true);
        xSubFormPanel1.setHandler("opener");

        javax.swing.GroupLayout xSubFormPanel1Layout = new javax.swing.GroupLayout(xSubFormPanel1);
        xSubFormPanel1.setLayout(xSubFormPanel1Layout);
        xSubFormPanel1Layout.setHorizontalGroup(
            xSubFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        xSubFormPanel1Layout.setVerticalGroup(
            xSubFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addComponent(xSubFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xSubFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel1;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
}