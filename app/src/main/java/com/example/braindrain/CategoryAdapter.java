package com.example.braindrain;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.time.temporal.Temporal;
import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    Context context;
    ArrayList<CategoryModal> categoryModals;
    public CategoryAdapter(Context context , ArrayList<CategoryModal> categoryModals){
        this.categoryModals = categoryModals;
        this.context = context;
    }
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_sample,null);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        CategoryModal modal = categoryModals.get(position);
        holder.textView.setText(modal.getCategoryName());

        Glide.with(context).load(modal.getCategoryImage())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return categoryModals.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.category);
        }
    }
}
