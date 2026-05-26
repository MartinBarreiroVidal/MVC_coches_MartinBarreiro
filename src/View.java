import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario.
 */
public class View {

    /** Scanner para leer lo que escribe el usuario. */
    Scanner scanner = new Scanner(System.in);

    /**
     * Muestra el menú y devuelve la opción elegida por el usuario.
     * @return opción introducida como int
     */
    public int mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Crear coche");
        System.out.println("2. Mostrar velocidad");
        System.out.println("3. Avanzar");
        System.out.println("4. Cargar gasolina");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion: ");
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Pide al usuario los datos para crear un coche.
     * @return array con [0]=modelo y [1]=matricula
     */
    public String[] pedirDatosCoche() {
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();
        return new String[]{modelo, matricula};
    }

    /**
     * Pide al usuario una matrícula.
     * @return matrícula introducida
     */
    public String pedirMatricula() {
        System.out.print("Matricula: ");
        return scanner.nextLine();
    }

    /**
     * Pide al usuario los metros que quiere avanzar.
     * @return metros introducidos como int
     */
    public int pedirMetros() {
        System.out.print("Metros a avanzar: ");
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Pide al usuario los litros que quiere cargar.
     * @return litros introducidos como int
     */
    public int pedirLitros() {
        System.out.print("Litros a cargar: ");
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Muestra la velocidad de un coche por pantalla.
     * @param matricula matrícula del coche
     * @param v velocidad del coche
     * @return true si se ha mostrado correctamente
     */
    public boolean muestraVelocidad(String matricula, Integer v) {
        System.out.println(matricula + ": " + v + " km/h");
        return true;
    }

    /**
     * Muestra los kilómetros recorridos de un coche por pantalla.
     * @param matricula matrícula del coche
     * @param metros metros acumulados del coche
     * @return true si se ha mostrado correctamente
     */
    public boolean muestraKilometros(String matricula, int metros) {
        double km = metros / 1000.0;
        System.out.println(matricula + " ha recorrido " + km + " km");
        return true;
    }

    /**
     * Muestra los litros de gasolina actuales de un coche por pantalla.
     * @param matricula matrícula del coche
     * @param litros litros totales en el depósito
     * @return true si se ha mostrado correctamente
     */
    public boolean muestraGasolina(String matricula, int litros) {
        System.out.println(matricula + " tiene " + litros + " litros en el deposito");
        return true;
    }
}