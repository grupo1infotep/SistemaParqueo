package Views;
import Controllers.*;
import Models.*;
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
        tblDatosPersonalesDtm = (DefaultTableModel) this.tblDatosPersonales.getModel();
        tblTelefonosDtm = (DefaultTableModel) this.tblTelefonos.getModel();
        this.usuarioLogueado= usuarioLogueado;
        CargarDatosUsuarioLogueado();
        
        LlenarTablaUsuarios(usuariosController.SelectUsuarios());
        
        LlenarTablaTelefonos(telefonosController.SelectTelefonosById(new TelefonosModel(null,"")));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosPersonales = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirecciones = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTelefonos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGuardarDatosPersonales = new javax.swing.JButton();
        btnEditarDatosPersonales = new javax.swing.JButton();
        btnEliminarDatosPersonales = new javax.swing.JButton();
        btnNuevoDatosPersonales = new javax.swing.JButton();
        btnGuardarDirecciones = new javax.swing.JButton();
        btnEditarDirecciones = new javax.swing.JButton();
        btnEliminarDirecciones = new javax.swing.JButton();
        btnNuevoDirecciones = new javax.swing.JButton();
        btnGuardarTelefonos = new javax.swing.JButton();
        btnEditarTelefonos = new javax.swing.JButton();
        btnEliminarTelefonos = new javax.swing.JButton();
        btnNuevoTelefonos = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblDatosPersonales.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tblDatosPersonales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "1er Nombre", "2do Nombre", "1er Apellido", "2do Apellido", "Documento", "Usuario", "Contrasena", "Tipo Usuario", "Status", "Creado", "Modificado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDatosPersonales.setName(""); // NOI18N
        tblDatosPersonales.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tblDatosPersonalesCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tblDatosPersonales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDatosPersonalesKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatosPersonales);
        tblDatosPersonales.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDatosPersonales.getAccessibleContext().setAccessibleName("tblDatosPersonales");

        tblDirecciones.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tblDirecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Calle", "Numero", "Sector", "Ciudad", "Pais", "Creado", "Modificado"
            }
        ));
        jScrollPane1.setViewportView(tblDirecciones);

        tblTelefonos.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tblTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Numero", "Tipo", "Creado", "Modificado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblTelefonos);
        if (tblTelefonos.getColumnModel().getColumnCount() > 0) {
            tblTelefonos.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Telefonos");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Direcciones");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Buscar:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel4.setText("Usuarios");

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBuscar.setPreferredSize(new java.awt.Dimension(25, 30));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Datos Personales");

        btnGuardarDatosPersonales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarDatosPersonales.setText("Guardar");
        btnGuardarDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosPersonalesActionPerformed(evt);
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

        btnEliminarDatosPersonales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarDatosPersonales.setText("Eliminar");
        btnEliminarDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDatosPersonalesActionPerformed(evt);
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

        btnGuardarDirecciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarDirecciones.setText("Guardar");
        btnGuardarDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDireccionesActionPerformed(evt);
            }
        });

        btnEditarDirecciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditarDirecciones.setText("Editar");
        btnEditarDirecciones.setPreferredSize(new java.awt.Dimension(89, 25));
        btnEditarDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDireccionesActionPerformed(evt);
            }
        });

        btnEliminarDirecciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarDirecciones.setText("Eliminar");
        btnEliminarDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDireccionesActionPerformed(evt);
            }
        });

        btnNuevoDirecciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevoDirecciones.setText("Nuevo");
        btnNuevoDirecciones.setPreferredSize(new java.awt.Dimension(89, 25));
        btnNuevoDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDireccionesActionPerformed(evt);
            }
        });

        btnGuardarTelefonos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarTelefonos.setText("Guardar");
        btnGuardarTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTelefonosActionPerformed(evt);
            }
        });

        btnEditarTelefonos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditarTelefonos.setText("Editar");
        btnEditarTelefonos.setPreferredSize(new java.awt.Dimension(89, 25));
        btnEditarTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTelefonosActionPerformed(evt);
            }
        });

        btnEliminarTelefonos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarTelefonos.setText("Eliminar");
        btnEliminarTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTelefonosActionPerformed(evt);
            }
        });

        btnNuevoTelefonos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevoTelefonos.setText("Nuevo");
        btnNuevoTelefonos.setName(""); // NOI18N
        btnNuevoTelefonos.setPreferredSize(new java.awt.Dimension(89, 25));
        btnNuevoTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTelefonosActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(46, 46, 46)
                                .addComponent(btnNuevoTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarTelefonos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarTelefonos))
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(150, 150, 150)
                                .addComponent(btnNuevoDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarDirecciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarDirecciones))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(229, 229, 229)
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8)
                        .addComponent(lblUsuario)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevoDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardarDatosPersonales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarDatosPersonales))
                            .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnEliminarDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEliminarDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNuevoDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEditarDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGuardarDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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
                    usuariosModel.getPrimerNombre(),
                    usuariosModel.getSegundoNombre(),
                    usuariosModel.getPrimerApellido(),
                    usuariosModel.getSegundoApellido(),
                    usuariosModel.getDocumento(),
                    usuariosModel.getUsuario(),
                    usuariosModel.getContrasena(),
                    usuariosModel.getTipoUsuario(),
                    usuariosModel.getStatus(),
                    usuariosModel.getCreado(),
                    usuariosModel.getModificado()
                }
            );
        }
    }

    public void LlenarTablaTelefonos(List<TelefonosModel> telefonosList){
        tblTelefonosDtm.setNumRows(0);
        
        for(TelefonosModel telefonosModel : telefonosList){
            tblTelefonosDtm.addRow(
                new Object[]{
                    telefonosModel.getIdTelefono(),
                    telefonosModel.getNumeroTelefono(),
                    telefonosModel.getTipoTelefono(),
                    telefonosModel.getCreado(),
                    telefonosModel.getModificado(),
                }
            );
        }
    }
    
    private void btnGuardarDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosPersonalesActionPerformed
    }//GEN-LAST:event_btnGuardarDatosPersonalesActionPerformed

    private void btnEditarDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDatosPersonalesActionPerformed
        for(UsuariosModel usuariosModel : usuarioLogueado){
            if(usuariosModel.getTipoUsuario().equals("Administrador")){
                this.tblDatosPersonales.setDefaultEditor(Object.class, null);
            }
        }
        
        
    }//GEN-LAST:event_btnEditarDatosPersonalesActionPerformed

    private void btnEliminarDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDatosPersonalesActionPerformed
    }//GEN-LAST:event_btnEliminarDatosPersonalesActionPerformed

    private void btnNuevoDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDatosPersonalesActionPerformed
    }//GEN-LAST:event_btnNuevoDatosPersonalesActionPerformed

    private void btnGuardarDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDireccionesActionPerformed
    }//GEN-LAST:event_btnGuardarDireccionesActionPerformed

    private void btnEditarDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDireccionesActionPerformed
    }//GEN-LAST:event_btnEditarDireccionesActionPerformed

    private void btnEliminarDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDireccionesActionPerformed
    }//GEN-LAST:event_btnEliminarDireccionesActionPerformed

    private void btnNuevoDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDireccionesActionPerformed
    }//GEN-LAST:event_btnNuevoDireccionesActionPerformed

    private void btnGuardarTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTelefonosActionPerformed
    }//GEN-LAST:event_btnGuardarTelefonosActionPerformed

    private void btnEditarTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTelefonosActionPerformed
    }//GEN-LAST:event_btnEditarTelefonosActionPerformed

    private void btnEliminarTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTelefonosActionPerformed
    }//GEN-LAST:event_btnEliminarTelefonosActionPerformed

    private void btnNuevoTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTelefonosActionPerformed
    }//GEN-LAST:event_btnNuevoTelefonosActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        LlenarTablaUsuarios(usuariosController.SelectUsuarios());
        JOptionPane.showMessageDialog(null, "Datos Refrescados");
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        LlenarTablaUsuarios(usuariosController.SelectUsuarioByName(this.txtBuscar.getText().replace(" ", "")));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblDatosPersonalesCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tblDatosPersonalesCaretPositionChanged

        JOptionPane.showMessageDialog(null,"Se movio y ahora es" + tblDatosPersonalesDtm.getValueAt(0, 0));
        
        
    }//GEN-LAST:event_tblDatosPersonalesCaretPositionChanged

    private void tblDatosPersonalesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatosPersonalesKeyPressed
        //JOptionPane.showMessageDialog(tblDatosPersonales.);

    }//GEN-LAST:event_tblDatosPersonalesKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarDatosPersonales;
    private javax.swing.JButton btnEditarDirecciones;
    private javax.swing.JButton btnEditarTelefonos;
    private javax.swing.JButton btnEliminarDatosPersonales;
    private javax.swing.JButton btnEliminarDirecciones;
    private javax.swing.JButton btnEliminarTelefonos;
    private javax.swing.JButton btnGuardarDatosPersonales;
    private javax.swing.JButton btnGuardarDirecciones;
    private javax.swing.JButton btnGuardarTelefonos;
    private javax.swing.JButton btnNuevoDatosPersonales;
    private javax.swing.JButton btnNuevoDirecciones;
    private javax.swing.JButton btnNuevoTelefonos;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblDatosPersonales;
    private javax.swing.JTable tblDirecciones;
    private javax.swing.JTable tblTelefonos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
