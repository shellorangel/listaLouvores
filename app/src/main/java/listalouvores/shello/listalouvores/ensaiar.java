package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ensaiar extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={

            "378 - Confia e ora",
            "475 - AGEU",
            "385 - Quão difícil é Senhor",
            "709 - Resplande, o Jerusalém",
            "707 - Eu confio em Ti Senhor",
            "598 - Há um só que é digno",
            "462 - Quantos fieis Senhor",
            "694 - Jerusalém Eterna",
            "687 - Quem é como Tu",
            "665 - Bendizei ao Senhor",
            "673 - Oh Pai queria tanto ver",
            "364 - Dá mais fé *testar tom*",
            "476 - Esta obra é de Deus",
            "468 - Há tanta terra pra possuir",
            "357 - O Senhor é o meu Pastor(Bondade e misericórdia)",
            "444 - Desejei ardentemente",
            "566 - O Senhor é meu pastor",


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ensaiar);


        ListaLouvores =(ListView) findViewById(R.id.listaEnsaio);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);
    }
}
