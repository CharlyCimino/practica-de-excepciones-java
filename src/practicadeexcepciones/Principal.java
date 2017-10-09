package practicadeexcepciones;

public class Principal 
{
    public static void main(String[] args) 
    {
        // Todo esto vino por defecto del JFrame que creó NetBeans
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                ControladorSubte cs = new ControladorSubte();
                ControladorCalculadora cc = new ControladorCalculadora();
                
                cs.iniciar();
                cc.iniciar();
            }
        });
    }
}
