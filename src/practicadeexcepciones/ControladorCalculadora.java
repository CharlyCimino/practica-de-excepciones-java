
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
        int primerNumero = this.v.obtenerPrimerValor();
        int segundoNumero = this.v.obtenerSegundoValor();
        int operador = this.v.obtenerOperador();
        
        int resultado = resolver(primerNumero, segundoNumero, operador);
        
        this.v.mostrarResultado(resultado);
    }
    
    private int resolver (int n1, int n2, int op) {
        int res = 0;
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
