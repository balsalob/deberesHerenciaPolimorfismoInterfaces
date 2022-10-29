public class Main {
    public static void main(String[] args) {
        Cliente maria = new Cliente(32, "Maria", 666444555, 20000);

        System.out.println("Esta es la cliente:");
        System.out.println(Integer.toString(maria.getEdad()));
        System.out.println(maria.getNombre());
        System.out.println(Integer.toString(maria.getTeléfono()));
        System.out.println(Integer.toString(maria.getCredito()));

        Trabajador paco = new Trabajador(45, "Paco", 611611611, 20000);

        System.out.println("Este es el trabajador:");
        System.out.println(Integer.toString(paco.getEdad()));
        System.out.println(paco.getNombre());
        System.out.println(Integer.toString(paco.getTeléfono()));
        System.out.println(Integer.toString(paco.getSalario()));
    }
}

