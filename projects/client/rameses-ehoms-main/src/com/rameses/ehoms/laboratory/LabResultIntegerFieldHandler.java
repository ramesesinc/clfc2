/*
 * VitalSignFieldHandler.java
 *
 * Created on April 4, 2014, 1:58 PM
 */

package com.rameses.ehoms.laboratory;

/**
 *
 * @author  Elmo
 */
public class LabResultIntegerFieldHandler extends javax.swing.JPanel {
    
    /** Creates new form VitalSignFieldHandler */
    public LabResultIntegerFieldHandler() {
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
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();

        xFormPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xFormPanel1.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xFormPanel1.setCaptionPadding(new java.awt.Insets(0, 0, 0, 0));
        xFormPanel1.setCellspacing(10);
        xFormPanel1.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel1.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xFormPanel1.setShowCaption(false);
        xIntegerField1.setName("entity.value");
        xIntegerField1.setShowCaption(false);
        xFormPanel1.add(xIntegerField1);

        xLabel1.setExpression("#{unit}");
        xLabel1.setPreferredSize(new java.awt.Dimension(80, 20));
        xLabel1.setShowCaption(false);
        xFormPanel1.add(xLabel1);

        xLabel2.setExpression("#{range}");
        xLabel2.setPreferredSize(new java.awt.Dimension(190, 20));
        xLabel2.setShowCaption(false);
        xFormPanel1.add(xLabel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    // End of variables declaration//GEN-END:variables
    
}
