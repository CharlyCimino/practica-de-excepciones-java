
package practicadeexcepciones;

import java.awt.Color;

public class LineaDeSubte {
    private Color color;
    private String nombre;
    private String[] estaciones;

    public LineaDeSubte(Color color, String nombre, String[] estaciones) {
        this.color = color;
        this.nombre = nombre;
        this.estaciones = estaciones;
    }

    public Color getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public String obtenerEstacion(int i) {
        return this.estaciones[i];
    }
    
    
}
