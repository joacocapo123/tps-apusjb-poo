public class Tablero {

    //atributos

   private Casillero[][] casillero;

    //constructor

    public Tablero(){

    }

     // Constructor vacío (punto 1.c)
    public Tablero() {
    }
 
    // Constructor completo (punto 1.d)
    public Tablero(Casillero[][] casillero) {
        this.casillero = casillero;
    }
 
    // Getters y setters (punto 1.b)
    public Casillero[][] getCasillero() {
        return casillero;
    }
 
    public void setCasillero(Casillero[][] casillero) {
        this.casillero = casillero;
    }
}
