package Java;

public class ejercicio3{

    public static void main(String[] args) {
        coche micoche= new coche();
        System.out.println("EJERCICIO PARTE 1:");
        System.out.println("-El resultado de la suma de los 3 parametros(10, 20 y 40) es = " + suma(10,20,40));
        System.out.println("                    ");
        System.out.println("EJERCICIO PARTE 2:");
        System.out.println("-Cantidad de puertas iniciales del coche= " + micoche.puertascoche());
        micoche.agregarpuerta();
        System.out.println("-Cantidad de puertas de mi coche despues de los cambios = " + micoche.puertasmicoche());
        System.out.println("                    ");
    }
    
    public static int suma(int a, int b, int c){
        return a + b + c;
    }

    public static class coche {
    
    public int puertas = 4;
    //esto indica cuantas puertas tiene mi coche
    
    //metodos del objeto=

    //esto indica cuantas puertas tiene un coche
    public int puertasmicoche(){
        return puertas;
    }
    //esto muestra la cantidad de puertas en una varialbe tipo int como pide el ejercicio
    public int puertascoche(){
        return puertas;
    }
    //esto agrega una puerta como pide el ejercicio
    public void agregarpuerta(){
        this.puertas++;
        System.out.println("/Se agrego una puerta. Tu cantidad de puertas total de puertas ahora es = " + puertasmicoche());
    }
    //esto quita una puerta(lo hice por si las dudas)
    public void quitarpuerta() {
        this.puertas--;
        System.out.println("/Se quito una puerta. Tu cantidad de puertas total de puertas ahora es = " + puertasmicoche());
    }
    
}
}



