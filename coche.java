public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();

        System.out.println(miCoche.puertas);
    }
}
class coche {
    public int puertas = 1;
    public void SumarPuerta(){
        this.puertas ++;
    }
}

