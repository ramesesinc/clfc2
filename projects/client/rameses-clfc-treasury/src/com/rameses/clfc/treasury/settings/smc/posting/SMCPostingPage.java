/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.clfc.treasury.settings.smc.posting;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author louie
 */

@StyleSheet
@Template(FormPage.class)
public class SMCPostingPage extends javax.swing.JPanel {

    /**
     * Creates new form BranchLoanPostingSequencePage
     */
    public SMCPostingPage() {
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

        xLabel3 = new com.rameses.rcp.control.XLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        xHtmlView1 = new com.rameses.rcp.control.XHtmlView();
        xButton6 = new com.rameses.rcp.control.XButton();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xButton2 = new com.rameses.rcp.control.XButton();
        xButton3 = new com.rameses.rcp.control.XButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        xList1 = new com.rameses.rcp.control.XList();
        xButton7 = new com.rameses.rcp.control.XButton();
        xButton8 = new com.rameses.rcp.control.XButton();

        xLabel3.setExpression("Item Posting Sequence");
        xLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        xHtmlView1.setName("postingHtml"); // NOI18N
        jScrollPane2.setViewportView(xHtmlView1);

        xButton6.setContentAreaFilled(false);
        xButton6.setDisableWhen("#{mode=='read'}");
        xButton6.setImmediate(true);
        xButton6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        xButton6.setName("generateDefaultPosting"); // NOI18N
        xButton6.setPreferredSize(new java.awt.Dimension(109, 25));
        xButton6.setText("<html><a href=\"x\">[ Generate Default Sequence ]</a></html>");

        xLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        xLabel4.setText("Item Display Sequence");

        xButton2.setDisableWhen("#{mode=='read'}");
        xButton2.setImmediate(true);
        xButton2.setName("addHeader"); // NOI18N
        xButton2.setPreferredSize(new java.awt.Dimension(40, 23));
        xButton2.setText("+");

        xButton3.setDepends(new String[] {"selectedHeader"});
        xButton3.setDisableWhen("#{mode=='read'||selectedHeader==null}");
        xButton3.setImmediate(true);
        xButton3.setName("removeHeader"); // NOI18N
        xButton3.setPreferredSize(new java.awt.Dimension(40, 23));
        xButton3.setText("-");

        xList1.setExpression("${item.sequence} ${item.title}");
        xList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xList1.setHandler("headersHandler");
        xList1.setName("selectedHeader"); // NOI18N
        jScrollPane1.setViewportView(xList1);

        xButton7.setDepends(new String[] {"selectedHeader"});
        xButton7.setDisableWhen("#{mode=='read'||selectedHeader?.isfirst==true}");
        xButton7.setImmediate(true);
        xButton7.setName("moveUpHeader"); // NOI18N
        xButton7.setPreferredSize(new java.awt.Dimension(70, 23));
        xButton7.setText("Up");

        xButton8.setDepends(new String[] {"selectedHeader"});
        xButton8.setDisableWhen("#{mode=='read'||selectedHeader?.islast==true}");
        xButton8.setImmediate(true);
        xButton8.setName("moveDownHeader"); // NOI18N
        xButton8.setPreferredSize(new java.awt.Dimension(70, 23));
        xButton8.setText("Down");
        xButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(xLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addComponent(xButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.rameses.rcp.control.XButton xButton2;
    private com.rameses.rcp.control.XButton xButton3;
    private com.rameses.rcp.control.XButton xButton6;
    private com.rameses.rcp.control.XButton xButton7;
    private com.rameses.rcp.control.XButton xButton8;
    private com.rameses.rcp.control.XHtmlView xHtmlView1;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XList xList1;
    // End of variables declaration//GEN-END:variables
}
