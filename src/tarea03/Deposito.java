package tarea03;

import java.util.ArrayList;
/**
 * Esta clase contiene la existencia de cada uno de los productos vendidos por la máquina expendedora.
 * @param deposito contiene un arreglo del tipo bebida
 * @param deposito1 contiene un arreglo del tipo dulces
 */

class Deposito{
    private ArrayList<Bebida> deposito;
    private ArrayList<Dulce> deposito1;
    
    /**
     * constructor para crear el deposito y los arraylist de cada tipo
     */
    public Deposito(){
        deposito = new ArrayList<Bebida>();
        deposito1 = new ArrayList<Dulce>();
    }
    
    //agrega una bebida al arraylist de bebidas
    public void addBebida(Bebida bebida){
        deposito.add(bebida);
    }
   
    //agrega un dulce al arraylist de dulces
    public void addDulce(Dulce dulce){
        deposito1.add(dulce);
    }
 
    /**
     * @return devuelve si hay bebida disponible en el depósito, de haber disponibilidad, se realiza la compra.
     */
    public Bebida getBebida(){
        if(deposito.isEmpty()){
             return null; //si no hay bebidas
        }
        else{ //en el caso que hay dicponibilidad de bebida, se realiza la compra
            Bebida bebida = deposito.get(0);
            deposito.remove(0);
            return bebida;
        }
    }
    /**
     * @return devuelve si hay dulces disponibles en el depósito, de ser así, se realiza la compra
     */
    public Dulce getDulce(){
        if(deposito1.size() == 0){
             return null; //si el deposito de dulces esta vacio
        }
        else{ //si hay stock, el dulce es comprado
            Dulce dulce = deposito1.get(0);
            deposito1.remove(0);
            return dulce;
        }
    }
   
}
