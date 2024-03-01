package org.byronlopez.swing;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.byronlopez.modelos.ModeloEstudiante;

import javax.swing.JButton;


public class MiventanaPersonal extends JFrame implements ActionListener  {

	private JButton btnCerrar;
	private JTable tblEstudiantes;
	private JScrollPane jspEstudiantes;
	
	
	public MiventanaPersonal() {
		this.setSize(800,600);
		this.setTitle("byron lopez");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.getContentPane().add(getBtnCerrar());
		this.getContentPane().add(getJspEstudiantes());
	
		this.setVisible(true);
	}
	
	public JTable getTblEstudiantes() {
		if(tblEstudiantes==null) {
			tblEstudiantes=new JTable();
			tblEstudiantes.setModel(new ModeloEstudiante()); // import de la clase modelo estudiante que hay que crear 

		}
		
		return tblEstudiantes;
	}
	
	
	
	public JScrollPane getJspEstudiantes() {
		if(jspEstudiantes==null) {
			jspEstudiantes=new JScrollPane();
			jspEstudiantes.setBounds(new Rectangle(10,10,700,300));
			jspEstudiantes.setViewportView(getTblEstudiantes());
			
		}
		
		return jspEstudiantes;
	}
	
	
	public JButton getBtnCerrar() {
		if(btnCerrar == null) {
			btnCerrar=new JButton();
			btnCerrar.setText("cerrar");
			btnCerrar.setLocation(550, 450);
			btnCerrar.addActionListener(this);
			btnCerrar.setSize(new Dimension(120,80));
			
		}
		
		return btnCerrar;
	}
	
	
	public void setBtnCerrar(JButton btnCerrar) {
		this.btnCerrar=btnCerrar;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCerrar) {
			
			JOptionPane.showMessageDialog(null, "hasta luego---");
			System.exit(DISPOSE_ON_CLOSE);
		}
	}
	
	
	
	
}


