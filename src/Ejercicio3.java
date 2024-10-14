
public class Ejercicio3 {
    String [] clientes = {"Jorge", "Raul","Bianca","Graciela","Alberto"};
    int [] facturas = {300, 400, 560, 200, 800};


    public void enviarFacturas(){
        System.out.println("Los deudores son:");
        for (int i = 0; i < facturas.length; i++){
            if (facturas[i] > 500){
                System.out.println(clientes[i]);
            }
        }
    }
}
