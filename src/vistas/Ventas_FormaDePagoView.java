package vistas;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Ventas_FormaDePagoView extends JPanel {

	private JPanel lblPanel;
	private JPanel rbPanel;
	private JPanel btnPanel;
	
	private JLabel lblTitulo;
	
	ButtonGroup bg;
	
	private JRadioButton rbEfectivo;
	private JRadioButton rbTarjeta;
	
	private JButton btnConfirmarCompra;
	
	public Ventas_FormaDePagoView() {
		setPreferredSize(new Dimension(360, 330));
		initComponents();
	}

	private void initComponents() {
		this.setBounds(new Rectangle(360, 330));
		this.setBorder(new EmptyBorder(20,0,0,0));
		this.setLayout(new BorderLayout());
				
		//Panel titulo
		lblPanel = new JPanel();
		
		lblTitulo = new JLabel("Forma de pago");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPanel.add(lblTitulo);
		this.add(lblPanel, BorderLayout.NORTH);
		
		//Panel Radio Buttons
		rbPanel = new JPanel();
		rbPanel.setBorder(new EmptyBorder(20,0,0,0));
		
		rbEfectivo = new JRadioButton("Efectivo");
		rbEfectivo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		rbTarjeta = new JRadioButton("Tarjeta");
		rbTarjeta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		//Agrego los radio buttons a un grupo para que solo pueda seleccionarse uno
		bg = new ButtonGroup();
		bg.add(rbEfectivo);
		bg.add(rbTarjeta);
		
		rbPanel.add(rbEfectivo);
		rbPanel.add(rbTarjeta);
		this.add(rbPanel, BorderLayout.CENTER);
		
		//Panel boton
		btnPanel = new JPanel();
		
		btnConfirmarCompra = new JButton("Confirmar compra");
		
		btnPanel.add(btnConfirmarCompra);
		this.add(btnPanel, BorderLayout.SOUTH);
	}

	public JButton getBtnConfirmarCompra() {
		return btnConfirmarCompra;
	}
	
	 public String getSelectedButtonText() {
	        for (Enumeration<AbstractButton> buttons = bg.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();

	            if (button.isSelected()) {
	                return button.getText();
	            }
	        }
	        return null;
	    }
	
//	public String getTextRbEfectivo() {
//		return rbEfectivo.getActionCommand();
//	}
	
//	public String getTextRbTarjeta() {
//		return rbTarjeta.getActionCommand();
//	}
}
