package org.byronlopez.manejadores;

import java.util.ArrayList;
import java.util.List;

import org.byronlopez.bin.Estudiante;

public class ManejadoreDeEstudiantes {

	private List<Estudiante> listaEstudiante = new ArrayList<Estudiante>();

	
	//metodos para ingresar y eliminar datos de la lista estudiante
	public void agregar(Estudiante elemento) {
		this.listaEstudiante.add(elemento);

	}

	public void eliminar(Estudiante elemento) {
		this.listaEstudiante.remove(elemento);

	}

	public Estudiante buscarPorCarne(String carne) {

		Estudiante elemento = null;//primero vaciamos el elemento para que podamos almacenar el que buscamos en elemento 
		for (Estudiante e : this.listaEstudiante) { //un for que va a recorrer toda la lista y verificar si estan los datos que buscamos
			if (e.getCarne().equalsIgnoreCase(carne))//con este if vamos a evaluar si el dato es igual con el que buscamos por medio del campo carne
				;
			{
				elemento = e; //lo guardamos en elemento
				break;//descansamos y retornamos el elemento 
			}
		}
		return elemento;
	}

	public List<Estudiante> getListaEstudiante() {
		return this.listaEstudiante;
	}

}
