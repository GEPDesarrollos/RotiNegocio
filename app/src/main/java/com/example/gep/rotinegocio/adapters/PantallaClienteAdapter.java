package com.example.gep.rotinegocio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gep.rotinegocio.R;
import com.example.gep.rotinegocio.datos.Pedido;
import com.example.gep.rotinegocio.datos.PlatosPedidos;


public class PantallaClienteAdapter extends RecyclerView.Adapter<PantallaClienteAdapter.MyViewHolder> {

    private Pedido [] pedidos;/*PROVISORIO*/

    public PantallaClienteAdapter(Pedido [] pedidos){

        this.pedidos=pedidos;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_pantalla_clientes, parent, false);
        MyViewHolder mVH=new MyViewHolder(view);

        return mVH;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.nroPedido.setText("Nro: "+pedidos[position].getNroPedido());
        holder.fechaPedido.setText(pedidos[position].getFechaPedido());
//        holder.nombreCliente.setText(pedidos[position].getNombreCliente().toUpperCase());
        holder.listaPlatosPedidos.setText(PlatosPedidos.getListaPlatosPedidos(pedidos[position].getPlatosPedidos()));
        holder.cantidadTotalDePlatos.setText("Total Platos: "+pedidos[position].getCantidadTotalPlatosFrios());
        holder.pesosTotal.setText("$ "+pedidos[position].getPrecioTotal());
//        holder.horarioRetiro.setText("Retira a las: "+pedidos[position].getHorarioRetiro());

    }

    @Override
    public int getItemCount() {
        return pedidos.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView nroPedido, fechaPedido, /*nombreCliente*/ listaPlatosPedidos,
                cantidadTotalDePlatos, pesosTotal;

        public MyViewHolder(View itemView){
            super(itemView);

            nroPedido=(TextView)itemView.findViewById(R.id.nro_pedido_text);
//            nombreCliente=(TextView)itemView.findViewById(R.id.nombre_cliente_text);
            fechaPedido=(TextView)itemView.findViewById(R.id.fecha_pedido_text);
            listaPlatosPedidos=(TextView)itemView.findViewById(R.id.lista_platos_pedidos);
            cantidadTotalDePlatos=(TextView)itemView.findViewById(R.id.cantidad_total_pedido_text);
            pesosTotal=(TextView)itemView.findViewById(R.id.pesos_total_pedido_text);
//            horarioRetiro=(TextView)itemView.findViewById(R.id.horario_retiro_text);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
