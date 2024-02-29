package bar.sistema;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

import bar.database.InventarioDTO;

public class Inventario extends javax.swing.JDialog {

    public Inventario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    BaseDeDatos BD = new BaseDeDatos();

    public float RonDorado, Bitter, CocaCola, Limas, Cant;
    String Item;
    int x, y;

    private void AñadirYRetirar() {
        if (txt_Cantidad.getText().equals("") || txt_Cantidad.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Introduzca una Cantidad");
        } else {
            switch (Item) {
                case "Ron Dorado":
                    label_RonDorado.setText(
                            "Ron Dorado: " + (RonDorado += Cant) + " Lts." + "(" + (RonDorado * 1000) + " ml" + ")");
                    break;
                case "Bitter":
                    label_Amargo.setText("Bitter: " + (Bitter += Cant) + " Lts." + "(" + (Bitter * 1000) + " ml" + ")");
                    break;
                case "Zumo De Limon":
                    label_Limas
                            .setText("Zumo De Limon " + (Limas += Cant) + " Lts." + "(" + (Limas * 1000) + " ml" + ")");
                    break;
                case "CocaCola":
                    label_CocaCola.setText(
                            "CocaCola: " + (CocaCola += Cant) + " Lts." + "(" + (CocaCola * 1000) + " ml" + ")");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una Opción");
                    break;
            }
            InventarioDTO inventario = new InventarioDTO();
            inventario.setID(1);
            inventario.setRonDorado(RonDorado);
            inventario.setBitter(Bitter);
            inventario.setCocaCola(CocaCola);
            inventario.setZumoDeLimon(Limas);
            Facade.agregarInventario(inventario);
            if (Cant < 0) {
                JOptionPane.showMessageDialog(null, "Se Retiró con Éxito del Inventario");
            } else {
                JOptionPane.showMessageDialog(null, "Se Añadió con Éxito al Inventario");
            }
            Cant = 0;

        }
    }

    public void Refrescar() {
        InventarioDTO inventario = Facade.consultarInventario();
        RonDorado = inventario.getRonDorado();
        Bitter = inventario.getBitter();
        Limas = inventario.getZumoDeLimon();
        CocaCola = inventario.getCocaCola();

        label_RonDorado.setText("Ron Dorado: " + RonDorado + " Lts." + "(" + (RonDorado * 1000) + " ml" + ")");
        label_Amargo.setText("Bitter: " + Bitter + " Lts." + "(" + (Bitter * 1000) + " ml" + ")");
        label_Limas.setText("Zumo De Limon: " + Limas + " Lts." + "(" + (Limas * 1000) + " ml" + ")");
        label_CocaCola.setText("CocaCola: " + CocaCola + " Lts." + "(" + (CocaCola * 1000) + " ml" + ")");

    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        Productos = new javax.swing.JPanel();
        label_RonDorado = new javax.swing.JLabel();
        label_Amargo = new javax.swing.JLabel();
        label_Limas = new javax.swing.JLabel();
        label_Frutas = new javax.swing.JLabel();
        label_Licores = new javax.swing.JLabel();
        label_Refrescos = new javax.swing.JLabel();
        label_CocaCola = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txt_Cantidad = new javax.swing.JTextField();
        comboBox_Licores = new javax.swing.JComboBox<>();
        button_Ingresar = new javax.swing.JButton();
        button_Retirar = new javax.swing.JButton();
        button_EliminarInventario = new javax.swing.JButton();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.9F);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N

        Productos.setBackground(new java.awt.Color(234, 163, 163));
        Productos.setOpaque(false);
        java.awt.GridBagLayout ProductosLayout = new java.awt.GridBagLayout();
        ProductosLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
        ProductosLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0 };
        Productos.setLayout(ProductosLayout);

        label_RonDorado.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        label_RonDorado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_RonDorado.setText("Ron Dorado: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        Productos.add(label_RonDorado, gridBagConstraints);

        label_Amargo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        label_Amargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Amargo.setText("Bitter:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        Productos.add(label_Amargo, gridBagConstraints);

        label_Limas.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        label_Limas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Limas.setText("Zumo De Limón:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        Productos.add(label_Limas, gridBagConstraints);

        label_Frutas.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        label_Frutas.setText("Frutas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        Productos.add(label_Frutas, gridBagConstraints);

        label_Licores.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        label_Licores.setText("Licores ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        Productos.add(label_Licores, gridBagConstraints);

        label_Refrescos.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        label_Refrescos.setText("Refrescos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        Productos.add(label_Refrescos, gridBagConstraints);

        label_CocaCola.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        label_CocaCola.setText("Coca-Cola:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        Productos.add(label_CocaCola, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel3.setText("Complementos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        Productos.add(jLabel3, gridBagConstraints);

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

        txt_Cantidad.setColumns(5);
        txt_Cantidad.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        txt_Cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidadKeyTyped(evt);
            }
        });

        comboBox_Licores.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        comboBox_Licores.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Seleccione", "Ron Dorado", "Bitter", "CocaCola", "Zumo De Limon" }));
        comboBox_Licores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBox_Licores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_LicoresActionPerformed(evt);
            }
        });

        button_Ingresar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        button_Ingresar.setText("Hacer Pedido");
        button_Ingresar.setOpaque(false);
        button_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_IngresarActionPerformed(evt);
            }
        });

        button_Retirar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        button_Retirar.setText("Retirar");
        button_Retirar.setOpaque(false);
        button_Retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RetirarActionPerformed(evt);
            }
        });

        button_EliminarInventario.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        button_EliminarInventario.setText("Eliminar Inventario");
        button_EliminarInventario.setOpaque(false);
        button_EliminarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EliminarInventarioActionPerformed(evt);
            }
        });

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
                panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        panelImage2Layout.setVerticalGroup(
                panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
                panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelImage1Layout.createSequentialGroup()
                                .addGroup(panelImage1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelImage1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(panelImage1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(panelImage1Layout.createSequentialGroup()
                                                                .addComponent(comboBox_Licores,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txt_Cantidad,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(button_Ingresar)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(button_Retirar)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button_EliminarInventario))
                                        .addGroup(panelImage1Layout.createSequentialGroup()
                                                .addGap(250, 250, 250)
                                                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 579,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        panelImage1Layout.setVerticalGroup(
                panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 275,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelImage1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button_EliminarInventario)
                                        .addComponent(button_Retirar)
                                        .addComponent(button_Ingresar)
                                        .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox_Licores, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(16, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_CantidadKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txt_CantidadKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            button_Ingresar.doClick();
        }
        if (txt_Cantidad.getText().length() == 5 || txt_Cantidad.getText().equals("-")) {
            evt.consume();
        }

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }// GEN-LAST:event_txt_CantidadKeyTyped

    private void button_IngresarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_button_IngresarActionPerformed
        if (evt.getSource() == button_Ingresar) {
            Item = (String) comboBox_Licores.getSelectedItem();
            Cant = Float.parseFloat(txt_Cantidad.getText());
            AñadirYRetirar();
            Refrescar();
        }
    }// GEN-LAST:event_button_IngresarActionPerformed

    private void button_RetirarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_button_RetirarActionPerformed
        if (evt.getSource() == button_Retirar) {
            Item = (String) comboBox_Licores.getSelectedItem();
            Cant = Float.parseFloat(txt_Cantidad.getText());
            Cant *= -1;
            AñadirYRetirar();
        }
    }// GEN-LAST:event_button_RetirarActionPerformed

    private void button_EliminarInventarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_button_EliminarInventarioActionPerformed
        Cant = 0;
        InventarioDTO inventario=new InventarioDTO();
        inventario.setBitter(0);
        inventario.setRonDorado( 0);
        inventario.setCocaCola(0);
        inventario.setZumoDeLimon(0);
        JOptionPane.showMessageDialog(null,Facade.actualizarInventario(inventario));
        Refrescar();
    }// GEN-LAST:event_button_EliminarInventarioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }// GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }// GEN-LAST:event_jPanel4MouseDragged

    private void comboBox_LicoresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_comboBox_LicoresActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_comboBox_LicoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Productos;
    private javax.swing.JButton button_EliminarInventario;
    private javax.swing.JButton button_Ingresar;
    private javax.swing.JButton button_Retirar;
    private javax.swing.JComboBox<String> comboBox_Licores;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label_Amargo;
    private javax.swing.JLabel label_CocaCola;
    private javax.swing.JLabel label_Frutas;
    private javax.swing.JLabel label_Licores;
    private javax.swing.JLabel label_Limas;
    private javax.swing.JLabel label_Refrescos;
    private javax.swing.JLabel label_RonDorado;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private javax.swing.JTextField txt_Cantidad;
    // End of variables declaration//GEN-END:variables
}
