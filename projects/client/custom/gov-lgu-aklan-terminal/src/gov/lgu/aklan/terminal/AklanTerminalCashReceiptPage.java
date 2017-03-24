/*
 * MiscPOSPage.java
 *
 * Created on November 10, 2013, 10:44 AM
 */

package gov.lgu.aklan.terminal;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  Rameses
 */
@Template(FormPage.class)
public class AklanTerminalCashReceiptPage extends javax.swing.JPanel {
    
    /** Creates new form MiscPOSPage */
    public AklanTerminalCashReceiptPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xSeparator2 = new com.rameses.rcp.control.XSeparator();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xIntegerField2 = new com.rameses.rcp.control.XIntegerField();
        xDecimalField1 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField2 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField3 = new com.rameses.rcp.control.XDecimalField();
        xSeparator3 = new com.rameses.rcp.control.XSeparator();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xSeparator4 = new com.rameses.rcp.control.XSeparator();
        xTextField4 = new com.rameses.rcp.control.XTextField();

        setPreferredSize(new java.awt.Dimension(636, 459));

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("   General Information   ");
        jPanel1.setBorder(xTitledBorder1);

        xFormPanel1.setCaptionFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xFormPanel1.setCaptionFontStyle("font-size:18;");
        xFormPanel1.setCaptionWidth(100);

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(180, 180, 180));
        xLabel3.setBorder(xLineBorder1);
        xLabel3.setCaption("Receipt Number");
        xLabel3.setCaptionFontStyle("font-size:18;");
        xLabel3.setCaptionWidth(180);
        xLabel3.setExpression("#{entity.receiptno}");
        xLabel3.setFontStyle("font-size:19; font-weight:bold; ");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 30));
        xFormPanel1.add(xLabel3);

        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(180, 180, 180));
        xLabel1.setBorder(xLineBorder2);
        xLabel1.setCaption("Account");
        xLabel1.setCaptionFontStyle("");
        xLabel1.setCaptionWidth(180);
        xLabel1.setExpression("#{entity.items[0].item.title}");
        xLabel1.setFontStyle("font-size:18;");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 30));
        xFormPanel1.add(xLabel1);

        xSeparator2.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout xSeparator2Layout = new javax.swing.GroupLayout(xSeparator2);
        xSeparator2.setLayout(xSeparator2Layout);
        xSeparator2Layout.setHorizontalGroup(
            xSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        xSeparator2Layout.setVerticalGroup(
            xSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        xFormPanel1.add(xSeparator2);

        xIntegerField1.setCaption("No. of Adults");
        xIntegerField1.setCaptionWidth(180);
        xIntegerField1.setFontStyle("font-size:18;");
        xIntegerField1.setName("entity.numadult"); // NOI18N
        xIntegerField1.setPreferredSize(new java.awt.Dimension(150, 30));
        xIntegerField1.setRequired(true);
        xFormPanel1.add(xIntegerField1);

        xIntegerField2.setCaption("No. of Children");
        xIntegerField2.setCaptionWidth(180);
        xIntegerField2.setFontStyle("font-size:18;");
        xIntegerField2.setName("entity.numchildren"); // NOI18N
        xIntegerField2.setPreferredSize(new java.awt.Dimension(150, 30));
        xIntegerField2.setRequired(true);
        xFormPanel1.add(xIntegerField2);

        xDecimalField1.setCaption("Amount Due");
        xDecimalField1.setCaptionFontStyle("");
        xDecimalField1.setCaptionWidth(180);
        xDecimalField1.setEnabled(false);
        xDecimalField1.setFontStyle("font-size:24; font-weight:bold;");
        xDecimalField1.setName("entity.amount"); // NOI18N
        xDecimalField1.setPreferredSize(new java.awt.Dimension(150, 30));
        xDecimalField1.setRequired(true);
        xFormPanel1.add(xDecimalField1);

        xDecimalField2.setCaption("Cash Tendered ");
        xDecimalField2.setCaptionWidth(180);
        xDecimalField2.setFontStyle("font-size:22; font-weight:bold;");
        xDecimalField2.setForeground(new java.awt.Color(0, 0, 102));
        xDecimalField2.setName("entity.totalcash"); // NOI18N
        xDecimalField2.setPreferredSize(new java.awt.Dimension(150, 30));
        xDecimalField2.setRequired(true);
        xFormPanel1.add(xDecimalField2);

        xDecimalField3.setCaption("Change");
        xDecimalField3.setCaptionWidth(180);
        xDecimalField3.setDepends(new String[] {"entity.totalcash", "entity.numadult", "entity.numchildren"});
        xDecimalField3.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        xDecimalField3.setEnabled(false);
        xDecimalField3.setFontStyle("font-size:22; font-weight:bold;");
        xDecimalField3.setForeground(new java.awt.Color(153, 0, 0));
        xDecimalField3.setName("entity.cashchange"); // NOI18N
        xDecimalField3.setPreferredSize(new java.awt.Dimension(150, 30));
        xFormPanel1.add(xDecimalField3);

        xSeparator3.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout xSeparator3Layout = new javax.swing.GroupLayout(xSeparator3);
        xSeparator3.setLayout(xSeparator3Layout);
        xSeparator3Layout.setHorizontalGroup(
            xSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        xSeparator3Layout.setVerticalGroup(
            xSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        xFormPanel1.add(xSeparator3);

        xTextField1.setCaption("Paid By");
        xTextField1.setCaptionMnemonic('b');
        xTextField1.setCaptionWidth(180);
        xTextField1.setFontStyle("font-size:18;");
        xTextField1.setName("entity.paidby"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 30));
        xTextField1.setRequired(true);
        xFormPanel1.add(xTextField1);

        xTextField2.setCaption("Address");
        xTextField2.setCaptionWidth(180);
        xTextField2.setFontStyle("font-size:18;");
        xTextField2.setName("entity.paidbyaddress"); // NOI18N
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 30));
        xTextField2.setRequired(true);
        xFormPanel1.add(xTextField2);

        xSeparator4.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout xSeparator4Layout = new javax.swing.GroupLayout(xSeparator4);
        xSeparator4.setLayout(xSeparator4Layout);
        xSeparator4Layout.setHorizontalGroup(
            xSeparator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        xSeparator4Layout.setVerticalGroup(
            xSeparator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        xFormPanel1.add(xSeparator4);

        xTextField4.setCaption("Remarks");
        xTextField4.setCaptionFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        xTextField4.setCaptionWidth(180);
        xTextField4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        xTextField4.setName("entity.remarks"); // NOI18N
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 28));
        xFormPanel1.add(xTextField4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XDecimalField xDecimalField1;
    private com.rameses.rcp.control.XDecimalField xDecimalField2;
    private com.rameses.rcp.control.XDecimalField xDecimalField3;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XIntegerField xIntegerField2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XSeparator xSeparator2;
    private com.rameses.rcp.control.XSeparator xSeparator3;
    private com.rameses.rcp.control.XSeparator xSeparator4;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField4;
    // End of variables declaration//GEN-END:variables
    
}