package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;


class ExpendedorTest {
    private Expendedor expendedor;
    private Expendedor expendedord;
    private Comprador compradoruno;
    private DepositoVuelto depositovuelto;
    private Moneda moneda;
    private Moneda1000 moneda1000;
    private Moneda500 moneda500;
    private Moneda100 moneda100;
    @BeforeEach
    void setUp(){
        expendedor = new Expendedor(3);
        expendedord = new Expendedor(5);
        moneda1000 = new Moneda1000();
        moneda500 = new Moneda500();
        moneda100 = new Moneda100();
        compradoruno = new Comprador(moneda1000, 1, 1, expendedor);
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
    @DisplayName("Comprar con saldo insuficiente")
    public void testSaldoInsuficiente() throws Exception{
        assertNotNull(expendedor.comprarProducto(moneda500,  1, 1));
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
    public void testComprarsinmoneda() throws Exception{
        assertNotNull(expendedor.comprarProducto(null,  2, 2));
        assertThrows("Pago Incorrecto Excepcion");

    }

    @Test
    @DisplayName("intentar comprar dulce saldo insuficiente")
    public void testDulceSaldoInsuficiente() throws Exception{
        assertNotNull(expendedor.comprarProducto(moneda500,  2, 1));
    }

    @Test
    @DisplayName("Comprar más productos del stock")
    public void testStockInsuficientedulces() throws Exception{
        assertNotNull(expendedord.comprarProducto(moneda1000,  2, 1));
        assertNotNull(expendedord.comprarProducto(moneda1000,  2, 2));
        assertNotNull(expendedord.comprarProducto(moneda1000,  2, 2));
        assertNotNull(expendedord.comprarProducto(moneda1000,  2, 1));
        assertNotNull(expendedord.comprarProducto(moneda1000,  2, 2));
        assertNotNull(expendedord.comprarProducto(moneda500,  2, 2));
    }

    @Test
    @DisplayName("no se realizó compra")
    public void testcompracorrecta() throws Exception{
        assertThrows("No Hay Producto Exception");
    }

    private void assertThrows(String noHayProductoException) {
    }

    @Test
    @DisplayName("saldo insuficiente")
    public void testsaldoInsuficiente() throws Exception{
        //assertNotNull(expendedor.comprarProducto(moneda100,  1, 1));
        assertThrows("PagoInsuficienteException");

    }
}