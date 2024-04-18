
package Tabla;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tabla extends javax.swing.JFrame {

    public Tabla() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        botonCargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cajaBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaPrecio = new javax.swing.JTextField();
        cajaId = new javax.swing.JTextField();
        cajaCantidad = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "IdCategoria", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        botonCargar.setText("Cargar Tabla");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        cajaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("IdCategoria:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad:");

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel4)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonInsertar)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaCantidad)
                                    .addComponent(cajaId)
                                    .addComponent(cajaPrecio)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonEliminar)
                                        .addGap(0, 16, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(cajaNombre)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cajaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonModificar)
                            .addComponent(botonEliminar)
                            .addComponent(botonInsertar))))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed

        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaProducto.setModel(modeloTabla);
        
        String campo=cajaBuscar.getText();
        String where="";
        
        if(!"".equals(campo)){ //si el campo no está vacío
            where="where nombre='"+campo+"'";
        }
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps=conexion.prepareStatement("select nombre, precio, idCategoria, cantidad from producto "+where);
            rs=ps.executeQuery();
            
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Precio");
            modeloTabla.addColumn("IdCategoria");
            modeloTabla.addColumn("Cantidad");
          
            //cuantas columnas hay exactamente en la tabla
            ResultSetMetaData rsMD=(ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas=rsMD.getColumnCount();
            
            //estableciendo el ancho de cada una de las columnas 
            int anchos[]={150,50,80,50};
            
            for(int i=0;i<cantidadColumnas;i++){
                tablaProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            ////////////////////////////////////////////////////////////////////////////////////
            
            while(rs.next()){//mientras siga habiendo datos
                Object fila[] = new Object[cantidadColumnas];//arreglo de cualquier tipo
                for(int i=0;i<cantidadColumnas;i++){
                    fila[i]=rs.getObject(i+1); //llenamos el arreglo
                }
                modeloTabla.addRow(fila);
            }
            
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
    }//GEN-LAST:event_botonCargarActionPerformed

    private void cajaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaBuscarActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
       
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            
            Conexion con = new Conexion();//conexion a la base de datos
            Connection conexion = con.getConnection();
            
            int fila=tablaProducto.getSelectedRow();//hallando la fila que hemos hecho click
            String nombre=tablaProducto.getValueAt(fila, 0).toString();//ir a mi tabla producto y busca el nombre de la fila que hemos hecho click
            
            ps=conexion.prepareStatement("select nombre,precio,idCategoria,cantidad from producto where nombre=?");//hacemos la consulta de todos los datos a través del nombre 
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            
            while(rs.next()){
                cajaNombre.setText(rs.getString("nombre"));
                cajaPrecio.setText(rs.getString("precio"));
                cajaId.setText(rs.getString("idCategoria"));
                cajaCantidad.setText(rs.getString("cantidad"));
            }
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
       
        PreparedStatement ps=null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps=conexion.prepareStatement("insert into producto (nombre,precio,idCategoria,cantidad) values (?,?,?,?)");
            ps.setString(1, cajaNombre.getText());
            ps.setDouble(2, Double.parseDouble(cajaPrecio.getText()));
            ps.setInt(3, Integer.parseInt(cajaId.getText()));
            ps.setInt(4, Integer.parseInt(cajaCantidad.getText()));
            
            ps.executeUpdate();//porque haremos una insercion pue
            
            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        PreparedStatement ps=null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps=conexion.prepareStatement("update producto set nombre=?,precio=?,idCategoria=?,cantidad=? where nombre=?");
            ps.setString(1, cajaNombre.getText());
            ps.setDouble(2, Double.parseDouble(cajaPrecio.getText()));
            ps.setInt(3, Integer.parseInt(cajaId.getText()));
            ps.setInt(4, Integer.parseInt(cajaCantidad.getText()));
            ps.setString(5, cajaNombre.getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        PreparedStatement ps=null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps=conexion.prepareStatement("delete from producto where nombre=?");
            ps.setString(1, cajaNombre.getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }

    }//GEN-LAST:event_botonEliminarActionPerformed
   
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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCantidad;
    private javax.swing.JTextField cajaId;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    // End of variables declaration//GEN-END:variables
}
