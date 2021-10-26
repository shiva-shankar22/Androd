package com.example.recyclerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context ctx;
    int[] i;
    String[] n;
    public MyAdapter(MainActivity mainActivity, int[] images,String[] names) {
        this.ctx=mainActivity;
        this.i= images;
        n=names;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(ctx).inflate(R.layout.row_item,parent,false);

       return new ViewHolder(view);
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
            holder.img.setImageResource(i[position]);
            holder.nm.setText(n[position]);
    }

    @Override
    public int getItemCount() {
        return i.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView nm;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imgs);
            nm=itemView.findViewById(R.id.name);
        }
    }
}
