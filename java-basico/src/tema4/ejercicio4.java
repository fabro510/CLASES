package tema4;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("ACTIVIDAD 1");
        smartPhone telefono = new smartPhone("motorola", "j9 play","rojo","17 cm", 64,5000);
        telefono.mostrarDatos();
        System.out.println("");
        System.out.println(" -----------------------------------");
        System.out.println("");
        smartWatch reloj = new smartWatch("Sansung", "mid 21", "azul", "4 cm", 8, 3000);
        reloj.mostrarDatos();
        System.out.println("------------------------------------");
    }
}
class smartDevice{
    protected String modelo;
    protected String marca;
    protected String color;
    protected String tamaño;
    protected int memoria;
    protected int bateria;
}

class smartPhone extends smartDevice{
    //contructor vacio
    public smartPhone(){
        System.out.println(" /creando objeto---");
    }
    //constructor con parametros
    public smartPhone(String marca,String modelo,String color, String tamaño, int memoria,int bateria){
        System.out.println(" /creando objeto-");
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.bateria = bateria;
        System.out.println(" /objeto creado--");
    }
    //mostrar parametros
    public void mostrarDatos(){
        System.out.println(" /mostrando datos---");
        System.out.println("");
        System.out.println(" Datos del telefono:");
        System.out.println(" Marca: "+this.marca);
        System.out.println(" Modelo: "+this.modelo);
        System.out.println(" Color: "+this.color);
        System.out.println(" Tamaño: "+this.tamaño);
        System.out.println(" Memoria: "+this.memoria);
        System.out.println(" Bateria: "+this.bateria);
    }
}

class smartWatch extends smartDevice{
    //contructor vacio
    public smartWatch(){
        System.out.println(" /creando objeto---");
    }
    //constructor con parametros
    public smartWatch(String marca,String modelo,String color, String tamaño, int memoria,int bateria){
        System.out.println(" /creando objeto-");
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.bateria = bateria;
        System.out.println(" /objeto creado--");
    }
    //mostrar parametros
    public void mostrarDatos(){
        System.out.println(" /mostrando datos---");
        System.out.println("");
        System.out.println(" Datos del telefono:");
        System.out.println(" Marca: "+this.marca);
        System.out.println(" Modelo: "+this.modelo);
        System.out.println(" Color: "+this.color);
        System.out.println(" Tamaño: "+this.tamaño);
        System.out.println(" Memoria: "+this.memoria);
        System.out.println(" Bateria: "+this.bateria);
    }
}

