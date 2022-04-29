import javax.swing.JFrame;
import javax.swing.JComponent;

/**
 * Clase contenedora para realizar pruebas de los métodos. Se tiene una interfaz
 * gráfica
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

        // Setting Bounds of JFrame.
        f.setBounds(200, 200, 800, 400);

        // Setting Title of frame.
        f.setTitle("Calculadora de unidades de medida");

        // Setting Visible status of frame as true.
        f.setVisible(true);
        /*Calculadora calc = new Calculadora();

        System.out.println("3.5 metros a pies: " + calc.metroAPie(3.5));
        System.out.println("0 metros a pies: " + calc.metroAPie(0));
        System.out.println("11.4829 pies a metros es: " + calc.pieAMetro(11.4829));
        System.out.println("7.8 centímetros a pulgadas es: " + calc.cmAPulgada(7.8));
        System.out.println("3.07086 pulgadas a centimetros es: " + calc.pulgadaACm(3.0708678000000003));
        System.out.println("120ºC a F es: " + calc.celAFar(120));
        System.out.println("248ºF a C es: " + calc.farACel(248));
        System.out.println("25 Km a millas es: " + calc.kmAMilla(25));
        System.out.println("15.5 millas a Km es: " + calc.millaAKm(15.5343));*/
    }
}
