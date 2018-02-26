package mx.edu.ittepic.tam_laboratorio_3_recyclerview_vicentemz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by vicen on 24/02/2018.
 */

public class Adaptador extends RecyclerView.Adapter<viewHolder> {

    List<Fuente> ListaObjeto;

    public Adaptador(List<Fuente> listaObjeto) {
        ListaObjeto = listaObjeto;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);

        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        holder.nombre.setText(ListaObjeto.get(position).getNombre());
        holder.ncontrol.setText(ListaObjeto.get(position).getNcontrol());
        holder.carrera.setText(ListaObjeto.get(position).getCarrera());
        holder.imagen.setImageResource(ListaObjeto.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return ListaObjeto.size();
    }
}
