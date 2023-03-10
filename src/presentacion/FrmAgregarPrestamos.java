/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.DPrestamos;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import logica.LPrestamos;

/**
 *
 * @author FeedzOne
 */
public class FrmAgregarPrestamos extends javax.swing.JFrame {

    /**
     * Creates new form FrmAgregarPrestamos
     */
    public FrmAgregarPrestamos() {
        initComponents();
        IDField.setEnabled(false);
        IDField.setVisible(false);
        BookField.setEditable(false);
        StudentField.setEditable(false);
        EmployeeField.setEditable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DateField = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        SaveBTN = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        BookField = new javax.swing.JTextField();
        StudentField = new javax.swing.JTextField();
        EmployeeField = new javax.swing.JTextField();
        SearchBookBTN = new javax.swing.JButton();
        SearchStudentBTN = new javax.swing.JButton();
        SearchEmployeeBTN = new javax.swing.JButton();
        IDBookField = new javax.swing.JTextField();
        IDStudentField = new javax.swing.JTextField();
        IDEmployeeFIeld = new javax.swing.JTextField();
        IDField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 230, 255));

        jLabel1.setText("Nombre del Libro: ");

        jLabel2.setText("Alumno:");

        jLabel3.setText("Docente que Autoriza:");

        jLabel5.setText("Fecha de Devolucion:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 55)); // NOI18N
        jLabel6.setText("AGREGAR PR??STAMOS");

        SaveBTN.setText("Guardar");
        SaveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBTNActionPerformed(evt);
            }
        });

        Cancel.setText("Cancelar");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        SearchBookBTN.setText("...");
        SearchBookBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBookBTNActionPerformed(evt);
            }
        });

        SearchStudentBTN.setText("...");
        SearchStudentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudentBTNActionPerformed(evt);
            }
        });

        SearchEmployeeBTN.setText("...");
        SearchEmployeeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmployeeBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SaveBTN))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(EmployeeField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                        .addComponent(StudentField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BookField, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(SearchStudentBTN)
                                            .addGap(18, 18, 18)
                                            .addComponent(IDStudentField, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(SearchEmployeeBTN)
                                            .addGap(18, 18, 18)
                                            .addComponent(IDEmployeeFIeld))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(SearchBookBTN)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(IDField)
                                                .addComponent(IDBookField, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))))
                                .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BookField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBookBTN)
                    .addComponent(IDBookField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(StudentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchStudentBTN)
                    .addComponent(IDStudentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EmployeeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchEmployeeBTN)
                    .addComponent(IDEmployeeFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBTN)
                    .addComponent(Cancel))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        BookField.setText("");
        StudentField.setText("");
        EmployeeField.setText("");
    }//GEN-LAST:event_CancelActionPerformed
    
    public static void setLibro(String id, String name){
        BookField.setText(name);
        IDBookField.setText(id);
    }
    
    public static void setDocente(String id, String name){
        EmployeeField.setText(name);
        IDEmployeeFIeld.setText(id);
    }
    
    public static void setAlumno(String id, String name){
        StudentField.setText(name);
        IDStudentField.setText(id);
    }
    
    private void SearchStudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudentBTNActionPerformed
       FrmBuscarAlumno misEstudiantes = new FrmBuscarAlumno();
       misEstudiantes.show();
    }//GEN-LAST:event_SearchStudentBTNActionPerformed

    private void SearchBookBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBookBTNActionPerformed
        FrmBuscarLibro misLibros = new FrmBuscarLibro();
        misLibros.show();
    }//GEN-LAST:event_SearchBookBTNActionPerformed

    private void SearchEmployeeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmployeeBTNActionPerformed
        FrmBuscarDocente misDocentes = new FrmBuscarDocente();
        misDocentes.show();
    }//GEN-LAST:event_SearchEmployeeBTNActionPerformed

    private void SaveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTNActionPerformed
        if(BookField.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El ISBN es Requerido", "Validacion", JOptionPane.WARNING_MESSAGE); 
            BookField.requestFocusInWindow();
            return;
        }
        if(StudentField.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El titulo es Requerido", "Validacion", JOptionPane.WARNING_MESSAGE); 
            StudentField.requestFocusInWindow();
            return;
        }
        if(EmployeeField.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "La descripcion es Requerida", "Validacion", JOptionPane.WARNING_MESSAGE); 
            EmployeeField.requestFocusInWindow();
            return;
        }
        if(DateField.getDate().equals("")){
            JOptionPane.showMessageDialog(rootPane, "La editorial es Requerida", "Validacion", JOptionPane.WARNING_MESSAGE); 
            DateField.requestFocusInWindow();
            return;
        } 
        String msg = null;
        if (IDField.getText().equals("")) {
            LPrestamos fun = new LPrestamos();
            DPrestamos dts = new DPrestamos();

            dts.setId_l((IDBookField.getText()));
            dts.setId_al(Integer.parseInt(IDStudentField.getText()));
            dts.setId_emp(Integer.parseInt(IDEmployeeFIeld.getText()));
            

            Calendar cal;
            cal = DateField.getCalendar();
            int aa, mm, dd;
            aa = cal.get(Calendar.YEAR) - 1900;
            mm = cal.get(Calendar.MONTH);
            dd = cal.get(Calendar.DAY_OF_MONTH);

            dts.setDateDev(new Date(aa, mm, dd));
            msg = fun.insertarPrestamos(dts);
            if(msg == "si"){
               JOptionPane.showMessageDialog(rootPane, "Registrado Satisfactoriamente", "Info", JOptionPane.INFORMATION_MESSAGE); 
            }else
            {
                JOptionPane.showMessageDialog(rootPane, "Uh oh, ocurri?? un error", "Info", JOptionPane.INFORMATION_MESSAGE); 
            }
        }
        
    }//GEN-LAST:event_SaveBTNActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgregarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarPrestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField BookField;
    private javax.swing.JButton Cancel;
    private com.toedter.calendar.JDateChooser DateField;
    private static javax.swing.JTextField EmployeeField;
    private static javax.swing.JTextField IDBookField;
    private static javax.swing.JTextField IDEmployeeFIeld;
    private javax.swing.JTextField IDField;
    private static javax.swing.JTextField IDStudentField;
    private javax.swing.JButton SaveBTN;
    private javax.swing.JButton SearchBookBTN;
    private javax.swing.JButton SearchEmployeeBTN;
    private javax.swing.JButton SearchStudentBTN;
    private static javax.swing.JTextField StudentField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
