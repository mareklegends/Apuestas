/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuestas;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Apuestas extends javax.swing.JFrame {

    /**
     * Creates new form Apuestas
     */
    
    //ArrayList vEquipo = null;
    private ArrayList<Apuesta> vApuesta = null;
         private  int r3=0;
          private int r4=0;
       private Random r = null;
         private  Random r2 = null;
      
       
    
    
    
    
    
    
    
    public Apuestas() {
        initComponents();
        this.setTitle("Apuestas");
          r = new Random();
        r2 = new Random();
      
        
        //vEquipo = new ArrayList();
        vApuesta = new ArrayList();
        
        vApuesta.add(new Apuesta("bot", 3, 2, true));
        vApuesta.add(new Apuesta("bot2", 5, 4, true));
    
          r3 = r.nextInt(99);
        r4 = r2.nextInt(99);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelEquipos = new javax.swing.JLabel();
        jTextFieldEquipoLocal = new javax.swing.JTextField();
        jTextFieldEquipoVisitante = new javax.swing.JTextField();
        jLabelEquipoLocal = new javax.swing.JLabel();
        jLabelEquipoVisitante = new javax.swing.JLabel();
        jLabelApuestas = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelApuesta = new javax.swing.JLabel();
        jCheckBoxPagado = new javax.swing.JCheckBox();
        jButtonAddApostante = new javax.swing.JButton();
        jTextFieldGol = new javax.swing.JTextField();
        jTextFieldGol2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jButtonComprobarApuestas = new javax.swing.JButton();
        jLabelResultadoTexto = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jLabelResultadoFinal = new javax.swing.JLabel();
        jLabelNombresEquipos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanelPrincipalFocusLost(evt);
            }
        });

        jLabelEquipos.setText("Equipos");

        jTextFieldEquipoLocal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEquipoLocalFocusLost(evt);
            }
        });

        jLabelEquipoLocal.setText("Equipo Local:");

        jLabelEquipoVisitante.setText("Equipo Visitante:");

        jLabelApuestas.setText("Apuestas");

        jLabelNombre.setText("Nombre:");

        jLabelApuesta.setText("Apuesta:");

        jCheckBoxPagado.setText("Pagado");

        jButtonAddApostante.setText("Añadir Apostante");
        jButtonAddApostante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddApostanteMouseClicked(evt);
            }
        });

        jTextFieldGol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldGolFocusLost(evt);
            }
        });
        jTextFieldGol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGolActionPerformed(evt);
            }
        });

        jTextFieldGol2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldGol2FocusLost(evt);
            }
        });
        jTextFieldGol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGol2ActionPerformed(evt);
            }
        });

        jLabel1.setText("     -");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEquipoLocal)
                            .addComponent(jLabelEquipoVisitante)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelApuestas)
                            .addComponent(jLabelEquipos)
                            .addComponent(jLabelApuesta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                                    .addComponent(jTextFieldEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22))
                                .addComponent(jTextFieldEquipoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxPagado)
                                    .addComponent(jButtonAddApostante)
                                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                            .addComponent(jTextFieldGol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldGol2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEquipos)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEquipoLocal))
                .addGap(28, 28, 28)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEquipoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEquipoVisitante))
                .addGap(40, 40, 40)
                .addComponent(jLabelApuestas)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApuesta)
                    .addComponent(jTextFieldGol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxPagado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddApostante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        jButtonComprobarApuestas.setText("Comprobar Apuestas");
        jButtonComprobarApuestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonComprobarApuestasMouseClicked(evt);
            }
        });

        jLabelResultadoTexto.setText("Resultado");

        jLabelResultadoFinal.setText("0 - 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(jButtonComprobarApuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResultadoTexto)
                            .addComponent(jLabelResultado)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelResultadoFinal))
                            .addComponent(jLabelNombresEquipos))
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelNombresEquipos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelResultadoTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelResultadoFinal)
                .addGap(29, 29, 29)
                .addComponent(jLabelResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonComprobarApuestas)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldGol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGol2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGol2ActionPerformed

    private void jTextFieldGolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGolActionPerformed

    private void jButtonAddApostanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddApostanteMouseClicked
        // TODO add your handling code here:
        
        Apuesta a = null;
        
        String nombre = jTextFieldNombre.getText();
        
       
        
        int gol1 = Integer.valueOf(jTextFieldGol.getText());
        int gol2 = Integer.valueOf(jTextFieldGol2.getText());
        
        
        if(jCheckBoxPagado.isSelected()==true){
          a = new Apuesta(nombre, gol1, gol2, true);
        }else{
          a = new Apuesta(nombre, gol1, gol2, false);  
        }
        
        vApuesta.add(a);      
      
      
    }//GEN-LAST:event_jButtonAddApostanteMouseClicked

    private void jTextFieldEquipoLocalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEquipoLocalFocusLost
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jTextFieldEquipoLocalFocusLost

    private void jPanelPrincipalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanelPrincipalFocusLost
        // TODO add your handling code here:
        
        String l = jTextFieldEquipoLocal.getText();
        String v = jTextFieldEquipoVisitante.getText();
        
        String equiposfinal =""+ l + " - " + v + "";
        
        jLabelNombresEquipos.setText(equiposfinal);
        
        jTextFieldEquipoLocal.setEditable(false);
        jTextFieldEquipoVisitante.setEditable(false);
    }//GEN-LAST:event_jPanelPrincipalFocusLost

    private void jButtonComprobarApuestasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonComprobarApuestasMouseClicked
        // TODO add your handling code here:
        
       
        jLabelResultadoFinal.setText(""+r3+" - "+r4+"");
        
          //error aqui
        String datos = "";
        double dinero = 5;
        for (int i = 0; i < vApuesta.size(); i++) {       
            if(vApuesta.get(i)!=null){
                if (vApuesta.get(i).getAlocal()==r3 && vApuesta.get(i).getAvisitante()==r4) {
                    datos+=" ["+vApuesta.get(i).isPagado()+"] "+vApuesta.get(i).getNombre()+" ha ganado "+dinero+"€ !!!!!!!"+"\n";
                } else {
                   datos+=" ["+vApuesta.get(i).isPagado()+"] "+vApuesta.get(i).getNombre()+" la apuesta no sirve"+"\n"; 
                }
          
          }
        }
        jTextAreaResultado.setEditable(false);
        jTextAreaResultado.setText(datos);
        
        
    }//GEN-LAST:event_jButtonComprobarApuestasMouseClicked

    private void jTextFieldGolFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldGolFocusLost
        // TODO add your handling code here:
        
         Pattern p = Pattern.compile("[0-9][0-9]?"); 
                       
        Matcher m = p.matcher(jTextFieldGol.getText());
       
        if(!m.matches()){
            JOptionPane.showMessageDialog(null,"Tiene que ser de 0 a 9");
        }
        
      
        
    }//GEN-LAST:event_jTextFieldGolFocusLost

    private void jTextFieldGol2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldGol2FocusLost
        // TODO add your handling code here:
          Pattern p = Pattern.compile("[0-9][0-9]?"); 
         Matcher m2 = p.matcher(jTextFieldGol2.getText());
          if(!m2.matches()){
            JOptionPane.showMessageDialog(null,"Tiene que ser de 0 a 9");
        }
        
    }//GEN-LAST:event_jTextFieldGol2FocusLost

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
            java.util.logging.Logger.getLogger(Apuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apuestas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddApostante;
    private javax.swing.JButton jButtonComprobarApuestas;
    private javax.swing.JCheckBox jCheckBoxPagado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApuesta;
    private javax.swing.JLabel jLabelApuestas;
    private javax.swing.JLabel jLabelEquipoLocal;
    private javax.swing.JLabel jLabelEquipoVisitante;
    private javax.swing.JLabel jLabelEquipos;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombresEquipos;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelResultadoFinal;
    private javax.swing.JLabel jLabelResultadoTexto;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextField jTextFieldEquipoLocal;
    private javax.swing.JTextField jTextFieldEquipoVisitante;
    private javax.swing.JTextField jTextFieldGol;
    private javax.swing.JTextField jTextFieldGol2;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
