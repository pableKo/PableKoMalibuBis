
package VistasM;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MenuViewM extends javax.swing.JFrame {

    
    public MenuViewM() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(500, 520);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/ulp/Recursos/iconos/paisaje/paisaje2.jpg"));
        Image miImagen=icono.getImage();
        jdpEscritorio = new javax.swing.JDesktopPane(){

            public void paintComponent (Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmiFormDelAlu = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiFormDeMat = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiManejoDeInsc = new javax.swing.JMenuItem();
        jmiManipuDeNotas = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiAluXMateria = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        jmAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ulp/Recursos/iconos/estudiante/leer50x50.png"))); // NOI18N

        jmiFormDelAlu.setText("Formulario del Alumno");
        jmiFormDelAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormDelAluActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiFormDelAlu);

        jMenuBar1.add(jmAlumno);

        jmMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ulp/Recursos/iconos/libros/libros(2)50x50.png"))); // NOI18N

        jmiFormDeMat.setText("Formulario de Materia");
        jmiFormDeMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormDeMatActionPerformed(evt);
            }
        });
        jmMateria.add(jmiFormDeMat);

        jMenuBar1.add(jmMateria);

        jmAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ulp/Recursos/iconos/inscripcion/registro-en-linea50x50.png"))); // NOI18N

        jmiManejoDeInsc.setText("Manejo de Inscripciones");
        jmiManejoDeInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoDeInscActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiManejoDeInsc);

        jmiManipuDeNotas.setText("Manipulación de Notas");
        jmAdministracion.add(jmiManipuDeNotas);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ulp/Recursos/iconos/consulta/buscar-archivo50x50.png"))); // NOI18N

        jmiAluXMateria.setText("Alumnos por Materia");
        jmConsultas.add(jmiAluXMateria);

        jMenuBar1.add(jmConsultas);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ulp/Recursos/iconos/salir/cerrar-sesion50x50.png"))); // NOI18N
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormDelAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormDelAluActionPerformed
        // TODO add your handling code here:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        FormularioAlumnoView  alumno = new FormularioAlumnoView();
        alumno.setVisible(true);
        alumno.getContentPane().setBackground(new Color(68, 167, 132));
        jdpEscritorio.add(alumno);
        jdpEscritorio.moveToFront(alumno);
    }//GEN-LAST:event_jmiFormDelAluActionPerformed

    private void jmiFormDeMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormDeMatActionPerformed
        // TODO add your handling code here:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        FormularioMateriaView  materia = new FormularioMateriaView();
        materia.setVisible(true);
        materia.getContentPane().setBackground(new Color(68, 167, 132));
        jdpEscritorio.add(materia);
        jdpEscritorio.moveToFront(materia);
    }//GEN-LAST:event_jmiFormDeMatActionPerformed

    private void jmiManejoDeInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoDeInscActionPerformed
        // TODO add your handling code here:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        InscripcionView  inscripcion = new InscripcionView();
        inscripcion.setVisible(true);
        inscripcion.getContentPane().setBackground(new Color(68, 167, 132));
        jdpEscritorio.add(inscripcion);
        jdpEscritorio.moveToFront(inscripcion);
    }//GEN-LAST:event_jmiManejoDeInscActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuViewM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuViewM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuViewM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuViewM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuViewM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAluXMateria;
    private javax.swing.JMenuItem jmiFormDeMat;
    private javax.swing.JMenuItem jmiFormDelAlu;
    private javax.swing.JMenuItem jmiManejoDeInsc;
    private javax.swing.JMenuItem jmiManipuDeNotas;
    // End of variables declaration//GEN-END:variables

    
}
