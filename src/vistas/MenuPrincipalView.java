package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class MenuPrincipalView extends JFrame {

	private JPanel contentPane;
	private JButton btnVuelos;
	private JButton btnVentas;
	private JButton btnClientes;
	private JButton btnLineasAereas;
	private JLabel lblTitulo;
	

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JButton getBtnVuelos() {
		return btnVuelos;
	}

	public void setBtnVuelos(JButton btnVuelos) {
		this.btnVuelos = btnVuelos;
	}

	public JButton getBtnVentas() {
		return btnVentas;
	}

	public void setBtnVentas(JButton btnVentas) {
		this.btnVentas = btnVentas;
	}

	public JButton getBtnClientes() {
		return btnClientes;
	}

	public void setBtnClientes(JButton btnClientes) {
		this.btnClientes = btnClientes;
	}

	public JButton getBtnLineasAereas() {
		return btnLineasAereas;
	}

	public void setBtnLineasAereas(JButton btnLineasAereas) {
		this.btnLineasAereas = btnLineasAereas;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipalView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnVuelos = new JButton("Vuelos");
		btnVuelos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVuelos.setBounds(186, 171, 115, 32);
		contentPane.add(btnVuelos);
		
		btnVentas = new JButton("Ventas");
		btnVentas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVentas.setBounds(186, 222, 115, 32);
		contentPane.add(btnVentas);
		
		btnClientes = new JButton("Clientes");
		btnClientes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClientes.setBounds(186, 118, 115, 32);
		contentPane.add(btnClientes);
		
		btnLineasAereas = new JButton("Lineas aereas");
		btnLineasAereas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLineasAereas.setBounds(186, 276, 115, 32);
		contentPane.add(btnLineasAereas);
		
		lblTitulo = new JLabel("Menu Principal");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitulo.setBounds(51, 26, 137, 32);
		contentPane.add(lblTitulo);
	}
}
