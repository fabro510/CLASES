package intro_programacion.tema9.java;

public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("ACTIVIDAD 1:");
        cliente cliente1 = new cliente();
        cliente1.nombre = "Olmos Benjamin Cuello";
        System.out.println(" /se ingreso en nombre del cliente");
        cliente1.edad = 16;
        System.out.println(" /se ingreso la edad del cliente");
        cliente1.telefono = 351268915;
        System.out.println(" /se ingreso el telefono del cliente");
        System.out.println(" ");
        System.out.println(" Todos los datos se ingresaron correctamente");
        cliente1.credito = 12000;
        System.out.println(" /se cargo el credito del cliente");
        System.out.println(" ");
        System.out.println(" A continuacion se mostraran todos los datos finales del cliente:");
        System.out.println(" -Nombre:"+cliente1.nombre);
        System.out.println(" -Edad:"+cliente1.edad);
        System.out.println(" -Telefono:"+cliente1.telefono);
        System.out.println(" -Monto del credito:"+cliente1.credito);
        System.out.println("--------------------------------------------------");
        System.out.println("ACTIVIDAD 2:");
        trabajador trabajador1 = new trabajador();
        trabajador1.nombre = "Italo Montalvo Verdeneli";
        System.out.println(" /se ingreso en nombre del empleado");
        trabajador1.edad = 18;
        System.out.println(" /se ingreso la edad del empleado");
        trabajador1.telefono = 351593589;
        System.out.println(" /se ingreso el telefono del empleado");
        System.out.println(" ");
        System.out.println(" Todos los datos se ingresaron correctamente");
        trabajador1.salario = 40000;
        System.out.println(" /se cargo el sueldo del cliente");
        System.out.println(" ");
        System.out.println(" A continuacion se mostraran todos los datos finales:");
        System.out.println(" -Nombre:"+trabajador1.nombre);
        System.out.println(" -Edad:"+trabajador1.edad);
        System.out.println(" -Telefono:"+trabajador1.telefono);
        System.out.println(" -Sueldo del trabajador"+trabajador1.salario);
        System.out.println("--------------------------------------------------");
    }
}
class persona{
    String nombre;
    int edad;
    int telefono;
}

class cliente extends persona{
    int credito;
}

class trabajador extends persona{
    int salario;
}