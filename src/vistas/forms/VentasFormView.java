package vistas.forms;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Font;

public class VentasFormView extends JPanel {

	private JLabel lblAeropuertoOrigen; 
	private JLabel lblAeropuertoDestino;
	
	//TODO: Pasarle los aeropuertos a los comboBox
	private JComboBox cAeropuertoOrigen;
	private JComboBox cAeropuertoDestino;
	
	private JButton btnBuscarVuelos;
	
	public VentasFormView() {
		initComponents();
	}

	private void initComponents() {
		this.setPreferredSize(new Dimension(350, 220));
		this.setBorder(new EmptyBorder(20, 10, 20, 10));
		
		Font f = new Font("Tahoma", Font.PLAIN, 15);
		
		//Row 1 ------
		Box hb = Box.createHorizontalBox();
		
		lblAeropuertoOrigen = new JLabel("Origen", JLabel.TRAILING);
		lblAeropuertoOrigen.setPreferredSize(new Dimension(70, 14));
		lblAeropuertoOrigen.setFont(f);
		
		cAeropuertoOrigen = new JComboBox<>();
		cAeropuertoOrigen.setPreferredSize(new Dimension(150, 22));
		cAeropuertoOrigen.setBounds(new Rectangle(50,15));
		
		hb.add(lblAeropuertoOrigen);
		hb.add(Box.createHorizontalStrut(20));
		hb.add(cAeropuertoOrigen);
		
		//Row 2 ------
		Box hb1 = Box.createHorizontalBox();
		
		lblAeropuertoDestino = new JLabel("Destino", JLabel.TRAILING);
		lblAeropuertoDestino.setPreferredSize(new Dimension(70, 14));
		lblAeropuertoDestino.setFont(f);
		
		cAeropuertoDestino = new JComboBox<>();
		
		hb1.add(lblAeropuertoDestino);
		hb1.add(Box.createHorizontalStrut(20));
		hb1.add(cAeropuertoDestino);
		
		//Row 3 ------
		Box hb2 = Box.createHorizontalBox();
		
		btnBuscarVuelos = new JButton("Buscar vuelos");
		
		hb2.add(btnBuscarVuelos);
		
		//Columns
		Box vb = Box.createVerticalBox();
		
		vb.add(hb);
		vb.add(Box.createVerticalStrut(50));
		vb.add(hb1);
		vb.add(Box.createVerticalStrut(50));
		vb.add(hb2);
		
		this.add(vb);
	}
	
	public JButton getBtnBuscarVuelos() {
		return btnBuscarVuelos;
	}
	
	public String getTextCAeropuertoOrigen() {
		return cAeropuertoOrigen.getActionCommand();
	}
	
	public String getTextCAeropuertoDestino() {
		return cAeropuertoDestino.getActionCommand();
	}
}
