public class Main {
    public static void main(String[] args) {
        var numeroIf = 12;
        if (numeroIf > 0) System.out.print("El numero " + numeroIf + " es positivo");
        if (numeroIf < 0) System.out.print("El numero " + numeroIf + " es negativo");
        if (numeroIf == 0) System.out.print("El numero es 0");
    }

    static {
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    static {
        int numeroWhile = 3;
        do {
            System.out.println(numeroWhile);
        }
        while (numeroWhile < 3);
    }

    static {
        int numeroFor =0;
        for (; numeroFor <=3; numeroFor++) ;
        System.out.println(numeroFor);
    }

    static {
        var estacion="primavera";
        switch (estacion) {
            case "verano": System.out.println("Ir de vacaciones");
                break;
            case "invierno": System.out.println("Abrigarse");
                break;
            case "otoño": System.out.println("Barrer las hojas");
                break;
            case "primavera": System.out.println("Ir de fiesta");
                break;
            default: System.out.println("Colocar un nombre de estacion");
        }
    }

}
