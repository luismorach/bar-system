package bar.sistema;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import bar.database.UsuariosDTO;

public class Bienvenido extends javax.swing.JFrame {

    BaseDeDatos BD = new BaseDeDatos();
    private Timer Tiempo;
    int Cont, x, y;
    public final static int TWO_SECOND = 10;
    String Item = "";
    UsuariosDTO user = new UsuariosDTO();
    String nl = System.getProperty("line.separator");

    public Bienvenido() {
        initComponents();
        setLocationRelativeTo(null);
        BaseDeDatos.conectar();
        BD.Tablas();
        pbLogin.setVisible(false);

    }
    // @Override

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(
                "images/Icono.png"));
        return retValue;
    }

    private class timerlistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Cont++;
            pbLogin.setValue(Cont);
            if (Cont == 100) {
                Tiempo.stop();
                pbLogin.setVisible(false);
                Home V = new Home();
                V.setVisible(true);
                V.label_Bienvenido.setText(Item);
                V.label_User.setText(user.getUser());
                dispo();
                if (Item.equals("Empleado")) {
                    V.button_PanelDeControl.setVisible(false);
                }
            }
        }
    }

    private void dispo() {
        this.dispose();
    }

    private void IniciarSesion() {

        Item = (String) rolEmpresa.getSelectedItem();
        if (txtUser.getText().equals("") || String.valueOf(txtPassword.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar los espacios vacios.");
        } else {
            switch (Item) {
                case "Empleado":
                    Item = "Empleado";
                    validarUsuario();
                    break;

                case "Administrador":
                    Item = "Administrador";
                    validarUsuario();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione su Tipo de Usuario.");
                    break;
            }
        }
    }

    private void validarUsuario() {
        user = Facade.ConsultarUsuario(txtUser.getText(),
                String.valueOf(txtPassword.getPassword()), Item);

        if (txtUser.getText().equalsIgnoreCase(user.getUser()) &&
                String.valueOf(txtPassword.getPassword()).equals(user.getPassword())
                && Item.equals(user.getTipoDeUser()) && user.getAutorizacion().equals("Autorizado")) {
            pbLogin.setVisible(true);
            Cont = -1;
            pbLogin.setValue(100);
            pbLogin.setStringPainted(true);
            Tiempo = new Timer(TWO_SECOND, new timerlistener());
            Tiempo.start();
        } else {
            if (txtUser.getText().equalsIgnoreCase(user.getUser()) &&
                    String.valueOf(txtPassword.getPassword()).equals(user.getPassword())
                    && user.getTipoDeUser().equals(Item)
                    && user.getAutorizacion().equals("No Autorizado")) {
                JOptionPane.showMessageDialog(null, "Usuario No Autorizado");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario/Contraseña Invalida");
                txtPassword.setText("");
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        txtPassword = new jpass.JRPasswordField();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        txtUser = new app.bolivia.swing.JCTextField();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        buttonEntrar = new javax.swing.JButton();
        buttonRegistro = new javax.swing.JButton();
        rolEmpresa = new org.edisoncor.gui.comboBox.ComboBoxRound();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        pbLogin = new javax.swing.JProgressBar();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setOpacity(0.9F);
        setResizable(false);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        panelImage2.setLayout(new java.awt.BorderLayout());

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usuariox.png"))); // NOI18N
        panelImage5.setPreferredSize(new java.awt.Dimension(20, 20));

        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password1.png"))); // NOI18N
        panelImage6.setPreferredSize(new java.awt.Dimension(20, 20));
        panelImage5.add(panelImage6);

        txtPassword.setBorder(null);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        txtPassword.setOpaque(false);
        txtPassword.setPlaceholder("Contraseña");
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        panelImage5.add(txtPassword);

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usuariox.png"))); // NOI18N

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono1.png"))); // NOI18N
        panelImage4.setPreferredSize(new java.awt.Dimension(20, 20));
        panelImage3.add(panelImage4);

        txtUser.setBackground(new java.awt.Color(233, 213, 213));
        txtUser.setBorder(null);
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        txtUser.setOpaque(false);
        txtUser.setPlaceholder("Usuario");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        panelImage3.add(txtUser);

        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Entrar.png"))); // NOI18N

        buttonEntrar.setBackground(new java.awt.Color(0, 255, 51));
        buttonEntrar.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        buttonEntrar.setText("Entrar");
        buttonEntrar.setBorderPainted(false);
        buttonEntrar.setContentAreaFilled(false);
        buttonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEntrar.setPreferredSize(new java.awt.Dimension(150, 30));
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });
        panelImage7.add(buttonEntrar);

        buttonRegistro.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        buttonRegistro.setText("¿Aun No Posee Cuenta?");
        buttonRegistro.setBorder(null);
        buttonRegistro.setBorderPainted(false);
        buttonRegistro.setContentAreaFilled(false);
        buttonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistroActionPerformed(evt);
            }
        });

        rolEmpresa.setModel(
                new javax.swing.DefaultComboBoxModel<String>(
                        new String[] { "Tipo De Usuario", "Administrador", "Empleado" }));
        rolEmpresa.setAlignmentY(2.0F);
        rolEmpresa.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N

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

        jPanel1.setOpaque(false);

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
        jPanel1.add(jButton3);

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
        jPanel1.add(jButton4);

        jPanel4.add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel2.setOpaque(false);

        panelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono.png"))); // NOI18N

        javax.swing.GroupLayout panelImage8Layout = new javax.swing.GroupLayout(panelImage8);
        panelImage8.setLayout(panelImage8Layout);
        panelImage8Layout.setHorizontalGroup(
                panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        panelImage8Layout.setVerticalGroup(
                panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        jPanel2.add(panelImage8);

        jPanel4.add(jPanel2, java.awt.BorderLayout.WEST);

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        jLabel1.setText("@Guarapitas_falcón");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
                panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelImage1Layout.createSequentialGroup()
                                .addGroup(panelImage1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 554,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelImage1Layout.createSequentialGroup()
                                                .addGap(186, 186, 186)
                                                .addGroup(panelImage1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(panelImage5,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 235,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(panelImage3,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(rolEmpresa,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 235,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel1)
                                        .addGroup(panelImage1Layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addGroup(panelImage1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(pbLogin, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                360, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelImage1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout
                                                .createSequentialGroup()
                                                .addComponent(panelImage7, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(197, 197, 197))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                panelImage1Layout.createSequentialGroup()
                                                        .addComponent(buttonRegistro)
                                                        .addGap(155, 155, 155)))));
        panelImage1Layout.setVerticalGroup(
                panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 325,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rolEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelImage7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pbLogin, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        getContentPane().add(panelImage1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        setExtendedState(ICONIFIED);
    }// GEN-LAST:event_jButton3ActionPerformed

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonEntrarActionPerformed
        if (evt.getSource() == buttonEntrar) {
            IniciarSesion();
        }
    }// GEN-LAST:event_buttonEntrarActionPerformed

    private void buttonRegistroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonRegistroActionPerformed
        Registro Fr = new Registro(this, true);
        Fr.setVisible(true);
    }// GEN-LAST:event_buttonRegistroActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtUserKeyTyped
        char S = evt.getKeyChar();

        if (S == KeyEvent.VK_ENTER) {
            buttonEntrar.doClick();
        } else if (txtUser.getText().length() == 8) {
            evt.consume();
        } else if (Character.isLetter(S) || Character.isDigit(S)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }// GEN-LAST:event_txtUserKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtPasswordKeyTyped
        char S = evt.getKeyChar();
        if (S == KeyEvent.VK_ENTER) {
            buttonEntrar.doClick();
        } else if (txtUser.getText().length() == 16) {
            evt.consume();
        }
    }// GEN-LAST:event_txtPasswordKeyTyped

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }// GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }// GEN-LAST:event_jPanel4MouseDragged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Bienvenido().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntrar;
    private javax.swing.JButton buttonRegistro;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private javax.swing.JProgressBar pbLogin;
    private org.edisoncor.gui.comboBox.ComboBoxRound rolEmpresa;
    private jpass.JRPasswordField txtPassword;
    private app.bolivia.swing.JCTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
