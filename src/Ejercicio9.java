public class Ejercicio9 {
    String [] productos = {"Heladera", "Lavarropas","Celular","Cocina","TV"};
    int [] precioOriginal = {700, 500, 900, 650, 560};

    public void calcularPrecioFinal(){
        double totalConDescuento = 0;
        for (int i = 0; i < precioOriginal.length; i++) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("El precio del producto "+productos[i]+" es de $"+precioOriginal[i]);
            totalConDescuento = precioOriginal[i] - (precioOriginal[i]*0.1);
            System.out.println("Aplicando el descuento queda en $"+totalConDescuento);
        }
    }
}
