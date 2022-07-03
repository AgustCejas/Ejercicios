public class Main {

    public static void main(String[] args) {
        suma(10, 20, 30);

        coche miCoche = new coche();

         miCoche.SumarPuerta();
         miCoche.SumarPuerta();
            System.out.println("El numero de puertas es " + miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado);
    }

static class coche {
    public int puertas = 2;
    public void SumarPuerta(){
        this.puertas ++;
    }
}
}