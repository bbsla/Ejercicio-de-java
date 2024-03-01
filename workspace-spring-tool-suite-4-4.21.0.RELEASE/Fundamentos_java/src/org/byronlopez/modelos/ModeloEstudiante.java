package org.byronlopez.modelos;

import org.byronlopez.bin.Estudiante;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloEstudiante extends AbstractTableModel {

	private String[]  encabezados={"carne","apellidos","nombres","email"};
	
	private List<Estudiante> listaEstudiante;
	
	public String getColumnName(int columnIndex) { //este pintara los encabezados
		
		return encabezados[columnIndex];
	}
	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return encabezados.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
