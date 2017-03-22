/*
 * FranchiseUnitHistoryPage.java
 *
 * Created on February 26, 2013, 12:22 PM
 */

package com.rameses.gov.etracs.mtop.franchise;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  rameses
 */
@Template(FormPage.class)
public class FranchiseHistoryPage extends javax.swing.JPanel {
    
    /** Creates new form FranchiseUnitHistoryPage */
    public FranchiseHistoryPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        xDataTable2 = new com.rameses.rcp.control.XDataTable();
        jPanel2 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel12 = new com.rameses.rcp.control.XLabel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xLabel8 = new com.rameses.rcp.control.XLabel();
        xLabel15 = new com.rameses.rcp.control.XLabel();
        formPanel5 = new com.rameses.rcp.util.FormPanel();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        xLabel11 = new com.rameses.rcp.control.XLabel();
        formPanel6 = new com.rameses.rcp.util.FormPanel();
        xLabel13 = new com.rameses.rcp.control.XLabel();
        xLabel14 = new com.rameses.rcp.control.XLabel();
        xActionTextField1 = new com.rameses.rcp.control.XActionTextField();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jPanel4 = new javax.swing.JPanel();
        formPanel8 = new com.rameses.rcp.util.FormPanel();
        xLabel16 = new com.rameses.rcp.control.XLabel();
        xLabel17 = new com.rameses.rcp.control.XLabel();
        formPanel9 = new com.rameses.rcp.util.FormPanel();
        xLabel18 = new com.rameses.rcp.control.XLabel();
        xLabel19 = new com.rameses.rcp.control.XLabel();

        jLabel1.setText("jLabel1");

        setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Applications");
        xDataTable2.setBorder(xTitledBorder1);
        xDataTable2.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "state"}
                , new Object[]{"caption", "State"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "txnno"}
                , new Object[]{"caption", "Application No."}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "permitno"}
                , new Object[]{"caption", "Permit No."}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "txntype"}
                , new Object[]{"caption", "Transaction Type"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "txndate"}
                , new Object[]{"caption", "Date Applied"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "owner.name"}
                , new Object[]{"caption", "Owner Name"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "owner.address"}
                , new Object[]{"caption", "Owner Address"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            })
        });
        xDataTable2.setHandler("appListHandler");
        xDataTable2.setImmediate(true);
        xDataTable2.setName("selectedApp");

        jPanel2.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Application Details");
        jPanel2.setBorder(xTitledBorder2);

        formPanel1.setPadding(new java.awt.Insets(4, 0, 0, 0));
        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel1.setBorder(xLineBorder1);
        xLabel1.setCaption("Motor No.");
        xLabel1.setDepends(new String[] {"selectedApp"});
        xLabel1.setExpression("#{selectedApp.motorno}");
        xLabel1.setPreferredSize(new java.awt.Dimension(202, 19));
        formPanel1.add(xLabel1);

        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel2.setBorder(xLineBorder2);
        xLabel2.setCaption("Chassis No.");
        xLabel2.setDepends(new String[] {"selectedApp"});
        xLabel2.setExpression("#{selectedApp.chassisno}");
        xLabel2.setPreferredSize(new java.awt.Dimension(202, 19));
        formPanel1.add(xLabel2);

        com.rameses.rcp.control.border.XLineBorder xLineBorder3 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder3.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel12.setBorder(xLineBorder3);
        xLabel12.setCaption("Plate No.");
        xLabel12.setDepends(new String[] {"selectedApp"});
        xLabel12.setExpression("#{selectedApp.plateno}");
        xLabel12.setPreferredSize(new java.awt.Dimension(202, 19));
        formPanel1.add(xLabel12);

        jPanel2.add(formPanel1);
        formPanel1.setBounds(310, 140, 290, 70);

        formPanel2.setPadding(new java.awt.Insets(4, 0, 0, 0));
        com.rameses.rcp.control.border.XLineBorder xLineBorder4 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder4.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel3.setBorder(xLineBorder4);
        xLabel3.setCaption("Make");
        xLabel3.setCaptionWidth(95);
        xLabel3.setDepends(new String[] {"selectedApp"});
        xLabel3.setExpression("#{selectedApp.make}");
        xLabel3.setPreferredSize(new java.awt.Dimension(200, 19));
        formPanel2.add(xLabel3);

        com.rameses.rcp.control.border.XLineBorder xLineBorder5 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder5.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel4.setBorder(xLineBorder5);
        xLabel4.setCaption("Model");
        xLabel4.setCaptionWidth(95);
        xLabel4.setDepends(new String[] {"selectedApp"});
        xLabel4.setExpression("#{selectedApp.model}");
        xLabel4.setPreferredSize(new java.awt.Dimension(200, 19));
        formPanel2.add(xLabel4);

        com.rameses.rcp.control.border.XLineBorder xLineBorder6 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder6.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel9.setBorder(xLineBorder6);
        xLabel9.setCaption("Unit Type");
        xLabel9.setCaptionWidth(95);
        xLabel9.setDepends(new String[] {"selectedApp"});
        xLabel9.setExpression("#{selectedApp.unittype}");
        xLabel9.setPreferredSize(new java.awt.Dimension(200, 19));
        formPanel2.add(xLabel9);

        jPanel2.add(formPanel2);
        formPanel2.setBounds(12, 140, 290, 70);

        formPanel3.setPadding(new java.awt.Insets(0, 0, 1, 0));
        com.rameses.rcp.control.border.XLineBorder xLineBorder7 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder7.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel5.setBorder(xLineBorder7);
        xLabel5.setCaption("Route");
        xLabel5.setCaptionWidth(95);
        xLabel5.setDepends(new String[] {"selectedApp"});
        xLabel5.setExpression("#{selectedApp.route.description}");
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xLabel5);

        jPanel2.add(formPanel3);
        formPanel3.setBounds(12, 210, 580, 20);

        formPanel4.setPadding(new java.awt.Insets(0, 0, 0, 0));
        com.rameses.rcp.control.border.XLineBorder xLineBorder8 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder8.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel7.setBorder(xLineBorder8);
        xLabel7.setCaption("State");
        xLabel7.setCaptionWidth(95);
        xLabel7.setDepends(new String[] {"selectedApp"});
        xLabel7.setExpression("#{selectedApp.state}");
        xLabel7.setPreferredSize(new java.awt.Dimension(200, 19));
        formPanel4.add(xLabel7);

        com.rameses.rcp.control.border.XLineBorder xLineBorder9 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder9.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel8.setBorder(xLineBorder9);
        xLabel8.setCaption("Application No.");
        xLabel8.setCaptionWidth(95);
        xLabel8.setDepends(new String[] {"selectedApp"});
        xLabel8.setExpression("#{selectedApp.txnno}");
        xLabel8.setPreferredSize(new java.awt.Dimension(200, 19));
        formPanel4.add(xLabel8);

        com.rameses.rcp.control.border.XLineBorder xLineBorder10 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder10.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel15.setBorder(xLineBorder10);
        xLabel15.setCaption("Permit No.");
        xLabel15.setCaptionWidth(95);
        xLabel15.setDepends(new String[] {"selectedApp"});
        xLabel15.setExpression("#{selectedApp.permitno}");
        xLabel15.setPreferredSize(new java.awt.Dimension(200, 19));
        formPanel4.add(xLabel15);

        jPanel2.add(formPanel4);
        formPanel4.setBounds(12, 30, 290, 70);

        formPanel5.setPadding(new java.awt.Insets(0, 0, 0, 0));
        com.rameses.rcp.control.border.XLineBorder xLineBorder11 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder11.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel10.setBorder(xLineBorder11);
        xLabel10.setCaption("Txn. Date");
        xLabel10.setDepends(new String[] {"selectedApp"});
        xLabel10.setExpression("#{selectedApp.txndate}");
        xLabel10.setPreferredSize(new java.awt.Dimension(202, 19));
        formPanel5.add(xLabel10);

        com.rameses.rcp.control.border.XLineBorder xLineBorder12 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder12.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel11.setBorder(xLineBorder12);
        xLabel11.setCaption("Txn. Type");
        xLabel11.setDepends(new String[] {"selectedApp"});
        xLabel11.setExpression("#{selectedApp.txntype}");
        xLabel11.setPreferredSize(new java.awt.Dimension(202, 19));
        formPanel5.add(xLabel11);

        jPanel2.add(formPanel5);
        formPanel5.setBounds(310, 30, 290, 40);

        formPanel6.setPadding(new java.awt.Insets(1, 0, 1, 0));
        com.rameses.rcp.control.border.XLineBorder xLineBorder13 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder13.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel13.setBorder(xLineBorder13);
        xLabel13.setCaption("Owner Name");
        xLabel13.setCaptionWidth(95);
        xLabel13.setDepends(new String[] {"selectedApp"});
        xLabel13.setExpression("#{selectedApp.owner.name}");
        xLabel13.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel13);

        com.rameses.rcp.control.border.XLineBorder xLineBorder14 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder14.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel14.setBorder(xLineBorder14);
        xLabel14.setCaption("Owner Address");
        xLabel14.setCaptionWidth(95);
        xLabel14.setDepends(new String[] {"selectedApp"});
        xLabel14.setExpression("#{selectedApp.owner.address}");
        xLabel14.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel14);

        jPanel2.add(formPanel6);
        formPanel6.setBounds(12, 90, 580, 50);

        xActionTextField1.setActionName("doSearch");
        xActionTextField1.setName("searchText");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                    .add(xActionTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 302, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xDataTable2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(xActionTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xDataTable2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 245, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jTabbedPane1.addTab("Application Information", jPanel3);

        xDataTable1.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "txnno"}
                , new Object[]{"caption", "Application No"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "type"}
                , new Object[]{"caption", "Txn Type"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "txndate"}
                , new Object[]{"caption", "Txn Date"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "make"}
                , new Object[]{"caption", "Prev Make"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "motorno"}
                , new Object[]{"caption", "Prev Motor No"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "chassisno"}
                , new Object[]{"caption", "Prev Chassis No"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "plateno"}
                , new Object[]{"caption", "Prev Plate No"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "newmake"}
                , new Object[]{"caption", "New Make No"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "newmotorno"}
                , new Object[]{"caption", "New Motor No"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "newchassisno"}
                , new Object[]{"caption", "New Chassis No"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "newplateno"}
                , new Object[]{"caption", "New Plate No"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            })
        });
        xDataTable1.setHandler("txnListHandler");
        jTabbedPane1.addTab("Order Of Dropping", xDataTable1);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Current Unit Information");
        jPanel4.setBorder(xTitledBorder3);

        formPanel8.setPadding(new java.awt.Insets(0, 0, 0, 0));
        com.rameses.rcp.control.border.XLineBorder xLineBorder15 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder15.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel16.setBorder(xLineBorder15);
        xLabel16.setCaption("Chassis No.");
        xLabel16.setDepends(new String[] {"selectedApp"});
        xLabel16.setExpression("#{franchise.chassisno}");
        xLabel16.setPreferredSize(new java.awt.Dimension(207, 19));
        formPanel8.add(xLabel16);

        com.rameses.rcp.control.border.XLineBorder xLineBorder16 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder16.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel17.setBorder(xLineBorder16);
        xLabel17.setCaption("Plate No.");
        xLabel17.setDepends(new String[] {"selectedApp"});
        xLabel17.setExpression("#{franchise.plateno}");
        xLabel17.setPreferredSize(new java.awt.Dimension(207, 19));
        formPanel8.add(xLabel17);

        formPanel9.setPadding(new java.awt.Insets(0, 0, 0, 0));
        com.rameses.rcp.control.border.XLineBorder xLineBorder17 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder17.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel18.setBorder(xLineBorder17);
        xLabel18.setCaption("Make");
        xLabel18.setCaptionWidth(95);
        xLabel18.setDepends(new String[] {"selectedApp"});
        xLabel18.setExpression("#{franchise.make}");
        xLabel18.setPreferredSize(new java.awt.Dimension(202, 19));
        formPanel9.add(xLabel18);

        com.rameses.rcp.control.border.XLineBorder xLineBorder18 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder18.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel19.setBorder(xLineBorder18);
        xLabel19.setCaption("Motor No.");
        xLabel19.setCaptionWidth(95);
        xLabel19.setDepends(new String[] {"selectedApp"});
        xLabel19.setExpression("#{franchise.motorno}");
        xLabel19.setPreferredSize(new java.awt.Dimension(202, 19));
        formPanel9.add(xLabel19);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 293, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(formPanel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(formPanel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .add(33, 33, 33))
        );
        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private com.rameses.rcp.util.FormPanel formPanel5;
    private com.rameses.rcp.util.FormPanel formPanel6;
    private com.rameses.rcp.util.FormPanel formPanel8;
    private com.rameses.rcp.util.FormPanel formPanel9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.rameses.rcp.control.XActionTextField xActionTextField1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDataTable xDataTable2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel11;
    private com.rameses.rcp.control.XLabel xLabel12;
    private com.rameses.rcp.control.XLabel xLabel13;
    private com.rameses.rcp.control.XLabel xLabel14;
    private com.rameses.rcp.control.XLabel xLabel15;
    private com.rameses.rcp.control.XLabel xLabel16;
    private com.rameses.rcp.control.XLabel xLabel17;
    private com.rameses.rcp.control.XLabel xLabel18;
    private com.rameses.rcp.control.XLabel xLabel19;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XLabel xLabel9;
    // End of variables declaration//GEN-END:variables
    
}
