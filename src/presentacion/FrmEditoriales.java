/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.DEditoriales;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.LEditoriales;

/**
 *
 * @author FeedzOne
 */
public class FrmEditoriales extends javax.swing.JFrame {

    /**
     * Creates new form FrmDirecciones
     */
    public FrmEditoriales() {
        initComponents();
        IDField.setEnabled(false);
        idF.setVisible(false);
        ShowEditoriales("");
        TEditoriales.getColumnModel().getColumn(0).setMaxWidth(0);
        TEditoriales.getColumnModel().getColumn(0).setMinWidth(0);
        TEditoriales.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    public void clearField(){
        IDField.setText("");
        NameField.setText("");
        AddressField.setText("");
    }
    
    public void ShowEditoriales(String user){
        DefaultTableModel myModel;
        LEditoriales fn = new LEditoriales();
        DEditoriales dts = new DEditoriales();
        
        dts.setNombre(user);
        myModel = fn.verEditoriales(dts);
        TEditoriales.setModel(myModel);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TEditoriales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        AddBNT = new javax.swing.JButton();
        EditBNT = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();
        idF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 230, 255));

        TEditoriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Direccion"
            }
        ));
        TEditoriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEditorialesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TEditoriales);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 64)); // NOI18N
        jLabel1.setText("EDITORIALES");

        jLabel2.setText("Nombre de la Editorial:");

        jLabel3.setText("Direccion:");

        jLabel6.setText("ID:");

        AddBNT.setText("Agregar");
        AddBNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBNTActionPerformed(evt);
            }
        });

        EditBNT.setText("Editar");
        EditBNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBNTActionPerformed(evt);
            }
        });

        DeleteBTN.setText("Eliminar");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        CancelBTN.setText("Cancelar");
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddBNT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(EditBNT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(CancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NameField)
                                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(idF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBNT)
                    .addComponent(EditBNT)
                    .addComponent(DeleteBTN)
                    .addComponent(CancelBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(idF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBNTActionPerformed
        // TODO add your handling code here:
        if(NameField.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El nombre es requerido.", "Validacion", JOptionPane.WARNING_MESSAGE);
            NameField.requestFocusInWindow();
            return;
        }
        if(AddressField.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El nombre es requerido.", "Validacion", JOptionPane.WARNING_MESSAGE);
            NameField.requestFocusInWindow();
            return;
        }
        
        String msg = null;
        DEditoriales dts = new DEditoriales();
        LEditoriales fun = new LEditoriales();
        
        dts.setNombre(NameField.getText());
        dts.setDireccion(AddressField.getText());
        msg = fun.insertarEditorial(dts);
        
        if(msg == "si"){
               JOptionPane.showMessageDialog(rootPane, "Registrado Satisfactoriamente", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "Uh oh, ocurri?? un error", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }
        clearField();
        ShowEditoriales("");
    }//GEN-LAST:event_AddBNTActionPerformed

    private void TEditorialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEditorialesMouseClicked
        // TODO add your handling code here:
        int fila = TEditoriales.getSelectedRow();
        IDField.setText(TEditoriales.getValueAt(fila, 0).toString());
        NameField.setText(TEditoriales.getValueAt(fila, 1).toString());
        AddressField.setText(TEditoriales.getValueAt(fila, 2).toString());
        
    }//GEN-LAST:event_TEditorialesMouseClicked

    private void EditBNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBNTActionPerformed
        // TODO add your handling code here:
        if(NameField.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El nombre es requerido.", "Validacion", JOptionPane.WARNING_MESSAGE);
            NameField.requestFocusInWindow();
            return;
        }
        if(AddressField.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El nombre es requerido.", "Validacion", JOptionPane.WARNING_MESSAGE);
            NameField.requestFocusInWindow();
            return;
        }
        String msg = null;

        DEditoriales dts = new DEditoriales();
        LEditoriales fun = new LEditoriales();

        dts.setIdEditorial(Integer.parseInt(IDField.getText()));
        dts.setNombre(NameField.getText());
        dts.setDireccion(AddressField.getText());
        msg = fun.editarEditoriales(dts);

        if(msg == "si"){
           JOptionPane.showMessageDialog(rootPane, "Actualizado Satisfactoriamente", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "Uh oh, ocurri?? un error", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }
        

        
        clearField();
        ShowEditoriales("");
    }//GEN-LAST:event_EditBNTActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        // TODO add your handling code here:
        DEditoriales dts = new DEditoriales();
        LEditoriales fun = new LEditoriales();

        dts.setIdEditorial(Integer.parseInt(IDField.getText()));
        String msg = fun.eliminarEditoriales(dts);

        if(msg.equals("si")){
             JOptionPane.showMessageDialog(rootPane, "Eliminado Satisfactoriamente", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "Uh oh, ocurri?? un error", "Info", JOptionPane.ERROR_MESSAGE); 
        }
        clearField();
        ShowEditoriales("");
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        // TODO add your handling code here:
        clearField();
        ShowEditoriales("");
        return;
    }//GEN-LAST:event_CancelBTNActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditoriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditoriales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBNT;
    private javax.swing.JTextField AddressField;
    private javax.swing.JButton CancelBTN;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton EditBNT;
    private javax.swing.JTextField IDField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTable TEditoriales;
    private javax.swing.JTextField idF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
