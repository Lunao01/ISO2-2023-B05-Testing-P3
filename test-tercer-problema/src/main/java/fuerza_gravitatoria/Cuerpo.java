package fuerza_gravitatoria;

/**
*   Class Name: Cuerpo                                                 
*   Goal: Representar un cuerpo, se guarda información sobre su id,    
*   peso, posición en los ejes X, Y y Z.                         
*/

public class Cuerpo {
    
    /*Variables*/
    private String id;
    private double peso; // (Mg) 1 megagramo (tonelada)
    private double pos_x; // (parsec)
    private double pos_y; // (parsec)
    private double pos_z; // (parsec)
    
    /*El parsec es una unidad utilizada para medir distancias entre cuerpos celestes 
    muy distantes en el Sistema Solar y equivale a 3,084.10^13 kilómetros*/
    
    /*Constructor*/
    public Cuerpo(String id, double peso, double pos_x, double pos_y, double pos_z) {
        this.setId(id);
        this.setPeso(peso); 
        this.setPos_x(pos_x);
        this.setPos_y(pos_y);
        this.setPos_z(pos_z);
    }
    
    /*Métodos get*/
    public String getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public double getPos_x() {
        return pos_x;
    }

    public double getPos_y() {
        return pos_y;
    }

    public double getPos_z() {
        return pos_z;
    }
    
    
    /*Métodos set*/
    public void setId(String id) {
        this.id = id;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPos_x(double pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(double pos_y) {
        this.pos_y = pos_y;
    }

    public void setPos_z(double pos_z) {
        this.pos_z = pos_z;
    }
    
    /*toString*/
    @Override
    public String toString() {
        return "Cuerpo{" + "id=" + id + ", peso=" + peso + ", pos_x=" + pos_x + ", pos_y=" + pos_y + ", pos_z=" + pos_z + '}';
    }
    
    
}//end of class
