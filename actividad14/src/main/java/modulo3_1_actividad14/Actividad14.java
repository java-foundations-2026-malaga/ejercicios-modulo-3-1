package modulo3_1_actividad14;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        String producto = "Agenda";
        double precioUnitario = 12.5;
        int cantidad = 3;
        double porcentajeIva = 0.21;

        double subtotal = precioUnitario * cantidad;
        double impuesto = subtotal * porcentajeIva;
        double total = subtotal + impuesto;

        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    }
}


        // TODO: calcula subtotal, impuesto aplicado y total.
