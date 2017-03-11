package com.aimewexample.recyclerview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.aimewexample.recyclerview.R;
import com.aimewexample.recyclerview.models.Hero;

import java.util.List;

/**
 * Created by aimew on 10/03/2017.
 */

public class HerosAdapter extends RecyclerView.Adapter<HerosAdapter.HeroViewHolder>{

    private List<Hero>heroList;
    private Context context;
    private HeroAdapterItemCallBack listener;


    public HerosAdapter(List<Hero> heroList, Context context) {
        this.heroList = heroList;
        this.context = context;
        this.listener = (HeroAdapterItemCallBack) context;
    }

    @Override
    public HeroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero, parent, false);
        HeroViewHolder hvh = new HeroViewHolder(view);
        return hvh;
    }

    @Override
    public void onBindViewHolder(HeroViewHolder holder, final int position) {
        holder.textItemName.setText(heroList.get(position).getName());
        holder.textItemGender.setText(heroList.get(position).getGender());
        holder.textItemSuperPower.setText(heroList.get(position).getSuperPower());
        holder.imageItemHero.setImageResource(heroList.get(position).getAvatar());

        holder.viewItemHero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onHeroItemSelected(heroList.get(position));
            }
        });
    }



    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public static class HeroViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageItemHero;
        public TextView textItemName;
        public TextView textItemSuperPower;
        public TextView textItemGender;
        public View viewItemHero;

        public HeroViewHolder(View itemView) {
            super(itemView);
            imageItemHero = (ImageView)itemView.findViewById(R.id.image_item_hero);
            textItemName = (TextView)itemView.findViewById(R.id.text_item_name);
            textItemSuperPower = (TextView)itemView.findViewById(R.id.text_item_super_power);
            textItemGender = (TextView)itemView.findViewById(R.id.text_item_gender);
            viewItemHero = (View)itemView.findViewById(R.id.view_item_hero);
        }
    }

    public interface HeroAdapterItemCallBack{
        public void onHeroItemSelected(Hero hero);
    }
}
