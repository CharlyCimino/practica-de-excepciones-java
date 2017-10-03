
package practicadeexcepciones;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class VistaSubte extends javax.swing.JFrame 
{
    public VistaSubte() {
        initComponents();
    }
    
    public void iniciarVista()
    {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // La aplicación por defecto se cierra al tocar la cruz
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.setVisible(true); // Hace la ventana visible
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/DibujoCaemci.png"));
        setIconImage(icon);
    }
    
    public void eleccionListener(ActionListener al)
    {
        this.jComboBoxLinea.addActionListener(al);
    }
    
    public void anteriorListener(ActionListener al)
    {
        this.jButtonAnterior.addActionListener(al);
    }
    
    public void siguienteListener(ActionListener al)
    {
        this.jButtonSiguiente.addActionListener(al);
    }
    
    public void pintar (Color c) {
        this.jLabelEstacion.setForeground(c);
        this.jButtonSiguiente.setBackground(c);
        this.jButtonAnterior.setBackground(c);
        this.jLabelEstacion.repaint();
        this.jButtonAnterior.repaint();
        this.repaint();
    }
    
    public void cargarLineas(String[] lineas) {
        for (int i = 0; i < lineas.length; i++) {
            this.jComboBoxLinea.addItem( lineas[i] + "" );
        }
    }
    
    public int obtenerIndiceEstacion() {
        return Integer.valueOf( this.jLabelIndice.getText() );
    }
    
    public int obtenerIndiceLineaSeleccionada() {
        return this.jComboBoxLinea.getSelectedIndex();
    }
    
    public void establecerEstacion(String estacion) {
        this.jLabelEstacion.setText(estacion);
    }
    
    public void establecerIndiceEstacion(int i) {
        this.jLabelIndice.setText(i + "");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxLinea = new javax.swing.JComboBox<>();
        jLabelEstacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAnterior = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jLabelIndice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colores");
        setBackground(new java.awt.Color(237, 244, 252));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Elegir linea");

        jComboBoxLinea.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabelEstacion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Usted está en estacion:");

        jButtonAnterior.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAnterior.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonAnterior.setText("<------");

        jButtonSiguiente.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSiguiente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonSiguiente.setText("------>");

        jLabelIndice.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelIndice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIndice.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIndice, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEstacion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxLinea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstacion)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAnterior)
                        .addComponent(jButtonSiguiente))
                    .addComponent(jLabelIndice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JComboBox<String> jComboBoxLinea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEstacion;
    private javax.swing.JLabel jLabelIndice;
    // End of variables declaration//GEN-END:variables
}
