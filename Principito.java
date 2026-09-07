// Clase principal
public class Principito{
    private String dedicacion;
    private int diasCuidando;
    private int planetasVisitados;
    private String viaje;
    private Flor flor;

// Constructores
    // clase para instanciar sin pasar valores
    public Principito(){        
    }

    public Principito(String dedicacion, int diasCuidando, int planetasVisitados, String viaje, Flor flor) {
        this.dedicacion = dedicacion;
        this.diasCuidando = diasCuidando;
        this.planetasVisitados = planetasVisitados;
        this.viaje = viaje;
        this.flor = flor;       
    }

    public String getDedicacion() {
        return dedicacion;
    }
    public void setDedicacion(String dedicacion){
        this.dedicacion = dedicacion;
    }

    public int getDiasCuidando(){
        return diasCuidando;
    }
    public void setDiasCuidando(int diasCuidando){
        this.diasCuidando = diasCuidando;
    }    

    public int getPlanetasVisitados(){
        return planetasVisitados;
    }
    public void setPlanetasVisitados(int planetasVisitados){
        this.planetasVisitados = planetasVisitados;
    }

    public String getViaje(){
        return viaje;
    }
    public void setViaje(String viaje){
        this.viaje = viaje;
    }

    public Flor getFlor(){
        return flor;
    }
    public void setFlor(Flor flor){
        this.flor = flor;
    }
}