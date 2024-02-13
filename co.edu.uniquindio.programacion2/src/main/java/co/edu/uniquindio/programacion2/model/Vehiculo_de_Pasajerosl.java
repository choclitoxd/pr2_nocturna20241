package co.edu.uniquindio.programacion2.model;

public class Vehiculo_de_Pasajerosl extends Vehiculo{
    private int numero_maximo_pasajeros;

    public Vehiculo_de_Pasajerosl(String placa, String modelo, String marca, String color,
            int numero_maximo_pasajeros) {
        super(placa, modelo, marca, color);
        this.numero_maximo_pasajeros = numero_maximo_pasajeros;
    }

    public int getNumero_maximo_pasajeros() {
        return numero_maximo_pasajeros;
    }

    public void setNumero_maximo_pasajeros(int numero_maximo_pasajeros) {
        this.numero_maximo_pasajeros = numero_maximo_pasajeros;
    }

    @Override
    public String toString() {
        return "Vehiculo_de_Pasajerosl [numero_maximo_pasajeros=" + numero_maximo_pasajeros + "]";
    }
}
