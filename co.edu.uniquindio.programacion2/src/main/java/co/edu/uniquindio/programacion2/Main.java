package co.edu.uniquindio.programacion2;

import co.edu.uniquindio.programacion2.model.Asociado;
import co.edu.uniquindio.programacion2.model.Vehiculo;
import co.edu.uniquindio.programacion2.model.Vehiculo_de_Carga;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculoDeCarga1 = new Vehiculo_de_Carga("lp","cholte","chebro","pink", 20000,4);
        Asociado asociado1 = new Asociado("Pedro", 01,"xwdxwxa","21213123");
        asociado1.addVehiculo(vehiculoDeCarga1);
        System.out.println(asociado1.toString());
    }

}