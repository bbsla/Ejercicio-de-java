package org.byronlopez.bin;

import org.byronlopez.utilities.Operaciones;

public class Profesor extends Persona implements Operaciones {
	private Long Sueldo;

	public Profesor() {
		
	}
	
	public Long getSueldo() {
		return Sueldo;
	}

	public void setSueldo(Long sueldo) {
		this.Sueldo = sueldo;
	}

	@Override
	public void enviarNotificacion() {
		// TODO Auto-generated method stub
		System.out.println("se le informa que la reunion se cambia de fecha");
		
	}

	@Override
	public void revisarAsistencia() {
		// TODO Auto-generated method stub
		System.out.println("la asistencia del alumno es muy baja");
	}

	@Override
	public  void registrarAsistencia() {
		
			System.out.println("Registrando asistencia jornada matutina".concat("").concat(getApellido()).concat(getNombre()));
		
	}
	
	

}
