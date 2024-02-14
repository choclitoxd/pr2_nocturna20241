package co.edu.uniquindio.programacion2.model;

import java.util.ArrayList;
import java.util.Objects;

public class Transportadora {
    private String nombre;
    private ArrayList<Asociado> listaAsociado = new ArrayList<>();
    private ArrayList<Vehiculo_de_Carga> listaVehiculoCarga = new ArrayList<>();
    private ArrayList<Vehiculo_de_Pasajeros> listaVehiculoPasajero = new ArrayList<>();
    public Transportadora(String nombre) {
        this.nombre = nombre;
    }

    public Transportadora() {
    }
    public ArrayList<Asociado> getListaAsociado() {
        return listaAsociado;
    }
    public void setListaAsociado(ArrayList<Asociado> listaAsociado) {
        this.listaAsociado = listaAsociado;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo_de_Carga> getListaVehiculoCarga() {
        return listaVehiculoCarga;
    }

    public void setListaVehiculoCarga(ArrayList<Vehiculo_de_Carga> listaVehiculoCarga) {
        this.listaVehiculoCarga = listaVehiculoCarga;
    }

    public ArrayList<Vehiculo_de_Pasajeros> getListaVehiculoPasajero() {
        return listaVehiculoPasajero;
    }

    public void setListaVehiculoPasajero(ArrayList<Vehiculo_de_Pasajeros> listaVehiculoPasajero) {
        this.listaVehiculoPasajero = listaVehiculoPasajero;
    }
    public void addVehiculo(Object vehiculo){
        if (vehiculo instanceof Vehiculo_de_Pasajeros)
            this.listaVehiculoPasajero.add((Vehiculo_de_Pasajeros) vehiculo);
        else
            this.listaVehiculoCarga.add((Vehiculo_de_Carga) vehiculo);
    }
}
