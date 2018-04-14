package com.example.lenovog40.androiddev;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.Arrays;

public class OrderFragment extends Fragment {

    public OrderFragment() {}
    private ListMakananAdapter makananAdapter;
    ListMakanan[] androidmakanan = {
            new  ListMakanan("Cupcake", "Rp.100000", R.drawable.cupcake),
            new  ListMakanan("Donut", "Rp.200000", R.drawable.donut),
            new  ListMakanan("Eclair", "Rp.300000", R.drawable.eclair),
            new  ListMakanan("Froyo", "Rp.400000", R.drawable.froyo),
            new  ListMakanan("GingerBread", "Rp.500000", R.drawable.gingerbread),
            new  ListMakanan("Honeycomb", "Rp.600000", R.drawable.honeycomb),
            new ListMakanan("Ice Cream Sandwich", "Rp.700000", R.drawable.icecream),
            new  ListMakanan("Jelly Bean", "Rp.800000", R.drawable.jellybean),
            new ListMakanan("KitKat", "Rp.900000", R.drawable.kitkat),
            new  ListMakanan("Lollipop", "Rp.1000000", R.drawable.lollipop)
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_order, container, false);

        makananAdapter = new ListMakananAdapter(getActivity(), Arrays.asList(androidmakanan));

        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(makananAdapter);

        return rootView;
    }
}


