package modulo3_1_actividad12;

public class Actividad12 {
    public static void main(String[] args) throws Exception {
        String nombre = "Carlos";
        String departamento = "Ventas";
        double salarioMensual = 1800.0;
        boolean activo = true;
        
        double salarioAnual;
        salarioAnual = salarioMensual * 12;

        // TODO: calcula el salario anual y muestra la tarjeta.
        System.out.println("Empleado: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario mensual: " + salarioMensual);
        System.out.println("Salario anual: " + salarioAnual);
        System.out.println("Activo: " + activo);
        
    }
}
