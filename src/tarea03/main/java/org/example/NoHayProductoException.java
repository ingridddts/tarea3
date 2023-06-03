package org.example;

public class NoHayProductoException extends Exception {
    public NoHayProductoException(String msg){
        super(msg);
    }
}