package com.example.gep.rotinegocio.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.gep.rotinegocio.fragment.ClientesFragment;
import com.example.gep.rotinegocio.fragment.ComandaFragment;
import com.example.gep.rotinegocio.fragment.EstadisticasFragment;
import com.example.gep.rotinegocio.fragment.PedidosFragment;
import com.example.gep.rotinegocio.fragment.PromoFragment;

public class PagerAdaptador extends FragmentStatePagerAdapter {

    private int numeroDeTabs;

    public PagerAdaptador(FragmentManager fm, int tabs) {
        super(fm);
        numeroDeTabs=tabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:

                return new PedidosFragment();

            case 1:

                return new ComandaFragment();

            case 2:

                return new ClientesFragment();

            case 3:

                return new PromoFragment();

            case 4:

                return new EstadisticasFragment();

            default:

                return null;
        }

    }

    @Override
    public int getCount() {
        return numeroDeTabs;
    }
}
