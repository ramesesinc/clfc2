/*
 * DrugPage.java
 *
 * Created on April 16, 2014, 11:07 PM
 */

package com.rameses.ehoms.master;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  Elmo
 */
@Template(FormPage.class)
@StyleSheet
public class DrugPage extends javax.swing.JPanel {
    
    /** Creates new form DrugPage */
    public DrugPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        xTextArea2 = new com.rameses.rcp.control.XTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        xTextArea3 = new com.rameses.rcp.control.XTextArea();

        xFormPanel1.setCaptionWidth(100);
        xTextField5.setCaption("Code");
        xTextField5.setName("entity.code");
        xTextField5.setPreferredSize(new java.awt.Dimension(150, 20));
        xTextField5.setRequired(true);
        xFormPanel1.add(xTextField5);

        xTextField1.setCaption("Name");
        xTextField1.setName("entity.name");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField1.setRequired(true);
        xFormPanel1.add(xTextField1);

        xTextField3.setCaption("Generic Name");
        xTextField3.setName("entity.genericname");
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xTextField3);

        xTextField2.setCaption("Brand");
        xTextField2.setName("entity.brand");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xTextField2);

        xTextField4.setText("entity.strength");
        xTextField4.setCaption("Dosage Amt");
        xTextField4.setName("entity.dosageamt");
        xTextField4.setTextCase(com.rameses.rcp.constant.TextCase.NONE);
        xFormPanel1.add(xTextField4);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 60));
        xTextArea1.setLineWrap(true);
        xTextArea1.setCaption("Availability");
        xTextArea1.setName("entity.availability");
        jScrollPane1.setViewportView(xTextArea1);

        xFormPanel1.add(jScrollPane1);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(0, 60));
        xTextArea2.setLineWrap(true);
        xTextArea2.setCaption("Purpose");
        xTextArea2.setName("entity.purpose");
        jScrollPane2.setViewportView(xTextArea2);

        xFormPanel1.add(jScrollPane2);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(0, 60));
        xTextArea3.setLineWrap(true);
        xTextArea3.setCaption("Administration");
        xTextArea3.setName("entity.administration");
        jScrollPane3.setViewportView(xTextArea3);

        xFormPanel1.add(jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextArea xTextArea2;
    private com.rameses.rcp.control.XTextArea xTextArea3;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    // End of variables declaration//GEN-END:variables
    
}
