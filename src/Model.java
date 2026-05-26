import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos de los coches.
 */
public class Model {

    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo añade al parking.
     * @param modelo modelo del coche
     * @param matricula identificador único del coche
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca un coche en el parking según su matrícula.
     * @param matricula matrícula a buscar
     * @return el coche encontrado, o null si no existe
     */
    public Coche getCoche(String matricula) {
        Coche aux = null;
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Cambia la velocidad de un coche.
     * @param matricula matrícula del coche
     * @param v nueva velocidad
     * @return la velocidad modificada
     */
    public int cambiarVelocidad(String matricula, Integer v) {
        getCoche(matricula).velocidad = v;
        return getCoche(matricula).velocidad;
    }

    /**
     * Devuelve la velocidad de un coche según su matrícula.
     * @param matricula matrícula del coche
     * @return velocidad del coche
     */
    public int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }

    /**
     * Suma metros al contador de kilómetros del coche.
     * @param matricula matrícula del coche
     * @param metros metros a añadir
     * @return total de metros acumulados
     */
    public int avanzar(String matricula, int metros) {
        getCoche(matricula).metros += metros;
        return getCoche(matricula).metros;
    }

    /**
     * Añade litros de gasolina al depósito del coche.
     * @param matricula matrícula del coche
     * @param litros litros a añadir
     * @return total de litros en el depósito
     */
    public int ponerGasolina(String matricula, int litros) {
        getCoche(matricula).gasolina += litros;
        return getCoche(matricula).gasolina;
    }
}