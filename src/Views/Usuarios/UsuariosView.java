package Views.Usuarios;
import Controllers.*;
import Models.*;
import Views.Usuarios.DetalleUsuarioView;
import Views.Usuarios.EditarUsuarioView;
import Views.Usuarios.NuevoUsuarioView;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class UsuariosView extends javax.swing.JFrame {
    UsuariosController usuariosController;
    TelefonosController telefonosController;
    DefaultTableModel tblDatosPersonalesDtm, tblTelefonosDtm;
    List<UsuariosModel> usuarioLogueado;
    
    public UsuariosView(List<UsuariosModel> usuarioLogueado) {
        initComponents();
        usuariosController = new UsuariosController();
        telefonosController= new TelefonosController();
        tblDatosPersonalesDtm = (DefaultTableModel) this.tblUsuarios.getModel();
        //tblTelefonosDtm = (DefaultTableModel) this.tblTelefonos.getModel();
        this.usuarioLogueado= usuarioLogueado;
        CargarDatosUsuarioLogueado();
        
        LlenarTablaUsuarios(usuariosController.SelectUsuarios());
    }
    
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnEditarDatosPersonales = new javax.swing.JButton();
        btnNuevoDatosPersonales = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblUsuarios.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Documento", "Usuario", "Tipo Usuario", "Status", "Creado", "Modificado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblUsuarios.setName(""); // NOI18N
        jScrollPane2.setViewportView(tblUsuarios);
        tblUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUsuarios.getAccessibleContext().setAccessibleName("tblDatosPersonales");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Buscar:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel4.setText("Usuarios");

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtBuscar.setPreferredSize(new java.awt.Dimension(25, 30));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnEditarDatosPersonales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditarDatosPersonales.setText("Editar");
        btnEditarDatosPersonales.setPreferredSize(new java.awt.Dimension(89, 25));
        btnEditarDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDatosPersonalesActionPerformed(evt);
            }
        });

        btnNuevoDatosPersonales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevoDatosPersonales.setText("Nuevo");
        btnNuevoDatosPersonales.setPreferredSize(new java.awt.Dimension(89, 25));
        btnNuevoDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDatosPersonalesActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUsuario.setText("@User");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Usuario:");

        btnRefrescar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRefrescar.setText("Refrescar");
        btnRefrescar.setPreferredSize(new java.awt.Dimension(89, 25));
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        btnDetalles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDetalles.setText("Detalles");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(232, 232, 232)
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8)
                        .addComponent(lblUsuario)
                        .addGap(132, 132, 132)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUsuario)
                        .addComponent(jLabel7)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNuevoDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CargarDatosUsuarioLogueado(){
        for(UsuariosModel usuariosModel : usuarioLogueado){
            this.lblUsuario.setText(
                    usuariosModel.getPrimerNombre() + " " + 
                    usuariosModel.getPrimerApellido()
            );
        }
    }
    
    public void LlenarTablaUsuarios(List<UsuariosModel> listUsuariosModel){
        tblDatosPersonalesDtm.setNumRows(0);
        for(UsuariosModel usuariosModel : listUsuariosModel){
            tblDatosPersonalesDtm.addRow(
                new Object[]{
                    usuariosModel.getIdUsuario(),
                    usuariosModel.getPrimerNombre()+usuariosModel.getSegundoNombre(),
                    usuariosModel.getPrimerApellido()+ usuariosModel.getSegundoApellido(),
                    usuariosModel.getDocumento(),
                    usuariosModel.getUsuario(),
                    usuariosModel.getTipoUsuario(),
                    usuariosModel.getStatus(),
                    usuariosModel.getCreado(),
                    usuariosModel.getModificado()
                }
            );
        }
    }
    
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        LlenarTablaUsuarios(usuariosController.SelectUsuarioByName(this.txtBuscar.getText().replace(" ", "")));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEditarDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDatosPersonalesActionPerformed
            new EditarUsuarioView(tblUsuarios.getModel().getValueAt(tblUsuarios.getSelectedRow(),0).toString()).setVisible(true);
    }//GEN-LAST:event_btnEditarDatosPersonalesActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        JOptionPane.showMessageDialog(null,"Tablas Refrescadas");
        LlenarTablaUsuarios(usuariosController.SelectUsuarios());
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        new DetalleUsuarioView(tblUsuarios.getModel().getValueAt(tblUsuarios.getSelectedRow(),0).toString()).setVisible(true);
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void btnNuevoDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDatosPersonalesActionPerformed
        new NuevoUsuarioView().setVisible(true);
        usuariosController.j();

    }//GEN-LAST:event_btnNuevoDatosPersonalesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEditarDatosPersonales;
    private javax.swing.JButton btnNuevoDatosPersonales;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
