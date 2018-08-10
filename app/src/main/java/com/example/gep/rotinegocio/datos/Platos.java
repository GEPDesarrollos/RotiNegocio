package com.example.gep.rotinegocio.datos;

public class Platos {
    private String idPlato;
    private int cantidadPlatos;

    public Platos(String idPlato, int cantidadPlatos) {
        this.idPlato = idPlato;
        this.cantidadPlatos = cantidadPlatos;
    }

    public String getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(String idPlato) {
        this.idPlato = idPlato;
    }

    public int getCantidadPlatos() {
        return cantidadPlatos;
    }

    public void setCantidadPlatos(int cantidadPlatos) {
        this.cantidadPlatos = cantidadPlatos;
    }
}
