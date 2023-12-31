/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;


/**
 *
 * @author DELL
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setVisible(true);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit_btn = new javax.swing.JButton();
        AddEng_btn = new javax.swing.JButton();
        DeleteEng_btn = new javax.swing.JButton();
        ViewEng_btn = new javax.swing.JButton();
        CalcSalaryEng_btn = new javax.swing.JButton();
        EditEng_btn = new javax.swing.JButton();
        AddTrain_btn = new javax.swing.JButton();
        EditTrain_btn = new javax.swing.JButton();
        DeleteTrain_btn = new javax.swing.JButton();
        ViewTrain_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        Exit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/exit.png"))); // NOI18N
        Exit_btn.setText("Exit");
        Exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 100, 40));

        AddEng_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        AddEng_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/employee.png"))); // NOI18N
        AddEng_btn.setText("Add Engineer");
        AddEng_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEng_btnActionPerformed(evt);
            }
        });
        getContentPane().add(AddEng_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 200, 60));

        DeleteEng_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        DeleteEng_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/delete.png"))); // NOI18N
        DeleteEng_btn.setText("Delete Engineer");
        DeleteEng_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEng_btnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteEng_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 54));

        ViewEng_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        ViewEng_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/binoculars.png"))); // NOI18N
        ViewEng_btn.setText("View all Engineers");
        ViewEng_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEng_btnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewEng_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, 49));

        CalcSalaryEng_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        CalcSalaryEng_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/calculator.png"))); // NOI18N
        CalcSalaryEng_btn.setText("Calculate Salary");
        CalcSalaryEng_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcSalaryEng_btnActionPerformed(evt);
            }
        });
        getContentPane().add(CalcSalaryEng_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, -1, 50));

        EditEng_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        EditEng_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/reload (1).png"))); // NOI18N
        EditEng_btn.setText("Edit Engineer");
        EditEng_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEng_btnActionPerformed(evt);
            }
        });
        getContentPane().add(EditEng_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 50));

        AddTrain_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        AddTrain_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/employee.png"))); // NOI18N
        AddTrain_btn.setText("Add Trainee");
        AddTrain_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrain_btnActionPerformed(evt);
            }
        });
        getContentPane().add(AddTrain_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 220, 60));

        EditTrain_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        EditTrain_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/reload (1).png"))); // NOI18N
        EditTrain_btn.setText("Edit Trainee");
        EditTrain_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTrain_btnActionPerformed(evt);
            }
        });
        getContentPane().add(EditTrain_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 210, 50));

        DeleteTrain_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        DeleteTrain_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/delete.png"))); // NOI18N
        DeleteTrain_btn.setText("Delete Trainee");
        DeleteTrain_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTrain_btnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteTrain_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 220, 60));

        ViewTrain_btn.setFont(new java.awt.Font("Sylfaen", 1, 21)); // NOI18N
        ViewTrain_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/binoculars.png"))); // NOI18N
        ViewTrain_btn.setText("View all Trainees");
        ViewTrain_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTrain_btnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewTrain_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, 50));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Home  ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/operations-manager-job-description1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -10, 860, 670));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 180, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddEng_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEng_btnActionPerformed
        setVisible(false);
           new AddEngineer().setVisible(true);
    }//GEN-LAST:event_AddEng_btnActionPerformed

    private void AddTrain_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrain_btnActionPerformed
        setVisible(false);
           new AddTrainee().setVisible(true);
    }//GEN-LAST:event_AddTrain_btnActionPerformed

    private void DeleteTrain_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTrain_btnActionPerformed
        setVisible(false);
           new DeleteTrainee().setVisible(true);
    }//GEN-LAST:event_DeleteTrain_btnActionPerformed

    private void Exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_btnActionPerformed
         setVisible(false);
      new Login().setVisible(true);
    }//GEN-LAST:event_Exit_btnActionPerformed

    private void CalcSalaryEng_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcSalaryEng_btnActionPerformed
       setVisible(false);
           new CalculateSalary().setVisible(true);
    }//GEN-LAST:event_CalcSalaryEng_btnActionPerformed

    private void ViewTrain_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTrain_btnActionPerformed
        setVisible(false);
           new ViewTrainee().setVisible(true);
    }//GEN-LAST:event_ViewTrain_btnActionPerformed

    private void ViewEng_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEng_btnActionPerformed
       setVisible(false);
        new ViewEngineers().setVisible(true);
         
    }//GEN-LAST:event_ViewEng_btnActionPerformed

    private void DeleteEng_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEng_btnActionPerformed
        setVisible(false);
           new DeleteEngineer().setVisible(true);
    }//GEN-LAST:event_DeleteEng_btnActionPerformed

    private void EditEng_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEng_btnActionPerformed
        setVisible(false);
           new EditEngineer().setVisible(true);
    }//GEN-LAST:event_EditEng_btnActionPerformed

    private void EditTrain_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTrain_btnActionPerformed
        setVisible(false);
           new EditTrainee().setVisible(true);
    }//GEN-LAST:event_EditTrain_btnActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEng_btn;
    private javax.swing.JButton AddTrain_btn;
    private javax.swing.JButton CalcSalaryEng_btn;
    private javax.swing.JButton DeleteEng_btn;
    private javax.swing.JButton DeleteTrain_btn;
    private javax.swing.JButton EditEng_btn;
    private javax.swing.JButton EditTrain_btn;
    private javax.swing.JButton Exit_btn;
    private javax.swing.JButton ViewEng_btn;
    private javax.swing.JButton ViewTrain_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
