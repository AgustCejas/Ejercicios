public class Main {
    public static void main(String[] args){
    Persona persona1 = new Persona();
    persona1.setEdad(23);
    persona1.setNombre("Agustin");
    persona1.setTelefono(4784021);
        System.out.println (persona1.getNombre());
        System.out.println ("edad:" + persona1.getEdad());
        System.out.println ("telefono:" + persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombres) {
        this.nombre = nombres;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}