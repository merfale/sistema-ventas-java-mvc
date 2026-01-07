package gui;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import dao.DistritoDAO;
import dao.EmpleadoDAO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import to.EmpleadoTO;

public class EmpleadoGUI extends javax.swing.JInternalFrame {

    DefaultTableModel objDtm;
    ResultSet rsEmpleado;
    ResultSet rsDistrito;
    EmpleadoDAO objEmpleadoDAO = new EmpleadoDAO();
    DistritoDAO objDistritoDAO = new DistritoDAO();
    boolean sw;
    ButtonGroup objButtonGroup = new ButtonGroup();
    int xid_distrito;
    int xid_empleado;
    String ruta;

    public EmpleadoGUI() {
        initComponents();
        setSize(736, 568);
        jtxtRutaFoto.setColumns(20);
        objButtonGroup.add(jrbtFemenino);
        objButtonGroup.add(jrbtMasculino);
        objButtonGroup.add(jrbtMatias);
        objDtm = (DefaultTableModel) jtblRegistros.getModel();
        setVisible(true);
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
        jtxtObservacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtPaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtMaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtFijo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtCelular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jrbtMasculino = new javax.swing.JRadioButton();
        jrbtFemenino = new javax.swing.JRadioButton();
        jcmbDistrito = new javax.swing.JComboBox<>();
        jrbtMatias = new javax.swing.JRadioButton();
        jlblFoto1 = new javax.swing.JPanel();
        jlblFoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnNuevo = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jbtnGrabar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnSeleccionar = new javax.swing.JButton();
        jtxtRutaFoto = new javax.swing.JTextField();

        jLabel1.setText("INGRESE AP. PATERNO");

        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyReleased(evt);
            }
        });

        jtblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "AP. PATERNO", "AP. MATERNO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel2.setText("CODIGO");

        jtxtCodigo.setEditable(false);

        jLabel3.setText("NOMBRE");

        jtxtNombre.setEditable(false);

        jLabel4.setText("OBSERVACION");

        jtxtObservacion.setEditable(false);

        jLabel5.setText("A. PATERNO");

        jtxtPaterno.setEditable(false);

        jLabel6.setText("A. MATERNO");

        jtxtMaterno.setEditable(false);

        jLabel7.setText("SEXO");

        jLabel8.setText("TELEFONO");

        jLabel9.setText("DIRECCION");

        jtxtDireccion.setEditable(false);

        jtxtFijo.setEditable(false);

        jLabel10.setText("CELULAR");

        jtxtCelular.setEditable(false);

        jLabel11.setText("DISTRITO");

        jLabel12.setText("EMAIL");

        jtxtEmail.setEditable(false);

        jrbtMasculino.setText("MASCULINO");

        jrbtFemenino.setText("FEMENINO");

        jcmbDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selccione", "Item 2", "Item 3", "Item 4" }));

        jrbtMatias.setText("OTRO");

        jlblFoto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jlblFoto1Layout = new javax.swing.GroupLayout(jlblFoto1);
        jlblFoto1.setLayout(jlblFoto1Layout);
        jlblFoto1Layout.setHorizontalGroup(
            jlblFoto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        jlblFoto1Layout.setVerticalGroup(
            jlblFoto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlblFoto1Layout.createSequentialGroup()
                .addComponent(jlblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnSeleccionar.setText("SELECCIONAR");
        jbtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSeleccionarActionPerformed(evt);
            }
        });

        jtxtRutaFoto.setEditable(false);
        jtxtRutaFoto.setEnabled(false);
        jtxtRutaFoto.setFocusable(false);
        jtxtRutaFoto.setMaximumSize(new java.awt.Dimension(25, 190));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jrbtMatias)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jrbtMasculino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jrbtFemenino))
                        .addComponent(jtxtDireccion))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtFijo)
                            .addComponent(jtxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(14, 14, 14)
                                .addComponent(jtxtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtRutaFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmbDistrito, 0, 190, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jlblFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jbtnSeleccionar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jtxtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcmbDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel11)))
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jtxtRutaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jlblFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jbtnSeleccionar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jrbtMasculino)
                                    .addComponent(jrbtFemenino))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbtMatias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        try {
            limpiarJTable();
            String nombre = jtxtBuscar.getText().trim();
            if (!nombre.isEmpty()) {
                rsEmpleado = objEmpleadoDAO.buscar(nombre);
                while (rsEmpleado.next()) {
                    Object[] registro = {rsEmpleado.getInt(1),
                        rsEmpleado.getString(2), rsEmpleado.getString(3),
                        rsEmpleado.getString(4)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    private void jtblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistrosMouseClicked
        try {
            xid_empleado = Integer.parseInt(jtblRegistros.getValueAt(jtblRegistros.getSelectedRow(), 0).toString());
            rsEmpleado.first();
            do {
                if (xid_empleado == rsEmpleado.getInt(1)) {
                    jtxtCodigo.setText(String.valueOf(rsEmpleado.getInt(1)));
                    jtxtNombre.setText(rsEmpleado.getString(2));
                    jtxtPaterno.setText(rsEmpleado.getString(3));
                    jtxtMaterno.setText(rsEmpleado.getString(4));
                    if (rsEmpleado.getString(5).equals("M")) {
                        jrbtMasculino.setSelected(true);
                    }
                    if (rsEmpleado.getString(5).equals("F")) {
                        jrbtFemenino.setSelected(true);
                    }
                    if (rsEmpleado.getString(5).equals("O")) {
                        jrbtMatias.setSelected(true);
                    }
                    jtxtDireccion.setText(rsEmpleado.getString(6));
                    jcmbDistrito.removeAllItems();
                    jcmbDistrito.addItem(rsEmpleado.getString(7));
                    jtxtFijo.setText(rsEmpleado.getString(8));
                    jtxtCelular.setText(rsEmpleado.getString(9));
                    jtxtEmail.setText(rsEmpleado.getString(10));
                    jtxtObservacion.setText(rsEmpleado.getString(11));
                    jlblFoto.setIcon(null);
                    Blob fotoBlob = rsEmpleado.getBlob(12);
                    byte[] data = fotoBlob.getBytes(1, (int) fotoBlob.length());
                    BufferedImage foto = ImageIO.read(new ByteArrayInputStream(data));
                    ImageIcon imagen = new ImageIcon(foto);
                    Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(jlblFoto.getWidth(), jlblFoto.getHeight(), Image.SCALE_DEFAULT));
                    jlblFoto.setIcon(icon);

                    this.repaint();
                }
            } while (rsEmpleado.next());
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jtblRegistrosMouseClicked

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        sw = true;
        habilitaControles(true);
        limpiaControles();
        llenaCombo();
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/nuevo.wav");
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        try {
            if (!jtxtCodigo.getText().isEmpty()) {
                int op = JOptionPane.showConfirmDialog(rootPane, "¿Eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (op == JOptionPane.YES_OPTION) {
                    EmpleadoTO objEmpleadoTO = new EmpleadoTO();
                    objEmpleadoTO.setId_empleado(xid_empleado);
                    objEmpleadoDAO.delete(objEmpleadoTO);
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

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
        try {
            String mensaje = "";
            String masculino = "C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/imagen/masculino.png";
            String femenino = "C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/imagen/femenino.png";
            String otro = "..\\PryVentas\\src\\fotos\\otro.jpg";
            EmpleadoTO objEmpleadoTO = new EmpleadoTO();
            objEmpleadoTO.setId_empleado(xid_empleado);
            objEmpleadoTO.setNomb_empl(jtxtNombre.getText());
            objEmpleadoTO.setApat_empl(jtxtPaterno.getText());
            objEmpleadoTO.setAmat_empl(jtxtMaterno.getText());
            if (jrbtMasculino.isSelected()) {
                objEmpleadoTO.setSexo_empl("M");
            }
            if (jrbtFemenino.isSelected()) {
                objEmpleadoTO.setSexo_empl("F");
            }
            if (jrbtMatias.isSelected()) {
                objEmpleadoTO.setSexo_empl("O");
            }
            objEmpleadoTO.setDire_empl(jtxtDireccion.getText());
            obtener_id_distrito();
            objEmpleadoTO.setId_distrito(xid_distrito);
            objEmpleadoTO.setTelf_empl(jtxtFijo.getText());
            objEmpleadoTO.setCelu_empl(jtxtCelular.getText());
            objEmpleadoTO.setEmai_empl(jtxtEmail.getText());
            objEmpleadoTO.setObsv_empl(jtxtObservacion.getText());
            if (jtxtRutaFoto.getText().isEmpty()) {
                if (jrbtMasculino.isSelected()) {
                    objEmpleadoTO.setFoto_empl(masculino);
                }
                if (jrbtFemenino.isSelected()) {
                    objEmpleadoTO.setFoto_empl(femenino);
                }
            } else {
                objEmpleadoTO.setFoto_empl(jtxtRutaFoto.getText());
            }
            if (sw) {
                objEmpleadoDAO.insert(objEmpleadoTO);
                mensaje = "Registro agregado";
            } else {
                objEmpleadoDAO.update(objEmpleadoTO);
                
                mensaje = "Registro actualizado";
            }
            JOptionPane.showMessageDialog(rootPane, mensaje);
            limpiaControles();
            habilitaControles(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/grabar.wav");
    }//GEN-LAST:event_jbtnGrabarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        habilitaControles(false);
        limpiaControles();
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/ttsmaker-file-2025-10-23-10-21-40.wav");
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        sw = false;
        habilitaControles(true);
        llenaCombo();
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/editando.wav");
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        dispose();
        reproducir("C:/Users/Merca/OneDrive/Documentos/Oracle Whit Java/PrySisVentas202502/src/Audios/salir.wav");
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSeleccionarActionPerformed
        JFileChooser objJFileChooser = new JFileChooser();
        int op = objJFileChooser.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            ruta = objJFileChooser.getSelectedFile().getAbsolutePath();
            ImageIcon imagen = new ImageIcon(ruta);
            Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(jlblFoto.getWidth(), jlblFoto.getHeight(), Image.SCALE_DEFAULT));
            jlblFoto.setIcon(icon);
            jtxtRutaFoto.setText(ruta);
        }
    }//GEN-LAST:event_jbtnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnGrabar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JButton jbtnSeleccionar;
    private javax.swing.JComboBox<String> jcmbDistrito;
    private javax.swing.JLabel jlblFoto;
    private javax.swing.JPanel jlblFoto1;
    private javax.swing.JRadioButton jrbtFemenino;
    private javax.swing.JRadioButton jrbtMasculino;
    private javax.swing.JRadioButton jrbtMatias;
    private javax.swing.JTable jtblRegistros;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtCelular;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFijo;
    private javax.swing.JTextField jtxtMaterno;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtObservacion;
    private javax.swing.JTextField jtxtPaterno;
    private javax.swing.JTextField jtxtRutaFoto;
    // End of variables declaration//GEN-END:variables
    private void habilitaControles(boolean b) {
        JTextField[] arrayJTextFields = {jtxtFijo, jtxtCelular,
            jtxtDireccion, jtxtEmail, jtxtMaterno, jtxtPaterno,
            jtxtObservacion, jtxtNombre};
        for (JTextField objTextField : arrayJTextFields) {
            objTextField.setEditable(b);
        }
        jcmbDistrito.setEnabled(b);
        jrbtFemenino.setEnabled(b);
        jrbtMasculino.setEnabled(b);
        jrbtMatias.setEnabled(b);
        jbtnGrabar.setEnabled(b);
        jbtnCancelar.setEnabled(b);
        jbtnNuevo.setEnabled(!b);
        jbtnEditar.setEnabled(!b);
        jbtnSalir.setEnabled(!b);
        jbtnBorrar.setEnabled(!b);
        jtxtNombre.grabFocus();
    }

    private void limpiaControles() {
        limpiarJTable();
        JTextField[] arrayJTextFields = {jtxtFijo, jtxtCelular, jtxtCodigo,
            jtxtDireccion, jtxtEmail, jtxtMaterno, jtxtPaterno,
            jtxtObservacion, jtxtBuscar, jtxtNombre};
        for (JTextField objTextField : arrayJTextFields) {
            objTextField.setText(null);
        }

        jcmbDistrito.removeAllItems();
        objButtonGroup.clearSelection();
        jlblFoto.setIcon(null);
    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    private void llenaCombo() {
        try {
            rsDistrito = objDistritoDAO.buscar("%");
            if (sw) {

                while (rsDistrito.next()) {
                    jcmbDistrito.addItem(rsDistrito.getString(2));
                }
            } else {
                String nombre = jcmbDistrito.getSelectedItem().toString();
                while (rsDistrito.next()) {
                    if (!nombre.equals(rsDistrito.getString(2))) {
                        jcmbDistrito.addItem(rsDistrito.getString(2));
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void obtener_id_distrito() {
        try {
            rsDistrito.first();
            String nombre = jcmbDistrito.getSelectedItem().toString();
            do {
                if (nombre.equals(rsDistrito.getString(2))) {
                    xid_distrito = rsDistrito.getInt(1);
                    rsDistrito.last();
                }
            } while (rsDistrito.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
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
