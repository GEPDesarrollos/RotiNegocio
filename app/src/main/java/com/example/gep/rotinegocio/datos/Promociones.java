package com.example.gep.rotinegocio.datos;

public class Promociones {

    /*
    * esta clase sirve para cuando se crean las promociones que luego se enviarán a los clientes
    * */

    private String nombrePromo;
    private String fechaDesde;
    private String fechaHasta;

    public Promociones(String nombrePromo, String fechaDesde, String fechaHasta) {
        this.nombrePromo = nombrePromo;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public String getNombrePromo() {
        return nombrePromo;
    }

    public void setNombrePromo(String nombrePromo) {
        this.nombrePromo = nombrePromo;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
}
