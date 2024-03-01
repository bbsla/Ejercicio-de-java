package llamada;

import interfazllamada.ILlamada;

public class LlamadaInterior extends Llamada {

	private double precioUno;
	private double precioDos;
	private double precioTres;
	private int franja;

	public LlamadaInterior(String numeroOrigen, String numeroDestino, double duracion, int franja) {
		super(numeroOrigen, numeroDestino, duracion);

		this.franja = franja;

	}

	@Override
	public double CalcularPrecio() {
		if (franja == 0 ) {
			System.out.println("valor in correcto");
			return 0l;
		} else if (franja == 1) {
			precioUno = 0.20 * getDuracion();
			return getPrecioUno();
		} else if (franja == 2) {
			precioDos = 0 - 35 * getDuracion();
			return getPrecioDos();
		} else if (franja == 3) {
			precioTres = 0 - 85 * getDuracion();
			return getPrecioTres();
		} else
			return 0l;

	}

	public double getPrecioUno() {
		return precioUno;
	}

	public void setPrecioUno(double precioUno) {
		this.precioUno = precioUno;
	}

	public double getPrecioDos() {
		return precioDos;
	}

	public void setPrecioDos(double precioDos) {
		this.precioDos = precioDos;
	}

	public double getPrecioTres() {
		return precioTres;
	}

	public void setPrecioTres(double precioTres) {
		this.precioTres = precioTres;
	}

	public int getFranja() {
		return franja;
	}

	public void setFranja(int franja) {
		this.franja = franja;
	}

	public String toString() {
		return "numero origgen ".concat(getNumeroOrigen()).concat("").concat("numero destino ")
				.concat(getNumeroDestino());
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
