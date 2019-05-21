package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class salvacao extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={"251- A paz que Tu procuras",

            "275- Um milagre é",

            "290- Oque os olhos nunca viram",

            "222 - Eis que estou a porta e bato",
            "226 - O sentido de viver",
            "227 - Só em Jesus te pode dar o que procuras",
            "228 - Entrega o teu caminho ao Senhor",
            "231 - Quem me dá agua",
            "232 - Quem beber da água que eu lhe der",
            "233 - Vou guiar-te a uma rica fonte",
            "235 - Manso e suave",
            "236 - Ouve a voz de Jesus",
            "239 - Deixa Deus falar ao teu coração",
            "241 - Meu amado filho te escolhi",
            "242 - Se esta noite Deus pedir tua Alma",
            "245 - Por onde quer que eu vá",
            "246 - Se em teu viver",
            "251 - A paz que Tu procuras",
            "253 - Se dispuseres o teu coração",
            "270 - Se Tu pediste um sinal",
            "280 - Há hoje alguém esperando",
            "282 - Quem dá água ao sedento ",
            "284 - O amor de Deus é grande",
            "289 - Estende a tua mão"



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salvacao);



        ListaLouvores =(ListView) findViewById(R.id.ListaLouvores);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);
    }
}
