package listalouvores.shello.listalouvores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class criancas extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={


            "1 - Meu Deus, meu Pai",
            "2 - Pai, Estou a Ti Clamar",
            "5 - Estou aqui pra confessar",
            "11 - Clamo a Ti meu Senhor e Pai",
            "12 - Perdoa-me Senhor",
            "17 - Quando falo com Deus",
            "23 - Quando Israel saiu do Egito",
            "27 - Ele é a raiz",
            "37 - No meu coração há um tesouro",
            "38 - Tenho um coração alegre",
            "40 - Quero ouvir",
            "48 - Jesus Cristo é o amado",
            "50 - Do alto céu",
            "53 - É bom, é bom demais",
            "59 - O nome do meu Senhor",
            "60 - Deus falou comigo",
            "61 - Sei que na cruz",
            "66 - Nasceu um novo dia",
            "68 - Vem para o meio",
            "69 - Você sabe oque é salvação?",
            "70 - O dia do Senhor virá",
            "74 - Aquilo que melhor existe",
            "76 - Jesus falou que o céu é pra mim",
            "79 - Deus ama você",
            "81 - quem quer subir para o céu",
            "85 - Neste dia especial ",
            "92 - Jesus Cura e salva",
            "93 - Jesus te ama",
            "97 - Jesus é o caminho",
            "99 - No meu coração",
            "110 - Eu tudo posso",
            "126 - Deus forte como Jeová",
            "132 - Meu barco é pequeno",
            "136 - Lâmpada para os meus pés",
            "137 - Não por força",
            "141 - Quem irá?",
            "143 - Tenho uma candeia",
            "174 - A Tua palavra é semente",
            "176 - Cria em mim ó Deus",
            "184 - No expresso viajamos",
            "186 - Nossas vidas são mudadas",
            "189 - Um dia a igreja subirá",
            "200 - Vou para o meu lar",
            "210 - Jesus voltará pra me buscar",
            "211 - Os dias estão passando",
            "217 - Verei meu grande Rei",
            "218 - Maranata",
            "223 - Pai Tua beleza me admira",
            "239 - Jesus é a nossa vitória"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criancas);

        ListaLouvores =(ListView) findViewById(R.id.listaCriancas);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);
    }

}
