package com.example.viewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewpagerAdapter extends RecyclerView.Adapter<ViewpagerAdapter.ViewHolder>{

    private List<String> Items;

    public ViewpagerAdapter(List<String> Items) {
        this.Items = Items;
    }

    @NonNull
    @Override
    public ViewpagerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpager_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewpagerAdapter.ViewHolder holder, int position) {
//        Uri profileUri = Uri.parse(Items.get(position));
//        Log.d("디버그태그", Items.get(position));
//        holder.imageViewViewpager.setImageURI(profileUri);
        holder.imageViewViewpager.setText(Items.get(position));
    }

    @Override
    public int getItemCount() {
        return Items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView imageViewViewpager;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewViewpager = itemView.findViewById(R.id.textView);
        }
    }

}
