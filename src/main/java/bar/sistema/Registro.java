package bar.sistema;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;

import bar.database.UsuariosDTO;

public class Registro extends javax.swing.JDialog {

    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    int x, y;
    String  Item = "", Autorizacion = "";

    Bienvenido B = new Bienvenido();

    public void registrar() {

        UsuariosDTO user = new UsuariosDTO();
        user.setNombre(txt_Nombre.getText());
        user.setApellido(txt_Apellido.getText());
        user.setCedula(txt_Cedula.getText());
        user.setUser(txt_User.getText());
        user.setPassword(String.valueOf(txt_Password.getPassword()));
        user.setTipoDeUser(Item);
        user.setAutorizacion(Autorizacion);

        JOptionPane.showMessageDialog(null, Facade.AñadirUsuarios(user));
        this.dispose();
       
    }

    public void validarRegistro() {
        if (txt_Nombre.getText().equals("") || txt_Apellido.getText().equals("") || txt_Cedula.getText().equals("")
                || txt_User.getText().equals("") || 
                String.valueOf(txt_Password.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Rellenar Todos Los Campos");
        } else {
            UsuariosDTO user = Facade.ConsultarUsuario(txt_Cedula.getText());

            if (txt_Cedula.getText().equals(user.getCedula())) {
                JOptionPane.showMessageDialog(null, "Este Usuario/Cedula Ya Existe");
            } else {
                switch (Item) {
                    case "Empleado":
                        Autorizacion = "No Autorizado";
                        registrar();
                        break;
                    case "Administrador":
                        Autorizacion = "Autorizado";
                        registrar();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Debe Seleccionar su Tipo De Usuario");
                        break;

                }
               
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel6 = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelImage9 = new org.edisoncor.gui.panel.PanelImage();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        txt_Nombre = new javax.swing.JTextField();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        txt_Apellido = new javax.swing.JTextField();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        txt_Cedula = new javax.swing.JTextField();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        txt_User = new javax.swing.JTextField();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        txt_Password = new javax.swing.JPasswordField();
        rolEmpresa = new org.edisoncor.gui.comboBox.ComboBoxRound();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        button_Registro = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setOpacity(0.9F);
        setResizable(false);
        setSize(new java.awt.Dimension(300, 300));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        panelImage2.setLayout(new java.awt.BorderLayout());

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

        jPanel5.setOpaque(false);

        jButton3.setBackground(new java.awt.Color(226, 228, 137));
        jButton3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton3.setText("_");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);

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
        jPanel5.add(jButton4);

        jPanel4.add(jPanel5, java.awt.BorderLayout.EAST);

        jPanel6.setOpaque(false);
        jPanel4.add(jPanel6, java.awt.BorderLayout.WEST);

        panelImage2.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel2.setOpaque(false);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(new java.awt.BorderLayout());

        panelImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Entrar.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(99, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelImage9.add(jButton1);

        jPanel2.add(panelImage9, java.awt.BorderLayout.WEST);

        panelImage2.add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel1.setOpaque(false);
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
        jPanel1Layout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0 };
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel1.setText("Nombre: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setText("Apellido: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel3.setText("Cedula: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel4.setText("Usuario: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel5.setText("Contraseña: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jLabel5, gridBagConstraints);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.png"))); // NOI18N
        panelImage1.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel1.add(panelImage1, gridBagConstraints);

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usuariox.png"))); // NOI18N
        panelImage5.setPreferredSize(new java.awt.Dimension(20, 30));

        txt_Nombre.setColumns(11);
        txt_Nombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setText("Alefrank");
        txt_Nombre.setBorder(null);
        txt_Nombre.setOpaque(false);
        txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreKeyTyped(evt);
            }
        });
        panelImage5.add(txt_Nombre);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(panelImage5, gridBagConstraints);

        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usuariox.png"))); // NOI18N
        panelImage6.setPreferredSize(new java.awt.Dimension(20, 30));

        txt_Apellido.setColumns(11);
        txt_Apellido.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txt_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Apellido.setText("Martinez");
        txt_Apellido.setBorder(null);
        txt_Apellido.setOpaque(false);
        txt_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApellidoKeyTyped(evt);
            }
        });
        panelImage6.add(txt_Apellido);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(panelImage6, gridBagConstraints);

        panelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usuariox.png"))); // NOI18N
        panelImage8.setPreferredSize(new java.awt.Dimension(20, 30));

        txt_Cedula.setColumns(11);
        txt_Cedula.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txt_Cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cedula.setText("26677798");
        txt_Cedula.setBorder(null);
        txt_Cedula.setOpaque(false);
        txt_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CedulaKeyTyped(evt);
            }
        });
        panelImage8.add(txt_Cedula);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(panelImage8, gridBagConstraints);

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usuariox.png"))); // NOI18N
        panelImage3.setPreferredSize(new java.awt.Dimension(20, 30));

        txt_User.setColumns(11);
        txt_User.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txt_User.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_User.setText("Diwaii");
        txt_User.setBorder(null);
        txt_User.setOpaque(false);
        txt_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_UserKeyTyped(evt);
            }
        });
        panelImage3.add(txt_User);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(panelImage3, gridBagConstraints);

        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usuariox.png"))); // NOI18N
        panelImage7.setPreferredSize(new java.awt.Dimension(20, 30));

        txt_Password.setColumns(11);
        txt_Password.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txt_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Password.setBorder(null);
        txt_Password.setOpaque(false);
        txt_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PasswordKeyTyped(evt);
            }
        });
        panelImage7.add(txt_Password);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(panelImage7, gridBagConstraints);

        rolEmpresa.setModel(
                new javax.swing.DefaultComboBoxModel<String>(new String[] { "Tipo De Usuario", "Empleado", "Administrador" }));
        rolEmpresa.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        rolEmpresa.setPreferredSize(new java.awt.Dimension(69, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(rolEmpresa, gridBagConstraints);

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Entrar.png"))); // NOI18N
        panelImage4.setPreferredSize(new java.awt.Dimension(130, 40));

        button_Registro.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        button_Registro.setText("Registrarse");
        button_Registro.setBorder(null);
        button_Registro.setContentAreaFilled(false);
        button_Registro.setPreferredSize(new java.awt.Dimension(120, 32));
        button_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RegistroActionPerformed(evt);
            }
        });
        panelImage4.add(button_Registro);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        jPanel1.add(panelImage4, gridBagConstraints);

        panelImage2.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelImage2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_RegistroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_button_RegistroActionPerformed
        if (evt.getSource() == button_Registro) {
            Item = (String) rolEmpresa.getSelectedItem();
           validarRegistro();
        }
    }// GEN-LAST:event_button_RegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txt_NombreKeyTyped
        if (txt_Nombre.getText().length() == 10) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }// GEN-LAST:event_txt_NombreKeyTyped

    private void txt_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txt_ApellidoKeyTyped
        if (txt_Apellido.getText().length() == 10) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }// GEN-LAST:event_txt_ApellidoKeyTyped

    private void txt_CedulaKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txt_CedulaKeyTyped
        if (txt_Cedula.getText().length() == 8) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }// GEN-LAST:event_txt_CedulaKeyTyped

    private void txt_UserKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txt_UserKeyTyped
        if (txt_User.getText().length() == 10) {
            evt.consume();
        }

        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isDigit(c)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }// GEN-LAST:event_txt_UserKeyTyped

    private void txt_PasswordKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txt_PasswordKeyTyped
        if (String.valueOf(txt_Password.getPassword()).length() == 16) {
            evt.consume();
        }
    }// GEN-LAST:event_txt_PasswordKeyTyped

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jPanel2KeyPressed

    }// GEN-LAST:event_jPanel2KeyPressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MouseDragged

        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }// GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }// GEN-LAST:event_jPanel2MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }// GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }// GEN-LAST:event_jPanel4MousePressed
     // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton button_Registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private org.edisoncor.gui.panel.PanelImage panelImage9;
    private org.edisoncor.gui.comboBox.ComboBoxRound rolEmpresa;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
