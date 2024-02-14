package co.edu.uniquindio.programacion2.model;

public class Vehiculo_de_Carga extends Vehiculo {
    private int capacidad_de_carga;
    private int numero_de_ejes_vehiculo;

    public Vehiculo_de_Carga() {
    }

    public Vehiculo_de_Carga(String placa, String modelo, String marca, String color, int capacidad_de_carga,
                             int numero_de_ejes_vehiculo) {
        super(placa, modelo, marca, color);
        this.capacidad_de_carga = capacidad_de_carga;
        this.numero_de_ejes_vehiculo = numero_de_ejes_vehiculo;
    }

    public int getCapacidad_de_carga() {
        return capacidad_de_carga;
    }

    public void setCapacidad_de_carga(int capacidad_de_carga) {
        this.capacidad_de_carga = capacidad_de_carga;
    }

    public int getNumero_de_ejes_vehiculo() {
        return numero_de_ejes_vehiculo;
    }

    public void setNumero_de_ejes_vehiculo(int numero_de_ejes_vehiculo) {
        this.numero_de_ejes_vehiculo = numero_de_ejes_vehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo_de_Carga [capacidad_de_carga=" + capacidad_de_carga + ", numero_de_ejes_vehiculo="
                + numero_de_ejes_vehiculo + "]";
    } 
}
