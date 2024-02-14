package co.edu.uniquindio.programacion2.model;

import java.util.ArrayList;

public class Asociado {
    private String nombre;
    private int numero_identificacion;
    private String email;
    private String numero_celular;
    private ArrayList<Vehiculo> listaVehiculo;

    public Asociado(String nombre, int numero_identificacion, String email, String numero_celular) {
        this.nombre = nombre;
        this.numero_identificacion = numero_identificacion;
        this.email = email;
        this.numero_celular = numero_celular;
        this.listaVehiculo = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo){
        this.listaVehiculo.add(vehiculo);
        System.out.println("Melo"+ vehiculo.toString());
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(int numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

    public ArrayList<Vehiculo> getListaVehiculo() {
        return listaVehiculo;
    }

    public void setListaVehiculo(ArrayList<Vehiculo> listaVehiculo) {
        this.listaVehiculo = listaVehiculo;
    }

    @Override
    public String toString() {
        return "Asociado{" +
                "nombre='" + nombre + '\'' +
                ", numero_identificacion=" + numero_identificacion +
                ", email='" + email + '\'' +
                ", numero_celular='" + numero_celular + '\'' +
                ", listaVehiculo=" + listaVehiculo +
                '}';
    }
}
