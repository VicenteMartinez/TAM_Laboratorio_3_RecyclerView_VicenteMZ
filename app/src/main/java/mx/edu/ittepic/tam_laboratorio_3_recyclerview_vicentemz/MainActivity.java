package mx.edu.ittepic.tam_laboratorio_3_recyclerview_vicentemz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fuente> Lista = new ArrayList<Fuente>();
        Lista.add(new Fuente("Vicente Martinez","14401037","Tics",R.drawable.perfil));
        Lista.add(new Fuente("Guerra Robles","14401035","Tics",R.drawable.perfil));
        Lista.add(new Fuente("Carolina Mondragon","14401032","Tics",R.drawable.perfil));
        Lista.add(new Fuente("Gerardo Tovar","14401052","Tics",R.drawable.perfil));
        Lista.add(new Fuente("Vicente Martinez","14401037","Tics",R.drawable.perfil));
        Lista.add(new Fuente("Guerra Robles","14401035","Tics",R.drawable.perfil));
        Lista.add(new Fuente("Carolina Mondragon","14401032","Tics",R.drawable.perfil));
        Lista.add(new Fuente("Gerardo Tovar","14401052","Tics",R.drawable.perfil));


        RecyclerView contenedor = findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);

        contenedor.setAdapter(new Adaptador(Lista));
        contenedor.setLayoutManager(layout);

    }
}
