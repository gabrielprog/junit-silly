package com.gabriel.junit.clienteTDD;

public class Client {
    
    private int taxFree;

    public Client(int taxFree) {
        this.taxFree = taxFree;
    }

    public int calculateTaxFree() {
        return this.taxFree * 10;
    }
}
