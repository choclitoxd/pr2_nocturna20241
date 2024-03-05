package model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private double peso;
    private double estatura;

    public Cliente(String nombre, String apellido, String cedula, int edad, double peso, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
}
