/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import javax.swing.table.DefaultTableModel;
import models.Municipio;
import static models.Municipio.llenarMunicipios;
import static models.Municipio.municipios;


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

        llenarMunicipios();
        setModelo();
        setDatos();
        tlbMunicipios.repaint();
    }

    public void setModelo(){
        String[] tlbCabecera = {"No ","ID","Nombre","Estado"};
        dataMunicipios.setColumnIdentifiers(tlbCabecera);
        tlbMunicipios.setModel(dataMunicipios);
    }
    
    public void setDatos(){
        Object[] datos = new Object[dataMunicipios.getColumnCount()];
        int i =0;
        dataMunicipios.setRowCount(0);
        for (Municipio municipio : municipios) {
            datos[0] = i;
            datos[1] = municipio.getId();
            datos[2] = municipio.getNombre();
            i++;
            dataMunicipios.addRow(datos);
        }
        tlbMunicipios.setModel(dataMunicipios);
        
    }
    
    
    public void limpiarCampos(){
        this.txtRecNo.setText("-1");
        this.txtId.setText("");
        this.txtNombre.setText("");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnCAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbMunicipios = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JButton();
        txtRecNo = new javax.swing.JTextField();
        lblRecNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre");

        lblID.setText("ID");

        btnCAceptar.setText("Aceptar");
        btnCAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCAceptarMouseClicked(evt);
            }
        });

        tlbMunicipios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tlbMunicipios);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
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
                    .addComponent(lblRecNo))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRecNo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar))
                    .addComponent(txtId)
                    .addComponent(txtNombre))
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
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCAceptar)
                    .addComponent(btnLimpiar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(36, 36, 36)
                        .addComponent(btnActualizar)
                        .addGap(150, 150, 150))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCAceptarMouseClicked
        int recNo = Integer.parseInt(this.txtRecNo.getText().trim());
        int id = Integer.parseInt(this.txtId.getText().trim());
        String nombre = this.txtNombre.getText();      

        
        if (recNo == -1) {
            Municipio.añadirMunicipios(id, nombre);
        }else{
            System.out.println("Actualizando datos");
            Municipio.actualizarMunicipio(recNo, id, nombre);
            this.btnActualizar.setSelected(false);
            System.out.println(municipios);
        }
        
        setDatos();
        limpiarCampos();
               
    }//GEN-LAST:event_btnCAceptarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        
        int filaActual = tlbMunicipios.getSelectedRow();

        if (filaActual != -1) {
            System.out.println(filaActual);
            Municipio.eliminarMunicipios(filaActual);
            setDatos();
            System.out.println(municipios);
        } else{
            System.out.println("No hay filas existentes para eliminar");
        }       
        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        int filaActual = tlbMunicipios.getSelectedRow();
        System.out.println(filaActual);
        System.out.println(this.btnActualizar.isSelected());
        if (this.btnActualizar.isSelected()) {
            if (filaActual != -1) {
                System.out.println(dataMunicipios.getValueAt(filaActual, 0));
                System.out.println(dataMunicipios.getValueAt(filaActual, 1));
                System.out.println(dataMunicipios.getValueAt(filaActual, 2));
                this.txtRecNo.setText(""+dataMunicipios.getValueAt(filaActual, 0));
                this.txtId.setText(""+dataMunicipios.getValueAt(filaActual, 1));

                this.txtNombre.setText(""+dataMunicipios.getValueAt(filaActual, 2));

            
            }else{
                System.out.println("Debe seleccionar un registro");
                this.btnActualizar.setSelected(false);
            } 
        }else{
            limpiarCampos();
        }

    }//GEN-LAST:event_btnActualizarMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnActualizar;
    private javax.swing.JButton btnCAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRecNo;
    private javax.swing.JTable tlbMunicipios;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRecNo;
    // End of variables declaration//GEN-END:variables
}
