/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.waterworks.rates;

/**
 *
 * @author Dino Quimson
 */
public class CreateRatePage extends javax.swing.JPanel {

    /**
     * Creates new form CreateRatePage
     */
    public CreateRatePage() {
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
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xIntegerField2 = new com.rameses.rcp.control.XIntegerField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xDecimalField1 = new com.rameses.rcp.control.XDecimalField();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xButton3 = new com.rameses.rcp.control.XButton();
        xButton1 = new com.rameses.rcp.control.XButton();

        xFormPanel1.setCaptionWidth(120);

        xIntegerField1.setText("xIntegerField1");
        xIntegerField1.setCaption("From");
        xIntegerField1.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField1.setName("entity.from"); // NOI18N
        xIntegerField1.setPreferredSize(new java.awt.Dimension(60, 20));
        xIntegerField1.setRequired(true);
        xFormPanel1.add(xIntegerField1);

        xIntegerField2.setText("xIntegerField1");
        xIntegerField2.setCaption("To");
        xIntegerField2.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xIntegerField2.setName("entity.to"); // NOI18N
        xIntegerField2.setPreferredSize(new java.awt.Dimension(60, 20));
        xIntegerField2.setRequired(true);
        xFormPanel1.add(xIntegerField2);

        xComboBox1.setCaption("Type");
        xComboBox1.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xComboBox1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xComboBox1.setItems("types");
        xComboBox1.setName("entity.type"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(130, 22));
        xComboBox1.setRequired(true);
        xFormPanel1.add(xComboBox1);

        xDecimalField1.setText("xDecimalField1");
        xDecimalField1.setCaption("Amount");
        xDecimalField1.setCaptionFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xDecimalField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        xDecimalField1.setName("entity.amount"); // NOI18N
        xDecimalField1.setPreferredSize(new java.awt.Dimension(130, 20));
        xDecimalField1.setRequired(true);
        xFormPanel1.add(xDecimalField1);

        xFormPanel2.setAlignmentY(0.0F);
        xFormPanel2.setCaptionHAlignment("RIGHT");
        xFormPanel2.setShowCaption(false);

        xButton3.setText("Add");
        xButton3.setName("add"); // NOI18N
        xButton3.setPreferredSize(new java.awt.Dimension(70, 23));
        xButton3.setShowCaption(false);
        xButton3.setVisibleWhen("#{mode == 'create'}");
        xFormPanel2.add(xButton3);

        xButton1.setText("Done");
        xButton1.setName("done"); // NOI18N
        xButton1.setPreferredSize(new java.awt.Dimension(70, 23));
        xButton1.setShowCaption(false);
        xButton1.setVisibleWhen("#{mode == 'edit'}");
        xFormPanel2.add(xButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 254, Short.MAX_VALUE)
                        .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XButton xButton3;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDecimalField xDecimalField1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XIntegerField xIntegerField2;
    // End of variables declaration//GEN-END:variables
}