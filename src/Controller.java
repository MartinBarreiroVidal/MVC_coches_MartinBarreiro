/**
 * Clase principal que conecta la vista con el modelo y gestiona el flujo de la aplicación.
 */
public class Controller {

    /**
     * Método principal que arranca la aplicación.
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {

        View miView = new View();
        Model miModel = new Model();

        boolean salir = false;

        while (!salir) {

            int opcion = miView.mostrarMenu();

            if (opcion == 1) {
                // recogemos los datos y creamos el coche en el modelo
                String[] datos = miView.pedirDatosCoche();
                miModel.crearCoche(datos[0], datos[1]);
                System.out.println("Coche creado correctamente.");

            } else if (opcion == 2) {
                // buscamos el coche y mostramos su velocidad
                String matricula = miView.pedirMatricula();
                if (miModel.getCoche(matricula) != null) {
                    miView.muestraVelocidad(matricula, miModel.getVelocidad(matricula));
                } else {
                    System.out.println("No existe ningun coche con esa matricula.");

                }

            } else if (opcion == 3) {
                // pedimos matrícula y metros, avanzamos y mostramos el total
                String matricula = miView.pedirMatricula();
                if (miModel.getCoche(matricula) != null) {
                    int metros = miView.pedirMetros();
                    int total = miModel.avanzar(matricula, metros);
                    miView.muestraKilometros(matricula, total);
                } else {
                    System.out.println("No existe ningun coche con esa matricula.");
                }

            } else if (opcion == 4) {
                // pedimos matrícula y litros, ponemos gasolina y mostramos el total
                String matricula = miView.pedirMatricula();
                if (miModel.getCoche(matricula) != null) {
                    int litros = miView.pedirLitros();
                    int total = miModel.ponerGasolina(matricula, litros);
                    miView.muestraGasolina(matricula, total);
                } else {
                    System.out.println("No existe ningun coche con esa matricula.");
                }

            } else if (opcion == 5) {
                salir = true;
                System.out.println("Saliendo...");

            } else {
                System.out.println("Opcion no valida.");
            }
        }
    }
}