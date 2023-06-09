package org.example;

/**
 * clase abstracta que hereda de la clase producto y almacena atributos del producto ofrecido
 * @param serie: número de serie del dulce
 */

abstract class Dulce extends Producto{
    private int serie; //codigo dulce

    //constructor
    public Dulce(int serie){
        super(serie);
    }

    /**
     * @return número de serie del producto
     */
    @Override
    public int getSerie(){
        return serie;
    }
    /**
     * @return sabor del dulce
     */
    @Override
    public abstract String sabor();
}
