package llamada;

import interfazllamada.ILlamada;

public abstract class Llamada implements ILlamada {
	private String numeroOrigen;
	private String numeroDestino;
	private double duracion;

	public Llamada(String numeroOrigen, String numeroDestino, double duracion) {
		this.numeroOrigen = numeroOrigen;
		this.numeroDestino = numeroDestino;
		this.duracion = duracion;
	}

	public abstract double CalcularPrecio();

	public String getNumeroOrigen() {
		return numeroOrigen;
	}

	public void setNumeroOrigen(String numeroOrigen) {
		this.numeroOrigen = numeroOrigen;
	}

	public String getNumeroDestino() {
		return numeroDestino;
	}

	public void setNumeroDestino(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

}
