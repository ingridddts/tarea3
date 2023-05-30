package tarea03;
//1: tipo bebida:
    //1:cocacola
    //2:sprite
//2: tipo dulce
    //1: snickers
    //2: super8
class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito snickers;
    private Deposito super8;
    private DepositoVuelto dv;
    private int precio; //precio del producto que puede ser dulce o bebida
    precioProducto precioProd;
    
    //constructor expendedor tiene como parametros el stock de productos y el precio de ellos.
    public Expendedor(int numProducto){
        //this.precio = precioProducto;
        coca = new Deposito();
        sprite = new Deposito();
        snickers = new Deposito();
        super8 = new Deposito();
        dv = new DepositoVuelto();
       
        /**
        precioProducto preciococa = precioProducto.
        precioProducto preciosp = preciosp.preciosprite;
        precioProducto preciosnic = preciosnic.preciosnickers;
        precioProducto precios8 = precios8.preciosuper8;        
        **/
     
        
        //Rellenar máquina con bebidas y dulces 
        for (int i = 0; i < numProducto; i++) { 
            CocaCola a= new CocaCola(100+i);
            coca.addBebida(a);
            Sprite b = new Sprite(200+i);
            sprite.addBebida(b);    
            Snickers s = new Snickers(300+i);
            snickers.addDulce(s);
            Super8 sup = new Super8(400+i);
            super8.addDulce(sup);
        }
    }
    
    public Producto comprarProducto(Moneda moneda, int tipo, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException{
        /*Vuelto en multiplos de 100*/
        //cualProducto cualProd = cualProducto.values()[cual];
        switch(tipo){
            case 1: //si es tipo bebida entra a este switch
                Bebida bebida = null;
                //se verifica que se insertó una moneda
                if(moneda == null){ //no se insertó moneda
                    throw new PagoIncorrectoException("Inserte dinero para comprar");
                }
                else{ //moneda correcta
                    //if(moneda.getValor() >= precio){
                    switch(cual){
                        case 1: //si es cocacola
                            int preciocc = queprecio(precioProducto.cocacola);
                            if(moneda.getValor() >= preciocc){
                                bebida = coca.getBebida();
                                if(bebida != null){ //si hay stock dicponible de cocacola
                                    //calcularVuelto
                                    int vuelto = moneda.getValor()- preciocc;
                                    while(vuelto > 0){
                                        dv.addMoneda(new Moneda100());
                                        vuelto = vuelto - 100;
                                    }
                                    return bebida;
                                }
                                else{ //si no hay stock se lanza excepción
                                    throw new NoHayProductoException("Bebida no disponible");
                                }
                            } //if precio
                            else{ //excepcion si se ingresa una moneda de menor valor al de la bebida
                                throw new PagoIncorrectoException("Saldo insuficiente");
                            }
                            
                        case 2: //si es sprite
                            int preciosp = queprecio(precioProducto.sprite);
                            if(moneda.getValor() >= preciosp){
                               bebida = sprite.getBebida();
                                    //int preciosp = queprecio(precioProducto.sprite);
                                if(bebida != null){ //si hay sprite en stock
                                    //calcularVuelto
                                    int vuelto = moneda.getValor()- preciosp;
                                    while(vuelto > 0){
                                        dv.addMoneda(new Moneda100() );
                                        vuelto = vuelto - 100;
                                    }
                                    return bebida;
                                }
                                else{ //si no hay stock, se lanza excepción
                                    throw new NoHayProductoException("Bebida no disponible");
                                }  
                            } //if precio
                            else{ //excepcion si se ingresa una moneda de menor valor al de la bebida
                                throw new PagoIncorrectoException("Saldo insuficiente");
                            }
                            //caso numero erroneo
                            default:
                                throw new NoHayProductoException("No hay bebida disponible");
                    } //switch        
                }//else
        
            case 2: //si es tipo dulce entra a este switch
                Dulce dulce = null;
        
                if(moneda == null){ //si no se inserta moneda, lanza excepcion
                    throw new PagoIncorrectoException("Inserte dinero para comprar");
                }
                else{ //si la moneda es correcta 
                    switch(cual){
                        case 1: //si compra un snickers
                            int preciosn = queprecio(precioProducto.snickers);
                            if(moneda.getValor() >= precio){
                                dulce = snickers.getDulce();
                                if(dulce != null){ //si hay stock
                                    //calcularVuelto
                                    int vuelto= moneda.getValor()- preciosn;
                                    while(vuelto > 0){
                                        dv.addMoneda(new Moneda100());
                                        vuelto = vuelto - 100;
                                    }
                                    return dulce;
                                } //if de producto no null
                                else{ //si no hay dulce en stock, se lanza excepcion
                                    throw new NoHayProductoException("Dulce no disponible");
                               }
                            } //if precio
                            else{ //excepcion si se ingresa una moneda de menor valor al de la bebida
                                throw new PagoIncorrectoException("Saldo insuficiente");
                            }
                                
                        case 2: //si se compra un super8
                            int preciosuper = queprecio(precioProducto.super8);
                            if(moneda.getValor() >= preciosuper){
                                dulce = super8.getDulce();
                                if(dulce != null){ //se verifica que haya stock
                                //calcularVuelto
                                    int vuelto= moneda.getValor()- preciosuper;
                                    while(vuelto > 0){
                                        dv.addMoneda(new Moneda100() );
                                        vuelto = vuelto - 100;
                                    }
                                    return dulce;
                                }
                                else{ //no hay stock, se lanza excepcion
                                    throw new NoHayProductoException("Dulce no disponible");
                                }  
                            } //if precio
                            else{ //excepcion si se ingresa una moneda de menor valor al de la bebida
                                throw new PagoIncorrectoException("Saldo insuficiente");
                            }
                        //caso numero erroneo
                        default:
                            throw new NoHayProductoException("No hay Dulces disponibles");
                    } //switch
                } //else    
            default:
                 throw new NoHayProductoException("No hay producto disponible");
        }//switch
        
   } 
    //devuelve una moneda del deposito
    public Moneda getVuelto(){
        return dv.getMoneda();    
    }     
    
    //devuelve el precio de la bebida
    public int getPrecioBebida(){
        return this.precio;
    }
    
    //devuelve el precio del dulce
    public int getPrecioDulce(){
        return this.precio;
    }
    
    public int queprecio(precioProducto precioProd){
        //precioProd = precioProducto.cocacola;
            switch(precioProd){
                case cocacola:
                    return precio = 900;
                case sprite:
                    return precio = 800;
                case snickers:
                    return precio = 700;
                case super8: 
                    return precio = 400;
            }
            return precio;
    }
    
}
