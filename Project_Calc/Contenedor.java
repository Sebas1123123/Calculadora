import javax.swing.JFrame;
import javax.swing.JComponent;

/**
 * Clase contenedora para realizar pruebas de los métodos. Se tiene una interfaz
 * gráfica con un espacio para colocar una cifra y varias opciones, todas funcionales
 *
 * @author Sebastián
 * @author Sebastián España
 * @author Carlos Durán
 * @version 26-04-2022
 */

public class Contenedor
{

    public static void main(String args[]) {
        RadioButtonCalc f = new RadioButtonCalc();

        // Tamaño de la pantalla de la calculadora.
        f.setBounds(200, 200, 800, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Título de la aplicación.
        f.setTitle("Calculadora de unidades de medida");

        // Visibilidad de la pantalla.
        f.setVisible(true);
    }
}
