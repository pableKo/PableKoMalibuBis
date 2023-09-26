
package VistasM;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import ulp.AccesoADatos.AlumnoData;
import ulp.Entidades.Alumno;
import java.util.Date;

public class FormularioAlumnoViewM extends javax.swing.JInternalFrame {
    
    private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual = null;
  
    public FormularioAlumnoViewM() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritAlu = new javax.swing.JDesktopPane();
        jlAlumno = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlFechaDeNac = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jdcFechaDeNac = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jbVaciar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        JbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();

        jlAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlAlumno.setText("Alumno");

        jlDni.setText("DNI:");

        jlApellido.setText("Apellido:");

        jlNombre.setText("Nombre:");

        jlEstado.setText("Estado:");

        jlFechaDeNac.setText("Fecha de Nacimiento:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbVaciar.setText("Vaciar");
        jbVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVaciarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        JbEliminar.setText("Eliminar");
        JbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jdpEscritAlu.setLayer(jlAlumno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jlDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jlApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jlNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jlEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jlFechaDeNac, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jtDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jtApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jrbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jdcFechaDeNac, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jbVaciar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(JbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritAlu.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritAluLayout = new javax.swing.GroupLayout(jdpEscritAlu);
        jdpEscritAlu.setLayout(jdpEscritAluLayout);
        jdpEscritAluLayout.setHorizontalGroup(
            jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritAluLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jlAlumno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jdpEscritAluLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpEscritAluLayout.createSequentialGroup()
                        .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdpEscritAluLayout.createSequentialGroup()
                                .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDni)
                                    .addComponent(jlApellido))
                                .addGap(22, 22, 22)
                                .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jdpEscritAluLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(JbEliminar))
                            .addGroup(jdpEscritAluLayout.createSequentialGroup()
                                .addComponent(jlNombre)
                                .addGap(22, 22, 22)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jbBuscar)
                        .addGap(26, 26, 26))
                    .addGroup(jdpEscritAluLayout.createSequentialGroup()
                        .addComponent(jbVaciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addGap(58, 58, 58)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(jdpEscritAluLayout.createSequentialGroup()
                        .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jdpEscritAluLayout.createSequentialGroup()
                                .addComponent(jlEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbEstado))
                            .addComponent(jlFechaDeNac))
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaDeNac, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jdpEscritAluLayout.setVerticalGroup(
            jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritAluLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlAlumno)
                .addGap(46, 46, 46)
                .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDni)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbEstado)
                    .addComponent(jlEstado))
                .addGap(30, 30, 30)
                .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaDeNac, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaDeNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jdpEscritAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVaciar)
                    .addComponent(jbSalir)
                    .addComponent(JbEliminar)
                    .addComponent(jbGuardar))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpEscritAlu)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpEscritAlu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        
        try{
        Integer dni = Integer.parseInt(jtDni.getText());
        alumnoActual=aluData.buscarAlumnoPorDni(dni);
        if(alumnoActual!=null){
            jtApellido.setText(alumnoActual.getApellido());
            jtNombre.setText(alumnoActual.getNombre());
            jrbEstado.setSelected(alumnoActual.isActivo());
            LocalDate lc=alumnoActual.getFechaNac();
            java.util.Date date=java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdcFechaDeNac.setDate(date);
        
        }
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Ud debe ingresar un DNI sin puntos");
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVaciarActionPerformed
        LimpiarCampos();
        alumnoActual=null;
        
    }//GEN-LAST:event_jbVaciarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        try{
        Integer dni = Integer.parseInt(jtDni.getText());
        String apellido = jtApellido.getText();
        String nombre = jtNombre.getText();
        
            if (nombre.isEmpty()||apellido.isEmpty()) {
            JOptionPane.showMessageDialog(this,"No puede haber campos vacíos");
            return;
        }
            java.util.Date sfecha = jdcFechaDeNac.getDate();
            LocalDate fechaNac=sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean estado=jrbEstado.isSelected();
            if(alumnoActual==null){
                alumnoActual=new Alumno(dni, apellido, nombre, fechaNac,estado);
                aluData.guardarAlumno(alumnoActual);
                
            }else{
                alumnoActual.setDni(dni);
                alumnoActual.setApellido(apellido);
                alumnoActual.setNombre(nombre);
                alumnoActual.setFechaNac(fechaNac);
                //No pongo el estado xq no debería dejar que cambie el estado
                aluData.modificarAlumno(alumnoActual);
                
            }

        
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Ud debe ingresar un DNI sin puntos");
            
            
            
        }
        
        
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void JbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbEliminarActionPerformed
        // TODO add your handling code here:
        if(alumnoActual!=null){
            aluData.eliminarAlumno(alumnoActual.getIdAlumno());
            alumnoActual=null;
            LimpiarCampos();
        }else {
        JOptionPane.showMessageDialog(this,"No hay un alumno seleccionado");

        }
        
        
    }//GEN-LAST:event_JbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void LimpiarCampos(){
        
        jtDni.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jrbEstado.setSelected(true);
        jdcFechaDeNac.setDate(new Date());
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbEliminar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVaciar;
    private com.toedter.calendar.JDateChooser jdcFechaDeNac;
    private javax.swing.JDesktopPane jdpEscritAlu;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFechaDeNac;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
