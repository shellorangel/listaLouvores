package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Louvor extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={
            "649 - Te louvamos Senhor",
            "380 - Glorifica",
            "641 - A luz do mundo",
            "592 - Aleluia muitas vozes",
            "565 - Lá está o meu tesouro",
            "619 - Vem derrama a paz",
            "255 - Meu coração engrandece ao Senhor",
            "455 - Quanto mais eu te conheço",
            "590 - Ao Cordeiro",
            "223 - Onde está o Cordeiro",
            "654 - Grande é o Senhor",
            "221 - Jesus em Tua presença",
            "187 - Minha alma tem sede de Ti",
            "675 - Na eternidade",
            "573 - Como é bom te adorar",
            "574 - Adorarei",
            "578 - Hoje o Senhor Derramou",
            "586 - Ó profundidade das riquezas",
            "590 - Ao Cordeiro",
            "597 - Cantarei, cantarei Hosana",
            "594 - Na expressão deste louvor",
            "600 - Jesus te entronizamos",
            "601 - Ao que está no trono",
            "617 - O meu coração se regozija no Senhor",
            "620 - Estamos Aqui Senhor",
            "622 - A beleza da Tua santidade",
            "627 - Nós te adoramos Senhor",
            "634 - Glorioso és Jesus",
            "637 - Toda terra te exalta",
            "639 - Motivos tenho pra louvar-te",
            "641 - A luz do mundo",
            "642 - Em nossos lábios",
            "657 - Os céus proclamam",
            "658 - Meditarei"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_louvor);

        ListaLouvores =(ListView) findViewById(R.id.ListaLouvor);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);
    }
}
