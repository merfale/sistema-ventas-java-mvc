package gui;

import dao.ProductoDAO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import to.ProductoTO;

public class ProductoGUI extends javax.swing.JInternalFrame {

    DefaultTableModel objDtm;
    ResultSet rsProducto;
    ProductoDAO objProductoDAO = new ProductoDAO();
    boolean sw;
    int xid_producto;
    String ruta;

    public ProductoGUI() {
        initComponents();
        setVisible(true);
        setSize(537, 512);
        objDtm = (DefaultTableModel) jtblRegistros.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtObservacion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jlblFoto = new javax.swing.JLabel();
        jbtnSeleccionar = new javax.swing.JButton();
        jtxtRutaFoto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtnNuevo = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jbtnGrabar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INGRESE EL NOMBRE DEL PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 260, -1));

        jtblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblRegistros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, 500, 90));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("CODIGO");

        jtxtCodigo.setEditable(false);

        jLabel3.setText("NOMBRE");

        jtxtNombre.setEditable(false);

        jLabel4.setText("PRECIO");

        jtxtPrecio.setEditable(false);

        jLabel5.setText("OBSERVACION");

        jtxtObservacion.setEditable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        jbtnSeleccionar.setText("SELECCIONAR");
        jbtnSeleccionar.setEnabled(false);
        jbtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSeleccionarActionPerformed(evt);
            }
        });

        jtxtRutaFoto.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)
                                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtRutaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jbtnSeleccionar))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jtxtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtRutaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSeleccionar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 390, 340));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        jbtnNuevo.setText("NUEVO");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar.png"))); // NOI18N
        jbtnBorrar.setText("BORRAR");
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        jbtnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grabar.png"))); // NOI18N
        jbtnGrabar.setText("GRABAR");
        jbtnGrabar.setEnabled(false);
        jbtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarActionPerformed(evt);
            }
        });

        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jbtnCancelar.setText("CANCELAR");
        jbtnCancelar.setEnabled(false);
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        jbtnEditar.setText("EDITAR");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir.png"))); // NOI18N
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnGrabar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 110, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        habilitaControles(true);
        sw = false;
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/editando.wav");
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        dispose();
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/salir.wav");
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        habilitaControles(false);
        limpiaControles();
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/ttsmaker-file-2025-10-23-10-21-40.wav");
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        habilitaControles(true);
        limpiaControles();
        sw = true;
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/nuevo.wav");
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscar.getText().isEmpty()) {
                rsProducto = objProductoDAO.buscar(jtxtBuscar.getText());
                while (rsProducto.next()) {
                    Object registro[] = {rsProducto.getInt(1), rsProducto.getString(2)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    private void jtblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistrosMouseClicked
        try {
            xid_producto = Integer.parseInt(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 0).toString());
            rsProducto.first();
            do {
                if (xid_producto == rsProducto.getInt(1)) {
                    jtxtCodigo.setText(String.valueOf(rsProducto.getInt(1)));
                    jtxtNombre.setText(rsProducto.getString(2));
                    jtxtPrecio.setText(String.format("%.2f", rsProducto.getDouble(3)));
                    jtxtObservacion.setText(rsProducto.getString(4));
                    jtxtRutaFoto.setText(rsProducto.getString(5));
                    jlblFoto.setIcon(null);
                    if (!jtxtRutaFoto.getText().isEmpty()) {
                        ImageIcon imagen = new ImageIcon(jtxtRutaFoto.getText());
                        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jlblFoto.getWidth(), jlblFoto.getHeight(), Image.SCALE_DEFAULT));
                        jlblFoto.setIcon(icono);
                    }
                    rsProducto.last();
                }
            } while (rsProducto.next());

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jtblRegistrosMouseClicked

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
        try {
            String mensaje = "";
            String imagen = "C:/Users/Merca/Downloads/producto.jpg";
            ProductoTO objProductoTO = new ProductoTO();
            objProductoTO.setNomb_prod(jtxtNombre.getText());
            objProductoTO.setPrec_prod(Double.parseDouble(jtxtPrecio.getText()));
            objProductoTO.setObsv_prod(jtxtObservacion.getText());
            if (jtxtRutaFoto.getText().isEmpty()) {
                objProductoTO.setFoto_prod(imagen);
            } else {
                objProductoTO.setFoto_prod(jtxtRutaFoto.getText());
            }
            if (sw) {
                objProductoDAO.insert(objProductoTO);
                mensaje = "Registro Grabado";
            } else {
                objProductoTO.setId_producto(xid_producto);
                objProductoDAO.update(objProductoTO);
                mensaje = "Registro Actualizado";
            }
            habilitaControles(false);
            JOptionPane.showMessageDialog(rootPane, mensaje);
            limpiaControles();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/grabar.wav");
    }//GEN-LAST:event_jbtnGrabarActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        try {
            if (!jtxtCodigo.getText().isEmpty()){
                int op = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (op == JOptionPane.YES_OPTION) {
                    ProductoTO objProductoTO = new ProductoTO();
                    objProductoTO.setId_producto(xid_producto);
                    objProductoDAO.delete(objProductoTO);
                    limpiaControles();
                    reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/borrar.wav");
                    JOptionPane.showMessageDialog(rootPane, "Registro Borrado");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se selecciono ningun registro");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jbtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSeleccionarActionPerformed
        JFileChooser objFileChooser = new JFileChooser();
        int op = objFileChooser.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            ruta = objFileChooser.getSelectedFile().getAbsolutePath();
            ImageIcon imagen = new ImageIcon(ruta);
            Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(jlblFoto.getWidth(), jlblFoto.getHeight(), Image.SCALE_DEFAULT));
            jlblFoto.setIcon(icon);
            jtxtRutaFoto.setText(ruta);
        }
    }//GEN-LAST:event_jbtnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnGrabar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JButton jbtnSeleccionar;
    private javax.swing.JLabel jlblFoto;
    private javax.swing.JTable jtblRegistros;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtObservacion;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtRutaFoto;
    // End of variables declaration//GEN-END:variables

    private void habilitaControles(boolean b) {
        jtxtNombre.setEditable(b);
        jtxtPrecio.setEditable(b);
        jtxtObservacion.setEditable(b);
        jtxtBuscar.setEditable(!b);
        //Activar controles
        jbtnGrabar.setEnabled(b);
        jbtnCancelar.setEnabled(b);
        jbtnSeleccionar.setEnabled(b);
        //Desactivar controles
        jbtnNuevo.setEnabled(!b);
        jbtnEditar.setEnabled(!b);
        jbtnBorrar.setEnabled(!b);
        jbtnSalir.setEnabled(!b);
        //Llevar cursor al cuadro de texto
        jtxtNombre.grabFocus();
    }

    private void limpiaControles() {
        jtxtBuscar.setText(null);
        jtxtCodigo.setText(null);
        jtxtNombre.setText(null);
        jtxtPrecio.setText(null);
        jtxtObservacion.setText(null);
        jtxtRutaFoto.setText(null);
        jlblFoto.setIcon(null);
        limpiarJTable();
    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }
    
     public void reproducir(String rutaAudio) {
        try {
            File archivo = new File(rutaAudio);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivo);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
