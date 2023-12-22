package test.iso.b05;

/**
*   Class Name: BodiesEqualPositionException                           
*   Goal: Excepción que salta si los cuerpos se encuentran en el mismo 
*   punto del plano (imposible).                                            
*/

class BodiesEqualPositionException extends RuntimeException {

    /*Constructores*/
    public BodiesEqualPositionException() {
    }

    public BodiesEqualPositionException(String message) {
        super(message);
    }

    public BodiesEqualPositionException(String message, Throwable cause) {
        super(message, cause);
    }

    public BodiesEqualPositionException(Throwable cause) {
        super(cause);
    }

    public BodiesEqualPositionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    

     
}
