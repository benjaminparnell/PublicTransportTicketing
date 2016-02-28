package publictransportticketing;

import java.util.Date;

/**
 *
 * @author benp
 */
public class ManagementUI extends javax.swing.JFrame {

    private final Server server;
    
    /**
     * Creates new form ManagementUI
     * @param server
     */
    public ManagementUI(Server server) {
        initComponents();
        this.server = server;
        this.setupUi();
    }
    
    private void setupUi() {
        this.transportChoice.addItem("Train");
        this.transportChoice.addItem("Bus");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        transportChoice = new java.awt.Choice();
        transportLabel = new java.awt.Label();
        startDatePicker = new com.toedter.calendar.JDateChooser();
        endDatePicker = new com.toedter.calendar.JDateChooser();
        startHourSpinner = new javax.swing.JSpinner();
        startMinuteSpinner = new javax.swing.JSpinner();
        startSecondSpinner = new javax.swing.JSpinner();
        endHourSpinner = new javax.swing.JSpinner();
        endMinuteSpinner = new javax.swing.JSpinner();
        endSecondSpinner = new javax.swing.JSpinner();
        startTimeLabel = new javax.swing.JLabel();
        endTimeLabel = new javax.swing.JLabel();
        endHoursLabel = new javax.swing.JLabel();
        endMinutesLabel = new javax.swing.JLabel();
        endSecondsLabel = new javax.swing.JLabel();
        endHoursLabel1 = new javax.swing.JLabel();
        endMinutesLabel1 = new javax.swing.JLabel();
        endSecondsLabel1 = new javax.swing.JLabel();
        zoneOneCheckbox = new javax.swing.JCheckBox();
        zoneFourCheckbox = new javax.swing.JCheckBox();
        zoneTwoCheckbox = new javax.swing.JCheckBox();
        ZoneFiveCheckbox = new javax.swing.JCheckBox();
        zoneThreeCheckbox = new javax.swing.JCheckBox();
        zoneSixCheckbox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();

        jCheckBox2.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        transportLabel.setText("Transport");

        startHourSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        startMinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        startSecondSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        endHourSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        endMinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        endSecondSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        startTimeLabel.setText("Start Time");

        endTimeLabel.setText("End Time");

        endHoursLabel.setText("Hours");

        endMinutesLabel.setText("Minutes");

        endSecondsLabel.setText("Seconds");

        endHoursLabel1.setText("Hours");

        endMinutesLabel1.setText("Minutes");

        endSecondsLabel1.setText("Seconds");

        zoneOneCheckbox.setText("Zone 1");

        zoneFourCheckbox.setText("Zone 4");

        zoneTwoCheckbox.setText("Zone 2");

        ZoneFiveCheckbox.setText("Zone 5");

        zoneThreeCheckbox.setText("Zone 3");

        zoneSixCheckbox.setText("Zone 6");

        jLabel1.setText("Zones");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zoneThreeCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zoneSixCheckbox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zoneTwoCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ZoneFiveCheckbox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zoneOneCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zoneFourCheckbox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(endHoursLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endMinutesLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endSecondsLabel1))
                    .addComponent(endDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endTimeLabel)
                    .addComponent(startTimeLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(startSecondSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transportChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endHoursLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endMinutesLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(endSecondSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endSecondsLabel)))))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(transportChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startTimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endHoursLabel1)
                    .addComponent(endMinutesLabel1)
                    .addComponent(endSecondsLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startSecondSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(endTimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endHoursLabel)
                    .addComponent(endMinutesLabel)
                    .addComponent(endSecondsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endSecondSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zoneOneCheckbox)
                    .addComponent(zoneFourCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zoneTwoCheckbox)
                    .addComponent(ZoneFiveCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zoneSixCheckbox)
                    .addComponent(zoneThreeCheckbox))
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String transport = this.transportChoice.getSelectedItem();
        
        Date startDate = this.startDatePicker.getDate();
        Integer startTimeHour = (Integer) this.startHourSpinner.getValue();
        Integer startTimeMinute = (Integer) this.startMinuteSpinner.getValue();
        Integer startTimeSecond = (Integer) this.startSecondSpinner.getValue();
        
        Date endDate = this.endDatePicker.getDate();
        Integer endTimeHour = (Integer) this.endHourSpinner.getValue();
        Integer endTimeMinute = (Integer) this.endMinuteSpinner.getValue();
        Integer endTimeSecond = (Integer) this.endSecondSpinner.getValue();
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ZoneFiveCheckbox;
    private com.toedter.calendar.JDateChooser endDatePicker;
    private javax.swing.JSpinner endHourSpinner;
    private javax.swing.JLabel endHoursLabel;
    private javax.swing.JLabel endHoursLabel1;
    private javax.swing.JSpinner endMinuteSpinner;
    private javax.swing.JLabel endMinutesLabel;
    private javax.swing.JLabel endMinutesLabel1;
    private javax.swing.JSpinner endSecondSpinner;
    private javax.swing.JLabel endSecondsLabel;
    private javax.swing.JLabel endSecondsLabel1;
    private javax.swing.JLabel endTimeLabel;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton saveButton;
    private com.toedter.calendar.JDateChooser startDatePicker;
    private javax.swing.JSpinner startHourSpinner;
    private javax.swing.JSpinner startMinuteSpinner;
    private javax.swing.JSpinner startSecondSpinner;
    private javax.swing.JLabel startTimeLabel;
    private java.awt.Choice transportChoice;
    private java.awt.Label transportLabel;
    private javax.swing.JCheckBox zoneFourCheckbox;
    private javax.swing.JCheckBox zoneOneCheckbox;
    private javax.swing.JCheckBox zoneSixCheckbox;
    private javax.swing.JCheckBox zoneThreeCheckbox;
    private javax.swing.JCheckBox zoneTwoCheckbox;
    // End of variables declaration//GEN-END:variables
}
