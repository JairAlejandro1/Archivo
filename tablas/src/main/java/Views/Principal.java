/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import javax.swing.table.DefaultTableModel;
import models.Municipio;
import static models.Municipio.llenarDatosTabla;
import static models.Municipio.TablaDatos;


public class Principal extends javax.swing.JFrame {

    DefaultTableModel dataMunicipios = new DefaultTableModel(){
       @Override
        public boolean isCellEditable(int row,int column){
           return false;
       } 
    };
    
    
    
    public Principal() {

        initComponents();
        this.txtRecNo.setText("-1");
        this.txtRecNo.setVisible(false);
        this.lblRecNo.setVisible(false);

        llenarDatosTabla();
        setModelo();
        setDatos();
        tlbDatosGenerales.repaint();
    }

    public void setModelo(){
        String[] tlbCabecera = {"No ","ID","Estado","Municipio"};
        dataMunicipios.setColumnIdentifiers(tlbCabecera);
        tlbDatosGenerales.setModel(dataMunicipios);
    }
    
    public void setDatos(){
        Object[] datos = new Object[dataMunicipios.getColumnCount()];
        int i =0;
        dataMunicipios.setRowCount(0);
        for (Municipio municipio : TablaDatos) {
            datos[0] = i;
            datos[1] = municipio.getId();
            datos[2] = municipio.getNomEstado();
            datos[3] = municipio.getNomMunicipio();
            i++;
            dataMunicipios.addRow(datos);
        }
        tlbDatosGenerales.setModel(dataMunicipios);
        
    }
    
    
    public void limpiarCampos(){
        this.txtRecNo.setText("-1");
        this.txtId.setText("");
        this.txtNombreEstado.setText("");
        this.txtNombreMunicipio.setText("");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombreEstado = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbDatosGenerales = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JButton();
        txtRecNo = new javax.swing.JTextField();
        lblRecNo = new javax.swing.JLabel();
        txtNombreMunicipio = new javax.swing.JTextField();
        lblMunicipio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Estado");

        lblID.setText("ID");

        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        tlbDatosGenerales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tlbDatosGenerales);

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        lblRecNo.setText("RecNo");

        txtNombreMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMunicipioActionPerformed(evt);
            }
        });

        lblMunicipio.setText("Municipio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblID)
                    .addComponent(lblRecNo)
                    .addComponent(lblMunicipio))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreMunicipio)
                    .addComponent(txtRecNo, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtId)
                    .addComponent(txtNombreEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMunicipio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addGap(50, 50, 50)
                        .addComponent(btnEliminar)
                        .addGap(144, 144, 144))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        int recNo = Integer.parseInt(this.txtRecNo.getText().trim());
        int id = Integer.parseInt(this.txtId.getText().trim());
        String nomEstado = this.txtNombreEstado.getText(); 
        String nomMunicipio = this.txtNombreMunicipio.getText(); 

        
        if (recNo == -1) {
            Municipio.añadirDatosTabla(id, nomEstado, nomMunicipio);
        }else{
            System.out.println("Actualizando datos");
            Municipio.actualizarDatosTabla(recNo, id, nomEstado, nomMunicipio);
            this.btnActualizar.setSelected(false);
            System.out.println(TablaDatos);
        }
        
        setDatos();
        limpiarCampos();
               
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        
        int filaActual = tlbDatosGenerales.getSelectedRow();

        if (filaActual != -1) {
            System.out.println(filaActual);
            Municipio.eliminarDatosTabla(filaActual);
            setDatos();
            System.out.println(TablaDatos);
        } else{
            System.out.println("No hay filas existentes para eliminar");
        }       
        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        int filaActual = tlbDatosGenerales.getSelectedRow();
        System.out.println(filaActual);
        System.out.println(this.btnActualizar.isSelected());
        if (this.btnActualizar.isSelected()) {
            if (filaActual != -1) {
                System.out.println(dataMunicipios.getValueAt(filaActual, 0));
                System.out.println(dataMunicipios.getValueAt(filaActual, 1));
                System.out.println(dataMunicipios.getValueAt(filaActual, 2));
                System.out.println(dataMunicipios.getValueAt(filaActual, 3));
                
                this.txtRecNo.setText(""+dataMunicipios.getValueAt(filaActual, 0));
                this.txtId.setText(""+dataMunicipios.getValueAt(filaActual, 1));
                this.txtNombreEstado.setText(""+dataMunicipios.getValueAt(filaActual, 2));
                this.txtNombreMunicipio.setText(""+dataMunicipios.getValueAt(filaActual, 3));

            
            }else{
                System.out.println("Debe seleccionar un registro");
                this.btnActualizar.setSelected(false);
            } 
        }else{
            limpiarCampos();
        }

    }//GEN-LAST:event_btnActualizarMouseClicked

    private void txtNombreMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMunicipioActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JToggleButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRecNo;
    private javax.swing.JTable tlbDatosGenerales;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreEstado;
    private javax.swing.JTextField txtNombreMunicipio;
    private javax.swing.JTextField txtRecNo;
    // End of variables declaration//GEN-END:variables
}
