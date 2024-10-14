public class main {
    public static void main(String[] args) {
        Ejercicio1 funcion1 = new Ejercicio1(5);
        funcion1.cargarVentas();

        System.out.println("El valor total de la venta es de $"+funcion1.calcularVentasMensual());

        Ejercicio3 funcion2 = new Ejercicio3();
        funcion2.enviarFacturas();

        Ejercicio4 funcion3 = new Ejercicio4();
        funcion3.calcularDescuento();

        Ejercicio5 funcion4 = new Ejercicio5();
        funcion4.cantidadDeCalificaciones(5);
        funcion4.cargarCalificacion();
        System.out.println("El promedio de satisfacción de los clientes es de "+ funcion4.calcularPromedio());

        Ejercicio6 funcion5 = new Ejercicio6();
        funcion5.cantidadDeFacturas(5);
        funcion5.cargarFacturas();
        funcion5.calcularImpuesto();

        Ejercicio7 funcion6 = new Ejercicio7();
        funcion6.cargarCantidadDeCompras(5);
        funcion6.cargarCompras();
        funcion6.aplicarDescuento();

        Ejercicio8 funcion7 = new Ejercicio8();
        funcion7.calcularPagoSemanal();

        Ejercicio9 funcion8 = new Ejercicio9();
        funcion8.calcularPrecioFinal();

    }
}
