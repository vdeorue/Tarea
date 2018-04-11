/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author Vicente
 */
public class Estudiante {
    String nombre;
    String carrera;
    int rut;
    public Estudiante(int r, String n,String c){
    rut = r;
    nombre = n;
    carrera = c;
}
    public void display(){
        System.out.println(nombre + "-"+rut+"-"+carrera);
    }
}
