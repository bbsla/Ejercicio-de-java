package llamadaprincipal;

import llamada.Llamada;
import llamada.LlamadaInterior;
import llamada.LlamadaLocal;

public class PrincipalLlamada {

	public static void main(String[] args) {

		Llamada llamada = new LlamadaInterior("hola", "hola", 3455l, 4534);

		System.out.println(llamada.toString());
	}
}
