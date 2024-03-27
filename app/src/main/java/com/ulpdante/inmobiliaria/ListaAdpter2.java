package com.ulpdante.inmobiliaria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.ulpdante.inmobiliaria.databinding.ItemBinding;

import java.util.List;

public class ListaAdpter2 extends ArrayAdapter<Inmueble> {
    private List<Inmueble> listadoInmuebles;
    private Context context;
    private int itemAMostrar;
    private LayoutInflater li;
    private ItemBinding binding;


    public ListaAdpter2(@NonNull Context context, int resource, @NonNull List<Inmueble> listaInmuebles) {
        super(context, resource, listaInmuebles);
        this.listadoInmuebles = listaInmuebles;
        this.context = context;
        this.li = LayoutInflater.from(context);
        this.itemAMostrar = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View itemView, @NonNull ViewGroup parent){
        if(itemView == null){
            binding = ItemBinding.inflate(li, parent, false);
            itemView = binding.getRoot();
            itemView.setTag(binding);
        }else{
            binding = (ItemBinding) itemView.getTag();
        }
        Inmueble inmueble = listadoInmuebles.get(position);
        binding.tDireccion.setText(inmueble.getDireccion());
        binding.tPrecio.setText(inmueble.getPrecio()+"");
        binding.fotoInmueble.setImageResource(inmueble.getFoto());

        return itemView;
    }

    public int getCount(){
        return listadoInmuebles.size();
    }
}
