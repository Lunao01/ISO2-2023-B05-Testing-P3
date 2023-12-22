package fuerza_gravitatoria;

/**
*   Class Name: FuerzaGravitatoria                                     
*   Goal: Clase encargada de realizar el cálculo de la fuerza          
*   gravitatoria entre dos objetos de clase Cuerpo.             
*/

public class FuerzaGravitatoria {
    

    public static final double G = 9.81; //Constante de gravitación universal
    
    
    /*Método para calcular la fuerza gravitatoria entre los cuerpos a y b*/
    public static double calcular_fuerza_gravitatoria(double peso_a, double peso_b, double distancia)throws BodiesEqualPositionException, MinimumWeightNotExceededException{
        double peso_min = 100000; //Peso mínimo establecido a 100000 toneladas
        if(peso_min > peso_a || peso_min > peso_b){
            throw new MinimumWeightNotExceededException("Error, los cuerpos deben superar una masa mínima de 100.000 toneladas.");
        }
        
        double resultado = G*(((peso_a*1000)*(peso_b*1000))/Math.pow( distancia * (3.084*Math.pow(10,16)),2));
                
        return resultado;
    }
    
    
    /*Método para calcular la distancia entre los cuerpos a y b*/
    public static double calcular_distancia(double ax, double ay, double az, double bx, double by, double bz){
        if (ax == bx && ay == by && az == bz){
            throw new BodiesEqualPositionException("Error, cuerpos en el mismo lugar.");
        }
        double f_1, f_2, f_3;
        f_1 = Math.pow(bx - ax, 2);
        f_2 = Math.pow(by - ay, 2);
        f_3 = Math.pow(bz - az, 2);
        
        return Math.sqrt(f_1 + f_2 + f_3);
    }
    
}

