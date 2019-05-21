package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class avivamento extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={



            "77 - Vivifica",

            "454 - Saúde espiritual",

            "117 - Como Desistir",




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avivamento);

        ListaLouvores =(ListView) findViewById(R.id.listaAvivamento);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);





    }


    }

