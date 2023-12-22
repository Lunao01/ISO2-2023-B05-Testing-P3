package fuerza_gravitatoria;

/**
*   Class Name: MinimumWeightNotExceededException                           
*   Goal: Excepción que salta si los cuerpos no poseen un mínimo de    
*   masa.                                                        
*/

public class MinimumWeightNotExceededException extends RuntimeException {

    /*Constructor*/
    public MinimumWeightNotExceededException(String message) {
        super(message);
    }
}
