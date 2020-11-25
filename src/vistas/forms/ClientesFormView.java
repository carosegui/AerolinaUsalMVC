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

public class ClientesFormView extends JPanel {
	
	private JPanel panelInferior;

	private JLabel lblTitle;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblCuitCuil;
	private JLabel lblFechaNac;
	private JLabel lblEmail;
	private JLabel lblTelefono;
	private JLabel lblTelefonoPersonal;
	private JLabel lblTelefonoCelular;
	private JLabel lblTelefonoLaboral;
	private JLabel lblDireccion;
	private JLabel lblDirCalle;
	private JLabel lblDirAltura;
	private JLabel lblDirCiudad;
	private JLabel lblDirCodPostal;
	private JLabel lblDirPais;
	private JLabel lblDirProvincia;
	private JLabel lblPasaporte;
	private JLabel lblNumero;
	private JLabel lblAutoridadEmision;
	private JLabel lblFechaEmision;
	private JLabel lblFechaVencimiento;
	private JLabel lblPais_pasaporte;
	
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDni;
	private JTextField txtCuitCuil;
	private JTextField txtFechaNac;
	private JTextField txtEmail;
	private JTextField txtTelefonoPersonal;
	private JTextField txtTelefonoCelular;
	private JTextField txtTelefonoLaboral;
	private JTextField txtDirCalle;
	private JTextField txtDirAltura;
	private JTextField txtDirCiudad;
	private JTextField txtDirCodPostal;
	private JTextField txtDirPais;
	private JTextField txtDirProvincia;
	private JTextField txtNumero;
	private JTextField txtAutoridadEmision;
	private JTextField txtFechaEmision;
	private JTextField txtFechaVencimiento;
	private JTextField txtPais_pasaporte;
	
	private JButton btnOk;
	private JButton btnCancelar;
	
	/**
	 * Create the panel.
	 */
	public ClientesFormView() {
		setPreferredSize(new Dimension(520, 700));
		setMinimumSize(new Dimension(520, 700));
		setBorder(new EmptyBorder(10, 0, 10, 10));
		setLayout(new BorderLayout(0, 0));
		
		initComponents();
	}
	
	private void initComponents() {
		//Label titulo
		lblTitle = new JLabel("Clientes", JLabel.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		this.add(lblTitle, BorderLayout.NORTH);
		
		//Botones
		JPanel panelBotones = new JPanel();
		
		btnOk = new JButton("OK");
		btnOk.setPreferredSize(new Dimension(115, 23));
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setPreferredSize(new Dimension(115, 23));
		
		panelBotones.add(btnOk);
		panelBotones.add(btnCancelar);
		
		this.add(panelBotones, BorderLayout.SOUTH);
		
		//Panel inferior con formulario
		panelInferior = new JPanel(new GridLayout(0,2, 20, 5));
		
		Font f = new Font("Tahoma", Font.PLAIN, 15);
		Font f2 = new Font("Tahoma", Font.BOLD, 15); 
		
		//Row 1 ------
		lblNombre = new JLabel("Nombre:", JLabel.TRAILING);
		lblNombre.setFont(f);
		
		txtNombre = new JTextField();
		txtNombre.setFont(f);
		
		panelInferior.add(lblNombre);
		panelInferior.add(txtNombre);
		
		//Row 2 ------
		lblApellidos = new JLabel("Apellidos:", JLabel.TRAILING);
		lblApellidos.setFont(f);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(f);
		
		panelInferior.add(lblApellidos);
		panelInferior.add(txtApellidos);

		//Row 3 ------
		lblDni = new JLabel("DNI:", JLabel.TRAILING);
		lblDni.setFont(f);
		
		txtDni = new JTextField();
		txtDni.setFont(f);
		
		panelInferior.add(lblDni);
		panelInferior.add(txtDni);
		
		//Row 4 ------
		lblCuitCuil = new JLabel("Cuit - Cuil:", JLabel.TRAILING);
		lblCuitCuil.setFont(f);
		
		txtCuitCuil = new JTextField();
		txtCuitCuil.setFont(f);
		
		panelInferior.add(lblCuitCuil);
		panelInferior.add(txtCuitCuil);
		
		//Row 5 ------
		lblFechaNac = new JLabel("Fecha nacimiento:", JLabel.TRAILING);
		lblFechaNac.setFont(f);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setFont(f);
		
		panelInferior.add(lblFechaNac);
		panelInferior.add(txtFechaNac);
		
		//Row 6 ------
		lblEmail = new JLabel("Email:", JLabel.TRAILING);
		lblEmail.setFont(f);
		
		txtEmail = new JTextField();
		txtEmail.setFont(f);
		
		panelInferior.add(lblEmail);
		panelInferior.add(txtEmail);
		
		//Row 7 ------
		lblTelefono = new JLabel("TELÉFONO", JLabel.CENTER);
		lblTelefono.setFont(f2);
		
		JLabel lblVacia = new JLabel("");
		
		panelInferior.add(lblTelefono);
		panelInferior.add(lblVacia);
		
		//Row 8 ------
		lblTelefonoPersonal = new JLabel("Personal:", JLabel.TRAILING);
		lblTelefonoPersonal.setFont(f);
		
		txtTelefonoPersonal = new JTextField();
		txtTelefonoPersonal.setFont(f);
		
		panelInferior.add(lblTelefonoPersonal);
		panelInferior.add(txtTelefonoPersonal);
		
		//Row 9 ------
		lblTelefonoCelular = new JLabel("Celular:", JLabel.TRAILING);
		lblTelefonoCelular.setFont(f);
		
		txtTelefonoCelular = new JTextField();
		txtTelefonoCelular.setFont(f);
		
		panelInferior.add(lblTelefonoCelular);
		panelInferior.add(txtTelefonoCelular);
		
		//Row 10 ------
		lblTelefonoLaboral = new JLabel("Laboral:", JLabel.TRAILING);
		lblTelefonoLaboral.setFont(f);
		
		txtTelefonoLaboral = new JTextField();
		txtTelefonoLaboral.setFont(f);
		
		panelInferior.add(lblTelefonoLaboral);
		panelInferior.add(txtTelefonoLaboral);
		
		//Row 11 ------
		lblDireccion = new JLabel("DIRECCIÓN", JLabel.CENTER);
		lblDireccion.setFont(f2);
		
		JLabel lblVacia2 = new JLabel();
		
		panelInferior.add(lblDireccion);
		panelInferior.add(lblVacia2);
		
		//Row 12 ------
		lblDirCalle = new JLabel("Calle:", JLabel.TRAILING);
		lblDirCalle.setFont(f);
		
		txtDirCalle = new JTextField();
		txtDirCalle.setFont(f);
		
		panelInferior.add(lblDirCalle);
		panelInferior.add(txtDirCalle);
	
		//Row 13 ------
		lblDirAltura = new JLabel("Altura:", JLabel.TRAILING);
		lblDirAltura.setFont(f);
		
		txtDirAltura = new JTextField();
		txtDirAltura.setFont(f);
		
		panelInferior.add(lblDirAltura);
		panelInferior.add(txtDirAltura);
	
		//Row 14 ------
		lblDirCiudad = new JLabel("Ciudad:", JLabel.TRAILING);
		lblDirCiudad.setFont(f);
		
		txtDirCiudad = new JTextField();
		txtDirCiudad.setFont(f);
		
		panelInferior.add(lblDirCiudad);
		panelInferior.add(txtDirCiudad);
	
		//Row 15 ------
		lblDirCodPostal = new JLabel("Cod Postal:", JLabel.TRAILING);
		lblDirCodPostal.setFont(f);
		
		txtDirCodPostal = new JTextField();
		txtDirCodPostal.setFont(f);
		
		panelInferior.add(lblDirCodPostal);
		panelInferior.add(txtDirCodPostal);
	
		//Row 16 ------
		lblDirPais = new JLabel("País:", JLabel.TRAILING);
		lblDirPais.setFont(f);
		
		txtDirPais = new JTextField();
		txtDirPais.setFont(f);
		
		panelInferior.add(lblDirPais);
		panelInferior.add(txtDirPais);
	
		//Row 17 ------
		lblDirProvincia = new JLabel("Provincia:", JLabel.TRAILING);
		lblDirProvincia.setFont(f);
		
		txtDirProvincia = new JTextField();
		txtDirProvincia.setFont(f);
		
		panelInferior.add(lblDirProvincia);
		panelInferior.add(txtDirProvincia);
	
		//Row 18 ------
		lblPasaporte = new JLabel("PASAPORTE", JLabel.CENTER);
		lblPasaporte.setFont(f2);
		
		JLabel lblVacia3 = new JLabel();
		
		panelInferior.add(lblPasaporte);
		panelInferior.add(lblVacia3);
	
		//Row 19 ------
		lblNumero = new JLabel("Número:", JLabel.TRAILING);
		lblNumero.setFont(f);
		
		txtNumero = new JTextField();
		txtNumero.setFont(f);
		
		panelInferior.add(lblNumero);
		panelInferior.add(txtNumero);
	
		//Row 20 ------
		lblAutoridadEmision = new JLabel("Autoridad emisión:", JLabel.TRAILING);
		lblAutoridadEmision.setFont(f);
		
		txtAutoridadEmision = new JTextField();
		txtAutoridadEmision.setFont(f);
		
		panelInferior.add(lblAutoridadEmision);
		panelInferior.add(txtAutoridadEmision);
	
		//Row 21 ------
		lblFechaEmision = new JLabel("Fecha emisión:", JLabel.TRAILING);
		lblFechaEmision.setFont(f);
		
		txtFechaEmision = new JTextField();
		txtFechaEmision.setFont(f);
		
		panelInferior.add(lblFechaEmision);
		panelInferior.add(txtFechaEmision);
	
		//Row 22 ------
		lblFechaVencimiento = new JLabel("Fecha vencimiento:", JLabel.TRAILING);
		lblFechaVencimiento.setFont(f);
		
		txtFechaVencimiento = new JTextField();
		txtFechaVencimiento.setFont(f);
		
		panelInferior.add(lblFechaVencimiento);
		panelInferior.add(txtFechaVencimiento);
	
		//Row 23 ------
		lblPais_pasaporte = new JLabel("País:", JLabel.TRAILING);
		lblPais_pasaporte.setFont(f);
		
		txtPais_pasaporte = new JTextField();
		txtPais_pasaporte.setFont(f);
		
		panelInferior.add(lblPais_pasaporte);
		panelInferior.add(txtPais_pasaporte);
	
		this.add(panelInferior, BorderLayout.CENTER);
		
	}

}
