import java.util.Scanner;
public class Ejercicio1 {
    int [] ventas;

    public Ejercicio1(int dias){
        ventas = new int[dias];
    }

    public void cargarVentas(){
        int venta;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < ventas.length; i++){
            System.out.println("Ingresa el valor de la venta del dìa "+(i+1));
            venta = sc.nextInt();
            ventas[i] = venta;
        }
    }

    public int calcularVentasMensual(){
        int total = 0;
        for (int venta: ventas ) {
            total += venta;
        }
        return total;
    }

}
