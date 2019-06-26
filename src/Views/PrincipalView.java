package Views;

import Models.*;
import java.util.List;

public class PrincipalView extends javax.swing.JFrame {
    List<UsuariosModel> usuarioLogueado;
    
    public PrincipalView(List<UsuariosModel> usuarioLogueado) {
        initComponents();
        this.usuarioLogueado=usuarioLogueado;
        cargarDatosUsuarioLogueado();
    }

    public void cargarDatosUsuarioLogueado(){
        for(UsuariosModel usuariosModel : usuarioLogueado){
            this.lblUsuario.setText(
                    usuariosModel.getPrimerNombre() + " " + 
                    usuariosModel.getPrimerApellido()
            );
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUsuarios = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        setMinimumSize(new java.awt.Dimension(1245, 616));
        setPreferredSize(new java.awt.Dimension(1245, 616));
        setSize(new java.awt.Dimension(1245, 616));

        btnUsuarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setPreferredSize(new java.awt.Dimension(89, 25));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUsuario.setText("@User");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Usuario:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel4.setText("Pantalla Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(183, 183, 183)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(lblUsuario)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUsuario)
                        .addComponent(jLabel7))
                    .addComponent(jLabel4))
                .addGap(76, 76, 76)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        new UsuariosView(usuarioLogueado).setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
