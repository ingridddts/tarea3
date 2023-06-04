package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import javax.annotation.processing.SupportedAnnotationTypes;


class ExpendedorTest {
    private Expendedor expendedor;
    private Expendedor expendedord;
    private Comprador compradoruno, compradordos, compradorcinco, compradorseis;
    private Comprador compradortres, compradorcuatro;
    private DepositoVuelto depositovuelto;
    private Producto producto;
    private Moneda moneda;
    private Moneda1000 moneda1000;
    private Moneda500 moneda500;
    private Moneda100 moneda100;
    private Moneda monedann;

    @BeforeEach
    void setUp(){
        expendedor = new Expendedor(3);
        expendedord = new Expendedor(5);
        moneda1000 = new Moneda1000();
        moneda500 = new Moneda500();
        moneda100 = new Moneda100();
        compradoruno = new Comprador(moneda1000, 1, 1, expendedor);
        compradordos = new Comprador(moneda1000, 1, 2, expendedor);
        compradortres = new Comprador(moneda1000, 2, 1, expendedord);
        compradorcuatro = new Comprador(moneda500, 2, 2, expendedord);
        depositovuelto = new DepositoVuelto();
    }

    @Test
    @DisplayName("Test UNA bebida")
    public void testComprarUnaBebida() throws Exception{
        assertNotNull(expendedor.comprarProducto(moneda1000,  1, 1));
    }

    @Test
    @DisplayName("Comprar TRES bebidas")
    public void testComprarTresBebidas() throws Exception{
        assertNotNull(expendedor.comprarProducto(moneda1000,  1, 1));
        assertNotNull(expendedor.comprarProducto(moneda1000,  1, 2));
        assertNotNull(expendedor.comprarProducto(moneda1000,  1, 1));
    }

    @Test
    @DisplayName("Test UN dulce")
    public void testComprarUnDulce() throws Exception{
        assertNotNull(expendedor.comprarProducto(moneda1000,  2, 1));
    }

    @Test
    @DisplayName("Comprar cuatro dulces")
    public void testComprarCuatroDulces() throws Exception{
        assertNotNull(expendedor.comprarProducto(moneda1000,  2, 1));
        assertNotNull(expendedor.comprarProducto(moneda1000,  2, 2));
        assertNotNull(expendedor.comprarProducto(moneda1000,  2, 1));
        assertNotNull(expendedor.comprarProducto(moneda500,  2, 2));
    }

    @Test
    @DisplayName("Comprar sin dinero")
    public void testComprarsinmoneda() throws PagoInsuficienteException {
        compradorseis = new Comprador(null, 1,1,expendedor);
        assertEquals(compradoruno.queCompraste(), "cocacola");
    }

    @Test
    @DisplayName("Stock insuficiente")
    public void testStockInsuficientedulces() throws Exception{
        assertNotNull(expendedord.comprarProducto(moneda1000,  2, 1));
        assertNotNull(expendedord.comprarProducto(moneda1000,  2, 1));
        assertNotNull(expendedord.comprarProducto(moneda1000,  2, 1));
        assertNotNull(expendedord.comprarProducto(moneda1000,  2, 1));
        compradorcinco = new Comprador(moneda1000, 2, 1, expendedord);
        assertNotEquals(compradorcinco.queCompraste(), "Snickers");
    }

    @Test
    @DisplayName("Saldo insuficiente")
    public void testsaldoinsuficiente() throws Exception{
        compradorcinco = new Comprador(moneda100, 1, 1, expendedor);
        assertNotEquals(compradorcinco.queCompraste(), "cocacola");
    }

    @Test
    @DisplayName("Obtener producto correcto")
    public void testquecompaste(){
        assertEquals(compradoruno.queCompraste(), "cocacola");
        assertEquals(compradordos.queCompraste(), "sprite");
        assertEquals(compradortres.queCompraste(), "Snickers");
        assertEquals(compradorcuatro.queCompraste(), "Super8");
    }

    @Test
    @DisplayName("Obtener precios productos")
    public void testprecios(){
        assertEquals(expendedor.queprecio(precioProducto.cocacola), 900);
        assertEquals(expendedor.queprecio(precioProducto.sprite), 800);
        assertEquals(expendedor.queprecio(precioProducto.snickers), 700);
        assertEquals(expendedor.queprecio(precioProducto.super8), 400);
    }

    @Test
    @DisplayName("vuelto")
    public void testvuelto() throws Exception{
        expendedord.comprarProducto(moneda1000,  2, 1);
        assertEquals(compradoruno.cuantoVuelto(), 100);
        assertEquals(compradordos.cuantoVuelto(),200);
        assertEquals(compradortres.cuantoVuelto(),300);
        assertEquals(compradorcuatro.cuantoVuelto(),100);
    }

}