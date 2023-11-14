package com.gabriel.junit.tests.clienteTDD;

import org.junit.Assert;
import org.junit.Test;

import com.gabriel.junit.clienteTDD.Client;

public class ClientTest {

    @Test
    public void calculateTaxFree() {
        Client client = new Client(10);

        Assert.assertEquals(100, client.calculateTaxFree());
    }
    
}
