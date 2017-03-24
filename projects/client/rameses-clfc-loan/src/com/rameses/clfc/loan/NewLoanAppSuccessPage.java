/*
 * NewLoanAppSuccessPage.java
 *
 * Created on September 15, 2013, 11:56 PM
 */

package com.rameses.clfc.loan;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  wflores
 */
@Template(FormPage.class)
public class NewLoanAppSuccessPage extends javax.swing.JPanel {
    
    public NewLoanAppSuccessPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();

        xLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xLabel1.setAntiAliasOn(true);
        xLabel1.setFontStyle("font-size:18;");
        xLabel1.setForeground(new java.awt.Color(80, 80, 80));
        xLabel1.setText("<html><center>Your application has been successfully saved.<br> Please refer to the information below.</center></html>");
        xLabel1.setUseHtml(true);

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setHideRight(true);
        xLineBorder1.setLineColor(new java.awt.Color(150, 150, 150));
        xLineBorder1.setPadding(new java.awt.Insets(5, 5, 5, 5));
        xFormPanel1.setCaptionBorder(xLineBorder1);
        xFormPanel1.setPadding(new java.awt.Insets(0, 30, 5, 5));
        xFormPanel1.setRequired(true);
        xLabel2.setAntiAliasOn(true);
        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(150, 150, 150));
        xLineBorder2.setPadding(new java.awt.Insets(5, 5, 5, 5));
        xLabel2.setBorder(xLineBorder2);
        xLabel2.setCaption("Application Number");
        xLabel2.setCaptionFontStyle("font-size:12;");
        xLabel2.setCaptionWidth(160);
        xLabel2.setExpression("#{entity.appno}");
        xLabel2.setFont(new java.awt.Font("Courier New", 1, 18));
        xLabel2.setForeground(new java.awt.Color(153, 0, 0));
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 30));
        xFormPanel1.add(xLabel2);

        xLabel3.setAntiAliasOn(true);
        com.rameses.rcp.control.border.XLineBorder xLineBorder3 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder3.setLineColor(new java.awt.Color(150, 150, 150));
        xLineBorder3.setPadding(new java.awt.Insets(5, 5, 5, 5));
        xLabel3.setBorder(xLineBorder3);
        xLabel3.setCaption("Borrower Name");
        xLabel3.setCaptionFontStyle("font-size:12;");
        xLabel3.setCaptionWidth(160);
        xLabel3.setExpression("#{entity.borrower.name}");
        xLabel3.setFontStyle("font-size:12;");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 30));
        xFormPanel1.add(xLabel3);

        xLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel4.setAntiAliasOn(true);
        com.rameses.rcp.control.border.XLineBorder xLineBorder4 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder4.setLineColor(new java.awt.Color(150, 150, 150));
        xLineBorder4.setPadding(new java.awt.Insets(5, 5, 5, 5));
        xLabel4.setBorder(xLineBorder4);
        xLabel4.setCaption("Borrower Address");
        xLabel4.setCaptionFontStyle("font-size:12;");
        xLabel4.setCaptionWidth(160);
        xLabel4.setExpression("#{entity.borrower.address}");
        xLabel4.setFontStyle("font-size:12;");
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 60));
        xLabel4.setUseHtml(true);
        xFormPanel1.add(xLabel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    // End of variables declaration//GEN-END:variables
    
}