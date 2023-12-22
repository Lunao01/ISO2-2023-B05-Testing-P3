package test.iso.b05;

/**
*   Class Name: MinimumWeightNotExceededException                           
*   Goal: Excepción que salta si los cuerpos no poseen un mínimo de    
*   masa.                                                        
*/

class MinimumWeightNotExceededException extends RuntimeException {

    /*Constructores*/
    public MinimumWeightNotExceededException() {
    }

    public MinimumWeightNotExceededException(String message) {
        super(message);
    }

    public MinimumWeightNotExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public MinimumWeightNotExceededException(Throwable cause) {
        super(cause);
    }

    public MinimumWeightNotExceededException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    

     
}
