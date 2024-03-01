package llamada;

import interfazllamada.ILlamada;

public class LlamadaLocal extends Llamada implements ILlamada {

	private double precio;

	public LlamadaLocal(String numeroOrigen, String numeroDestino, double duracion, int precio) {
		super(numeroOrigen, numeroDestino, duracion);
		// TODO Auto-generated constructor stub
		this.precio = precio;
	}

	@Override
	public double CalcularPrecio() {

		precio = 0.25 * getDuracion();

		return getPrecio();
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String toString() {
		return "";
	}

	@Override
	public void registrarLlamada(Llamada registro) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotalLlamadas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalFacturas() {
		// TODO Auto-generated method stub
		return 0;
	}

}
