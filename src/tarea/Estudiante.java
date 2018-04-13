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
    private String nombre;
	private String carrera;
	private String rut;
	
	public Estudiante(String r, String n, String c) {
		rut = r;
		nombre = n;
		carrera = c;
	}
	
	public void display() {
		System.out.println(nombre + " - " + rut + " - " + carrera);
	}
	
	public long getRut() {
		if(rut.contains("K")) {
			rut = rut.replace("K", "0");
		}
		
		return Long.valueOf(rut);
	}
}
