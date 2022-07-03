public class Main {
    public static void main(String[] args) {
        int numeroIf = 12;
        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        } else {
            System.out.println("la variable es 0");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile ahora vale " + numeroWhile);
        }

        int numeroDoWhile = 3;
        do {
            System.out.println("numeroDoWhile ahora vale " + numeroDoWhile);
        }
        while (numeroDoWhile < 3);


        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) ;
        System.out.println("La variable numeroFor ahora vale " + numeroFor);

        var estacion = "invierno";
        switch (estacion) {
            case "verano":
                System.out.println("Ir de vacaciones");
                break;
            case "invierno":
                System.out.println("Abrigarse");
                break;
            case "otoño":
                System.out.println("Barrer las hojas");
                break;
            case "primavera":
                System.out.println("Ir de fiesta");
                break;
            default:
                System.out.println("Colocar un nombre de estacion");
        }
    }
}
