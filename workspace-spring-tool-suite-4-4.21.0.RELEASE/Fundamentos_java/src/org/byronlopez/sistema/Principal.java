package org.byronlopez.sistema;

import java.util.ArrayList;
import java.util.Scanner;

import org.byronlopez.bin.Persona;

import org.byronlopez.bin.Estudiante;
import org.byronlopez.bin.Profesor;
import org.byronlopez.swing.MiventanaPersonal;
import org.byronlopez.utilities.Operaciones;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
		//Scanner in =new Scanner(System.in);
		
		Estudiante estudiante=new Estudiante();
		//Estudiante estudiante1=new Estudiante();
		Profesor profesor=new Profesor();
		
		estudiante.setId(123562);
		estudiante.setNombre("byron ");
		estudiante.setApellido("lopez");
		estudiante.setDireccion("zona 9");
		estudiante.setEmail("sebas@gmaial.");
		estudiante.setTelefono("58626321");
		estudiante.setCarne("5256332");
		estudiante.registrarAsistencia();
		System.out.println(estudiante.getId() +" "+ estudiante.getNombre()+ " "+estudiante.getApellido() +" "+ estudiante.getEmail() +" "+ estudiante.getTelefono() +" "+ estudiante.getDireccion());
		
		/*
		ArrayList<Persona> lista=new ArrayList<Persona>();
		
		Persona e1 = new Estudiante();
		Persona e2= new Estudiante();
		Persona e3= new Estudiante();
		Persona e4= new Estudiante();
		Persona p1= new Profesor();
		Persona p2= new Profesor();
		Persona p3= new Profesor();
		
				*/
		
		System.out.println();
		profesor.setId(123562);
		profesor.setNombre("byron ");
		profesor.setApellido("lopez");
		profesor.setDireccion("zona 9");
		profesor.setEmail("sebas@gmaial.");
		profesor.setTelefono("58626321");
		profesor.setSueldo(15000l);
		profesor.registrarAsistencia();
		
		
		System.out.println(profesor.getId() +" "+ profesor.getNombre()+ " "+profesor.getApellido() +" "+ profesor.getEmail() +" "+ profesor.getTelefono() +" "+ profesor.getDireccion()+" "+ profesor.getSueldo());
		
		
		
		
		registrarEvento(estudiante);
		registrarEvento(profesor);
		
		
		MiventanaPersonal ventanaPersonal =new MiventanaPersonal();
		
		
		
		
	}  //desde aqui podemos enviar los dos objetos
	
	public static void registrarEvento(Operaciones operador) {
		operador.enviarNotificacion();
		operador.revisarAsistencia();
	}

}
