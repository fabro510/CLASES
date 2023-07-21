package tema2;

public class ejercicio2 {
    
    public static void main(String[] args) {
        barrera();
        mostrar("ACTIVIDAD 1");
        mostrar(" El porcentaje de iva es de: "+iva);
        mostrar(" El monto a calcular es: "+precio);
        int Total = calcularIva(precio);
        mostrar(" El precio con iva incluido es: "+Total);
        barrera();
    }
    static int precio=100;
    static int iva=35;
    static int calcularIva(int precio){
        mostrar(" /calculando---");
        precio+=precio*iva/100;
        return precio;
    }



    
    public static void mostrar(String texto){
        System.out.println(texto);
    }
    static void barrera(){
        System.out.println("--------------------------------");
    }
}
