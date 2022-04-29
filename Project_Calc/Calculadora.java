
/**
 * Clase que realiza los cálculos para convertir entre diferentes medidas, por ejemplo
 * metro a pie (y viceversa), centímetro a pulgada, celsio a fahrenheit, kilómetro a milla.
 *
 * @author Sebastián
 * @author Sebastián España
 * @author Carlos Durán
 * @version 26-04-2022
 */
public class Calculadora
{
    public double metroAPie(double dato) {
        if (dato < 0.0)
            return 0.0;
        else
            return dato * 3.28084;
    }

    public double pieAMetro(double dato) {
        if (dato < 0.0)
            return 0;
        else
            return dato * (0.3048);
    }

    public double cmAPulgada(double dato) {
        if (dato < 0.0)
            return 0;
        else
            return dato * 0.393701;
    }

    public double pulgadaACm(double dato){
        if (dato < 0.0)
            return 0;
        else
            return dato * 2.54;
    }

    public double celAFar(double dato) {
        return (dato * 9.0/5.0) + 32;
    }

    public double farACel(double dato) {
        return (dato - 32) * 5.0/9.0;
    }

    public double kmAMilla(double dato) {
        if (dato < 0.0)
            return 0;
        else
            return dato * 0.621371;
    }

    public double millaAKm(double dato) {
        if (dato < 0.0)
            return 0;
        else
            return dato * 1.60934;
    }
}
