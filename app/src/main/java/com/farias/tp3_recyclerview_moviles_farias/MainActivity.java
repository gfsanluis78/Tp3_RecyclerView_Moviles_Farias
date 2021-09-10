package com.farias.tp3_recyclerview_moviles_farias;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerAdapterPeliculas.ListItemClick{

    private RecyclerView mRVPeliculas;

    private static final int lista_numeros = 100;

    private ArrayList<Pelicula> lista = new ArrayList<>();

    private Toast miToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();

        mRVPeliculas = findViewById(R.id.RVpeliculas);

        mRVPeliculas.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        mRVPeliculas.setLayoutManager(linearLayoutManager);

        RecyclerAdapterPeliculas mAdapter = new RecyclerAdapterPeliculas(lista,this);

        mRVPeliculas.setAdapter(mAdapter);

    }

    @Override
    public void onListItemClick(int clickedItem) {

        if(miToast != null){
            miToast.cancel();
        }
        String  mensajeToast = "Item "+ clickedItem + " clickeado";
        miToast = Toast.makeText(this, mensajeToast, Toast.LENGTH_SHORT);
        miToast.show();




    }

    public void cargarDatos(){

        lista.add(new Pelicula("Titanic(1988)", R.drawable.titanic,"El buscador de tesoros Brock Lovett se encuentra en los restos del Titanic una pintura de una mujer casi desnuda que porta un collar.", "Leonardo DiCaprio,Kate Winslet","James Cameron"));
        lista.add(new Pelicula("El Grinch (2000)", R.drawable.grinch,"Una criatura tiene la intención de robarse la navidad.", "Peter Seaman,Kate Soloa","James Camaron"));
        lista.add(new Pelicula("Drácula (1958)", R.drawable.dracula,"Drácula busca vengarse de Jonathan Harker, viajando a su ciudad y atacando a la familia de su prometida. El único que puede protegerlos es el Dr. van Helsing, un amigo de Harker y estudiante de vampiros, quien está determinado en destruir a Drácula.", "Jimmy Sangaster, Bram Stoker","Felipe Dirige"));
        lista.add(new Pelicula("Mi Amigo el Dragón (2016)", R.drawable.miamigodragon,"El remake de la película homónima de 1977 nos transporta a un pequeño pueblo de Estados Unidos en el que un viejo tallador de madera, el Sr. Meacham (Robert Redford), se ha encargado de hacer popular la leyenda local sobre un enorme dragón que vive oculto en el bosque y con el cual supuestamente tuvo un encuentro accidental años atrás. ", "Robert Redford ,Frank Soloa","Javier Solanas"));
        lista.add(new Pelicula("Anna Karenina (2012)", R.drawable.anakarenina,"Es una nueva y audaz visión teatral de la historia épica de amor, adaptada de la novela de Leo Tolstoy. La historia explora poderosamente la capacidad del amor que surge a través del corazón humano. Cuando Anna (Knightley) cuestiona su felicidad y el matrimonio, el cambio viene a todos los que la rodean.", "Tom Stopard, Leo Tolstoy","Francisco Gandirect"));
        lista.add(new Pelicula("Alice in Wonderland (1985)", R.drawable.alice,"Adaptación para televisión de las dos novelas de Lewis Carroll basadas en el personaje de Alicia: Alicia en el país de las maravillas y Alicia a través del espejo.", "Lewis Carroll, Paul Zindel","Harry Harris"));
        lista.add(new Pelicula("Mi Vida a los 17 (2016)", R.drawable.mividaalos47,"El proceso de crecer es difícil y para Nadine,una chica que va a la preparatoria, se le dificulta aún más cuando su mejor amiga, Kista, comienza a salir con su hermano mayor, Darian. Después de esto Nadine se siente más sola que nunca, hasta que una inesperada amistad le devuelve un poco de esperanza en su vida.", "kelly Fremon","kelly Fozen"));


    }


}