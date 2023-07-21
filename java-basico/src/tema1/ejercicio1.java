package tema1;

public class ejercicio1 {
    

    public static void main(String[] args) {
        Byte a = 127;
        short b = 32767;
        int c =2147483647;
        long d = 2147483647;

        float e = 4.6f;
        double f = 6.69d;

        char g='a';
        boolean h=false;
        String i ="sexo";

        Integer j =null;

        mostrar("variable byte: "+a);
        mostrar("variable short: "+b);
        mostrar("variable int: "+c);
        mostrar("variable long: "+d);
        mostrar("variable float: "+e);
        mostrar("variable double: "+f);
        mostrar("variable char: "+g);
        mostrar("variable booblean: "+h);
        mostrar("variable sring: "+i);
        mostrar("variable integer: "+j);
    }
    
    public static void mostrar(String texto){
        System.out.println(texto);
    }
}
