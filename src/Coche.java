/**
 * Clase que representa un coche con matrícula, modelo, velocidad, metros recorridos y gasolina.
 */
public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    Integer metros;
    Integer gasolina;

    /**
     * Constructor que crea un coche con velocidad, metros y gasolina en 0.
     * @param modelo modelo del coche
     * @param matricula identificador único del coche
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.metros = 0;
        this.gasolina = 0;
    }
}