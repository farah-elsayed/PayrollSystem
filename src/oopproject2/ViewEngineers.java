/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class ViewEngineers extends javax.swing.JFrame {

    /**
     * Creates new form ViewEngineers
     * @return 
     */
     public JCheckBox getjCheckBox1() {
        return jCheckBox1;
    }
    
    public ViewEngineers() {
        initComponents();
        jLabel5.setVisible(false);
            jComboBox1.setVisible(false);
            jComboBox2.setVisible(false);
            
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        View_btn1 = new javax.swing.JButton();
        Cancel_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        View_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_btn1.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        View_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/binoculars.png"))); // NOI18N
        View_btn1.setText("View All Engineers");
        View_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(View_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, 34));

        Cancel_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        Cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/cancel.png"))); // NOI18N
        Cancel_btn.setText("Cancel");
        Cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, 34));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("ID:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 80, 40));

        jLabel5.setText("Month");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 40, -1));

        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 150, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        View_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        View_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/binoculars.png"))); // NOI18N
        View_btn.setText("View");
        View_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_btnActionPerformed(evt);
            }
        });
        jPanel3.add(View_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 140, 30));

        jLabel3.setText("View Specific Employee's Information");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 240, 30));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("View Salary for a specific month");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 240, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 400, 270));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View All Engnieers");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/Website-Landing-Page-Best-Practices-1520x800again.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 910, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_btnActionPerformed
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_Cancel_btnActionPerformed

    private void View_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_btn1ActionPerformed

        Admin viewall = new Admin();
       viewall.view();// OPERATING VIEW ALL FUNCTION
        
    }//GEN-LAST:event_View_btn1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if (jCheckBox1.isSelected())
        {
            jLabel5.setVisible(true);
            jComboBox1.setVisible(true);
            jComboBox2.setVisible(true);

        }
        else
        {
            jLabel5.setVisible(false);
            jComboBox1.setVisible(false);
            jComboBox2.setVisible(false);

        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void View_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_btnActionPerformed

      Admin vid= new Admin(); 
      try{
      
        int i= Integer.parseInt(jTextField1.getText());
        if (i!=0){
        if (jCheckBox1.isSelected())
        {

            vid.view(i, jComboBox1, jComboBox2);
        } 
        else
        {

            vid.view(i);
        }
      }
        else
             JOptionPane.showMessageDialog(null, "Please Enter a Valid ID");
      }
      catch (NumberFormatException e)
      {
          JOptionPane.showMessageDialog(null, "Please Enter a Valid ID");
      }
    }//GEN-LAST:event_View_btnActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        System.out.print (jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_btn;
    private javax.swing.JButton View_btn;
    private javax.swing.JButton View_btn1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
