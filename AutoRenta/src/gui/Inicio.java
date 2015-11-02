/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dani
 */
public class Inicio extends javax.swing.JFrame {
    static double Total;
    static String fechaRegreso;
    static Double totalNeto = 0.0;
    String marca;
    String modelo;
    String color;
    String transmision;
    float tanque;
    int inventario;
    String estado;
    int cantidad;
    float total;
    float precio;
    String nombreEmpleado;
    String nombreCliente;
    Dimension dim;
    static int row;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        visibilidad();
        this.setLocationRelativeTo(null);
        obtenerNombreEmpleado();
        cmbDiasRenta.addItem(1);
        cmbDiasRenta.addItem(2);
        cmbDiasRenta.addItem(3);
        cmbDiasRenta.addItem(4);
        cmbDiasRenta.addItem(5);
        //setFechaRegreso(Regreso);
        
               
    }
    
 
    public static void obtenerCodigo(String codigo) {
        frm_codigo.setText(codigo);
        frm_codigo.requestFocus();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        frm_codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        frm_renta = new javax.swing.JTable();
        sasdad = new javax.swing.JLabel();
        total_venta = new javax.swing.JLabel();
        btnCobrar = new javax.swing.JButton();
        tbpAdmin = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnEmp = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tbpBajas = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNombCliente = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cmbDiasRenta = new javax.swing.JComboBox();
        lblFechaEntrega = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblNombreEmpleado = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Id Del Vehiculo:");

        frm_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frm_codigoActionPerformed(evt);
            }
        });
        frm_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                frm_codigoKeyPressed(evt);
            }
        });

        jButton1.setText("Busca Vehiculo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        frm_renta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Color", "Transmisión", "Tanque", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(frm_renta);

        sasdad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sasdad.setText("Total x dia: ");

        total_venta.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        total_venta.setText("$0.00");

        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        btnEmp.setText("Agregar Empleado");
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar Vehiculo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tbpAdmin.addTab("Altas", jPanel3);

        jButton2.setText("Borrar Empleados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Borrar Clientes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Borrar Vehiculos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbpBajasLayout = new javax.swing.GroupLayout(tbpBajas);
        tbpBajas.setLayout(tbpBajasLayout);
        tbpBajasLayout.setHorizontalGroup(
            tbpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbpBajasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tbpBajasLayout.setVerticalGroup(
            tbpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbpBajasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tbpAdmin.addTab("Bajas", tbpBajas);

        jLabel2.setText("Cliente:");

        jLabel3.setText("Rango de Renta:");

        jLabel4.setText("Numero de Dias:");

        jButton8.setText("Buscar Cliente");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton3.setText("Registrar Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cmbDiasRenta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDiasRentaItemStateChanged(evt);
            }
        });

        lblFechaEntrega.setText("Fecha entrega:");

        jButton5.setText("Devolución De Vehiculos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton10.setText("Borrar tabla");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDiasRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblFechaEntrega))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNombCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton10))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblNombCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmbDiasRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaEntrega))
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel6.setText("Empleado:");

        lblNombreEmpleado.setText("Nombre del Empleado");

        jButton9.setText("Cerrar Sesión");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sasdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(frm_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(tbpAdmin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(lblNombreEmpleado)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frm_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tbpAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sasdad)
                            .addComponent(total_venta))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frm_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frm_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frm_codigoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrmClientes clientes = new FrmClientes();
        clientes.setLocationRelativeTo(this);
        clientes.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BuscarVehiculo buscar = new BuscarVehiculo();
        buscar.setLocationRelativeTo(this);
        buscar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
        FrmEmpleado empleado = new FrmEmpleado();
        empleado.setLocationRelativeTo(this);
        empleado.setVisible(true);
    }//GEN-LAST:event_btnEmpActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FrmVehiculos vehiculos = new FrmVehiculos();
        vehiculos.setLocationRelativeTo(this);
        vehiculos.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void frm_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frm_codigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (frm_codigo.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Introduzca un codigo");

            } else {
                DefaultTableModel venta = (DefaultTableModel) frm_renta.getModel();
                int codigo = Integer.parseInt(frm_codigo.getText());
                
                //cantidad = Integer.parseInt(txtCantidad.getText());
                try {

                    ResultSet prod = sql.Vehiculos.getVehiculos(codigo);
                    if (prod.next()) {
                        marca = prod.getString("MARCA");
                        modelo = prod.getString("MODELO");
                        color = prod.getString("COLOR");
                        /*inventario = prod.getInt("INVENTARIO");*/
                        estado = prod.getString("ESTADO");
                        transmision = prod.getString("TRANSMISION");
                        tanque = prod.getFloat("TANQUE");
                        precio = prod.getFloat("PRECIO_RENTA");
                        total = /*cantidad **/ precio;

                        /*if (inventario < cantidad) {
                         if (inventario == 0) {
                         JOptionPane.showMessageDialog(null, "Vehiculo agotado");
                         } else {
                         JOptionPane.showMessageDialog(null, "Vehiculos insuficientes");
                         txtCantidad.setText("");
                         txtCantidad.requestFocus();
                         }
                         } else {
                         if (comprobarRepetidos() == false) {
                         inventario = inventario - cantidad;*/
                        venta.addRow(new Object[]{codigo, marca, modelo, color, transmision, tanque, precio});
                        /*}*/
                        frm_codigo.setText("");
                        frm_codigo.requestFocus();
                        calcularTotal();

                        /*}
                         }else {
                         JOptionPane.showMessageDialog(this, "El codigo no existe");
                         */                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_frm_codigoKeyPressed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        DefaultTableModel venta = (DefaultTableModel) frm_renta.getModel();
             row = venta.getRowCount();
                System.out.println(row);
        if (row < 1) {
            JOptionPane.showMessageDialog(this, "No hay vehiculos seleccionados");
        }else{
         if(lblNombCliente.getText().equals("")){
                JOptionPane.showMessageDialog(this, "No ha seleccionado a un cliente.");
            }else{
             rentar();
             setTotal(calcularTotal());
        } 
        }
        
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmBorrarEmpleados borrarEmpleados = new FrmBorrarEmpleados();
        borrarEmpleados.setVisible(true);
        borrarEmpleados.setLocationRelativeTo(borrarEmpleados);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FrmBorrarCliente borrarClientes = new FrmBorrarCliente();
        borrarClientes.setVisible(true);
        borrarClientes.setLocationRelativeTo(borrarClientes);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        FrmBorrarVehiculos borrar = new FrmBorrarVehiculos();
        borrar.setVisible(true);
        borrar.setLocationRelativeTo(borrar);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        BuscarCliente borrar = new BuscarCliente();
        borrar.setVisible(true);
        borrar.setLocationRelativeTo(borrar);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DevolucionVehiculo vehiculos = new DevolucionVehiculo();
        vehiculos.setLocationRelativeTo(this);
        vehiculos.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cmbDiasRentaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDiasRentaItemStateChanged
        java.util.Date ahora = new java.util.Date();
        String Regreso = Fechas.sumarFechasDias(ahora, getDiasRenta());
        setFechaRegreso(Regreso);
        mostrarFechaRegreso(Regreso);
        calcularTotal();
    }//GEN-LAST:event_cmbDiasRentaItemStateChanged

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       
    }//GEN-LAST:event_jButton10ActionPerformed

    public static void VVLV(){
         int x;
        DefaultTableModel venta = (DefaultTableModel) frm_renta.getModel();
        for (x = venta.getRowCount(); x > 0; x--) {
            venta.removeRow(0);
        }
        calcularTotal();
    }
        
    public boolean comprobarRepetidos() {
        DefaultTableModel venta = (DefaultTableModel) frm_renta.getModel();
        int x = 0;
        boolean bandera = false;

        for (x = 0; x < venta.getRowCount(); x++) {
            String tmpCodigo = String.valueOf(venta.getValueAt(x, 0));
            String Chkcodigo = frm_codigo.getText();
            if (Chkcodigo.equals(tmpCodigo)) {
                bandera = true;
                int temp = Integer.parseInt(venta.getValueAt(x, 1).toString());
                cantidad = temp + cantidad;
                float temp2 = Float.parseFloat(venta.getValueAt(x, 8).toString());
                total = cantidad * temp2;
                inventario = inventario - cantidad;
                venta.setValueAt(cantidad, x, 1);
                venta.setValueAt(total, x, 8);
                venta.setValueAt(inventario, x, 7);
            }
        }
        return bandera;
    }

    public static Double calcularTotal() {
        int x;
        totalNeto = 0.00;
        DefaultTableModel venta = (DefaultTableModel) frm_renta.getModel();
        //Si la cantidad de renglones es 0 es decir se hizo ninguna renta, mantiene la variable del total en 0.
        if (venta.getRowCount() == 0) {
            totalNeto = 0.00;
        } else {
            //En un numero de iteraciones igual a la cantidad de renglones que tiene la tabla.
            //Guarda en una variable temporal de tipo String el texto que contiene la celda del precio. 
            //Despues de combertir este String a numero va almacenando la suma de estos en otra variable.
            for (x = 0; x < venta.getRowCount(); x++) {
                String tmpTotal = String.valueOf(venta.getValueAt(x, 6));
                Double tmpTotal1 = Double.parseDouble(tmpTotal);
                int DiasRenta = getDiasRenta();
                totalNeto = (totalNeto + tmpTotal1) * DiasRenta;
            }
        }
        total_venta.setText(Format.Mxn(totalNeto));
        return totalNeto;
    }

    public void rentar() {
        int x = 0;
        DefaultTableModel renta = (DefaultTableModel) frm_renta.getModel();
        for (x = 0; x < renta.getRowCount(); x++) {
            int Codigo = (int) renta.getValueAt(x, 0);
            
            if (sql.Vehiculos.rentarVehiculo(Codigo)) {
                Cobrar cobrar = new Cobrar();
                cobrar.setLocationRelativeTo(this);
                cobrar.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Error al tratar de rentar el vehiculo.");
            }
        }
    }

     public static void setTotal(double total){
        Total = total;
    }
    
    public static double getTotal(){
        return Total;
    }

    public void visibilidad() {
        if (sql.Empleado.isAdmin()) {
            tbpAdmin.setEnabled(true);
        } else {
            tbpAdmin.setEnabled(false);
            btnEmp.setEnabled(false);
            jButton4.setEnabled(false);
            jButton2.setEnabled(false);
            jButton6.setEnabled(false);
            jButton7.setEnabled(false);
        }
    }

    public static void obtenerNombreCliente(String nombre) {
        lblNombCliente.setText(nombre);
    }
    
    public static void obtenerNombreEmpleado() {
        lblNombreEmpleado.setText(sql.Empleado.getNombreEmpleado());
    }
    
    public static int getDiasRenta(){
        int Dias = (int) cmbDiasRenta.getSelectedItem();
        return Dias;
    }
     
    public static void setFechaRegreso(String fecha){
        fechaRegreso = fecha;
    }
    
    public static String getFechaRegreso() {
        return fechaRegreso;
    }
    
    public static void mostrarFechaRegreso(String fecha)
    {
    lblFechaEntrega.setText("Fecha de entrega: " + fecha);
    }
    
    public static void calcularFechaRegreso()
    {
        java.util.Date ahora = new java.util.Date();
        String Regreso = Fechas.sumarFechasDias(ahora, getDiasRenta());
        setFechaRegreso(Regreso);
        mostrarFechaRegreso(Regreso);
    }
    
    
    
    
//    public static void asignarDiferenciaFechas(){
//        java.util.Date ahora = new java.util.Date();
//        int DiasRenta = Fechas.diferenciasDeFechas2(ahora, dchFechaEntrega.getDate());
//        lblDiasRenta.setText(String.valueOf(DiasRenta));
//    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnEmp;
    public static javax.swing.JComboBox cmbDiasRenta;
    private static javax.swing.JTextField frm_codigo;
    static javax.swing.JTable frm_renta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JLabel lblFechaEntrega;
    public static javax.swing.JLabel lblNombCliente;
    private static javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel sasdad;
    private javax.swing.JTabbedPane tbpAdmin;
    private javax.swing.JPanel tbpBajas;
    static javax.swing.JLabel total_venta;
    // End of variables declaration//GEN-END:variables
}
