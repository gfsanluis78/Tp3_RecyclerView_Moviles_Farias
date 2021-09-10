package com.farias.tp3_recyclerview_moviles_farias;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapterPeliculas extends RecyclerView.Adapter<RecyclerAdapterPeliculas.PeliculasViewHolder>{

    final private ListItemClick miOnclickListener;
    private List<Pelicula> lista;

    public RecyclerAdapterPeliculas(List<Pelicula> objetos ,ListItemClick listener) {
        miOnclickListener = listener;
        lista = objetos;
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
        holder.titulo.setText(lista.get(position).getTitulo());
        holder.resenia.setText(lista.get(position).getResenia());
        holder.IV_foto.setImageResource(lista.get(position).getImagenCartelera());
        holder.BT_detalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("mensaje","llego ");
            }
        });

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }


    class PeliculasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        Button BT_detalles;
        TextView resenia;
        TextView titulo;
        ImageView IV_foto;


        public PeliculasViewHolder(@NonNull View itemView) {
            super(itemView);

            BT_detalles = itemView.findViewById(R.id.BT_detalles);
            resenia = itemView.findViewById(R.id.TV_resenia);
            titulo = itemView.findViewById(R.id.TV_titulo);
            IV_foto = itemView.findViewById(R.id.IV_foto);
            itemView.setOnClickListener(this);
        }

        void bind (int listaIndex){
            titulo.setText(String.valueOf(listaIndex));


        }

        @Override
        public void onClick(View view) {
            int clickedItem = getAdapterPosition();

            miOnclickListener.onListItemClick(clickedItem);
        }
    }
}
