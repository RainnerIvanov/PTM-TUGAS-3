package com.example.pmt_tugas3;



import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesAdapter.MyViewHolder> {
    List<Heroes> my_list;
    Context context;

    public HeroesAdapter(List<Heroes> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Heroes heroes = my_list.get(position);
        holder.itemhero_tv_name.setText(heroes.getNama());
        holder.itemhero_tv_desc.setText(heroes.getDesc());
        holder.itemhero_iv.setImageDrawable(context.getResources().getDrawable(heroes.getImage()));
        holder.itemhero_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Implisit.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("image", heroes.getImage());
                intent.putExtra("nama", heroes.getNama());
                intent.putExtra("desc", heroes.getDesc());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView itemhero_iv;
        TextView itemhero_tv_name, itemhero_tv_desc;
        RelativeLayout itemhero_relative;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemhero_iv = itemView.findViewById(R.id.itemhero_iv);
            itemhero_tv_name = itemView.findViewById(R.id.itemhero_tv_name);
            itemhero_tv_desc = itemView.findViewById(R.id.itemhero_tv_desc);

        }
    }
}
