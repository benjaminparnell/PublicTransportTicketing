/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

/**
 *
 * @author swapnull
 */
public class ScannerUI_old extends javax.swing.JFrame {
    private final Server server;
    private final PublicTransportTicketing mainUi;

    /**
     * Creates new form ScannerUI
     */
    public ScannerUI_old(Server server, PublicTransportTicketing mainUi) {
        initComponents();
        this.server = server;
        this.mainUi = mainUi;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_scantoken = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btn_scantoken.setText("Scan Token");
        btn_scantoken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_scantokenMouseClicked(evt);
            }
        });
        btn_scantoken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scantokenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_scantoken)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btn_scantoken)
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_scantokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scantokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_scantokenActionPerformed

    private void btn_scantokenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_scantokenMouseClicked
        Scanner scanner = new Scanner("1", new Location((float)1.3, (float)1.4), "stationary");
        Token token = new Token("1", "weekly", "tr1234abcd");
        scanner.scanToken(token);
    }//GEN-LAST:event_btn_scantokenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_scantoken;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
