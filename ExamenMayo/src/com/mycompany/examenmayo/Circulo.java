package com.mycompany.examenmayo;

/**
 *  Clase que simula un círculo.
 * @author Víctor Manuel Hernández Esteban
 * @version 1.0
 */
public class Circulo {

    /**
     * Variable del tipo double para el radio del círculo
     */
    private double radio;
    /**
     * Variable del tipo String para el color del círculo
     */
    private String color;
    /**
     * Variable del tipo int con el número de círculos creados.
     */
    private static int numCirculos;

    /**
     * Constructor de la clase Circulo
     * @param radio double con el valor del radio
     * @param color String con el color
     */
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    
    
    /**
     * Método para calcular el area del circulo
     * @return  devuelve double con el area calculada
     */
    public double calculoArea(){
        if (this.getRadio()<0)
            throw new IllegalArgumentException("Radio negativo");
        return (Math.pow(getRadio(), 2)*Math.PI);
    }
    
    /**
     * Método para calcular el perímetro del circulo
     * @return double con el perímetro del circulo.
     * @throws Exception excepciones en caso de que el radio sea negativo o el radio sea muy grande.
     */
    public double calculoPerimetro()throws Exception{
        if (this.getRadio()<0)
            throw new Exception ("Radio negativo");
        else if(getRadio()>=100)
            throw new Exception ("Radio muy grande");
        else 
            return (2*Math.PI*this.getRadio());
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numCirculos
     */
    public static int getNumCirculos() {
        return numCirculos;
    }

    /**
     * @param aNumCirculos the numCirculos to set
     */
    public static void setNumCirculos(int aNumCirculos) {
        numCirculos = aNumCirculos;
    }
    
}
