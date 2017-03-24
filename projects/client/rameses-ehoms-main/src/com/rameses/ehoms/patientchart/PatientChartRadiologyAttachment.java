/*
 * RadiologyAttachment.java
 *
 * Created on April 19, 2014, 6:13 PM
 */

package com.rameses.ehoms.patientchart;

import com.rameses.osiris2.themes.OKCancelPage;
import com.rameses.rcp.ui.annotations.Template;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author  Elmo
 */
@Template(OKCancelPage.class)
public class PatientChartRadiologyAttachment extends javax.swing.JPanel {
    
    /** Creates new form RadiologyAttachment */
    public PatientChartRadiologyAttachment() {
        initComponents();
       
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xImageCanvas1 = new com.rameses.rcp.control.XImageCanvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        jLabel1 = new javax.swing.JLabel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        jPanel1 = new javax.swing.JPanel();
        xButton3 = new com.rameses.rcp.control.XButton();
        xButton4 = new com.rameses.rcp.control.XButton();
        xImageGallery1 = new com.rameses.rcp.control.XImageGallery();
        xLabel2 = new com.rameses.rcp.control.XLabel();

        xImageCanvas1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xImageCanvas1.setDepends(new String[] {"selectedImage"});
        xImageCanvas1.setName("selectedImage.largeImage");

        xTextArea1.setName("entity.notes");
        jScrollPane1.setViewportView(xTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Physicians Notes");

        xLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xLabel1.setAntiAliasOn(true);
        xLabel1.setDepends(new String[] {"selectedImage"});
        xLabel1.setExpression("#{selectedImage.title}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 3, 11));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(166, 100));
        xButton3.setName("moveNext");
        xButton3.setPreferredSize(new java.awt.Dimension(20, 9));
        jPanel1.add(xButton3, java.awt.BorderLayout.EAST);

        xButton4.setName("movePrev");
        xButton4.setPreferredSize(new java.awt.Dimension(20, 9));
        jPanel1.add(xButton4, java.awt.BorderLayout.WEST);

        xImageGallery1.setHandler("galleryModel");
        xImageGallery1.setName("selectedImage");
        jPanel1.add(xImageGallery1, java.awt.BorderLayout.CENTER);

        xLabel2.setExpression("#{entity.item.name}");
        xLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xImageCanvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(xLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xImageCanvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, 0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XButton xButton3;
    private com.rameses.rcp.control.XButton xButton4;
    private com.rameses.rcp.control.XImageCanvas xImageCanvas1;
    private com.rameses.rcp.control.XImageGallery xImageGallery1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    // End of variables declaration//GEN-END:variables
    
}