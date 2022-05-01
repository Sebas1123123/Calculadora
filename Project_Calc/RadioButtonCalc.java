/**
 * Clase para crear botones de seleccion.
 * Adaptado de un ejemplo en https://docs.oracle.com/javase/tutorial/uiswing/examples/components/RadioButtonDemoProject
 * y de https://www.geeksforgeeks.org/jradiobutton-java-swing
 * 
 *
 * @author Sebastián España
 * @author Sebastián Baltodano
 * @author Carlos Durán
 * @version 29-04-2022
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonCalc extends JFrame
{
    // Declaración de etiquetas para los botones
    static String metroAPie = "Metros a pies";
    static String pieAMetro = "Pies a metros";
    static String cmAPulgada = "Centímetros a pulgadas";
    static String pulgadaACm = "Pulgadas a centrímetros";
    static String celAFar = "Celsius a Farenheit";
    static String farACel = "Farenheit a Celsius";
    static String kmAMilla = "Kilómetros a millas";
    static String millaAKm = "Millas a kilómetros";

    public RadioButtonCalc() 
    { //Constructor de la clase
        this.setLayout(null);
        
        Calculadora calc = new Calculadora(); // instancia para los calculos de conversiones
        
        //Creación de selectores y coordenadas en la pantalla
        JRadioButton metroAPieButton = new JRadioButton(metroAPie);
        metroAPieButton.setBounds(120, 80, 190, 50);
        JRadioButton pieAMetroButton = new JRadioButton(pieAMetro);
        pieAMetroButton.setBounds(120, 110, 190, 50);
        JRadioButton cmAPulgadaButton = new JRadioButton(cmAPulgada);
        cmAPulgadaButton.setBounds(120, 140, 190, 50);
        JRadioButton pulgadaACmButton = new JRadioButton(pulgadaACm);
        pulgadaACmButton.setBounds(120, 170, 190, 50);
        JRadioButton celAFarButton = new JRadioButton(celAFar);
        celAFarButton.setBounds(400, 80, 190, 50);
        JRadioButton farACelButton = new JRadioButton(farACel);
        farACelButton.setBounds(400, 110, 190, 50);
        JRadioButton kmAMillaButton = new JRadioButton(kmAMilla);
        kmAMillaButton.setBounds(400, 140, 190, 50);
        JRadioButton millaAKmButton = new JRadioButton(millaAKm);
        millaAKmButton.setBounds(400, 170, 190, 50);

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(metroAPieButton);
        group.add(pieAMetroButton);
        group.add(cmAPulgadaButton);
        group.add(pulgadaACmButton);
        group.add(celAFarButton);
        group.add(farACelButton);
        group.add(kmAMillaButton);
        group.add(millaAKmButton);
        
        JLabel lblEntrada = new JLabel("Ingrese el valor a convertir: ");
        lblEntrada.setBounds(120, 10, 200, 50);
        
        JTextField entradaDato = new JTextField(10);
        entradaDato.setBounds(290, 20, 100, 30);
        
        JLabel etiqueta = new JLabel("Seleccione: ");
        etiqueta.setBounds(310, 50, 150, 50);
        
        JButton boton = new JButton("Calcular");
        boton.setBounds(350, 230, 80, 30);

        //Agregar elementos a JFrame
        this.add(metroAPieButton);
        this.add(pieAMetroButton);
        this.add(cmAPulgadaButton);
        this.add(pulgadaACmButton);
        this.add(celAFarButton);
        this.add(farACelButton);
        this.add(kmAMillaButton);
        this.add(millaAKmButton);
        this.add(etiqueta);
        this.add(boton);
        this.add(lblEntrada);
        this.add(entradaDato);

        boton.addActionListener(new ActionListener() 
            {
                // Anonymous class.
                public void actionPerformed(ActionEvent e)
                {
                    // Override Method
                    // Declaration of String class Objects.
                    double resultado = 0.0;

                    // If condition to check if jRadioButton2 is selected.
                    if (metroAPieButton.isSelected()) 
                    {
                        resultado = calc.metroAPie(Double.parseDouble(entradaDato.getText()));
                    }

                    else if (pieAMetroButton.isSelected()) 
                    {
                        resultado = calc.pieAMetro(Double.parseDouble(entradaDato.getText()));
                    }
                    else if (cmAPulgadaButton.isSelected()) 
                    {
                        resultado = calc.cmAPulgada(Double.parseDouble(entradaDato.getText()));
                    }
                    else if (pulgadaACmButton.isSelected()) 
                    {
                        resultado = calc.pulgadaACm(Double.parseDouble(entradaDato.getText()));
                    }
                    else if (celAFarButton.isSelected()) 
                    {
                        resultado = calc.celAFar(Double.parseDouble(entradaDato.getText()));
                    }
                    else if (farACelButton.isSelected()) 
                    {
                        resultado = calc.farACel(Double.parseDouble(entradaDato.getText()));
                    }
                    else if (kmAMillaButton.isSelected()) 
                    {
                        resultado = calc.kmAMilla(Double.parseDouble(entradaDato.getText()));
                    }
                    else if (millaAKmButton.isSelected()) 
                    {
                        resultado = calc.millaAKm(Double.parseDouble(entradaDato.getText()));
                    }
                    else
                    {
                        resultado = 0.0;
                    }

                    // MessageDialog para mostrar la informacion de la conversión.
                    JOptionPane.showMessageDialog(RadioButtonCalc.this, "El resultado es: " + resultado);
                }
            });

    }
}
