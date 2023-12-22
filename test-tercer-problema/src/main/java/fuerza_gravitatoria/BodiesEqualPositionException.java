package fuerza_gravitatoria;

/**
*   Class Name: BodiesEqualPositionException                           
*   Goal: Excepción que salta si los cuerpos se encuentran en el mismo 
*   punto del plano (imposible).                                            
*/

public class BodiesEqualPositionException extends RuntimeException {

    /*Constructor*/
    public BodiesEqualPositionException(String message) {
        super(message);
    }  
}
