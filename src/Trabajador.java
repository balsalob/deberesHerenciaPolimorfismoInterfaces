public class Trabajador extends Persona{

    //Variables
    private int salario;

    //constructor
    public Trabajador(int edad, String nombre, int teléfono, int salario) {
        super(edad, nombre, teléfono);
        this.salario = salario;
    }

    //Getters y Setters
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
