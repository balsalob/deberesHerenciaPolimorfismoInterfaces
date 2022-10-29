public class Persona {

    //Variables
    private int edad;
    private String nombre;
    private int teléfono;

    //Constructor

    public Persona(int edad, String nombre, int teléfono) {
        this.edad = edad;
        this.nombre = nombre;
        this.teléfono = teléfono;
    }

    //Getters y Setters

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }
}

