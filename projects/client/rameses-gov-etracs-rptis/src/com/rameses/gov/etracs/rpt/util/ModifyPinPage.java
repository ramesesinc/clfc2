
package com.rameses.gov.etracs.rpt.util;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  PRMF
 */
@StyleSheet
public class ModifyPinPage extends javax.swing.JPanel {
    
    /** Creates new form ChangePinPage */
    public ModifyPinPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox4 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xButton1 = new com.rameses.rcp.control.XButton();
        xButton2 = new com.rameses.rcp.control.XButton();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Existing PIN Information");
        formPanel1.setBorder(xTitledBorder1);
        formPanel1.setCaptionWidth(105);

        xLookupField1.setCaption("TD No.");
        xLookupField1.setCaptionWidth(120);
        xLookupField1.setExpression("#{faas.tdno}");
        xLookupField1.setHandler("lookupFaas");
        xLookupField1.setIndex(-100);
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLookupField1);

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Taxpayer Name");
        xLabel1.setCaptionWidth(120);
        xLabel1.setDepends(new String[] {"faas"});
        xLabel1.setExpression("#{faas.owner.name}");
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel1.setName("faas.taxpayer.name"); // NOI18N
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("Cadastral Lot No.");
        xLabel2.setCaptionWidth(120);
        xLabel2.setDepends(new String[] {"faas"});
        xLabel2.setExpression("#{faas.cadastrallotno}");
        xLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel2.setName("faas.cadastrallotno"); // NOI18N
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel2);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel3.setCaption("PIN");
        xLabel3.setCaptionWidth(120);
        xLabel3.setDepends(new String[] {"faas"});
        xLabel3.setExpression("#{faas.fullpin}");
        xLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel3.setName("faas.fullpin"); // NOI18N
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel3);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Modified PIN Information");
        formPanel2.setBorder(xTitledBorder2);
        formPanel2.setCaptionWidth(105);

        xComboBox3.setAllowNull(false);
        xComboBox3.setCaption("PIN Type");
        xComboBox3.setCaptionWidth(120);
        xComboBox3.setImmediate(true);
        xComboBox3.setItems("pinTypeList");
        xComboBox3.setName("entity.pintype"); // NOI18N
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox3.setRequired(true);
        formPanel2.add(xComboBox3);

        xComboBox1.setAllowNull(false);
        xComboBox1.setCaption("Province/City");
        xComboBox1.setCaptionWidth(120);
        xComboBox1.setDepends(new String[] {"faas"});
        xComboBox1.setExpression("#{item.name}");
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("provcityList");
        xComboBox1.setName("entity.provcity"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox1.setRequired(true);
        formPanel2.add(xComboBox1);

        xComboBox4.setCaption("Municipality/District");
        xComboBox4.setCaptionWidth(120);
        xComboBox4.setDepends(new String[] {"entity.provcity"});
        xComboBox4.setDynamic(true);
        xComboBox4.setExpression("#{item.name}");
        xComboBox4.setImmediate(true);
        xComboBox4.setItems("muniDistrictList");
        xComboBox4.setName("entity.munidistrict"); // NOI18N
        xComboBox4.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox4.setRequired(true);
        formPanel2.add(xComboBox4);

        xComboBox2.setCaption("Barangay");
        xComboBox2.setCaptionWidth(120);
        xComboBox2.setDepends(new String[] {"entity.munidistrict"});
        xComboBox2.setDynamic(true);
        xComboBox2.setExpression("#{item.name}");
        xComboBox2.setItems("barangayList");
        xComboBox2.setName("entity.barangay"); // NOI18N
        xComboBox2.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox2.setRequired(true);
        formPanel2.add(xComboBox2);

        xNumberField1.setCaption("Section");
        xNumberField1.setCaptionWidth(120);
        xNumberField1.setFieldType(Integer.class);
        xNumberField1.setName("entity.isection"); // NOI18N
        xNumberField1.setPreferredSize(new java.awt.Dimension(80, 19));
        xNumberField1.setRequired(true);
        formPanel2.add(xNumberField1);

        xNumberField2.setCaption("Parcel");
        xNumberField2.setCaptionWidth(120);
        xNumberField2.setFieldType(Integer.class);
        xNumberField2.setName("entity.iparcel"); // NOI18N
        xNumberField2.setPreferredSize(new java.awt.Dimension(80, 19));
        xNumberField2.setRequired(true);
        formPanel2.add(xNumberField2);

        xNumberField3.setCaption("Suffix");
        xNumberField3.setCaptionWidth(120);
        xNumberField3.setDepends(new String[] {"faas"});
        xNumberField3.setFieldType(Integer.class);
        xNumberField3.setName("entity.suffix"); // NOI18N
        xNumberField3.setPreferredSize(new java.awt.Dimension(80, 19));
        xNumberField3.setRequired(true);
        formPanel2.add(xNumberField3);

        xTextField2.setCaption("Claim No.");
        xTextField2.setCaptionWidth(120);
        xTextField2.setDepends(new String[] {"entity.rputype"});
        xTextField2.setName("entity.claimno"); // NOI18N
        xTextField2.setPreferredSize(new java.awt.Dimension(80, 19));
        xTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xTextField2ActionPerformed(evt);
            }
        });
        formPanel2.add(xTextField2);

        xCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox1.setCaption("");
        xCheckBox1.setCaptionWidth(120);
        xCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xCheckBox1.setName("entity.useoldpin"); // NOI18N
        xCheckBox1.setText(" Use old Index No.?");
        formPanel2.add(xCheckBox1);

        xLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel4.setCaption("New PIN");
        xLabel4.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xLabel4.setName("entity.newpin"); // NOI18N
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 26));
        xLabel4.setShowCaption(false);
        formPanel2.add(xLabel4);

        xButton1.setMnemonic('c');
        xButton1.setImmediate(true);
        xButton1.setName("_close"); // NOI18N
        xButton1.setText("Cancel");

        xButton2.setMnemonic('u');
        xButton2.setName("updatePin"); // NOI18N
        xButton2.setText("Update");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(xButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xTextField2ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XButton xButton2;
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox4;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    private com.rameses.rcp.control.XTextField xTextField2;
    // End of variables declaration//GEN-END:variables
    
}