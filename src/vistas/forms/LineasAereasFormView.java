package vistas.forms;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LineasAereasFormView extends JPanel {

	private JPanel panelCentral;
	private JPanel panelInferior;
	
	private JLabel lblTitle;
	private JLabel lblNombre;
	private JLabel lblAlianza;
	
	private JTextField txtNombre;
	private JTextField txtAlianza;
	
	private JButton btnOk;
	private JButton btnCancelar;
	
	/**
	 * Create the panel.
	 */
	public LineasAereasFormView() {
		setPreferredSize(new Dimension(450, 300));
		setMinimumSize(new Dimension(450, 300));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(0, 0));
		
		initComponents();
	}

	private void initComponents() {
		//Label titulo
		lblTitle = new JLabel("Lineas Aereas", JLabel.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		this.add(lblTitle, BorderLayout.NORTH);
		
		//Botones
		btnOk = new JButton("OK");
		btnOk.setPreferredSize(new Dimension(115, 23));
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setPreferredSize(new Dimension(115, 23));
		
		panelInferior = new JPanel();
		panelInferior.add(btnOk);
		panelInferior.add(btnCancelar);
		
		this.add(panelInferior, BorderLayout.SOUTH);
		
		//Panel central con formulario
		panelCentral = new JPanel(new GridLayout(0,2, 20, 5));
		panelCentral.setBorder(new EmptyBorder(30, 0, 30, 10));
		
		Font f = new Font("Tahoma", Font.PLAIN, 15);
		
		//Row 1 ------
		lblNombre = new JLabel("Nombre:", JLabel.TRAILING);
		lblNombre.setFont(f);
		
		txtNombre = new JTextField();
		txtNombre.setFont(f);
		
		panelCentral.add(lblNombre);
		panelCentral.add(txtNombre);
		
		//Row 2 ------
		lblAlianza = new JLabel("Alianza:", JLabel.TRAILING);
		lblAlianza.setFont(f);
		
		txtAlianza = new JTextField();
		txtAlianza.setFont(f);
		
		panelCentral.add(lblAlianza);
		panelCentral.add(txtAlianza);
		
		this.add(panelCentral, BorderLayout.CENTER);
	}	
	
	//Usar este metodo cuando se utiliza el boton SELECCIONAR
	//Llena los JTextFields con los datos correspondientes
	public void setSelectedRow(Object data[]) {
		txtNombre.setText((String) data[0]);
		txtAlianza.setText((String) data[1]);
	}
	
	public String getTextTxtNombre() {
		return txtNombre.getText();
	}
	
	public String getTextTxtAlianza() {
		return txtAlianza.getText();
	}
	
	public JButton getBtnOk() {
		return btnOk;
	}
	
	public JButton getBtnCancelar() {
		return btnCancelar;
	}
}