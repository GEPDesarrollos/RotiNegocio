package com.example.gep.rotinegocio.datos;

import java.util.Arrays;

/**
 * Created by gep on 29/12/17.
 */

public class PlatosPedidos {

    private int cantidadPlato;
    private String nombrePlato;
    private float subTotal;

    public PlatosPedidos(int cantidadPlato, String nombrePlato, float subTotal) {
        this.cantidadPlato = cantidadPlato;
        this.nombrePlato = nombrePlato;
        this.subTotal = subTotal;
    }

    /**
     * Obtiene una lista identada de los componentes del Array
     *
     * */

    public static String getListaPlatosPedidos(PlatosPedidos [] platosPedidos) {

        String listaPlatosPedidos="";

        for (PlatosPedidos platosPedidos1:platosPedidos){


            String renglonLista;

            int cP,sT,pP;
            cP= (String.valueOf(platosPedidos1.cantidadPlato)).length();
            sT=(String.valueOf(platosPedidos1.subTotal)).length();
            pP=platosPedidos1.nombrePlato.length();

            int cantidadDeLetras = 84-(cP+sT+pP+3);
            char [] espacios= new char[cantidadDeLetras];
            Arrays.fill(espacios,0,cantidadDeLetras-1, ' ');
            String espacio="";
            for (char car:espacios){
                espacio+=car;
            }
            renglonLista =""+platosPedidos1.cantidadPlato+" "+platosPedidos1.nombrePlato+
                            espacio+"$ "+platosPedidos1.subTotal+"\n";

            listaPlatosPedidos+=renglonLista;


        }

        return listaPlatosPedidos;

    }
}
