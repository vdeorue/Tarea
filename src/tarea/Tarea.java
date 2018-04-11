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
/**
 *
 * @author Vicente
 */
public class Tarea {


   public static void main(String[] args) throws IOException {
    loadArray("estudiantes.csv");
   }
   public static void loadArray(String csvFile){
    BufferedReader br = null;
    String line = "";
    //Se define separador ","
    String cvsSplitBy = ";";
    try {
        br = new BufferedReader(new FileReader(csvFile));
        while ((line = br.readLine()) != null) {                
            String[] datos = line.split(cvsSplitBy);
            //Imprime datos.
            char[] rutchar= datos[1].toCharArray();
            if(rutchar[8] == 'K'){
                rutchar[8]= '0';
                datos[1]=String.valueOf(rutchar);
            }
            
        System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2]);
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