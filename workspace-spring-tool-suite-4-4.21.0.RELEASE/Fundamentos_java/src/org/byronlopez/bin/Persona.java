package org.byronlopez.bin;

public abstract class Persona {

	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String telefono;
	private int dpi;
	
	
	
	
	public  abstract void registrarAsistencia();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre.toUpperCase();
	}

	public void setNombre(String nombre) {
		if(nombre!=null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}else {
			this.nombre ="el nombre no fue ingresado correctamente";
		}
		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		if(apellido!=null && !apellido.isEmpty()) {
			this.apellido = apellido;
		}else {
			this.apellido ="el apellido no fue ingresado correctamente";
		}
		
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getDpi() {
		return dpi;
	}

	public void setDpi(int dpi) {
		this.dpi = dpi;
	}

}
