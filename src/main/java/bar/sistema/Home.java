package bar.sistema;

import java.awt.MouseInfo;
import java.awt.Point;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    int x, y;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        button_PanelDeControl = new javax.swing.JButton();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        label_User = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        button_PanelDeControl1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        label_Bienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.9F);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        panelImage1.setLayout(new java.awt.GridBagLayout());

        button_PanelDeControl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        button_PanelDeControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Opciones.png"))); // NOI18N
        button_PanelDeControl.setText("Gestion De Usuarios");
        button_PanelDeControl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_PanelDeControl.setBorderPainted(false);
        button_PanelDeControl.setContentAreaFilled(false);
        button_PanelDeControl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_PanelDeControl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_PanelDeControl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_PanelDeControl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_PanelDeControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_PanelDeControlActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        panelImage1.add(button_PanelDeControl, gridBagConstraints);

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        panelImage3.setPreferredSize(new java.awt.Dimension(150, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelImage1.add(panelImage3, gridBagConstraints);

        label_User.setFont(new java.awt.Font("Brush Script MT", 1, 24)); // NOI18N
        label_User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_User.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panelImage1.add(label_User, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        jButton4.setText("Cerrar Sesión");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        panelImage1.add(jButton4, gridBagConstraints);

        button_PanelDeControl1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        button_PanelDeControl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ventas.png"))); // NOI18N
        button_PanelDeControl1.setText("Ventas");
        button_PanelDeControl1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_PanelDeControl1.setBorderPainted(false);
        button_PanelDeControl1.setContentAreaFilled(false);
        button_PanelDeControl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_PanelDeControl1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_PanelDeControl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_PanelDeControl1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_PanelDeControl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_PanelDeControl1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        panelImage1.add(button_PanelDeControl1, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Productos.png"))); // NOI18N
        jButton1.setText("Inventario");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        panelImage1.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grafica.png"))); // NOI18N
        jButton2.setText("Historial");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panelImage1.add(jButton2, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/creatividad.png"))); // NOI18N
        jButton3.setText("Modelo Matemático");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        panelImage1.add(jButton3, gridBagConstraints);

        label_Bienvenido.setFont(new java.awt.Font("Brush Script MT", 1, 30)); // NOI18N
        label_Bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Bienvenido.setText("Empleado");
        label_Bienvenido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                label_BienvenidoMouseDragged(evt);
            }
        });
        label_Bienvenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_BienvenidoMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        panelImage1.add(label_Bienvenido, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_PanelDeControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_PanelDeControlActionPerformed
        PanelDeControl PC = new PanelDeControl(this, true);
        PC.setVisible(true);
        PC.Usuarios();
    }//GEN-LAST:event_button_PanelDeControlActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Bienvenido B = new Bienvenido();
        B.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void button_PanelDeControl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_PanelDeControl1ActionPerformed
        Ventas V = new Ventas(this, true);
        V.InformacionGeneral();
        V.setVisible(true);
    }//GEN-LAST:event_button_PanelDeControl1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inventario I = new Inventario(this, true);
        I.Refrescar();
        I.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Historial H = new Historial(this, true);
        H.showHistorial();
        H.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Modelo M = new Modelo(this, true);
        M.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void label_BienvenidoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_BienvenidoMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_label_BienvenidoMouseDragged

    private void label_BienvenidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_BienvenidoMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_label_BienvenidoMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton button_PanelDeControl;
    public javax.swing.JButton button_PanelDeControl1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JLabel label_Bienvenido;
    public javax.swing.JLabel label_User;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    // End of variables declaration//GEN-END:variables
}
