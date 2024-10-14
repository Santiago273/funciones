public class Ejercicio8 {
    String [] empleados = {"Jose", "Raul", "Enzo", "Alejando", "Fernando"};
    int [] horasTrabajadas = {32, 48, 50, 60, 30};

    public void calcularPagoSemanal(){
        int total = 0;
        for (int i = 0; i < horasTrabajadas.length; i++) {
            total = horasTrabajadas[i]*15;
            System.out.println("El pago correspondiente al empleado "+empleados[i]+" es de $"+total);
        }
    }
}
