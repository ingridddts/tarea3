package tarea03;
/**
 * Esta clase contiene datos sobre el dinero ingresado a la máquina expendedora
 * @param Arraylist de tipo moneda, que almacena la(s) moneda(s) que fue(ron) ingresada(s)
 */

import java.util.ArrayList;

class DepositoVuelto{
    private ArrayList<Moneda> deposito;
    
    //constructor, inicializa array tipo moneda
    public DepositoVuelto(){
        deposito = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda m){
        deposito.add(m);  //agrega una moneda al arraylist de tipo moneda  
    }
    
    /**
     * determinar el vuelto
     * @return devuelve cuánto es el vuelto de la compra
     */
    public Moneda getMoneda(){
        if(deposito.isEmpty()){ 
            return null; //si no se inserta una moneda devuelve null
        }
        else{
            Moneda vuelto = deposito.get(0);
            deposito.remove(0); 
            return vuelto; //si se inserta moneda valida, devuelve el vuelto
        }
        
    }
}

