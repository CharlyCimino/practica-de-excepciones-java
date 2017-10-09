
package practicadeexcepciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorSubte 
{
    private VistaSubte v;
    private ArrayList<LineaDeSubte> lineas;
    private int lineaSeleccionada;
    private int estacionSeleccionada;

    public ControladorSubte() {
        this.lineas = new ArrayList<LineaDeSubte>();
        generarLineasDeSubte();
    }
    
    public void iniciar()
    {
        this.v = new VistaSubte();
        this.v.eleccionListener( new EleccionDeLineaHandler() );
        this.v.anteriorListener( new AnteriorHandler() );
        this.v.siguienteListener( new SiguienteHandler() );
        this.v.cargarLineas( obtenerNombresDeEstaciones() );
        actualizarEstacionEnPantalla(0);
        this.v.iniciarVista(); // Le ordeno a la vista que se muestre
    }
    
    private String[] obtenerNombresDeEstaciones() {
        String[] nombres = new String[this.lineas.size()];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = this.lineas.get(i).getNombre();
        }
        return nombres;
    }
    
    private void actualizarEstacionEnPantalla(int sentido)
    {
        try {
            estacionSeleccionada = v.obtenerIndiceEstacion() + sentido;
            v.establecerIndiceEstacion( estacionSeleccionada );
            v.establecerEstacion( lineas.get( lineaSeleccionada ).obtenerEstacion( estacionSeleccionada ) );
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            v.establecerEstacion("FUERA DE LIMITE");
        }
        
    }
    
    private class AnteriorHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            actualizarEstacionEnPantalla(-1);
        }
    }
    
    private class SiguienteHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            actualizarEstacionEnPantalla(1);
        }
    }
    
    private class EleccionDeLineaHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            lineaSeleccionada = v.obtenerIndiceLineaSeleccionada();
            v.pintar( lineas.get(lineaSeleccionada).getColor() );
            actualizarEstacionEnPantalla(0);
        }
    }
    
    private void generarLineasDeSubte() {
        String[] estacionesA = {"San Pedrito",
                                "San José de Flores",
                                "Carabobo",
                                "Puan",
                                "Primera Junta",
                                "Acoyte	",
                                "Río de Janeiro",
                                "Castro Barros",
                                "Loria",
                                "Plaza Miserere",
                                "Alberti",
                                "Pasco",
                                "Congreso",
                                "Sáenz Peña",
                                "Lima",
                                "Piedras",
                                "Perú",
                                "Plaza de Mayo"};
        String[] estacionesB = {"Juan Manuel de Rosas",
                                "Echeverría",
                                "De los Incas",
                                "Tronador",
                                "Federico Lacroze",
                                "Dorrego",
                                "Malabia Osvaldo Pugliese",
                                "Ángel Gallardo",
                                "Medrano",
                                "Carlos Gardel",
                                "Pueyrredón",
                                "Pasteur",
                                "Callao",
                                "Uruguay",
                                "Carlos Pellegrini",
                                "Florida",
                                "Leandro N. Alem"};
        String[] estacionesC = {"Constitución",
                                "San Juan",
                                "Independencia",
                                "Moreno",
                                "Avenida de Mayo",
                                "Diagonal Norte",
                                "Lavalle",
                                "General San Martín",
                                "Retiro"};
        String[] estacionesD = {"Congreso de Tucumán",
                                "Juramento",
                                "José Hernández",
                                "Olleros",
                                "Ministro Carranza",
                                "Palermo",
                                "Plaza Italia",
                                "Scalabrini Ortiz",
                                "Bulnes",
                                "Agüero",
                                "Pueyrredón",
                                "Facultad de Medicina",
                                "Callao",
                                "Tribunales",
                                "9 de Julio",
                                "Catedral"};
        String[] estacionesE =  {"Plaza de los Virreyes",
                                "Varela",
                                "Medalla Milagrosa",
                                "Emilio Mitre",
                                "José María Moreno",
                                "Avenida La Plata",
                                "Boedo",
                                "General Urquiza",
                                "Jujuy",
                                "Pichincha",
                                "Entre Ríos",
                                "San José",
                                "Constitución",
                                "Independencia",
                                "Belgrano",
                                "Bolívar",
                                "Correo Central",
                                "Catalinas",
                                "Retiro"};
        String[] estacionesH =  {"Sáenz",
                                "Hospitales",
                                "Parque Patricios",
                                "Caseros",
                                "Inclán",
                                "Humberto I",
                                "Venezuela",
                                "Once",
                                "Corrientes",
                                "Córdoba",
                                "Sante Fe",
                                "Las Heras",
                                "Facultad de Derecho",
                                "Padre Mugica",
                                "Terminal de Ómnibus",
                                "Retiro"};
        
        Color a = new Color (0, 175, 221);
        Color b = new Color (239, 20, 40);
        Color c = new Color (0, 104, 180);
        Color d = new Color (0, 129, 102);
        Color e = new Color (107, 25, 127);
        Color h = new Color (254, 210, 1);
        this.lineas.add( new LineaDeSubte ( a, "Linea A", estacionesA ) );
        this.lineas.add( new LineaDeSubte ( b, "Linea B", estacionesB ) );
        this.lineas.add( new LineaDeSubte ( c, "Linea C", estacionesC ) );
        this.lineas.add( new LineaDeSubte ( d, "Linea D", estacionesD ) );
        this.lineas.add( new LineaDeSubte ( e, "Linea E", estacionesE ) );
        this.lineas.add( new LineaDeSubte ( h, "Linea H", estacionesH ) );
    }
}
