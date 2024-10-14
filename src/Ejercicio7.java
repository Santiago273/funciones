import java.util.Scanner;

public class Ejercicio7 {
    int [] compras;

    public void cargarCantidadDeCompras(int cantidad){
        compras = new int[cantidad];
    }

    public void cargarCompras(){
        Scanner sc = new Scanner(System.in);
        int compra;
        for (int i = 0; i < compras.length; i++) {
            System.out.println("Ingrese el valor de la compra número "+(i+1));
            compra = sc.nextInt();
            compras[i] = compra;
        }
    }

    public void aplicarDescuento(){
        double descuento;
        for (int i = 0; i < compras.length; i++) {
            System.out.println("------------Ticket de la compra Nª"+(i+1)+"------------");
            System.out.println("Subtotal $"+compras[i]);
            if (compras[i] > 500){
                descuento = compras[i]-(compras[i] * 0.15);
                System.out.println("Total: $"+descuento);
            }else {
                System.out.println("Total $"+compras[i]);
            }
        }
    }
}
