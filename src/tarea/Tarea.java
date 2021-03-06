/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Vicente
 */
public class Tarea {


   private static ArrayList<Estudiante> estudiantes;
	public static void main(String[] args) throws IOException {
		estudiantes = new ArrayList<Estudiante>();
	    loadArray("estudiantes.csv");
	    
	    /*
	    for(int i=0;i<estudiantes.size();i++) {
	    	estudiantes.get(i).display();
	    }
	    */
	    ordenarEstudiantes();
	    
	}
	
	private static void ordenarEstudiantes() {
		QuickSort q = new QuickSort(estudiantes.size());
		for(int i=0;i<estudiantes.size();i++) {
			q.insert(estudiantes.get(i));
		}
		System.out.println("-----DESORDENADO-----");
		q.display();
		q.quickSort();
		System.out.println("-----ORDENADO-----");
		q.display();
		
	}

	public static void loadArray(String csvFile){
	    //Codigo para leer archivos csv.
	    BufferedReader br = null;
	    String line = "";
	    //Se define separador ","
	    String cvsSplitBy = ";";
	    try {
	        br = new BufferedReader(new FileReader(csvFile));
	        br.readLine();
	        while ((line = br.readLine()) != null) {                
	            String[] datos = line.split(cvsSplitBy);
	            //Imprime datos.
	            char[] rutchar= datos[1].toCharArray();
	            /*
	            if(rutchar[8] == 'K'){
	                rutchar[8]= '0';
	                datos[1]=String.valueOf(rutchar);

	            }
	            */
	            Estudiante Est = new Estudiante(datos[1],datos[0],datos[2]);
	            estudiantes.add(Est); // Codigo para agregar los datos a un arraylist de la clase estudiante (prueba).
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (br != null) {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
}
