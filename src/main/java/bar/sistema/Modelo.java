package bar.sistema;

import java.awt.MouseInfo;
import java.awt.Point;

public class Modelo extends javax.swing.JDialog {

    public Modelo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        ModeloMatematico();
    }
    Home H = new Home();
    Inventario j = new Inventario(H, true);
    Ventas V = new Ventas(H, true);
    String nl = System.getProperty("line.separator");
    int x, y;

    private void ModeloMatematico() {
        j.Refrescar();
        V.InformacionGeneral();
        String RonD = "Ron Dorado", Zumox = "Zumo De Limon", Bitterx = "Bitter", CocaColax = "CocaCola";
        float Tau1 = 0, Tau2 = 0, Tau3 = 0, K = 0, lambda = 0, C = 0, I = 0, Aux1, Q = 0, N = 0,
                TiempoDeCicloExpresadoEnAños = 0, TiempoDeCicloExpresadoEnSemandas = 0, Residuo = 0,
                PuntoDeReorden = 0, CostoA = 0;
        if (j.RonDorado != 0) {
            float DemandaSemanal = (V.Total * (float) 0.05 * 7);
            float DemandaMensual = DemandaSemanal * 4;
            float DemandaAnual = DemandaMensual * 12;
            float CostoSemanal = (V.Total * 6 * (float) 0.05 * 7);
            float CostoMensual = (CostoSemanal * 7);
            float CostoAnualRonDorado = CostoMensual * 12;
            Tau1 = 52;
            Tau2 = 1;
            Tau3 = Tau2 / Tau1;
            lambda = DemandaAnual;
            C = 6;
            I = (float) 0.1;
            K = 2;
            Aux1 = (2 * K * lambda) / (I * C);
            Q = (float) Math.sqrt(Aux1);
            N = lambda / Q;
            CostoA = C * (Q / 2);
            TiempoDeCicloExpresadoEnAños = 1 / N;
            TiempoDeCicloExpresadoEnSemandas = TiempoDeCicloExpresadoEnAños * 52;
            Residuo = Tau3 % TiempoDeCicloExpresadoEnAños;
            PuntoDeReorden = lambda * Residuo;
            jTextArea3.append(
                    nl + nl + "--" + RonD + "--"
                    + nl + "Demanda Semanal: " + DemandaSemanal + " Lts."
                    + nl + "Demanda Mensual: " + DemandaMensual + " Lts."
                    + nl + "Demanda Anual: " + DemandaAnual + " Lts."
                    + nl + "Costo Semanal: " + CostoSemanal + " $."
                    + nl + "Costo Mensual: " + CostoMensual + " $."
                    + nl + "Costo Anual: " + CostoAnualRonDorado + " $."
                    + nl + "\nTamaño Optimo de Pedido: " + Q
                    + nl + "Numero de Pedidos Al Año: " + N
                    // + nl + "Numero de Pedidos Al Año Expresado en Semanas: " + (N*12)
                    + nl + "CostoAnual: " + CostoA + " $."
                    + nl + "\nTiempo entre pedidos "
                    + nl + "Cada: " + TiempoDeCicloExpresadoEnAños + " Años"
                    + nl + "Cada: " + TiempoDeCicloExpresadoEnSemandas + " Semanas"
                    + nl + "Punto de Reorden: " + PuntoDeReorden);
        }
        if (j.CocaCola != 0) {
            float DemandaSemanal = (V.Total * (float) 0.1 * 7);
            float DemandaMensual = DemandaSemanal * 4;
            float DemandaAnual = DemandaMensual * 12;
            float CostoSemanal = (V.Total * 3 * (float) 0.1 * 7);
            float CostoMensual = (CostoSemanal * 7);
            float CostoAnualRonDorado = CostoMensual * 12;
            Tau1 = 52;
            Tau2 = 1;
            Tau3 = Tau2 / Tau1;
            lambda = DemandaAnual;
            C = 3;
            I = (float) 0.1;
            K = 2;
            Aux1 = (2 * K * lambda) / (I * C);
            Q = (float) Math.sqrt(Aux1);
            N = lambda / Q;
            CostoA = C * (Q / 2);
            TiempoDeCicloExpresadoEnAños = 1 / N;
            TiempoDeCicloExpresadoEnSemandas = TiempoDeCicloExpresadoEnAños * 52;
            Residuo = Tau3 % TiempoDeCicloExpresadoEnAños;
            PuntoDeReorden = lambda * Residuo;
            jTextArea3.append(
                    nl + nl + "--" + CocaColax + "--"
                    + nl + "Demanda Semanal: " + DemandaSemanal + " Lts."
                    + nl + "Demanda Mensual: " + DemandaMensual + " Lts."
                    + nl + "Demanda Anual: " + DemandaAnual + " Lts."
                    + nl + "Costo Semanal: " + CostoSemanal + " $."
                    + nl + "Costo Mensual: " + CostoMensual + " $."
                    + nl + "Costo Anual: " + CostoAnualRonDorado + " $."
                    + nl + "\nTamaño Optimo de Pedido: " + Q
                    + nl + "Numero de Pedidos Al Año: " + N
                    // + nl + "Numero de Pedidos Al Año Expresado en Semanas: " + (N*12)
                    + nl + "CostoAnual: " + CostoA + " $."
                    + nl + "\nTiempo entre pedidos "
                    + nl + "Cada: " + TiempoDeCicloExpresadoEnAños + " Años"
                    + nl + "Cada: " + TiempoDeCicloExpresadoEnSemandas + " Semanas"
                    + nl + "Punto de Reorden: " + PuntoDeReorden);
        }
        if (j.Limas != 0) {
            float DemandaSemanal = (V.Total * (float) 0.05 * 7);
            float DemandaMensual = DemandaSemanal * 4;
            float DemandaAnual = DemandaMensual * 12;
            float CostoSemanal = (V.Total * 4 * (float) 0.05 * 7);
            float CostoMensual = (CostoSemanal * 7);
            float CostoAnualRonDorado = CostoMensual * 12;
            Tau1 = 52;
            Tau2 = 1;
            Tau3 = Tau2 / Tau1;
            lambda = DemandaAnual;
            C = 4;
            I = (float) 0.25;
            K = 2;
            Aux1 = (2 * K * lambda) / (I * C);
            Q = (float) Math.sqrt(Aux1);
            N = lambda / Q;
            CostoA = C * (Q / 2);
            TiempoDeCicloExpresadoEnAños = 1 / N;
            TiempoDeCicloExpresadoEnSemandas = TiempoDeCicloExpresadoEnAños * 52;
            Residuo = Tau3 % TiempoDeCicloExpresadoEnAños;
            PuntoDeReorden = lambda * Residuo;
            jTextArea3.append(
                    nl + nl + "--" + Zumox + "--"
                    + nl + "Demanda Semanal: " + DemandaSemanal + " Lts."
                    + nl + "Demanda Mensual: " + DemandaMensual + " Lts."
                    + nl + "Demanda Anual: " + DemandaAnual + " Lts."
                    + nl + "Costo Semanal: " + CostoSemanal + " $."
                    + nl + "Costo Mensual: " + CostoMensual + " $."
                    + nl + "Costo Anual: " + CostoAnualRonDorado + " $."
                    + nl + "\nTamaño Optimo de Pedido: " + Q
                    + nl + "Numero de Pedidos Al Año: " + N
                    // + nl + "Numero de Pedidos Al Año Expresado en Semanas: " + (N*12)
                    + nl + "CostoAnual: " + CostoA + " $."
                    + nl + "\nTiempo entre pedidos "
                    + nl + "Cada: " + TiempoDeCicloExpresadoEnAños + " Años"
                    + nl + "Cada: " + TiempoDeCicloExpresadoEnSemandas + " Semanas"
                    + nl + "Punto de Reorden: " + PuntoDeReorden);
        }
        if (j.Bitter != 0) {
            float DemandaSemanal = (V.Total * (float) 0.001 * 7);
            float DemandaMensual = DemandaSemanal * 4;
            float DemandaAnual = DemandaMensual * 12;
            float CostoSemanal = (V.Total * 15 * (float) 0.001 * 7);
            float CostoMensual = (CostoSemanal * 7);
            float CostoAnualRonDorado = CostoMensual * 12;
            Tau1 = 52;
            Tau2 = 1;
            Tau3 = Tau2 / Tau1;
            lambda = DemandaAnual;
            C = 15;
            I = (float) 0.01;
            K = 2;
            Aux1 = (2 * K * lambda) / (I * C);
            Q = (float) Math.sqrt(Aux1);
            N = lambda / Q;
            CostoA = C * (Q / 2);
            TiempoDeCicloExpresadoEnAños = 1 / N;
            TiempoDeCicloExpresadoEnSemandas = TiempoDeCicloExpresadoEnAños * 52;
            Residuo = Tau3 % TiempoDeCicloExpresadoEnAños;
            PuntoDeReorden = lambda * Residuo;
            jTextArea3.append(
                    nl + nl + "--" + Bitterx + "--"
                    + nl + "Demanda Semanal: " + DemandaSemanal + " Lts."
                    + nl + "Demanda Mensual: " + DemandaMensual + " Lts."
                    + nl + "Demanda Anual: " + DemandaAnual + " Lts."
                    + nl + "Costo Semanal: " + CostoSemanal + " $."
                    + nl + "Costo Mensual: " + CostoMensual + " $."
                    + nl + "Costo Anual: " + CostoAnualRonDorado + " $."
                    + nl + "\nTamaño Optimo de Pedido: " + Q
                    + nl + "Numero de Pedidos Al Año: " + N
                    // + nl + "Numero de Pedidos Al Año Expresado en Semanas: " + (N*12)
                    + nl + "CostoAnual: " + CostoA + " $."
                    + nl + "\nTiempo entre pedidos "
                    + nl + "Cada: " + TiempoDeCicloExpresadoEnAños + " Años"
                    + nl + "Cada: " + TiempoDeCicloExpresadoEnSemandas + " Semanas"
                    + nl + "Punto de Reorden: " + PuntoDeReorden);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N

        jScrollPane3.setBackground(new java.awt.Color(0, 204, 0));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setOpaque(false);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(500, 400));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(58, 164, 58));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea3.setOpaque(false);
        jScrollPane3.setViewportView(jTextArea3);

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

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
