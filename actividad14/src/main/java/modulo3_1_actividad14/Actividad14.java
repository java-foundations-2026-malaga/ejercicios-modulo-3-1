package modulo3_1_actividad14;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        String producto = "Agenda";
        double precioUnitario = 12.5;
        int cantidad = 3;
        double impuesto = 0.21;
        double subtotal = precioUnitario*cantidad;
        double impuestoSub = subtotal*impuesto;
        double total = subtotal+impuestoSub;

        // TODO: calcula subtotal, impuesto aplicado y total.
        //"Producto: Agenda\nSubtotal: 37.5\nImpuesto: 7.875\nTotal: 45.375"
        System.out.println("Producto: "+producto+"\nSubtotal: "+subtotal+"\nImpuesto: "+impuestoSub+"\nTotal: "+total);
    }
}
