package com.example.gep.rotinegocio.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.gep.rotinegocio.R;
import com.example.gep.rotinegocio.adapters.PagerAdaptador;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseMessaging.getInstance().subscribeToTopic("rotiseria");
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Pedidos"));
        tabLayout.addTab(tabLayout.newTab().setText("Comanda"));
        tabLayout.addTab(tabLayout.newTab().setText("Cliente"));
        tabLayout.addTab(tabLayout.newTab().setText("Promos"));
        tabLayout.addTab(tabLayout.newTab().setText("Estad"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewPager=(ViewPager)findViewById(R.id.viewPager);
        PagerAdapter pagerAdaptador=new PagerAdaptador(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdaptador);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
