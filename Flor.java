// clase publica principal de la flor
public class Flor{
    private String Actitud;
    private String Apariencia;
    private String Estado;
    private int CantidadOrugas;
}

// Constructores de la clase
    // Constructor vacio para poder instaciar sin pasar valores
    public Flor(){
    }
    //Este no hace nada explícito, pero permite escribir new Flor(). El objeto se crea con los valores por defecto de Java (null para Strings, 0 para int)
    //Sirve para cuando querés crear el objeto primero y cargarle los datos después con los setters.
    public Flor(String actitud, String apariencia, String estado, int cantOrugas){
        this.Actitud = actitud
        this.Apariencia = apariencia
        this.Estado = estado
        this. CantidadOrugas = cantOrugas
    }

// Getters y Setters
    // un getter devuelve 
