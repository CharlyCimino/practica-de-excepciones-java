
package practicadeexcepciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora 
{
    private VistaCalculadora v;
    private char[] operadores;

    public ControladorCalculadora() {
        this.operadores = new char[] {'+','-','*','/'};
    }    

    public void iniciar()
    {
        this.v = new VistaCalculadora();
        this.v.cargarOperadores(this.operadores);
        this.v.resolverListener( new ResolverHandler() );
        this.v.iniciarVista(); // Le ordeno a la vista que se muestre
    }
    
    private void procesarResolucion() {
        double primerNumero = this.v.obtenerPrimerValor();
        double segundoNumero = this.v.obtenerSegundoValor();
        int operador = this.v.obtenerOperador();
        
        double resultado = resolver(primerNumero, segundoNumero, operador);
        
        this.v.mostrarResultado(resultado);
    }
    
    private double resolver (double n1, double n2, int op) {
        double res = 0;
        switch (op)
        {
            case 0: res = n1 + n2; break;
            case 1: res = n1 - n2; break;
            case 2: res = n1 * n2; break;
            case 3: res = n1 / n2; break;
        }
        return res;
    }
    
    private class ResolverHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            procesarResolucion();
        }
    }
}
