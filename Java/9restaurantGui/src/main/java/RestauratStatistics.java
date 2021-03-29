/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class RestauratStatistics extends javax.swing.JFrame {

  /**
   * Creates new form RestauratStatistics
   */
  public RestauratStatistics() {
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

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    lowerTextField = new javax.swing.JTextField();
    inputTextField = new javax.swing.JTextField();
    startTextField = new javax.swing.JTextField();
    endTextField = new javax.swing.JTextField();
    upperTextField = new javax.swing.JTextField();
    startTimeCheckBox = new javax.swing.JCheckBox();
    endTimeCheckBox = new javax.swing.JCheckBox();
    upperLimitCheckBox = new javax.swing.JCheckBox();
    lowerLimitCheckBox = new javax.swing.JCheckBox();
    readButton = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    totalAmountButton = new javax.swing.JButton();
    totalVisitButton = new javax.swing.JButton();
    totalCustomersButton = new javax.swing.JButton();
    listVisitsButton = new javax.swing.JButton();
    avgCustomersButton = new javax.swing.JButton();
    avgAmoungButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Restaurant Statistics");

    jLabel1.setText("Input File:");

    jLabel2.setText("Start Time:");

    jLabel3.setText("End Time:");

    jLabel4.setText("Upper Limit:");

    jLabel5.setText("Lower Limit:");

    startTextField.setText("DD-MM-YY-hh-mm");

    endTextField.setText("DD-MM-YY-hh-mm");

    startTimeCheckBox.setText("Ignore Start Time");
    startTimeCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        startTimeCheckBoxActionPerformed(evt);
      }
    });

    endTimeCheckBox.setText("Ignore End Time");

    upperLimitCheckBox.setText("Ignore Upper Limit");

    lowerLimitCheckBox.setText("Ignore Lower Limit");

    readButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    readButton.setText("Read");
    readButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        readButtonActionPerformed(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel6.setForeground(java.awt.Color.red);
    jLabel6.setText("Restaurant Statistics");

    totalAmountButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    totalAmountButton.setText("Total Amount");

    totalVisitButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    totalVisitButton.setText("Total Visits");

    totalCustomersButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    totalCustomersButton.setText("Total Customers");

    listVisitsButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    listVisitsButton.setText("List Visits");

    avgCustomersButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    avgCustomersButton.setText("Average Customers");

    avgAmoungButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    avgAmoungButton.setText("Average Amount");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel6)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(upperTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel5)
                      .addComponent(jLabel1)
                      .addComponent(jLabel2)
                      .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(endTextField, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(startTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                      .addComponent(inputTextField, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(lowerTextField))))
                .addGap(18, 18, 18))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(totalVisitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                  .addComponent(listVisitsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(totalCustomersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(avgCustomersButton))
                .addGap(30, 30, 30)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(lowerLimitCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(upperLimitCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(endTimeCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(startTimeCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(readButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(totalAmountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(avgAmoungButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel6)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(readButton))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(startTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(startTimeCheckBox))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(endTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(endTimeCheckBox))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(upperTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(upperLimitCheckBox))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(lowerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lowerLimitCheckBox))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(totalAmountButton)
          .addComponent(totalVisitButton)
          .addComponent(totalCustomersButton))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(listVisitsButton)
          .addComponent(avgCustomersButton)
          .addComponent(avgAmoungButton))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void startTimeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeCheckBoxActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_startTimeCheckBoxActionPerformed

  private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readButtonActionPerformed
    
  }//GEN-LAST:event_readButtonActionPerformed

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
      java.util.logging.Logger.getLogger(RestauratStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RestauratStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RestauratStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RestauratStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RestauratStatistics().setVisible(true);
      }
    });
  }
  
  private CustomerVisit[] CustomerVisitArray = new CustomerVisit[10000];
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton avgAmoungButton;
  private javax.swing.JButton avgCustomersButton;
  private javax.swing.JTextField endTextField;
  private javax.swing.JCheckBox endTimeCheckBox;
  private javax.swing.JTextField inputTextField;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JButton listVisitsButton;
  private javax.swing.JCheckBox lowerLimitCheckBox;
  private javax.swing.JTextField lowerTextField;
  private javax.swing.JButton readButton;
  private javax.swing.JTextField startTextField;
  private javax.swing.JCheckBox startTimeCheckBox;
  private javax.swing.JButton totalAmountButton;
  private javax.swing.JButton totalCustomersButton;
  private javax.swing.JButton totalVisitButton;
  private javax.swing.JCheckBox upperLimitCheckBox;
  private javax.swing.JTextField upperTextField;
  // End of variables declaration//GEN-END:variables
}