package com.countrylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<String> data;
    Context context;

    public Adapter(ArrayList<String> data, Context context){
        this.data = data;
        this.context = context;
    }
    @NonNull
    @Override
    //It clubs the looks
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewHolder viewHolder =  new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txt.setText(data.get(position));

    }
  // Size of the list
    @Override
    public int getItemCount() {
        return data.size();
    }
    //This describes what is inside the view holder. Actually whats inside single_item.xml
    class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.t);
        }
    }
}
