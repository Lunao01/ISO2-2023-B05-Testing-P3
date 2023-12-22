package test.iso.b05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void test_cp1_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = -100;
        
        // Cuerpo 2
        double peso_b = Double.MIN_VALUE;
        
        double distancia = -100000;
        
        
    }
    
    @Test
    public void test_cp2_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = 2000;
        
        // Cuerpo 2
        double peso_b = Double.MAX_VALUE;
        
        double distancia = 200000;
        
    }
    
    @Test
    public void test_cp3_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = 1289000000;
        
        // Cuerpo 2
        double peso_b = Double.MIN_VALUE - 1;
        
        double distancia = 0;
        
    }
    
    @Test
    public void test_cp4_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = 0;
        
        // Cuerpo 2
        double peso_b = Double.MAX_VALUE + 1;
        
        double distancia = -1;
        
    }
    
    @Test
    public void test_cp5_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = 100000;
        
        // Cuerpo 2
        double peso_b = -100;
        
        double distancia = 1;
        
    }
    
    @Test
    public void test_cp6_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = -1;
        
        // Cuerpo 2
        double peso_b = 2000;
        
        double distancia = Double.MIN_VALUE;
        
    }
    
    @Test
    public void test_cp7_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = 1;
        
        // Cuerpo 2
        double peso_b = 1289000000;
        
        double distancia = Double.MAX_VALUE;
        
    }
    
    @Test
    public void test_cp8_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = 99999;
        
        // Cuerpo 2
        double peso_b = 0;
        
        double distancia = Double.MIN_VALUE - 1;
        
    }
    
    @Test
    public void test_cp9_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = 100001;
        
        // Cuerpo 2
        double peso_b = 100000;
        
        double distancia = Double.MAX_VALUE + 1;
        
    }
    
    @Test
    public void test_cp10_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = Double.MIN_VALUE;
        
        // Cuerpo 2
        double peso_b = -1;
        
        double distancia = 1;
        
    }
    
    @Test
    public void test_cp11_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = Double.MAX_VALUE;
        
        // Cuerpo 2
        double peso_b = 1;
        
        double distancia = -1;
        
    }
    
    @Test
    public void test_cp12_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = Double.MIN_VALUE - 1;
        
        // Cuerpo 2
        double peso_b = 99999;
        
        double distancia = 0;
        
    }
    
    @Test
    public void test_cp13_gravedad()
    {
    	// Cuerpo 1
    	double peso_a = Double.MAX_VALUE + 1;
        
        // Cuerpo 2
        double peso_b = 100001;
        
        double distancia = 0;
        
    }
    
    @Test
    public void test_cp1_distancia()
    {
    	// Cuerpo 1
        double ax = -100000;
        double ay = Double.MIN_VALUE;
        double az = -100000;
        
        // Cuerpo 2
        double bx = Double.MIN_VALUE;
        double by = Double.MAX_VALUE + 1;
        double bz = 1;
        
    }
    
    @Test
    public void test_cp2_distancia()
    {
    	// Cuerpo 1
        double ax = 200000;
        double ay = Double.MAX_VALUE + 1;
        double az = 1;
        
        // Cuerpo 2
        double bx = 0;
        double by = -1;
        double bz = 1;
        
    }
    
    @Test
    public void test_cp3_distancia()
    {
    	// Cuerpo 1
        double ax = 0;
        double ay = Double.MIN_VALUE - 1;
        double az = 0;
        
        // Cuerpo 2
        double bx = Double.MIN_VALUE - 1;
        double by = Double.MAX_VALUE;
        double bz = 0;
        
    }
    
    @Test
    public void test_cp4_distancia()
    {
    	// Cuerpo 1
        double ax = -1;
        double ay = Double.MAX_VALUE + 1;
        double az = -1;
        
        // Cuerpo 2
        double bx = Double.MAX_VALUE + 1;
        double by = Double.MIN_VALUE;
        double bz = 200000;
        
    }
    
    @Test
    public void test_cp5_distancia()
    {
    	// Cuerpo 1
        double ax = 1;
        double ay = -100000;
        double az = 1;
        
        // Cuerpo 2
        double bx = -100000;
        double by = 1;
        double bz = -100000;
        
    }
    
    @Test
    public void test_cp6_distancia()
    {
    	// Cuerpo 1
        double ax = Double.MIN_VALUE;
        double ay = 200000;
        double az = Double.MIN_VALUE;
        
        // Cuerpo 2
        double bx = 200000;
        double by = -1;
        double bz = Double.MAX_VALUE + 1;
        
    }
    
    @Test
    public void test_cp7_distancia()
    {
    	// Cuerpo 1
        double ax = Double.MAX_VALUE;
        double ay = 0;
        double az = Double.MAX_VALUE;
        
        // Cuerpo 2
        double bx = 0;
        double by = 0;
        double bz = Double.MIN_VALUE - 1;
        
    }
    
    @Test
    public void test_cp8_distancia()
    {
    	// Cuerpo 1
        double ax = Double.MIN_VALUE - 1;
        double ay = -1;
        double az = Double.MIN_VALUE - 1;
        
        // Cuerpo 2
        double bx = -1;
        double by = 200000;
        double bz = Double.MAX_VALUE;
        
    }
    
    @Test
    public void test_cp9_distancia()
    {
    	// Cuerpo 1
        double ax = Double.MAX_VALUE + 1;
        double ay = 1;
        double az = Double.MAX_VALUE + 1;
        
        // Cuerpo 2
        double bx = 1;
        double by = -100000;
        double bz = Double.MIN_VALUE;
        
    }
   
    
}