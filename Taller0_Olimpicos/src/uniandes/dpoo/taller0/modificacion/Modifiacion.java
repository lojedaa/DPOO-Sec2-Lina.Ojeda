package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modifiacion 

{
	
	/**
	 * Saludo "¡Hola, muundo!"
	 * Ejecuta la aplicacion cargando el archivo atletas.csv 
	 * Busca el pais con mas medallistas indicando el total de estos
	 * 
	 */
	
public static void main(String[] args) throws FileNotFoundException, IOException
	
	{
	
     System.out.println("¡Hola, mundo!");
     System.out.println("\nCargando informacion de los atletas...\n");
     CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv"); 
     System.out.println("\nSe cargo correctamete la infromacion de los atletas");
     System.out.println("\nEl pais con mas medallistas y su respectiva cantidad es: " + "\n" + calc.paisConMasMedallistas());
     
     
	}

}
