package test.iso.b05;

/**
*   Class Name: MinimumWeightNotExceededException                           
*   Goal: Excepción que salta si los cuerpos no poseen un mínimo de    
*   masa.                                                        
*/

class MinimumWeightNotExceededException extends RuntimeException {

    /*Constructor*/
    public MinimumWeightNotExceededException(String message) {
        super(message);
    }
}
