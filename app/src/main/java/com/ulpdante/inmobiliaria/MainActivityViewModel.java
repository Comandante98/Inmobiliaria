package com.ulpdante.inmobiliaria;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private MutableLiveData<List<Inmueble>> inmueblesMutable;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Inmueble>> getInmuebleMutable(){
        if(inmueblesMutable == null){
            this.inmueblesMutable = new MutableLiveData<>();
        }
        return inmueblesMutable;
    }

    public void crearLista(){
        ArrayList<Inmueble> lista = new ArrayList<>();
        lista.add(new Inmueble(R.drawable.casa1,"San Luis Capital", 100000));
        lista.add(new Inmueble(R.drawable.casa2,"Merlo", 150000));
        lista.add(new Inmueble(R.drawable.casa3,"Villa Mercedes", 80000));
        lista.add(new Inmueble(R.drawable.casa4,"Carolina", 120000));
        lista.add(new Inmueble(R.drawable.casa5,"Trapiche", 90000));
        inmueblesMutable.setValue(lista);
    }
}
