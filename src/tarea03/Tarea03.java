
package tarea03;

public class Tarea03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Expendedor exp = new Expendedor(2,500);
        Moneda moneda1 = new Moneda1000();
        Moneda moneda2 = new Moneda100();
        Moneda moneda3 = new Moneda500();
        CocaCola cc = new CocaCola(2);
        Sprite sp = new Sprite(2);
        //Fanta f = new Fanta(3);
        
        System.out.println("Valor de la Bebidas y dulces: $" + exp.getPrecioBebida() + "\n");
        //System.out.println("-----Compra-----");
        //simular compra compradorUno
        Comprador compradorUno = new Comprador(moneda1, 1, 1, exp);
        //System.out.println("-----Compra 1-----");
        System.out.println("Moneda: " + moneda1.getValor());
        System.out.println("Sabor: " + compradorUno.queCompraste());
        System.out.println("Vuelto: " + compradorUno.cuantoVuelto());
        System.out.println();
        
        //simular compra comprador2
        Comprador compradorDos = new Comprador(moneda2, 1, 2, exp);
        //System.out.println("-----Compra 2-----");
        System.out.println("Moneda: " + moneda2.getValor());
        System.out.println("Sabor: " + compradorDos.queCompraste());
        System.out.println("Vuelto: " + compradorDos.cuantoVuelto());
        System.out.println();
        
        //comprador 3
        Comprador compradorTres = new Comprador(moneda3,1, 2, exp);
        //System.out.println("-----Compra 3-----");
        System.out.println("Moneda: " + moneda3.getValor());
        System.out.println("Sabor: " + compradorTres.queCompraste());
        System.out.println("Vuelto: " + compradorTres.cuantoVuelto());
        System.out.println();
        
        //probar dulces
        //compra 4
        Comprador compradorCuatro = new Comprador(moneda1, 2, 1, exp);
        System.out.println("Moneda: " + moneda1.getValor());
        System.out.println("Sabor: " + compradorCuatro.queCompraste());
        System.out.println("Vuelto: " + compradorCuatro.cuantoVuelto());
        System.out.println();
        
        //compra 5
        Comprador compradorCinco = new Comprador(moneda3, 2, 2, exp);
        System.out.println("Moneda: " + moneda3.getValor());
        System.out.println("Sabor: " + compradorCinco.queCompraste());
        System.out.println("Vuelto: " + compradorCinco.cuantoVuelto());
        System.out.println();    
    }
    
}
