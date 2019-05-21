package listalouvores.shello.listalouvores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView Listacategorias;
    private String[] categorias={"Salvação e apelo","Louvor","Volta de Jesus","CEIA","Dedicação","Encorajamento","Avivamento","Oração",
    "Crianças","Para firmar e novos","Para ensaiar"};

    private String[] louvores={"150-Queres ser feliz","455-Instrumento de louvor","788-Todo Louvor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Listacategorias =(ListView) findViewById(R.id.ListaCategoria);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,categorias
        );

        Listacategorias.setAdapter(adaptdador);
        Listacategorias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int indice=position;

                if (indice == 0)
                startActivity(new Intent(MainActivity.this,salvacao.class));

                if (indice == 1)
                    startActivity(new Intent(MainActivity.this,Louvor.class));
                if (indice == 2)
                    startActivity(new Intent(MainActivity.this,VoltaJesus.class));
                if (indice ==3)
                    startActivity(new Intent(MainActivity.this,ceia.class));
                if (indice ==4)
                    startActivity(new Intent(MainActivity.this,Dedicacao.class));
                if (indice ==5)
                    startActivity(new Intent(MainActivity.this,encorajamento.class));
                if (indice ==6)
                    startActivity(new Intent(MainActivity.this,avivamento.class));
                if (indice ==7)
                    startActivity(new Intent(MainActivity.this,oracao.class));
                if (indice ==8)
                    startActivity(new Intent(MainActivity.this,criancas.class));
                if (indice ==9)
                    startActivity(new Intent(MainActivity.this,novos.class));
                if (indice ==10)
                    startActivity(new Intent(MainActivity.this,ensaiar.class));
                 else
                //String valorClicado= louvores[indice].toString();

                Toast.makeText(getApplicationContext(),"Sem categoria",Toast.LENGTH_SHORT).show();
            }
        });

    }


}
