package com.farias.tp3_recyclerview_moviles_farias.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.farias.tp3_recyclerview_moviles_farias.R;
import com.farias.tp3_recyclerview_moviles_farias.model.PeliculaModel;

import java.util.ArrayList;
import java.util.List;

public class PeliculasListaViewModel extends ViewModel {

    private MutableLiveData<List<PeliculaModel>> listaPeliculas;
//    private MutableLiveData<PeliculaModel> pelicula;

    public LiveData<List<PeliculaModel>> getPeliculas(){
        if(listaPeliculas == null){
            listaPeliculas = new MutableLiveData<>();
            cargarPeliculas();
        }
        return listaPeliculas;
    }

    private void cargarPeliculas(){

        List<PeliculaModel> lista = new ArrayList<>();
        lista.add(new PeliculaModel(1,"Drácula (1958)", R.drawable.dracula,"Drácula busca vengarse de Jonathan Harker, viajando a su ciudad y atacando a la familia de su prometida. El único que puede protegerlos es el ...", "Jimmy Sangaster, Bram Stoker","Felipe Dirige"));
        lista.add(new PeliculaModel(2,"Titanic(1988)", R.drawable.titanic,"El buscador de tesoros Brock Lovett se encuentra en los restos del Titanic una pintura de una mujer casi desnuda que porta un collar.", "Leonardo DiCaprio,Kate Winslet","James Cameron"));
        lista.add(new PeliculaModel(3,"El Grinch (2000)", R.drawable.grinch,"Una criatura tiene la intención de robarse la navidad.", "Peter Seaman,Kate Soloa","James Camaron"));
        lista.add(new PeliculaModel(4,"Mi Amigo el Dragón (2016)", R.drawable.miamigodragon,"El remake de la película homónima de 1977 nos transporta a un pequeño pueblo de Estados Unidos en el que un viejo tallador de madera, el Sr. Meacham (Robert Redford)...", "Robert Redford ,Frank Soloa","Javier Solanas"));
        lista.add(new PeliculaModel(5,"Anna Karenina (2012)", R.drawable.anakarenina,"Es una nueva y audaz visión teatral de la historia épica de amor, adaptada de la novela de Leo Tolstoy. La historia explora poderosamente la capacidad del amor que surge a través del corazón humano...", "Tom Stopard, Leo Tolstoy","Francisco Gandirect"));
        lista.add(new PeliculaModel(6,"Alice in Wonderland (1985)", R.drawable.alice,"Adaptación para televisión de las dos novelas de Lewis Carroll basadas en el personaje de Alicia: Alicia en el país de las maravillas y Alicia a través del espejo.", "Lewis Carroll, Paul Zindel","Harry Harris"));
        lista.add(new PeliculaModel(7,"Mi Vida a los 17 (2016)", R.drawable.mividaalos47,"El proceso de crecer es difícil y para Nadine,una chica que va a la preparatoria, se le dificulta aún más cuando su mejor amiga, Kista, comienza a salir con su hermano mayor, Darian...", "kelly Fremon","kelly Fozen"));
        listaPeliculas.postValue(lista);
    }
}
