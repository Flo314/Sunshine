package com.example.android.sunshine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Création du ViewHolder pour l'adaptateur
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    @NonNull
    @Override
    public ListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ListViewHolder listViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public final TextView mItemView;
        final ListAdapter mAdapter;

        public ListViewHolder(View itemView, ListAdapter adapter) {
            super(itemView);
            mItemView = itemView.findViewById(R.id.tv_weather_data);
            this.mAdapter = adapter;
        }
    }
}
