import java.util.Scanner;

public class Ejercicio5 {
    int [] calificaciones;

    public void cantidadDeCalificaciones(int valor){
        calificaciones = new int[valor];
    }

    public void cargarCalificacion(){
        Scanner sc = new Scanner(System.in);
        int calificacion;
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingrese la calificacion número "+(i+1));
            calificacion = sc.nextInt();
            calificaciones[i] = calificacion;
        }
    }

    public int calcularPromedio(){
        int promedio = 0;
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
            contador++;
        }
        promedio = suma/contador;
        return promedio;
    }

}
