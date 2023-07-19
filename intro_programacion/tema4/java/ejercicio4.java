public class ejercicio4{
    public static void main(String[] args){
        System.out.println("ACTIVIDAD 1:");
        System.out.println("                ");
        int numeroif = 0;
        System.out.println("La variable numeroif es =" + numeroif);
        if (numeroif == 0){
            System.out.println("El numero es 0");
        }else if(numeroif < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }
        System.out.println("                ");
        System.out.println("ACTIVIDAD 2:");
        System.out.println("                ");
        int numerowhile=0;
        System.out.println("La variable numerowhile es =" + numerowhile);
        while (numerowhile < 3){
            System.out.println(numerowhile);
            numerowhile++;
        }
        System.out.println("                ");
        System.out.println("ACTIVIDAD 3:");
        System.out.println("                ");
        System.out.println("La variable numerowhile es =" + numerowhile);
        do {
            System.out.println(numerowhile);
            numerowhile++;
        } while (numerowhile<3);
        System.out.println("                ");
        System.out.println("ACTIVIDAD 4:");
        System.out.println("                ");
        System.out.println("La varialbe numerofor es = 0");
        for(int numerofor=0;numerofor<=3;numerofor++){
            System.out.println(numerofor);
        }
        System.out.println("                ");
        System.out.println("ACTIVIDAD 5:");
        System.out.println("                ");
        String estacion="verano";
        System.out.println("La variable estacion es =" + estacion);
        switch (estacion) {
            case "verano": 
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
            default:
                System.out.println("Esta variable no es una estacion");
                break;
        }
        System.out.println("                ");
    }
}