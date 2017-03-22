/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.rpt.rpu.ui;

import com.rameses.rcp.ui.annotations.StyleSheet;

public class RpuInfoAssessmentPage extends javax.swing.JPanel {

    /**
     * Creates new form RpuLandImprovementPage
     */
    public RpuInfoAssessmentPage() {
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

        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jPanel2 = new javax.swing.JPanel();
        formPanel10 = new com.rameses.rcp.util.FormPanel();
        xDecimalField8 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField9 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField10 = new com.rameses.rcp.control.XDecimalField();

        xDataTable1.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "rputype"}
                , new Object[]{"caption", "Type"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "actualuse.name"}
                , new Object[]{"caption", "Actual Use"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "marketvalue"}
                , new Object[]{"caption", "Market Value"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DecimalColumnHandler("#,##0.00", -1.0, -1.0, false, 2)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "assesslevel"}
                , new Object[]{"caption", "Assess Level"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DecimalColumnHandler("#,##0.00", -1.0, -1.0, false, 2)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "assessedvalue"}
                , new Object[]{"caption", "Assessed Value"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DecimalColumnHandler("#,##0.00", -1.0, -1.0, false, 2)}
            })
        });
        xDataTable1.setDynamic(true);
        xDataTable1.setHandler("assessmentListHandler");

        jPanel2.setLayout(new java.awt.BorderLayout());

        formPanel10.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        formPanel10.setCellpadding(new java.awt.Insets(0, 0, 0, 20));
        formPanel10.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel10.setPadding(new java.awt.Insets(1, 5, 3, 1));

        xDecimalField8.setCaption("Base Market Value");
        xDecimalField8.setCaptionWidth(110);
        xDecimalField8.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xDecimalField8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField8.setEnabled(false);
        xDecimalField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        xDecimalField8.setName("entity.rpu.totalbmv"); // NOI18N
        xDecimalField8.setPreferredSize(new java.awt.Dimension(130, 19));
        xDecimalField8.setReadonly(true);
        formPanel10.add(xDecimalField8);

        xDecimalField9.setCaption("Market Value ");
        xDecimalField9.setCaptionWidth(90);
        xDecimalField9.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xDecimalField9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField9.setEnabled(false);
        xDecimalField9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        xDecimalField9.setName("entity.rpu.totalmv"); // NOI18N
        xDecimalField9.setPreferredSize(new java.awt.Dimension(130, 19));
        xDecimalField9.setReadonly(true);
        formPanel10.add(xDecimalField9);

        xDecimalField10.setCaption("Assessed Value");
        xDecimalField10.setCaptionWidth(100);
        xDecimalField10.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField10.setEnabled(false);
        xDecimalField10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        xDecimalField10.setName("entity.rpu.totalav"); // NOI18N
        xDecimalField10.setPreferredSize(new java.awt.Dimension(130, 19));
        xDecimalField10.setReadonly(true);
        formPanel10.add(xDecimalField10);

        jPanel2.add(formPanel10, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xDataTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xDataTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(128, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel10;
    private javax.swing.JPanel jPanel2;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDecimalField xDecimalField10;
    private com.rameses.rcp.control.XDecimalField xDecimalField8;
    private com.rameses.rcp.control.XDecimalField xDecimalField9;
    // End of variables declaration//GEN-END:variables
}
