package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class encorajamento extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={


           " 381 - Meus Deus vence batalhas",

            "382 - Já Cheguei até aqui",

            "383 - Lá onde eu não posso ver",

            "309 - Oh por que duvidar?",

            "313 - O que habita no abrigo de Deus",

            "319 - Mais perto quero estar",

            "363 - Quando as lutas me cercam",

            "334 - Deus cuida de ti",

            "376 - O Senhor te Guiará",




    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encorajamento);

        ListaLouvores =(ListView) findViewById(R.id.listaEncorajamento);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);





    }
}
