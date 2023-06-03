package org.example;

/**
* clase Bebida que hereda de clase producto.
* @param serie indica el numero de serie identificador de la bebida
*/

abstract class Bebida extends Producto{
    private int serie; //codigo bebida

    //constructor de la clase bebida
    public Bebida(int serie){
        super(serie);
    }

    /**
    * @return número de serie de la bebida
    */
    public int getSerie(){
        return serie;
    }

    /**
    * @return sabor de la bebida 
    */
    public abstract String sabor();
}
