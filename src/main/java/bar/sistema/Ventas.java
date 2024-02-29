package bar.sistema;
import java.util.Calendar;
import javax.swing.JOptionPane;
import bar.database.InventarioDTO;
import bar.database.VentasDTO;
import java.util.GregorianCalendar;

public class Ventas extends javax.swing.JDialog {

    BaseDeDatos BD = new BaseDeDatos();
    Home H = new Home();
    Inventario V = new Inventario(H, true);
    String Itemx, dia, mes, annio, Fecha, Fecha2;
    int Cant, CubaLibre, Total;

    public Ventas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Calendario();
        this.setLocationRelativeTo(null);
        txt_Disponibilidad.setVisible(false);
        txt_Ganancias.setVisible(false);
        jLabel1.setVisible(false);
        jLabel5.setVisible(false);
        jLabel9.setVisible(false);
    }

    Bienvenido B = new Bienvenido();
    Calendar c = new GregorianCalendar();

    private void Calendario() {
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));
        Fecha = dia + "-" + mes + "-" + annio;
    }

    public void InformacionGeneral() {
        VentasDTO venta = Facade.consultarVentas();
        Total = venta.getTotal();
        CubaLibre = Integer.parseInt(venta.getCubaLibre());
        Fecha = venta.getFecha();
        txt_VendidosHoy.setText(Integer.toString(CubaLibre));
        txt_CTVendida.setText(Integer.toString(Total));
        Bebida.setText("Cuba Libre");

    }

    private void RegistrarVenta() {
        V.Refrescar();
        if (txt_Cantidad.getText().equals("") || txt_Cantidad.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Introduzca una Cantidad Valida");
        } else {
            if (V.RonDorado <= 0 || V.CocaCola <= 0 || V.Bitter <= 0 || V.Limas <= 0) {
                JOptionPane.showMessageDialog(null, "No hay ingredientes suficientes para realizar la venta");
            } else {
                Cant = 0;
                Cant = Integer.parseInt(txt_Cantidad.getText());
                switch (Itemx) {
                    case "Cuba Libre":
                        InventarioDTO inventario = new InventarioDTO();
                        inventario.setBitter(V.Bitter -= (Cant * 0.1));
                        inventario.setRonDorado(V.RonDorado -= (Cant * 0.05));
                        inventario.setCocaCola(V.CocaCola -= (Cant * 0.05));
                        inventario.setZumoDeLimon(V.Limas -= (Cant * 0.0001));
                        Facade.actualizarInventario(inventario);

                        VentasDTO venta = new VentasDTO();
                        venta.setCubaLibre(String.valueOf(CubaLibre += Cant));
                        venta.setFecha(Fecha);
                        venta.setTotal((int) (Total += (Cant)));

                        JOptionPane.showMessageDialog(null, Facade.insertarVenta(venta));
                        txt_Cantidad.setText("");
                        jLabel9.setText("Total: " + Total);
                        InformacionGeneral();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Seleccione una Opción");
                        break;
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Ventas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaUsuarios = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txt_Ganancias = new javax.swing.JTextField();
        txt_CTVendida = new javax.swing.JTextField();
        txt_VendidosHoy = new javax.swing.JTextField();
        txt_Disponibilidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Precio = new app.bolivia.swing.JCTextField();
        Bebida = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_Cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.9F);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
                panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        panelImage2Layout.setVerticalGroup(
                panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        jPanel4.setOpaque(false);
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

        Ventas.setOpaque(false);
        Ventas.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(120, 300));

        ListaUsuarios.setBackground(new java.awt.Color(38, 108, 38));
        ListaUsuarios.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        ListaUsuarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cuba Libre" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        ListaUsuarios.setVisibleRowCount(1);
        ListaUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaUsuariosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaUsuarios);

        Ventas.add(jScrollPane1, new java.awt.GridBagConstraints());

        jPanel1.setBackground(new java.awt.Color(59, 124, 59));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] { 0 };
        jPanel1Layout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
        jPanel1.setLayout(jPanel1Layout);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Informacion General");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel7, gridBagConstraints);

        jPanel6.setOpaque(false);
        java.awt.GridBagLayout jPanel6Layout = new java.awt.GridBagLayout();
        jPanel6Layout.columnWidths = new int[] { 0, 5, 0 };
        jPanel6Layout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
        jPanel6.setLayout(jPanel6Layout);

        txt_Ganancias.setEditable(false);
        txt_Ganancias.setColumns(7);
        txt_Ganancias.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        txt_Ganancias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Ganancias.setBorder(null);
        txt_Ganancias.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        jPanel6.add(txt_Ganancias, gridBagConstraints);

        txt_CTVendida.setEditable(false);
        txt_CTVendida.setColumns(7);
        txt_CTVendida.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        txt_CTVendida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CTVendida.setBorder(null);
        txt_CTVendida.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanel6.add(txt_CTVendida, gridBagConstraints);

        txt_VendidosHoy.setEditable(false);
        txt_VendidosHoy.setColumns(7);
        txt_VendidosHoy.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        txt_VendidosHoy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_VendidosHoy.setBorder(null);
        txt_VendidosHoy.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel6.add(txt_VendidosHoy, gridBagConstraints);

        txt_Disponibilidad.setEditable(false);
        txt_Disponibilidad.setColumns(7);
        txt_Disponibilidad.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        txt_Disponibilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Disponibilidad.setBorder(null);
        txt_Disponibilidad.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel6.add(txt_Disponibilidad, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jLabel1.setText("Disponibilidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jLabel2.setText("Vendidos Hoy:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jLabel4.setText("C.T Vendida:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jLabel5.setText("Ganancias:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel5, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jLabel3.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel3, gridBagConstraints);

        txt_Precio.setBorder(null);
        txt_Precio.setColumns(2);
        txt_Precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Precio.setText("1$");
        txt_Precio.setToolTipText("Introduzca El Precio Unitario En Dolares");
        txt_Precio.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        txt_Precio.setOpaque(false);
        txt_Precio.setPlaceholder("Introduzca el precio Unitario en $");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel6.add(txt_Precio, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jPanel6, gridBagConstraints);

        Bebida.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        Bebida.setText("Bebida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(Bebida, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        Ventas.add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(89, 160, 89));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
        jPanel2Layout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
        jPanel2.setLayout(jPanel2Layout);

        txt_Cantidad.setColumns(10);
        txt_Cantidad.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        txt_Cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel2.add(txt_Cantidad, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jLabel6.setText("Ordenar: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel6, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jButton1.setText("Registrar Venta");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanel2.add(jButton1, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("¿Desea Vender?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel2.add(jLabel9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        Ventas.add(jPanel2, gridBagConstraints);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
                panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(332, 332, 332))
                        .addGroup(panelImage1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 726,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 718,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        panelImage1Layout.setVerticalGroup(
                panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 349,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        getContentPane().add(panelImage1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_ListaUsuariosValueChanged
        Itemx = (String) ListaUsuarios.getSelectedValue().trim();
        InformacionGeneral();
    }// GEN-LAST:event_ListaUsuariosValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        RegistrarVenta();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }// GEN-LAST:event_jButton4ActionPerformed
     // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JLabel Bebida;
    private javax.swing.JList<String> ListaUsuarios;
    private javax.swing.JPanel Ventas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private javax.swing.JTextField txt_CTVendida;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Disponibilidad;
    private javax.swing.JTextField txt_Ganancias;
    private app.bolivia.swing.JCTextField txt_Precio;
    private javax.swing.JTextField txt_VendidosHoy;
    // End of variables declaration//GEN-END:variables
}
