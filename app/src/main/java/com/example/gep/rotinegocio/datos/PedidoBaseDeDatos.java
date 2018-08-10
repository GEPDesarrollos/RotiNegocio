package com.example.gep.rotinegocio.datos;

public class PedidoBaseDeDatos {

    private String cliente;
    private int demora;
    private int idPedido;
    private Platos platos[];
    private int precioTotal;

    public PedidoBaseDeDatos(String cliente, int demora, int idPedido, Platos[] platos, int precioTotal) {
        this.cliente = cliente;
        this.demora = demora;
        this.idPedido = idPedido;
        this.platos = platos;
        this.precioTotal = precioTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Platos[] getPlatos() {
        return platos;
    }

    public void setPlatos(Platos[] platos) {
        this.platos = platos;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
}
