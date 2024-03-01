package interfazllamada;

import llamada.Llamada;

public interface ILlamada {

	public int contador = 0;
	public double acumulador = 0;

	public void registrarLlamada(Llamada registro);

	public int getTotalLlamadas();

	public double getTotalFacturas();

}
