package org.example
/**
* Clase CocaCola que hereda de clase abstracta bebida
*/

class CocaCola extends Bebida{
    //constructor clase CocaCola
    public CocaCola(int i){
        super(i);
    }
    /**
    * @return sabor de la bebida, en ese caso coca cola
    */
    public String sabor(){
        String s = "cocacola";
        return s;
    }
}

