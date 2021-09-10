package com.farias.tp3_recyclerview_moviles_farias;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapterPeliculas extends RecyclerView.Adapter<RecyclerAdapterPeliculas.PeliculasViewHolder>{

    private int mNumeroItems;
    final private ListItemClick miOnclickListener;

    public RecyclerAdapterPeliculas( int numeroItems, ListItemClick listener) {
        mNumeroItems =  numeroItems;
        miOnclickListener = listener;
    }

    public interface  ListItemClick{
        void onListItemClick(int clickedItem);
    }



    @NonNull
    @Override
    public PeliculasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context mycontext  = parent.getContext();
        int layoutIdParaListItem = R.layout.lista_peliculas_fila;
        LayoutInflater inflater = LayoutInflater.from(mycontext);
        boolean attachToParentRapido = false;

        View view = inflater.inflate(layoutIdParaListItem,parent,attachToParentRapido);

        PeliculasViewHolder viewHolder = new PeliculasViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculasViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumeroItems;
    }


    class PeliculasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView mTVlistaPeliculasView;

        public PeliculasViewHolder(@NonNull View itemView) {
            super(itemView);

            mTVlistaPeliculasView = itemView.findViewById(R.id.TV_lista_peliculas);
            itemView.setOnClickListener(this);
        }

        void bind (int listaIndex){
            mTVlistaPeliculasView.setText(String.valueOf(listaIndex));
        }

        @Override
        public void onClick(View view) {
            int clickedItem = getAdapterPosition();

            miOnclickListener.onListItemClick(clickedItem);
        }
    }
}
