/*
 * LoanAppInitCaptureLedgerPage.java
 *
 * Created on September 23, 2013, 2:15 PM
 */

package com.rameses.clfc.loan.capture;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  louie
 */
@StyleSheet
@Template(FormPage.class)
public class CaptureLoanAppInitLedgerPage extends javax.swing.JPanel {
    
    /** Creates new form LoanAppInitCaptureLedgerPage */
    public CaptureLoanAppInitLedgerPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xLookupField2 = new com.rameses.rcp.control.XLookupField();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel1 = new com.rameses.rcp.control.XLabel();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle(" General Information ");
        xFormPanel2.setBorder(xTitledBorder1);
        xFormPanel2.setPadding(new java.awt.Insets(10, 15, 10, 20));
        xLookupField2.setCaption("App. No.");
        xLookupField2.setCaptionWidth(115);
        xLookupField2.setExpression("#{item.appno}");
        xLookupField2.setHandler("appLookupHandler");
        xLookupField2.setIndex(-10);
        xLookupField2.setName("entity");
        xLookupField2.setPreferredSize(new java.awt.Dimension(200, 20));
        xLookupField2.setRequired(true);
        xFormPanel2.add(xLookupField2);

        xLabel4.setBackground(new java.awt.Color(250, 250, 250));
        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(180, 180, 180));
        xLabel4.setBorder(xLineBorder1);
        xLabel4.setCaption("Borrower Name");
        xLabel4.setCaptionWidth(115);
        xLabel4.setDepends(new String[] {"entity"});
        xLabel4.setExpression("#{item.name}");
        xLabel4.setName("entity.borrower");
        xLabel4.setOpaque(true);
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 20));
        xLabel4.setVarName("item");
        xFormPanel2.add(xLabel4);

        xLabel5.setBackground(new java.awt.Color(250, 250, 250));
        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(180, 180, 180));
        xLabel5.setBorder(xLineBorder2);
        xLabel5.setCaption("Borrower Address");
        xLabel5.setCaptionWidth(115);
        xLabel5.setDepends(new String[] {"entity"});
        xLabel5.setExpression("#{item.address}");
        xLabel5.setName("entity.borrower");
        xLabel5.setOpaque(true);
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 20));
        xLabel5.setVarName("item");
        xFormPanel2.add(xLabel5);

        xLabel1.setBackground(new java.awt.Color(250, 250, 250));
        com.rameses.rcp.control.border.XLineBorder xLineBorder3 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder3.setLineColor(new java.awt.Color(180, 180, 180));
        xLabel1.setBorder(xLineBorder3);
        xLabel1.setCaption("Route");
        xLabel1.setCaptionWidth(115);
        xLabel1.setDepends(new String[] {"entity"});
        xLabel1.setExpression("#{item.description} - #{item.area}");
        xLabel1.setName("entity.route");
        xLabel1.setOpaque(true);
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 20));
        xLabel1.setVarName("item");
        xFormPanel2.add(xLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLookupField xLookupField2;
    // End of variables declaration//GEN-END:variables
    
}