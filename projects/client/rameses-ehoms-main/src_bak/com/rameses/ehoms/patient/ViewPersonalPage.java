/*
 * NewPatientPage.java
 *
 * Created on March 29, 2014, 11:15 AM
 */

package com.rameses.ehoms.patient;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  Elmo
 */
@Template(FormPage.class)
@StyleSheet
public class ViewPersonalPage extends javax.swing.JPanel {
    
    /** Creates new form NewPatientPage */
    public ViewPersonalPage() {
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
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xTextField10 = new com.rameses.rcp.control.XTextField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xTextField6 = new com.rameses.rcp.control.XTextField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xTextField11 = new com.rameses.rcp.control.XTextField();
        xTextField7 = new com.rameses.rcp.control.XTextField();
        xPhoto1 = new com.rameses.rcp.control.XPhoto();

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Acct No");
        xLabel1.setCaptionWidth(100);
        xLabel1.setExpression("#{entity.acctid}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        xLabel1.setPreferredSize(new java.awt.Dimension(200, 20));
        xFormPanel1.add(xLabel1);

        xTextField3.setCaption("Last Name");
        xTextField3.setCaptionWidth(100);
        xTextField3.setEnabled(false);
        xTextField3.setName("entity.lastname");
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField3.setRequired(true);
        xFormPanel1.add(xTextField3);

        xTextField2.setCaption("First Name");
        xTextField2.setCaptionWidth(100);
        xTextField2.setEnabled(false);
        xTextField2.setName("entity.firstname");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField2.setRequired(true);
        xFormPanel1.add(xTextField2);

        xTextField5.setCaption("Middle Name");
        xTextField5.setCaptionWidth(100);
        xTextField5.setEnabled(false);
        xTextField5.setName("entity.middlename");
        xTextField5.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xTextField5);

        xTextField10.setCaption("Address");
        xTextField10.setCaptionWidth(100);
        xTextField10.setEnabled(false);
        xTextField10.setName("entity.address");
        xTextField10.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField10.setRequired(true);
        xFormPanel1.add(xTextField10);

        xDateField1.setCaption("Birth Date");
        xDateField1.setCaptionWidth(100);
        xDateField1.setEnabled(false);
        xDateField1.setName("entity.birthdate");
        xDateField1.setPreferredSize(new java.awt.Dimension(100, 19));
        xFormPanel1.add(xDateField1);

        xTextField4.setCaption("Birth Place");
        xTextField4.setCaptionWidth(100);
        xTextField4.setEnabled(false);
        xTextField4.setName("entity.birthplace");
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xTextField4);

        xTextField6.setCaption("Citizenship");
        xTextField6.setCaptionWidth(100);
        xTextField6.setEnabled(false);
        xTextField6.setName("entity.citizenship");
        xTextField6.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xTextField6);

        xComboBox1.setCaption("Gender");
        xComboBox1.setCaptionWidth(100);
        xComboBox1.setEnabled(false);
        xComboBox1.setExpression("#{item.caption}");
        xComboBox1.setItemKey("name");
        xComboBox1.setItems("genderList");
        xComboBox1.setName("entity.gender");
        xComboBox1.setPreferredSize(new java.awt.Dimension(150, 22));
        xFormPanel1.add(xComboBox1);

        xComboBox2.setCaption("Civil Status");
        xComboBox2.setCaptionWidth(100);
        xComboBox2.setEnabled(false);
        xComboBox2.setExpression("#{item.caption}");
        xComboBox2.setItemKey("name");
        xComboBox2.setItems("civilStatusList");
        xComboBox2.setName("entity.civilstatus");
        xComboBox2.setPreferredSize(new java.awt.Dimension(150, 22));
        xFormPanel1.add(xComboBox2);

        xTextField11.setCaption("Religion");
        xTextField11.setCaptionWidth(100);
        xTextField11.setEnabled(false);
        xTextField11.setName("entity.religion");
        xTextField11.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xTextField11);

        xTextField7.setCaption("Profession");
        xTextField7.setCaptionWidth(100);
        xTextField7.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xTextField7.setEnabled(false);
        xTextField7.setName("entity.profession");
        xTextField7.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xTextField7);

        xPhoto1.setText("xPhoto1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XPhoto xPhoto1;
    private com.rameses.rcp.control.XTextField xTextField10;
    private com.rameses.rcp.control.XTextField xTextField11;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    private com.rameses.rcp.control.XTextField xTextField6;
    private com.rameses.rcp.control.XTextField xTextField7;
    // End of variables declaration//GEN-END:variables
    
}
