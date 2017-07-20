package com.example.kamonwan.ratchaphruekhospital.model;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kamonwan.ratchaphruekhospital.R;
import com.example.kamonwan.ratchaphruekhospital.adapter.MainMenuAdapter;

public class MainFragment extends Fragment {
    RecyclerView recyclerViewMain;
    MainMenuAdapter menuAdapter;
    int[] image_Icon, image_bg, name;
    public MainFragment() {
        // Required empty public constructor
    }

    private void Mocdata() {
      image_Icon = new   int[] {R.drawable.icon_packet, R.drawable.icon_promotion,R.drawable.icon_car,R.drawable.icon_meet,
      R.drawable.icon_doctor,R.drawable.icon_service};
      image_bg = new   int[] {R.drawable.bg_packet, R.drawable.bg_promotion,R.drawable.bg_car,R.drawable.bg_meet,
      R.drawable.bg_doctor,R.drawable.bg_service};
      name = new   int[] {R.string.menu_packet, R.string.menu_promotion,R.string.menu_car,R.string.menu_meet,R.string.menu_doctor,R.string.menu_service};
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_fragment_main, container, false);
        initInstance(view);
        return view;
    }

    private void initInstance(View view) {
        Mocdata();
        recyclerViewMain = (RecyclerView) view.findViewById(R.id.recyclerViewMain);
        recyclerViewMain.setLayoutManager(new GridLayoutManager(getContext(),2));
        menuAdapter = new MainMenuAdapter(image_Icon,image_bg,name);
        recyclerViewMain.setAdapter(menuAdapter);

    }
}

