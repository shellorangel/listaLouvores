package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class novos extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={

            "728 - Nossa gratidão",
            "730 - Só Tu nos fazes vencedores",
            "507 - O sol escurecerá",
            "380 - Glorifica",
            "196 - O Grande amor do meu Senhor",
            "474 - Quem sou eu Senhor",
            "553 - Vem Maranata, Jesus Vem",
            "554 - Jerusalém, Jerusalém",
            "384 - Bem sei que tudo podes",
            "452 - Quero que me toque Senhor",
            "475 - AGEU",
            "477 - Sempre vou lembrar da coragem",
            "571 - O grande dia está chegando",
            "567 - Quando será o grande dia",
            "639 - Te louvamos Senhor",
            "403 - Aquele que tem os meus mandamentos",
            "383 - A Oração",
            "634 - Glorioso é Jesus",
            "363 - Quando as lutas me cercam",
            "729 - Os Teus anjos Te exaltam",
            "709 - Resplandece oh Jerusalém",
            "476 - Esta obra é de Deus"



    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novos);

        ListaLouvores =(ListView) findViewById(R.id.listaNovos);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);
    }
}
