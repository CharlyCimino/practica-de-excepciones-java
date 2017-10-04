
package practicadeexcepciones;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

public class VistaCalculadora extends javax.swing.JFrame 
{
    public VistaCalculadora() {
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
    
    public void resolverListener(ActionListener al)
    {
        this.jButtonResolver.addActionListener(al);
    }
    
    public void cargarOperadores(char[] operadores) {
        for (int i = 0; i < operadores.length; i++) {
            this.jComboBoxOperador.addItem( operadores[i] + "" );
        }
    }
    
    public int obtenerPrimerValor() {
        int valor = 0;
        try {
            valor = Integer.valueOf( this.jTextFieldNumero1.getText() );
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NO VALIDO");
        }
        return valor;
    }
    
    public int obtenerSegundoValor() {
        return Integer.valueOf( this.jTextFieldNumero2.getText() );
    }
    
    public int obtenerOperador() {
        return this.jComboBoxOperador.getSelectedIndex();
    }
    
    public void mostrarResultado (double resultado) {
        this.jLabelResultado.setText("El resultado es " + resultado);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonResolver = new javax.swing.JButton();
        jComboBoxOperador = new javax.swing.JComboBox<>();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(237, 244, 252));
        setResizable(false);

        jButtonResolver.setBackground(new java.awt.Color(255, 102, 102));
        jButtonResolver.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonResolver.setText("Resolver");

        jComboBoxOperador.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jTextFieldNumero1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextFieldNumero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumero1.setToolTipText("");

        jTextFieldNumero2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextFieldNumero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumero2.setToolTipText("");

        jLabelResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelResultado.setText("El resultado es:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelResultado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelResultado)
                .addGap(18, 18, 18)
                .addComponent(jButtonResolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResolver;
    private javax.swing.JComboBox<String> jComboBoxOperador;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    // End of variables declaration//GEN-END:variables

}
