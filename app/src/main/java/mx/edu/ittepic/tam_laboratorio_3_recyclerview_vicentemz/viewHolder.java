package mx.edu.ittepic.tam_laboratorio_3_recyclerview_vicentemz;

import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vicen on 24/02/2018.
 */

public class viewHolder extends RecyclerView.ViewHolder {

    ImageView imagen;
    TextView nombre;
    TextView ncontrol;
    TextView carrera;

    public viewHolder(View itemView) {
        super(itemView);

        imagen=itemView.findViewById(R.id.imagen);
        nombre=itemView.findViewById(R.id.nombre);
        ncontrol=itemView.findViewById(R.id.ncontrol);
        carrera=itemView.findViewById(R.id.carrera);

    }
}
