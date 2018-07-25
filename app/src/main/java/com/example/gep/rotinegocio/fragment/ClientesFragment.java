package com.example.gep.rotinegocio.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gep.rotinegocio.R;
import com.example.gep.rotinegocio.adapters.PantallaClienteAdapter;
import com.example.gep.rotinegocio.adapters.PantallaPedidoAdapter;
import com.example.gep.rotinegocio.datos.Cliente;
import com.example.gep.rotinegocio.datos.Pedido;
import com.example.gep.rotinegocio.datos.PlatosPedidos;


public class ClientesFragment extends Fragment {


    private RecyclerView mRecyclerViewPantallaPedido, mRecyclerViewPedido;




    private LinearLayoutManager mLayoutManager;
    private PantallaClienteAdapter mAdapter;
    private Pedido[] pedidos = new Pedido[3];
    private PlatosPedidos[] platosPedidos = new PlatosPedidos [3];


    public ClientesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_clientes, container, false);
        mRecyclerViewPantallaPedido = view.findViewById(R.id.recycler_pantalla_clientes);

        mRecyclerViewPantallaPedido.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerViewPantallaPedido.setLayoutManager(mLayoutManager);

        platosPedidos[0]= new PlatosPedidos(10,"Salmón Roll",100);
        platosPedidos[1]= new PlatosPedidos(12,"Honey Roll",110);
        platosPedidos[2]= new PlatosPedidos(20,"Miyagui Roll",300);

        pedidos[0] = new Pedido(01,"17/10/2017",new Cliente(1,"Guille",null),platosPedidos,31,0,510,"10:00");
        pedidos[1] = new Pedido(02,"17/10/2017",new Cliente(2,"Cholo",null),platosPedidos,31,0,510,"10:15");
        pedidos[2] = new Pedido(03,"17/10/2017",new Cliente(3,"Fer",null),platosPedidos,31,0,510,"10:30");

        mAdapter = new PantallaClienteAdapter(pedidos);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     mRecyclerViewPantallaPedido.setAdapter(mAdapter);

        return view;
    }
}
