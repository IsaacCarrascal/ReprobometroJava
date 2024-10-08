/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;

import java.util.Arrays;
import javax.swing.JOptionPane;
import system.SubjectSystem;

/**
 *
 * @author Isaac
 */
public class Subjects extends javax.swing.JFrame {

    LogIn login;
    SubjectSystem subjsys = new SubjectSystem();

    /**
     * Creates new form Subjects
     */
    public Subjects() {
        initComponents();
    }

    public Subjects(LogIn login) {
        this.login = login;
        initComponents();
    }

    private boolean verifyFilled() {
        if (check1.isSelected() && !"".equals(txtGrade1.getText())) {
            return true;
        }
        if (check2.isSelected() && !"".equals(txtGrade1.getText()) && !"".equals(txtGrade2.getText())) {
            return true;
        }
        return check3.isSelected() && !"".equals(txtGrade1.getText()) && !"".equals(txtGrade2.getText()) && !"".equals(txtGrade3.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tbPn = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblGrades = new javax.swing.JLabel();
        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        lblG1 = new javax.swing.JLabel();
        lblG2 = new javax.swing.JLabel();
        lblG3 = new javax.swing.JLabel();
        txtGrade1 = new javax.swing.JTextField();
        txtGrade2 = new javax.swing.JTextField();
        txtGrade3 = new javax.swing.JTextField();
        ComboPonder = new javax.swing.JComboBox<>();
        lblPonder = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listShow = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaShow = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spnTarget = new javax.swing.JSpinner();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblName.setText("Nombre:");

        lblGrades.setText("Calificaciones Obtenidas");

        check1.setText("1");
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });

        check2.setText("2");
        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });

        check3.setText("3");
        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });

        lblG1.setText("Calificacion 1:");

        lblG2.setText("Calificacion 2:");

        lblG3.setText("Calificacion 3:");

        txtGrade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrade1ActionPerformed(evt);
            }
        });

        txtGrade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrade2ActionPerformed(evt);
            }
        });

        txtGrade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrade3ActionPerformed(evt);
            }
        });

        ComboPonder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C" }));
        ComboPonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPonderActionPerformed(evt);
            }
        });

        lblPonder.setText("Ponderación");

        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCalc)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPonder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboPonder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblG3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(lblG1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblG2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGrade3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrades)
                    .addComponent(check1)
                    .addComponent(check2)
                    .addComponent(check3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblG1)
                    .addComponent(txtGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblG2)
                    .addComponent(txtGrade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblG3)
                    .addComponent(txtGrade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboPonder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPonder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalc)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tbPn.addTab("Materia", jPanel1);

        listShow.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nombre", "Cal 1", "Cal 2", "Cal 3", "Ponderacion", "Calculos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listShow.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listShowValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listShow);

        txtAreaShow.setColumns(20);
        txtAreaShow.setRows(5);
        jScrollPane2.setViewportView(txtAreaShow);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        tbPn.addTab("Calculadora", jPanel2);

        jLabel1.setText("Calificacion Buscada:");

        spnTarget.setModel(new javax.swing.SpinnerNumberModel(70, 0, 100, 1));
        spnTarget.setValue(70);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spnTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        tbPn.addTab("Configuracion", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPn)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPn)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGrade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrade1ActionPerformed

    private void txtGrade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrade2ActionPerformed

    private void txtGrade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrade3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrade3ActionPerformed

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
        if (check1.isSelected()) {
            check2.setSelected(false);
            check3.setSelected(false);
            txtGrade2.setEnabled(false);
            txtGrade2.setText("");
            txtGrade3.setEnabled(false);
            txtGrade3.setText("");
        }
    }//GEN-LAST:event_check1ActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        if (check2.isSelected()) {
            check1.setSelected(false);
            check3.setSelected(false);
            txtGrade2.setEnabled(true);
            txtGrade3.setEnabled(false);
            txtGrade3.setText("");
        }
    }//GEN-LAST:event_check2ActionPerformed

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
        if (check3.isSelected()) {
            check2.setSelected(false);
            check1.setSelected(false);
            txtGrade2.setEnabled(true);
            txtGrade3.setEnabled(true);
        }
    }//GEN-LAST:event_check3ActionPerformed

    private void ComboPonderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPonderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboPonderActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        if (ComboPonder.getSelectedItem() != "" && this.verifyFilled() && !"".equals(txtName.getText())) {
            subjsys.setName(txtName.getText());
            subjsys.setGrade1(Double.valueOf(txtGrade1.getText()));
            subjsys.assign_ponderacion(ComboPonder.getSelectedIndex());
            subjsys.setTarget(Double.valueOf((int)spnTarget.getValue()));
            if (check1.isSelected()) {
                subjsys.p1_calculator();
            } else {
                subjsys.setGrade2(Double.valueOf(txtGrade2.getText()));
                if (check2.isSelected()) {
                    subjsys.p2_calculator();
                } else {
                    subjsys.setGrade3(Double.valueOf(txtGrade3.getText()));
                    subjsys.p3_calculator();
                }
            }
            tbPn.setSelectedIndex(1);
        } else {
            JOptionPane.showMessageDialog(this, "Favor de llenar todos los campos");
        }
    }//GEN-LAST:event_btnCalcActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        login.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void listShowValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listShowValueChanged
        if(!"".equals(subjsys.getName())){
        if (listShow.getSelectedIndex() == 0) {
            txtAreaShow.setText(subjsys.getName());
        }
        if (listShow.getSelectedIndex() == 1) {
            txtAreaShow.setText(String.valueOf(subjsys.getGrade1()));
        }
        if (listShow.getSelectedIndex() == 2) {
            txtAreaShow.setText(String.valueOf(subjsys.getGrade2()));
        }
        if (listShow.getSelectedIndex() == 3) {
            txtAreaShow.setText(String.valueOf(subjsys.getGrade3()));
        }
        if (listShow.getSelectedIndex() == 4) {
            txtAreaShow.setText(Arrays.toString(subjsys.getPonderacion()));
        }
        if (listShow.getSelectedIndex() == 5) {
            if (check1.isSelected()) {
                txtAreaShow.setText("Necesita sacar: " + String.valueOf(subjsys.getMean()) + "\n en ambos parciales para pasar");
                if(100<subjsys.getMean()){
                txtAreaShow.setText(txtAreaShow.getText()+"\n materia no aprobable :(");
                }
                else{
                    txtAreaShow.setText(txtAreaShow.getText()+"\n materia aprobable :)");
                }
            }
            if (check2.isSelected()) {
                txtAreaShow.setText("Necesita sacar: " + String.valueOf(subjsys.getMean()) + "\n en tercer parcial para pasar");
                if(100<subjsys.getMean()){
                txtAreaShow.setText(txtAreaShow.getText()+"\n materia no aprobable :(");
                }
                else{
                    txtAreaShow.setText(txtAreaShow.getText()+"\n materia aprobable :)");
                }
            }
            if (check3.isSelected()) {
                txtAreaShow.setText("Su promedio es de " + String.valueOf(subjsys.getMean()));
                if(subjsys.getTarget()>subjsys.getMean()){
                txtAreaShow.setText(txtAreaShow.getText()+"\n materia reprobada :(");
                }
                else{
                    txtAreaShow.setText(txtAreaShow.getText()+"\n materia aprobada :)");
                }
            }
        }
        }
        else{txtAreaShow.setText("Llene los campos y pulse calcular...");}
    }//GEN-LAST:event_listShowValueChanged

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
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPonder;
    private javax.swing.JButton btnCalc;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblG1;
    private javax.swing.JLabel lblG2;
    private javax.swing.JLabel lblG3;
    private javax.swing.JLabel lblGrades;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPonder;
    private javax.swing.JList<String> listShow;
    private javax.swing.JSpinner spnTarget;
    private javax.swing.JTabbedPane tbPn;
    private javax.swing.JTextArea txtAreaShow;
    private javax.swing.JTextField txtGrade1;
    private javax.swing.JTextField txtGrade2;
    private javax.swing.JTextField txtGrade3;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
