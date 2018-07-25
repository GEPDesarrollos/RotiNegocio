package com.example.gep.rotinegocio.datos;

/**
 * Created by gep on 29/12/17.
 */

public class Pedido {

    private int nroPedido;
    private String fechaPedido;
    private Cliente cliente;
    private PlatosPedidos [] platosPedidos;
    private int cantidadTotalPlatosFrios;
    private int cantidadTotalPlatosCalientes;
    private float precioTotal;
    private String horarioRetiro;

    public Pedido(int nroPedido, String fechaPedido, Cliente cliente, PlatosPedidos[] platosPedidos,
                  int cantidadTotalPlatosFrios, int cantidadTotalPlatosCalientes,
                  float precioTotal, String horarioRetiro) {
        this.nroPedido = nroPedido;
        this.fechaPedido = fechaPedido;
        this.cliente = cliente;
        this.platosPedidos = platosPedidos;
        this.cantidadTotalPlatosFrios = cantidadTotalPlatosFrios;
        this.cantidadTotalPlatosCalientes = cantidadTotalPlatosCalientes;
        this.precioTotal = precioTotal;
        this.horarioRetiro = horarioRetiro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public PlatosPedidos[] getPlatosPedidos() {
        return platosPedidos;
    }

    public void setPlatosPedidos(PlatosPedidos[] platosPedidos) {
        this.platosPedidos = platosPedidos;
    }

    public int getCantidadTotalPlatosFrios() {
        return cantidadTotalPlatosFrios;
    }

    public void setCantidadTotalPlatosFrios(int cantidadTotalPlatosFrios) {
        this.cantidadTotalPlatosFrios = cantidadTotalPlatosFrios;
    }

    public int getCantidadTotalPlatosCalientes() {
        return cantidadTotalPlatosCalientes;
    }

    public void setCantidadTotalPlatosCalientes(int cantidadTotalPlatosCalientes) {
        this.cantidadTotalPlatosCalientes = cantidadTotalPlatosCalientes;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getHorarioRetiro() {
        return horarioRetiro;
    }

    public void setHorarioRetiro(String horarioRetiro) {
        this.horarioRetiro = horarioRetiro;
    }
}
