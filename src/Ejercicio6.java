import java.util.Scanner;

public class Ejercicio6 {
    int [] facturas;

    public void cantidadDeFacturas(int valor){
        facturas = new int[valor];
    }

    public void cargarFacturas(){
        Scanner sc = new Scanner(System.in);
        int factura;
        for (int i = 0; i < facturas.length; i++) {
            System.out.println("Ingrese el monto de la factura número "+(i+1));
            factura = sc.nextInt();
            facturas[i] = factura;
        }
    }

    public void calcularImpuesto(){
        double impuesto = 0;
        for (int i = 0; i < facturas.length; i++) {
            impuesto = facturas[i]*0.21;

            System.out.println("El valor del impuesto de la factura Nº "+(i+1)+" es de $"+impuesto);
        }
    }
}
