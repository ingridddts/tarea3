package org.example;

class Comprador{
    private String sabor;
    private int monedavuelto;

    /**
     * Constructor
     * @param moneda con cuánto dinero compró
     * @param tipoProducto qé tipo de producto compró
     * @param cualProducto producto exacto seleccionado
     * @param exp se pasa como parámetro datos del expendedor
     */
    public Comprador(Moneda moneda, int tipoProducto, int cualProducto, Expendedor exp){
        this.monedavuelto=0;
        //Bebida a = exp.comprarBebida(moneda, cualBebida);
        Producto varProducto;

        //excepcion de la compra
        try{
            //si la compra es realizada, se muestran los datos
            varProducto = exp.comprarProducto(moneda, tipoProducto, cualProducto);
            sabor = varProducto.sabor();
            System.out.println("Compra realizada");
            // de lo contrario se muestra null porque no se realizó la compra
        } catch(PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e){
            sabor = null;
            System.out.println(e.getMessage());
        }

        Moneda vMoneda = exp.getVuelto();
        while(vMoneda != null){
            monedavuelto = monedavuelto + vMoneda.getValor();
            vMoneda = exp.getVuelto();
        }
    }

    /**
     * @return devuelve cuánto es el vuelto del comprador
     */
    public int cuantoVuelto(){
        return monedavuelto;
    }

    /**
     * @return devuelve el sabor del producto comprado
     */
    public String queCompraste() {
        return sabor;
    }
}
