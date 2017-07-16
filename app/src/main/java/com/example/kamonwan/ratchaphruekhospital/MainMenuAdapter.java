package com.example.kamonwan.ratchaphruekhospital;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by kamonwan on 7/16/2017.
 */

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuAdapter.ViewHolder> {

    int[] image_Icon, image_bg, name;

    public MainMenuAdapter(int[] image_Icon, int[] image_bg, int[] name) {
        this.image_Icon = image_Icon;
        this.image_bg = image_bg;
        this.name = name;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fragment_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.img_icon_menu.setImageResource(image_Icon[position]);
        holder.tv_name.setText(name[position]);
        holder.linear_bg.setBackgroundResource(image_bg[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img_icon_menu;
        public TextView tv_name;
        public LinearLayout linear_bg;

        public ViewHolder(View itemView) {
            super(itemView);
            img_icon_menu = (ImageView) itemView.findViewById(R.id.icon_menu);
            tv_name = (TextView) itemView.findViewById(R.id.name);
            linear_bg = (LinearLayout) itemView.findViewById(R.id.bg_menu);
        }


    }


}
