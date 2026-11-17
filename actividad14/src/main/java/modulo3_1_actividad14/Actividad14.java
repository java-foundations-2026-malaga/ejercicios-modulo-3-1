package modulo3_1_actividad14;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        String producto = "Agenda";
        double precioUnitario = 12.5;
        int cantidad = 3;
        double impuesto = 0.21;

        double subtotal = precioUnitario * cantidad;
        double importeImpuesto = subtotal * impuesto;
        double total = subtotal + importeImpuesto;

       System.out.println("Producto: " + producto);
       System.out.println("Subtotal: " + (precioUnitario * cantidad));
        System.out.println("Impuesto: " + (precioUnitario * cantidad * 0.21));
        System.out.println("Total: " + total);
        
    }
}
