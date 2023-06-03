package org.example;

public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String msg){
        super(msg);
    }
}
