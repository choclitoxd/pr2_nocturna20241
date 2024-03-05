import model.Cliente;
import model.ClienteVip;

public class Main {
    public static void main(String[] args) {
        crearCliente();
    }
    public static  void crearCliente(){
        Cliente cliente = new Cliente("Pablo", "Gonzales", "10282332",19, 61.2,1.78 );
        Cliente clienteBase = new Cliente("Leon", "Rios", "2121313");
        ClienteVip clienteVip = new ClienteVip("Leon", "Ramirez", "10922331",20,54.3, 1.78,"Granada", "Casado","gmail.com");
    }

}