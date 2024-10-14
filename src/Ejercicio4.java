public class Ejercicio4 {
    String [] clientes = {"Jorger", "Raul", "Patricia", "Alejandro", "Jesica"};
    int [] compras = {30, 10, 7, 20, 5};


    public void calcularDescuento(){
        System.out.println("Se le aplica descuento del 10% a los siguientes clientes:");
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 10){
                System.out.println(clientes[i]);
            }
        }
    }
}
