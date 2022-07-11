
public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(23, 478, "Nahuel", 12);
        Trabajador trabajador1 = new Trabajador(28, 4784576, "David", 270);

        System.out.println("CLIENTE " + cliente1.nombre);
        System.out.println ("EDAD " + cliente1.edad);
        System.out.println ("TEL " + cliente1.telefono);
        System.out.println ("CREDITO " + cliente1.credito);
        System.out.println("TRABAJADOR " + trabajador1.nombre);
        System.out.println ("EDAD " + trabajador1.edad);
        System.out.println ("TEL " + trabajador1.telefono);
        System.out.println ("SALARIO " + trabajador1.salario);
    }
}
       class Persona {
            int edad;
            int telefono;
            String nombre;
        }
        class Cliente extends Persona {
            int credito;

            public Cliente(int edad, int telefono, String nombre, int credito) {
                this.edad = edad;
                this.telefono = telefono;
                this.nombre = nombre;
                this.credito = credito;
            }
        }
        class Trabajador extends Persona {
            int salario;

            public Trabajador (int edad, int telefono, String nombre, int salario) {
                this.edad = edad;
                this.telefono = telefono;
                this.nombre = nombre;
                this.salario = salario;
            }
        }
