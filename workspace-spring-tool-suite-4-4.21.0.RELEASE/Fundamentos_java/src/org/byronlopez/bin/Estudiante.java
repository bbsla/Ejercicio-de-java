package org.byronlopez.bin;

import org.byronlopez.utilities.Operaciones;

public class Estudiante extends Persona implements Operaciones{
	
	private String carne;

	public Estudiante() {
		
	}
	
	
	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne=carne;
	}

	@Override
	public void enviarNotificacion() {
		// TODO Auto-generated method stub
		System.out.println("hoy no habra clases");
	}

	@Override
	public void revisarAsistencia() {
		// TODO Auto-generated method stub
		System.out.println("su asistencia es excelente");
	}
	
	@Override
	public  void registrarAsistencia() {
		System.out.println("Registrando asistencia jornada matutina".concat(carne).concat("").concat(getApellido()).concat(getNombre()));
	}
	
	}
