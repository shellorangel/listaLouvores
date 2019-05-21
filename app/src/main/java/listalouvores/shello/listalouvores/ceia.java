package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ceia extends AppCompatActivity {


    private ListView ListaLouvores;
    private String[] louvores={


            "590 - Ao Cordeiro",

            "431 - Cristo já nos preparou",

            "429 - És o pão da vida",

            "267 - Quando Jesus sangue verteu",

            "212 - Rude cruz",

            "428 - Vem ó Cristo",

            "463 - Vem Senhor visita tua vinha",

            "77 - Vem, visita tua igreja",

            "727  - Eis que abro a porta",

            "423 - Oh Pastor de Israel",

            "424 - O meu amado desceu ao seu jardim",

            "558 - Vem Jesus Cristo já vem",

            "255 - Meu coração engrandece ao Senhor"




    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceia);

        ListaLouvores =(ListView) findViewById(R.id.listaCeia);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);


    }
}
