/*
 * JuridicalEntityPage.java
 *
 * Created on August 14, 2013, 2:17 PM
 */

package com.rameses.entity.ui;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  wflores
 */
@Template(FormPage.class)
public class JuridicalEntityEditPage extends javax.swing.JPanel {
    
    public JuridicalEntityEditPage() {
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
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xSubFormPanel1 = new com.rameses.rcp.control.XSubFormPanel();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xTextField7 = new com.rameses.rcp.control.XTextField();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField8 = new com.rameses.rcp.control.XTextField();
        xTextField9 = new com.rameses.rcp.control.XTextField();
        xFormPanel3 = new com.rameses.rcp.control.XFormPanel();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        xSuggest1 = new com.rameses.rcp.control.XSuggest();

        setName("entity.administrator.position");
        setPreferredSize(new java.awt.Dimension(768, 525));

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setPadding(new java.awt.Insets(30, 15, 15, 15));
        xTitledBorder1.setTitle("General Information");
        xFormPanel1.setBorder(xTitledBorder1);
        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Entity No");
        xLabel1.setCaptionWidth(120);
        xLabel1.setExpression("#{entity.entityno}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        xLabel1.setPreferredSize(new java.awt.Dimension(200, 20));
        xFormPanel1.add(xLabel1);

        xTextField2.setCaption("Name");
        xTextField2.setCaptionWidth(120);
        xTextField2.setEnabled(false);
        xTextField2.setName("entity.name");
        xTextField2.setPreferredSize(new java.awt.Dimension(400, 20));
        xTextField2.setRequired(true);
        xFormPanel1.add(xTextField2);

        xComboBox1.setCaption("Organization Type");
        xComboBox1.setCaptionWidth(120);
        xComboBox1.setExpression("#{item.value}");
        xComboBox1.setIndex(-10);
        xComboBox1.setItemKey("key");
        xComboBox1.setItems("orgTypes");
        xComboBox1.setName("entity.orgtype");
        xComboBox1.setPreferredSize(new java.awt.Dimension(200, 22));
        xComboBox1.setRequired(true);
        xFormPanel1.add(xComboBox1);

        xSubFormPanel1.setCaption("Address");
        xSubFormPanel1.setCaptionWidth(120);
        xSubFormPanel1.setHandler("addressHandler");
        xSubFormPanel1.setPreferredSize(new java.awt.Dimension(0, 50));
        org.jdesktop.layout.GroupLayout xSubFormPanel1Layout = new org.jdesktop.layout.GroupLayout(xSubFormPanel1);
        xSubFormPanel1.setLayout(xSubFormPanel1Layout);
        xSubFormPanel1Layout.setHorizontalGroup(
            xSubFormPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 389, Short.MAX_VALUE)
        );
        xSubFormPanel1Layout.setVerticalGroup(
            xSubFormPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 50, Short.MAX_VALUE)
        );
        xFormPanel1.add(xSubFormPanel1);

        xDateField1.setCaption("Date Registered");
        xDateField1.setCaptionWidth(120);
        xDateField1.setName("entity.dtregistered");
        xDateField1.setPreferredSize(new java.awt.Dimension(110, 19));
        xFormPanel1.add(xDateField1);

        xTextField7.setCaption("Nature of Business");
        xTextField7.setCaptionWidth(120);
        xTextField7.setName("entity.nature");
        xTextField7.setPreferredSize(new java.awt.Dimension(400, 20));
        xFormPanel1.add(xTextField7);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setPadding(new java.awt.Insets(30, 15, 15, 15));
        xTitledBorder2.setTitle("Contact Info");
        xFormPanel2.setBorder(xTitledBorder2);
        xFormPanel2.setCaptionWidth(120);
        xTextField1.setCaption("Mobile No");
        xTextField1.setCaptionWidth(120);
        xTextField1.setName("entity.mobileno");
        xTextField1.setPreferredSize(new java.awt.Dimension(200, 20));
        xFormPanel2.add(xTextField1);

        xTextField8.setCaption("Phone No");
        xTextField8.setCaptionWidth(120);
        xTextField8.setName("entity.phoneno");
        xTextField8.setPreferredSize(new java.awt.Dimension(200, 20));
        xFormPanel2.add(xTextField8);

        xTextField9.setCaption("Email");
        xTextField9.setCaptionWidth(120);
        xTextField9.setName("entity.email");
        xTextField9.setPreferredSize(new java.awt.Dimension(200, 20));
        xTextField9.setTextCase(com.rameses.rcp.constant.TextCase.LOWER);
        xFormPanel2.add(xTextField9);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setPadding(new java.awt.Insets(30, 15, 15, 15));
        xTitledBorder3.setTitle("Administrator");
        xFormPanel3.setBorder(xTitledBorder3);
        xFormPanel3.setCaptionWidth(120);
        xTextField3.setCaption("Name");
        xTextField3.setCaptionWidth(120);
        xTextField3.setName("entity.administrator.name");
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel3.add(xTextField3);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setName("entity.administrator.address");
        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 50));
        xTextArea1.setCaption("Address");
        xTextArea1.setName("entity.administrator.address");
        xTextArea1.setTextCase(com.rameses.rcp.constant.TextCase.UPPER);
        jScrollPane1.setViewportView(xTextArea1);

        xFormPanel3.add(jScrollPane1);

        xSuggest1.setCaption("Position");
        xSuggest1.setExpression("#{entity.administrator.position}");
        xSuggest1.setHandler("positionModel");
        xSuggest1.setName("entity.administrator.position");
        xSuggest1.setPreferredSize(new java.awt.Dimension(0, 20));
        xSuggest1.setTextCase(com.rameses.rcp.constant.TextCase.UPPER);
        xFormPanel3.add(xSuggest1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, xFormPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, xFormPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, xFormPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 549, Short.MAX_VALUE))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(xFormPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 228, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xFormPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xFormPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XFormPanel xFormPanel3;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel1;
    private com.rameses.rcp.control.XSuggest xSuggest1;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField7;
    private com.rameses.rcp.control.XTextField xTextField8;
    private com.rameses.rcp.control.XTextField xTextField9;
    // End of variables declaration//GEN-END:variables
    
}
