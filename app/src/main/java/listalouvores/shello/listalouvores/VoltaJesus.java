package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VoltaJesus extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={

            "567 - Quando será o grande dia",

            "489 - Em breve escutarei",

            "571 - O grande dia está chegando",

            "546 - Oh quanto almejo estar",

            "207 - Deus enviou seu filho amado",

            "215 - Certo homem tão nobre",

            "479 - Quem me dera",

            "485 - Sete castiçais",

            "499 - Ouço uma voz tão suave",

            "513 - Quem é esta que aparece",

            "507 - O Sol escurecerá",

            "523 - Lá nos céus os anjos",

            "547 - Oh vem logo Jesus"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volta_jesus);
        ListaLouvores =(ListView) findViewById(R.id.ListaVoltaJesus);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);

    }
}
