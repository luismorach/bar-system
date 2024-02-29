package bar.sistema;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
//import AppPackage.AnimationClass;
import Animacion.Animacion;
import bar.database.UsuariosDTO;

public class PanelDeControl extends javax.swing.JDialog {

    String Itemx;
    int x, y;
    int y1;
    BaseDeDatos BD = new BaseDeDatos();

    public PanelDeControl(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Usuarios();
    }

    public void Usuarios() {
        DefaultListModel<UsuariosDTO> modelo = new DefaultListModel<UsuariosDTO>();
        ArrayList<UsuariosDTO> users = Facade.ConsultarUsuarios();
        modelo.removeAllElements();
        for (UsuariosDTO dto : users) {
            modelo.addElement(dto);
        }
        ListaUsuarios.setModel(modelo);
    }

    private void Refrescar() {
        UsuariosDTO user = Facade.ConsultarUsuario(ListaUsuarios.getSelectedValue().getCedula());

        txt_Nombre.setText(user.getNombre());
        txt_Apellido.setText(user.getApellido());
        txt_Cedula.setText(user.getCedula());
        txt_User.setText(user.getUser());
        txt_Password.setText(user.getPassword());
        txt_TipoDeUser.setText(user.getTipoDeUser());
        txt_Autorizacion.setText(user.getAutorizacion());
        if (txt_Autorizacion.getText().equals("No Autorizado")) {
            txt_Autorizacion.setBackground(Color.red);
            jCheckBox2.setSelected(true);
            jCheckBox1.setSelected(false);

        } else {
            txt_Autorizacion.setBackground(Color.GREEN);
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(false);
        }
        if (txt_TipoDeUser.getText().equals("Administrador")) {
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
        } else {
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
        }

    }

    private void EliminarUsuario() {
        String eliminado = Facade.EliminarUsuario(
                ListaUsuarios.getSelectedValue().getCedula());
        ListaUsuarios.setSelectedIndex(ListaUsuarios.getSelectedIndex() - 1);
        Usuarios();
        JOptionPane.showMessageDialog(null, eliminado);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Fondo = new org.edisoncor.gui.panel.PanelImage();
        jLabel3 = new javax.swing.JLabel();
        PanelDeControl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaUsuarios = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        jPanel2 = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Cedula = new javax.swing.JTextField();
        txt_User = new javax.swing.JTextField();
        txt_Password = new javax.swing.JTextField();
        txt_TipoDeUser = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txt_Autorizacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(1F);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 26)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lista de Usuarios en el Sistema");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 43, -1, -1));

        PanelDeControl.setBackground(new java.awt.Color(234, 163, 163));
        PanelDeControl.setOpaque(false);
        PanelDeControl.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 300));

        ListaUsuarios.setBackground(new java.awt.Color(38, 108, 38));
        ListaUsuarios.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        ListaUsuarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }

            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListaUsuariosAncestorAdded(evt);
            }

            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ListaUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaUsuariosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaUsuarios);

        PanelDeControl.add(jScrollPane1, java.awt.BorderLayout.WEST);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.png"))); // NOI18N
        panelImage5.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout panelImage5Layout = new javax.swing.GroupLayout(panelImage5);
        panelImage5.setLayout(panelImage5Layout);
        panelImage5Layout.setHorizontalGroup(
                panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        panelImage5Layout.setVerticalGroup(
                panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel1.add(panelImage5, gridBagConstraints);

        jPanel2.setOpaque(false);
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] { 0, 5, 0 };
        jPanel2Layout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0 };
        jPanel2.setLayout(jPanel2Layout);

        txt_Nombre.setColumns(5);
        txt_Nombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(null);
        txt_Nombre.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txt_Nombre, gridBagConstraints);

        txt_Apellido.setColumns(5);
        txt_Apellido.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        txt_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Apellido.setBorder(null);
        txt_Apellido.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txt_Apellido, gridBagConstraints);

        txt_Cedula.setColumns(5);
        txt_Cedula.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        txt_Cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cedula.setBorder(null);
        txt_Cedula.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txt_Cedula, gridBagConstraints);

        txt_User.setColumns(5);
        txt_User.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        txt_User.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_User.setBorder(null);
        txt_User.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txt_User, gridBagConstraints);

        txt_Password.setColumns(5);
        txt_Password.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        txt_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Password.setBorder(null);
        txt_Password.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txt_Password, gridBagConstraints);

        txt_TipoDeUser.setEditable(false);
        txt_TipoDeUser.setColumns(5);
        txt_TipoDeUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        txt_TipoDeUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TipoDeUser.setBorder(null);
        txt_TipoDeUser.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txt_TipoDeUser, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tipo De Usuario: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Usuario: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Cedula: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel15, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Apellido: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel14, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Nombre: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel13, gridBagConstraints);

        jCheckBox1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jCheckBox1.setText("Autorizado");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jCheckBox1, gridBagConstraints);

        jCheckBox2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jCheckBox2.setText("No Autorizado");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jCheckBox2, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Autorizacion: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel8, gridBagConstraints);

        txt_Autorizacion.setEditable(false);
        txt_Autorizacion.setColumns(5);
        txt_Autorizacion.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        txt_Autorizacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Autorizacion.setBorder(null);
        txt_Autorizacion.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txt_Autorizacion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jPanel2, gridBagConstraints);

        PanelDeControl.add(jPanel1, java.awt.BorderLayout.CENTER);

        Fondo.add(PanelDeControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 87, 608, 392));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton1.setText("Eliminar Usuario");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 485, 165, -1));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton2.setText("Actualizar Datos");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 485, 165, -1));

        jPanel4.setOpaque(false);
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel3.setOpaque(false);

        jButton4.setBackground(new java.awt.Color(226, 228, 137));
        jButton4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton4.setText("X");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jPanel4.add(jPanel3, java.awt.BorderLayout.EAST);

        jPanel5.setOpaque(false);
        jPanel4.add(jPanel5, java.awt.BorderLayout.WEST);

        Fondo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 672, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaUsuariosAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_ListaUsuariosAncestorAdded

    }// GEN-LAST:event_ListaUsuariosAncestorAdded

    private void ListaUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_ListaUsuariosValueChanged
        try {
            Itemx = (String) ListaUsuarios.getSelectedValue().getUser();
            Refrescar();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }// GEN-LAST:event_ListaUsuariosValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        EliminarUsuario();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        UsuariosDTO user = new UsuariosDTO();
        user.setNombre(txt_Nombre.getText());
        user.setApellido(txt_Apellido.getText());
        user.setCedula(txt_Cedula.getText());
        user.setAutorizacion(txt_Autorizacion.getText());
        user.setPassword(txt_Password.getText());
        user.setUser(txt_User.getText());
        JOptionPane.showMessageDialog(null, Facade.ActualizarUsuarios(
                ListaUsuarios.getSelectedValue().getCedula(), user));

    }// GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jCheckBox2StateChanged
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            txt_Autorizacion.setText("No Autorizado");
            txt_Autorizacion.setBackground(Color.red);
        }
    }// GEN-LAST:event_jCheckBox2StateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jCheckBox1StateChanged
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            txt_Autorizacion.setText("Autorizado");
            txt_Autorizacion.setBackground(Color.GREEN);
        }
    }// GEN-LAST:event_jCheckBox1StateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }// GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }// GEN-LAST:event_jPanel4MousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel3MouseClicked
        // Animation cuadro = new AnimationClass();
        Animacion.bajar(y1, 580, 40, 10, jLabel3);
        Animacion.subir(580, y1, 40, 10, jLabel3);
        // cuadro.jLabelYDown(y1, 580, 40, 10, jLabel3);
        // cuadro.jLabelYUp(580, y1, 40, 10, jLabel3);

    }// GEN-LAST:event_jLabel3MouseClicked
     // Variables declaration - do not modify//GEN-BEGIN:variables

    private org.edisoncor.gui.panel.PanelImage Fondo;
    private javax.swing.JList<UsuariosDTO> ListaUsuarios;
    private javax.swing.JPanel PanelDeControl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Autorizacion;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_TipoDeUser;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
