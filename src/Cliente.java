public class Cliente extends Persona{

    //variable
    private int credito;

    //constructor
    public Cliente(int edad, String nombre, int teléfono, int credito) {
        super(edad, nombre, teléfono);
        this.credito = credito;
    }

    //Getters y Setters
    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

