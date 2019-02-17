package com.example.android.sunshine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

// Création de l'adaptateur
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    // conserver vos données dans l'adaptateur
    private final LinkedList<String> mList;
    // lit une description XML de mise en page et la convertit en View éléments correspondants
    private LayoutInflater mInflater;

    // constructeur : Le constructeur doit avoir un paramètre de contexte et une liste de mots liée avec les données de l'application. La méthode doit instancier un LayoutInflatorpour mInflater et définir mList (les données passées)
    public ListAdapter(Context context, LinkedList<String> mMList) {
        mInflater = LayoutInflater.from(context);
        this.mList = mMList;
    }

    //  gonfle la présentation de l'article et renvoie a ViewHolder avec la présentation et l'adaptateur.
    @NonNull
    @Override
    public ListAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(mItemView, this);
    }

    // connecte vos données au détenteur de la vue.
    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        String mCurrent = mList.get(position);
        holder.mItemView.setText(mCurrent);
    }

    // retourne la taille des données
    @Override
    public int getItemCount() {
        return mList.size();
    }

    // Création du ViewHolder pour l'adaptateur
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
