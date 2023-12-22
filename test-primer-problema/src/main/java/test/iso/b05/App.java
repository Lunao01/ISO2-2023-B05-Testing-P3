package test.iso.b05;

import java.io.PrintStream;
import user.cli.Input;


import java.util.InputMismatchException;
import java.util.Scanner;



/**
 * Clase App para ejecutar el proyecto.
 *
 */
public class App
{
    
	public static void main(String[] args)
	{
	    /*Módulo para gestionar la entrada de datos*/
	    Input in = new Input(new Scanner(System.in), new PrintStream(System.out));
	    
	    /*Variables*/
	    Cuerpo a, b;

	    /*Introducción del servicio al cliente*/
	    System.out.println("########################################################");
	    System.out.println("#          CALCULADORA DE FUERZA GRAVITATORIA          #");
	    System.out.println("########################################################");
	    System.out.println("<--(Programa enfocado a cuerpos celestes)-->");
	    try{/*Se captura excepción por si el usuario inserta valores no válidos (strings)*/
		/*Valores para cuerpo 1*/
		System.out.println("Valores para cuerpo 1:");
		a = getNewCuerpo(in, "Cuerpo 1");

		/*Valores para cuerpo 2*/
		System.out.println("Valores para cuerpo 2:");
		b = getNewCuerpo(in, "Cuerpo 2");

		/*Se calcula la fuerza gravitatoria*/
		double distancia = FuerzaGravitatoria.calcular_distancia(a.getPos_x(), a.getPos_y(), a.getPos_z(), b.getPos_x(), b.getPos_y(), b.getPos_z());
		System.out.println("\nResultado: " + FuerzaGravitatoria.calcular_fuerza_gravitatoria(a.getPeso(), b.getPeso(), distancia) + " (N).");

	    }catch(InputMismatchException e){
		System.out.println("Error: Entrada de valor no válido.");
	    }catch(BodiesEqualPositionException e){
		System.out.println("Error: Cuerpos situados en las mismas coordenadas (x,y,z) del plano.");
	    }catch(MinimumWeightNotExceededException e){
		System.out.println("Error: Los cuerpos no superan una masa mínima de 100000 toneladas.");
	    }
	    System.out.println("\n###############     FIN DEL PROGRAMA     ###############");
	    System.out.println("########################################################");
	}//End of main
	
	
	/*Pedir valores para crear una clase Cuerpo*/
	private static Cuerpo getNewCuerpo(Input in, String id){
	   /*Variables*/
	   double masa, x, y, z;

	   /*Se piden los valores*/
	   //Masa del cuerpo
	    System.out.println("Masa del cuerpo (Mg (tonelada)):");
	    masa = in.getPositiveDouble();
	    
	    //Coordenadas dentro del plano
	    System.out.println("Posición X del cuerpo (parsec):");
	    x = in.getDouble();

	    System.out.println("Posición Y del cuerpo (parsec):");
	    y = in.getDouble();

	    System.out.println("Posición Z del cuerpo (parsec):");
	    z = in.getDouble();

	    return new Cuerpo(id, masa, x, y, z);

	}
}
