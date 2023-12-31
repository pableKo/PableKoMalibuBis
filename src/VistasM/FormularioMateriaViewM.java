
package VistasM;

import java.util.Date;
import javax.swing.JOptionPane;
import ulp.AccesoADatos.MateriaData;
import ulp.Entidades.Materia;
import static java.lang.Integer.parseInt;


public class FormularioMateriaViewM extends javax.swing.JInternalFrame {

    //int idMateria=Integer.parseInt(jtIdMateria.getText());
    
    private MateriaData matData = new MateriaData();
    private Materia materiaActual = new Materia();
    
    //private Materia materiaActual = null;
    
    public FormularioMateriaViewM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMateria = new javax.swing.JLabel();
        jlIdMateria = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlAnio = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jtIdMateria = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();
        jbVaciar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();

        jlMateria.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlMateria.setText("Materia");

        jlIdMateria.setText("Código");

        jlNombre.setText("Nombre");

        jlAnio.setText("Año");

        jlEstado.setText("Estado");

        jbBuscar.setText("Buscar");

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

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jlMateria))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbBuscar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbVaciar)
                                    .addGap(93, 93, 93)
                                    .addComponent(jbEliminar)
                                    .addGap(75, 75, 75)
                                    .addComponent(jbGuardar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlIdMateria)
                                        .addComponent(jlNombre)
                                        .addComponent(jlAnio)
                                        .addComponent(jlEstado))
                                    .addGap(68, 68, 68)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jrbEstado)
                                        .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlMateria)
                .addGap(30, 30, 30)
                .addComponent(jbBuscar)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlIdMateria)
                            .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAnio)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jlEstado))
                    .addComponent(jrbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVaciar)
                    .addComponent(jbSalir)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVaciarActionPerformed
        // TODO add your handling code here:
        LimpiarCampos();
        materiaActual=null;
    }//GEN-LAST:event_jbVaciarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
         if(materiaActual!=null){
            matData.eliminarMateria(materiaActual.getIdMateria());
            materiaActual=null;
            LimpiarCampos();
        }else {
        JOptionPane.showMessageDialog(this,"No hay una materia seleccionada");

        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int idMateria=Integer.parseInt(jtIdMateria.getText());
        
//              int idMateria = Integer.parseInt(codigo.getText());
//        
//        MateriaData materiaG = new MateriaData();
//        Materia mate = new Materia();
//       mate = materiaG.buscarMateria(idMateria);
//        
//        if (materiaG != null) {
//            nombre.setText(mate.getNombre());
//            nivel.setText(String.valueOf(mate.getAñoMateria()));
//            bEstado.setSelected(mate.isActivo());
//        }
       try{
       //int idMateria=Integer.parseInt(jtIdMateria.getText());
        
        //Integer anio=Integer.parseInt(jtAnio.getText()); Lo deshabilité xq
        //sino me salía cartel"Ud debe ingresar un código válido". Así funciona
        //salvo que no me sale el nombre de la materia. Me sale "nombre"
        materiaActual=matData.buscarMateria(idMateria);
        //if(materiaActual!=null){
        if(matData!=null){
            jtNombre.setText(materiaActual.getNombre());
            jtAnio.setText(String.valueOf(materiaActual.getAnio()));
            //jtAnio.setText(materiaActual.getAnio());
            jrbEstado.setSelected(materiaActual.isActivo());}
        
        
           
        }catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(this,"Ud debe ingresar un código válido");
    }                                        
    }
    
    {                                         
        // TODO add your handling code here:
//        LimpiarCampos();
//        materiaActual=null;
        
        
    }  
    
        private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try{
        int idMateria=Integer.parseInt(jtIdMateria.getText());
        String nombre = jtNombre.getText();
        int anio=Integer.parseInt(jtAnio.getText());//será igual que
        //en buscar. Allá lo deshabilité
        
        
            if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this,"No puede haber campos vacíos");
            return;
        }
            Boolean estado=jrbEstado.isSelected();
            if(materiaActual==null){
            //int anio = 1;//esta incialización (puso un 0) me la hizo cuando acepté LR para que "anio"
            //de acá abajo me lo acepte
                materiaActual=new Materia(nombre, anio, estado);
                
                matData.guardarMateria(materiaActual);
                
                //alumnoActual=new Alumno(dni, apellido, nombre, fechaNac,estado);
                //aluData.guardarAlumno(alumnoActual);
                
            }else{
               // materiaActual.setNombre(nombre);
                materiaActual.setNombre("nombre");//consejo de Gian
                
                //No pongo el estado xq no debería dejar que cambie el estado
                matData.modificarMateria(materiaActual);
                
            }

        
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Ud debe ingresar un código válido");
            
            
            
        }}
        
        private void LimpiarCampos(){
        
        jtIdMateria.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jrbEstado.setSelected(true);
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVaciar;
    private javax.swing.JLabel jlAnio;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlIdMateria;
    private javax.swing.JLabel jlMateria;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtIdMateria;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
