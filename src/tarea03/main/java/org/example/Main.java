package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(4);
        Expendedor exp1 = new Expendedor(3);
        Moneda moneda1 = new Moneda1000();
        Moneda moneda2 = new Moneda100();
        Moneda moneda3 = new Moneda500();
        Moneda moneda4 = new Moneda500();

        System.out.println("Valor de las Bebidas y dulces: $");
        System.out.println("Valor de una cocacola $" + exp.queprecio(precioProducto.cocacola));
        System.out.println("Valor de una sprite $" + exp.queprecio(precioProducto.sprite));
        System.out.println("Valor de un snickers $" + exp.queprecio(precioProducto.snickers));
        System.out.println("Valor de un super8 $" + exp.queprecio(precioProducto.super8)+ "\n");
        //System.out.println("-----Compra-----");

        //simular compra compradorUno
        Comprador compradorUno = new Comprador(moneda1, 1, 1, exp);
        //System.out.println("-----Compra 1-----");
        System.out.println("Moneda: " + moneda1.getValor());
        System.out.println("Sabor: " + compradorUno.queCompraste());
        System.out.println("Vuelto: " + compradorUno.cuantoVuelto());
        System.out.println();

        //simular compra compradorUno
        Comprador compradorccd = new Comprador(moneda1, 1, 1, exp);
        //System.out.println("-----Compra 1-----");
        System.out.println("Moneda: " + moneda1.getValor());
        System.out.println("Sabor: " + compradorUno.queCompraste());
        System.out.println("Vuelto: " + compradorUno.cuantoVuelto());
        System.out.println();

        //simular compra compradorUno
        Comprador compradorcct = new Comprador(moneda1, 1, 1, exp);
        //System.out.println("-----Compra 1-----");
        System.out.println("Moneda: " + moneda1.getValor());
        System.out.println("Sabor: " + compradorUno.queCompraste());
        System.out.println("Vuelto: " + compradorUno.cuantoVuelto());
        System.out.println();

        Comprador compradorccq = new Comprador(moneda1,1, 1, exp);
        //System.out.println("-----Compra 1-----");
        System.out.println("Moneda: " + moneda1.getValor());
        System.out.println("Sabor: " + compradorUno.queCompraste());
        System.out.println("Vuelto: " + compradorUno.cuantoVuelto());
        System.out.println();

        Comprador compradorccc = new Comprador(moneda1, 1, 1, exp);
        //System.out.println("-----Compra 1-----");
        System.out.println("Moneda: " + moneda1.getValor());
        System.out.println("Sabor: " + compradorUno.queCompraste());
        System.out.println("Vuelto: " + compradorUno.cuantoVuelto());
        System.out.println();

        Comprador compradorccss = new Comprador(moneda1, 1, 1, exp);
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
        Comprador compradorTres = new Comprador(moneda3, 1, 2, exp1);
        //System.out.println("-----Compra 3-----");
        System.out.println("Moneda: " + moneda3.getValor());
        System.out.println("Sabor: " + compradorTres.queCompraste());
        System.out.println("Vuelto: " + compradorTres.cuantoVuelto());
        System.out.println();

        //probar dulces
        //compra 4
        System.out.println("compra dulce");
        Comprador compradorCuatro = new Comprador(moneda4, 2, 1, exp1);
        System.out.println("Moneda: " + moneda4.getValor());
        System.out.println("Sabor: " + compradorCuatro.queCompraste());
        System.out.println("Vuelto: " + compradorCuatro.cuantoVuelto());
        System.out.println();

        //compra 5
        Comprador compradorCinco = new Comprador(moneda3, 2, 2, exp1);
        System.out.println("Moneda: " + moneda3.getValor());
        System.out.println("Sabor: " + compradorCinco.queCompraste());
        System.out.println("Vuelto: " + compradorCinco.cuantoVuelto());
        System.out.println();
    }
}