package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Dedicacao extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={


            "118 - Edifiquei uma casa",

            "455 - Quanto mais eu te conheço",

            "403 - Aquele que tem os meus mandamentos",

            "397 - Há uma luz a brilhar",

            "404 - Jesus quero amar-te",

            "413 - Ouvi, ó ceus e falarei",

            "424 - O meu amado desceu ao seu jardim",

            "462 - Quantos fiéis Senhor",

            "98 - Onde estaria eu",
            "100 - Eu me lembro quando Jesus me tocou",
            "120 - Jesus Cristo mudou meu viver",
            "126 - Quero prosseguir nesta jornada",
            "131 - Ás vezes, alguém me pergunta",
            "136 - Esta paz que sinto em minh'alma",
            "138 - Há sempre alguém",
            "140 - As muitas águas",
            "143 - Se não fosse o amor",
            "145 - É o amor de Deus",
            "146 - Existe um alguém que cuida de mim",
            "153 - Cristo, nome mais alto",
            "154 - Oh Tu que habitas entre o querubins",
            "163 - Tenho uma pedra viva",
            "178 - O Deus a quem Servimos",
            "180 - encontrei o grande amor",
            "181 - Em Ti eu encontro ",
            "183 - A minha alegria",
            "187 - Minh'alma tem sede de Ti",
            "188 - Venho Senhor minha vida",
            "194 - Quero andar em Teu caminho, Senhor",
            "196 - O grande amor do meu Senhor"





    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dedicacao);
        ListaLouvores =(ListView) findViewById(R.id.ListaDedicacao);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);




    }
}
