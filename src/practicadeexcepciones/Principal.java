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
//                ControladorCalculadora cc = new ControladorCalculadora();
                ControladorSubte cs = new ControladorSubte();
//                cc.iniciar();
                cs.iniciar();
            }
        });
    }
}
