/**
 * Clase Principito

 * Sus atributos surgen de los sustantivos del pizarrón que NO se convirtieron
 * en clase propia (Dedicación, Días, Planetas, Viaje), ya que en el texto
 * son características/acciones asociadas al Principito, no a la Flor.
 */
public class Principito {

    //  ATRIBUTOS
    private String dedicacion;      //  sustantivo "Dedicación"
    private int diasCuidando;       //  sustantivo "Días" ("todos los días")
    private int planetasVisitados;  //  sustantivo "Planetas"
    private String viaje;           //  sustantivo "Viaje"
    private Flor flor;              //  la flor propia del Principito

    // CONSTRUCTORES

    // Constructor vacío
    public Principito() {
    }

    //  Constructor con todos los valores como parámetro
    public Principito(String dedicacion, int diasCuidando, int planetasVisitados, String viaje, Flor flor) {
        this.dedicacion = dedicacion;
        this.diasCuidando = diasCuidando;
        this.planetasVisitados = planetasVisitados;
        this.viaje = viaje;
        this.flor = flor;
    }

    //  GETTERS Y SETTERS  
    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public int getDiasCuidando() {
        return diasCuidando;
    }

    public void setDiasCuidando(int diasCuidando) {
        this.diasCuidando = diasCuidando;
    }

    public int getPlanetasVisitados() {
        return planetasVisitados;
    }

    public void setPlanetasVisitados(int planetasVisitados) {
        this.planetasVisitados = planetasVisitados;
    }

    public String getViaje() {
        return viaje;
    }

    public void setViaje(String viaje) {
        this.viaje = viaje;
    }

    public Flor getFlor() {
        return flor;
    }

    public void setFlor(Flor flor) {
        this.flor = flor;
    }

    // ------------------ PUNTO 3 ------------------
    /**
     * Imprime, desde el propio Principito, los valores de los atributos
     * de SU flor (this.flor). Tal como pide el enunciado: "imprimir los
     * valores de los atributos de la flor del principito desde el programa
     * principal mediante un método imprimirFlorPrincipito()".
     */
    public void imprimirFlorPrincipito() {
        System.out.println(" Flor del Principito ");
        System.out.println("Actitud    : " + flor.getActitud());
        System.out.println("Apariencia : " + flor.getApariencia());
        System.out.println("Estado     : " + flor.getEstado());
        System.out.println("Orugas     : " + flor.getCantidadOrugas());
    }
}
