/*
 * QuickLaunchToolBar.java
 *
 * Created on November 2, 2010, 5:04 PM
 */

package system.toolbar.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author  ms
 */
public class TransactionLaunchBar extends javax.swing.JPanel {
    
    /** Creates new form QuickLaunchToolBar */
    public TransactionLaunchBar() {
        initComponents();
        txtKey.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ((JComponent)e.getSource()).requestFocus();
            }
        }, KeyStroke.getKeyStroke("F12"), JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        txtKey = new com.rameses.rcp.control.XActionTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        setPreferredSize(new java.awt.Dimension(256, 30));
        txtKey.setActionName("launch");
        txtKey.setHint("Type a quick launcher key");
        txtKey.setName("key");
        add(txtKey, java.awt.BorderLayout.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png")));
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        add(jLabel1, java.awt.BorderLayout.WEST);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.rameses.rcp.control.XActionTextField txtKey;
    // End of variables declaration//GEN-END:variables
    
}