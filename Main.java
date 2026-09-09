
public class Main {
    public static void main(String[] args) {

        // instanciación de un objeto de la clase Flor

        Flor flor = new Flor("vanidosa", "hermosa",
         "agradecida", 3); 

         //flor a medida

        Flor flor2 = new Flor ();

        flor2.setActitud("buena");

        flor2.setApariencia("Timida");

        flor2.setEstado("Alegre");

        flor2.setCantidadOrugas(3); 


        

        System.out.println(" FLOR DEL TEXTO LITERARIO ");
        flor.imprimirTextoDinamico(); // Punto 2.c

        System.out.println("\n FLOR A MEDIDA ");
        flor2.imprimirTextoDinamico(); // Punto 2.d

        

        Principito elPrincipito = new Principito(flor);
        
        elPrincipito.imprimirFlorPrincipito(); // Punto 3


        
    }
}