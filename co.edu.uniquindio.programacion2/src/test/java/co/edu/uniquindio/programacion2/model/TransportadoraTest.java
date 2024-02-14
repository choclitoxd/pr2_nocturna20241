package co.edu.uniquindio.programacion2.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportadoraTest {

    @Test
    void addVehiculo() {
        Vehiculo_de_Carga vehiculoDeCarga = new Vehiculo_de_Carga();
        Transportadora transportadora = new Transportadora();
        transportadora.addVehiculo(vehiculoDeCarga);
        assertEquals(1, transportadora.getListaVehiculoCarga().size());
    }
}