package com.example.gep.rotinegocio.datos;

public class Cliente {

    private int nroCliente;
    private String nombreCliente;
    //foto

    public Cliente(int nroCliente, String nombreCliente, Pedido[] pedidos) {
        this.nroCliente = nroCliente;
        this.nombreCliente = nombreCliente;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

}
