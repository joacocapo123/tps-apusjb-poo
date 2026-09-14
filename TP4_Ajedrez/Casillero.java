public class Casillero {

    // atributos
    private String color;
    private String coordenadas;

    //constructores

    public Casillero(){

    }

    public Casillero(String color, String coordenadas){
        this.color = color;
        this.coordenadas = coordenadas;

    }

    // getters y setters

    public String getColor(){
        return color;
    }

    public void setColor(String color){

        this.color = color;
    }

    public String getCoordenadas(){

        return coordenadas;
    }

    public void setCoordenadas(String coordenadas){

        this.coordenadas = coordenadas;
    }


}