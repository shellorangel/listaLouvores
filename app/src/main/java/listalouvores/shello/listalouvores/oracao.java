package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class oracao extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={



            "383 - Lá onde eu não posso ver",
            "434 - Há um doce espirito",
            "57 - Em fervente oração",
            "58 - Atende a voz do meu clamor",
            "59 - Se orarmos ao Senhor",
            "60 - Bem de manhã, embora",
            "62 - No silêncio da noite",
            "61 - Suba a minha oração",
            "63 - Invoca-me e te responderei",
            "64 - Brilhe sobre mim",
            "76 - Nesta noite feliz",
            "82 - Cada instante",
            "86 - Em Teu nome estamos ",
            "168 - Tu és fiel Senhor",
            "169 - Como a flor do campo"





    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracao);

        ListaLouvores =(ListView) findViewById(R.id.listaOracao);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);

    }
}
