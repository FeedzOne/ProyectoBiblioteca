/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.DGeneroLibro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.LGeneroLibro;

/**
 *
 * @author FeedzOne
 */
public class FrmGeneroLibros extends javax.swing.JFrame {

    /**
     * Creates new form FrmGeneroLibros
     */
    public FrmGeneroLibros() {
        initComponents();
        idF.setVisible(false);
        ShowGeneros("");
        TGeneros.getColumnModel().getColumn(0).setMaxWidth(0);
        TGeneros.getColumnModel().getColumn(0).setMinWidth(0);
        TGeneros.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    public void clearField(){
        GenreField.setText("");
    }
    
    public void ShowGeneros(String user){
        DefaultTableModel myModel;
        LGeneroLibro fn = new LGeneroLibro();
        DGeneroLibro dts = new DGeneroLibro();
        
        dts.setDescripcion(user);
        myModel = fn.verGeneros(dts);
        TGeneros.setModel(myModel);
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
        TGeneros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        GenreField = new javax.swing.JTextField();
        AddBTN = new javax.swing.JButton();
        EditBTN = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        idF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 230, 255));

        TGeneros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        TGeneros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TGenerosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TGeneros);

        jLabel1.setText("Genero del Libro:");

        AddBTN.setText("Agregar");
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });

        EditBTN.setText("Editar");
        EditBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBTNActionPerformed(evt);
            }
        });

        DeleteBTN.setText("Borrar");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenreField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DeleteBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(GenreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(AddBTN)
                        .addGap(18, 18, 18)
                        .addComponent(EditBTN)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(idF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTNActionPerformed
        // TODO add your handling code here:
        if(GenreField.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El nombre es requerido.", "Validacion", JOptionPane.WARNING_MESSAGE);
            GenreField.requestFocusInWindow();
            return;
        }

        String msg = null;
        DGeneroLibro dts = new DGeneroLibro();
        LGeneroLibro fun = new LGeneroLibro();
        
        dts.setDescripcion(GenreField.getText());
        msg = fun.insertarEditorial(dts);
        
        if(msg == "si"){
               JOptionPane.showMessageDialog(rootPane, "Registrado Satisfactoriamente", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "Uh oh, ocurri?? un error", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }
        clearField();
        ShowGeneros("");
    }//GEN-LAST:event_AddBTNActionPerformed

    private void EditBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBTNActionPerformed
        // TODO add your handling code here:
        if(GenreField.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El nombre es requerido.", "Validacion", JOptionPane.WARNING_MESSAGE);
            GenreField.requestFocusInWindow();
            return;
        }

        String msg = null;

        DGeneroLibro dts = new DGeneroLibro();
        LGeneroLibro fun = new LGeneroLibro();

        dts.setIdGenero(Integer.parseInt(idF.getText()));
        dts.setDescripcion(GenreField.getText());
        msg = fun.editarEditoriales(dts);

        if(msg == "si"){
           JOptionPane.showMessageDialog(rootPane, "Actualizado Satisfactoriamente", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "Uh oh, ocurri?? un error", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }

        clearField();
        ShowGeneros("");
    }//GEN-LAST:event_EditBTNActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        // TODO add your handling code here:
        if(!GenreField.getText().equals("")){
            DGeneroLibro dts = new DGeneroLibro();
            LGeneroLibro fun = new LGeneroLibro();

            dts.setIdGenero(Integer.parseInt(idF.getText()));
            String msg = fun.eliminarEditoriales(dts);

            if(msg.equals("si")){
                 JOptionPane.showMessageDialog(rootPane, "Eliminado Satisfactoriamente", "Info", JOptionPane.INFORMATION_MESSAGE); 
            }else
            {
                JOptionPane.showMessageDialog(rootPane, "Uh oh, ocurri?? un error", "Info", JOptionPane.ERROR_MESSAGE); 
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Es necesario seleccionar una opcion.", "Info", JOptionPane.ERROR_MESSAGE); 
        }
        clearField();
        ShowGeneros("");
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void TGenerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TGenerosMouseClicked
        // TODO add your handling code here:
        int fila = TGeneros.getSelectedRow();
        idF.setText(TGeneros.getValueAt(fila, 0).toString());
        GenreField.setText(TGeneros.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_TGenerosMouseClicked

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
            java.util.logging.Logger.getLogger(FrmGeneroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGeneroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGeneroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGeneroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGeneroLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton EditBTN;
    private javax.swing.JTextField GenreField;
    private javax.swing.JTable TGeneros;
    private javax.swing.JTextField idF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
