package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ClientesView extends JFrame {

	private JPanel contentPane;
	private JTextField txt_id;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientesView frame = new ClientesView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientesView() {
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1220, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloClientes = new JLabel("Clientes");
		lblTituloClientes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTituloClientes.setBounds(525, 0, 110, 63);
		contentPane.add(lblTituloClientes);
		
		JLabel lbl_id = new JLabel("ID:");
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_id.setBounds(10, 72, 49, 16);
		contentPane.add(lbl_id);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(10, 97, 86, 16);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApellidos.setBounds(10, 122, 98, 16);
		contentPane.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDni.setBounds(10, 147, 49, 16);
		contentPane.add(lblDni);
		
		JLabel lblCuitCuil = new JLabel("Cuit - Cuil:");
		lblCuitCuil.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCuitCuil.setBounds(10, 172, 98, 16);
		contentPane.add(lblCuitCuil);
		
		JLabel lblFechaNac = new JLabel("Fecha nac:");
		lblFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaNac.setBounds(10, 199, 98, 17);
		contentPane.add(lblFechaNac);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(10, 226, 64, 16);
		contentPane.add(lblEmail);
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_id.setBounds(112, 72, 147, 20);
		contentPane.add(txt_id);
		txt_id.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNombre.setColumns(10);
		txtNombre.setBounds(112, 99, 147, 20);
		contentPane.add(txtNombre);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(112, 124, 147, 20);
		contentPane.add(txtApellidos);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDni.setColumns(10);
		txtDni.setBounds(112, 149, 147, 20);
		contentPane.add(txtDni);
		
		txtCuitCuil = new JTextField();
		txtCuitCuil.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtCuitCuil.setColumns(10);
		txtCuitCuil.setBounds(112, 174, 147, 20);
		contentPane.add(txtCuitCuil);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(112, 201, 147, 20);
		contentPane.add(txtFechaNac);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmail.setColumns(10);
		txtEmail.setBounds(112, 228, 147, 20);
		contentPane.add(txtEmail);
		
		JLabel lblTelefono = new JLabel("TEL\u00C9FONO");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblTelefono.setBounds(305, 72, 110, 18);
		contentPane.add(lblTelefono);
		
		JLabel lblTelefonoPersonal = new JLabel("Personal:");
		lblTelefonoPersonal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefonoPersonal.setBounds(305, 101, 86, 16);
		contentPane.add(lblTelefonoPersonal);
		
		txtTelefonoPersonal = new JTextField();
		txtTelefonoPersonal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTelefonoPersonal.setColumns(10);
		txtTelefonoPersonal.setBounds(407, 101, 147, 20);
		contentPane.add(txtTelefonoPersonal);
		
		JLabel lblTelefonoCelular = new JLabel("Celular:");
		lblTelefonoCelular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefonoCelular.setBounds(305, 126, 86, 16);
		contentPane.add(lblTelefonoCelular);
		
		txtTelefonoCelular = new JTextField();
		txtTelefonoCelular.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTelefonoCelular.setColumns(10);
		txtTelefonoCelular.setBounds(407, 128, 147, 20);
		contentPane.add(txtTelefonoCelular);
		
		JLabel lblTelefonoLaboral = new JLabel("Laboral:");
		lblTelefonoLaboral.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefonoLaboral.setBounds(305, 151, 98, 16);
		contentPane.add(lblTelefonoLaboral);
		
		txtTelefonoLaboral = new JTextField();
		txtTelefonoLaboral.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTelefonoLaboral.setColumns(10);
		txtTelefonoLaboral.setBounds(407, 153, 147, 20);
		contentPane.add(txtTelefonoLaboral);
		
		JLabel lblDireccin = new JLabel("DIRECCI\u00D3N");
		lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblDireccin.setBounds(593, 74, 123, 18);
		contentPane.add(lblDireccin);
		
		JLabel lblDirCalle = new JLabel("Calle:\r\n");
		lblDirCalle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDirCalle.setBounds(593, 103, 86, 16);
		contentPane.add(lblDirCalle);
		
		JLabel lblDirAltura = new JLabel("Altura:");
		lblDirAltura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDirAltura.setBounds(593, 128, 86, 16);
		contentPane.add(lblDirAltura);
		
		JLabel lblDirCiudad = new JLabel("Ciudad:");
		lblDirCiudad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDirCiudad.setBounds(593, 153, 98, 16);
		contentPane.add(lblDirCiudad);
		
		txtDirCalle = new JTextField();
		txtDirCalle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDirCalle.setColumns(10);
		txtDirCalle.setBounds(695, 103, 147, 20);
		contentPane.add(txtDirCalle);
		
		txtDirAltura = new JTextField();
		txtDirAltura.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDirAltura.setColumns(10);
		txtDirAltura.setBounds(695, 130, 147, 20);
		contentPane.add(txtDirAltura);
		
		txtDirCiudad = new JTextField();
		txtDirCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDirCiudad.setColumns(10);
		txtDirCiudad.setBounds(695, 155, 147, 20);
		contentPane.add(txtDirCiudad);
		
		JLabel lblDirCodPostal = new JLabel("Cod Postal:");
		lblDirCodPostal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDirCodPostal.setBounds(593, 180, 110, 16);
		contentPane.add(lblDirCodPostal);
		
		txtDirCodPostal = new JTextField();
		txtDirCodPostal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDirCodPostal.setColumns(10);
		txtDirCodPostal.setBounds(695, 180, 147, 20);
		contentPane.add(txtDirCodPostal);
		
		JLabel lblDirPais = new JLabel("Pa\u00EDs:");
		lblDirPais.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDirPais.setBounds(593, 205, 86, 16);
		contentPane.add(lblDirPais);
		
		txtDirPais = new JTextField();
		txtDirPais.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDirPais.setColumns(10);
		txtDirPais.setBounds(695, 207, 147, 20);
		contentPane.add(txtDirPais);
		
		JLabel lblDirProvincia = new JLabel("Provincia:");
		lblDirProvincia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDirProvincia.setBounds(593, 230, 98, 16);
		contentPane.add(lblDirProvincia);
		
		txtDirProvincia = new JTextField();
		txtDirProvincia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDirProvincia.setColumns(10);
		txtDirProvincia.setBounds(695, 232, 147, 20);
		contentPane.add(txtDirProvincia);
		
		JLabel lblPasaporte = new JLabel("PASAPORTE");
		lblPasaporte.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPasaporte.setBounds(871, 72, 123, 18);
		contentPane.add(lblPasaporte);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumero.setBounds(871, 101, 86, 16);
		contentPane.add(lblNumero);
		
		JLabel lblAutoridadEmision = new JLabel("Autoridad emisi\u00F3n:");
		lblAutoridadEmision.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAutoridadEmision.setBounds(871, 126, 177, 16);
		contentPane.add(lblAutoridadEmision);
		
		JLabel lblFechaEmision = new JLabel("Fecha emisi\u00F3n:");
		lblFechaEmision.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaEmision.setBounds(871, 151, 152, 16);
		contentPane.add(lblFechaEmision);
		
		JLabel lblFechaVencimiento = new JLabel("Fecha vencimiento:");
		lblFechaVencimiento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaVencimiento.setBounds(871, 178, 177, 16);
		contentPane.add(lblFechaVencimiento);
		
		JLabel lblPais_pasaporte = new JLabel("Pa\u00EDs:");
		lblPais_pasaporte.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPais_pasaporte.setBounds(871, 203, 86, 16);
		contentPane.add(lblPais_pasaporte);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNumero.setColumns(10);
		txtNumero.setBounds(1045, 97, 147, 20);
		contentPane.add(txtNumero);
		
		txtAutoridadEmision = new JTextField();
		txtAutoridadEmision.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtAutoridadEmision.setColumns(10);
		txtAutoridadEmision.setBounds(1045, 124, 147, 20);
		contentPane.add(txtAutoridadEmision);
		
		txtFechaEmision = new JTextField();
		txtFechaEmision.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFechaEmision.setColumns(10);
		txtFechaEmision.setBounds(1045, 149, 147, 20);
		contentPane.add(txtFechaEmision);
		
		txtFechaVencimiento = new JTextField();
		txtFechaVencimiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFechaVencimiento.setColumns(10);
		txtFechaVencimiento.setBounds(1045, 174, 147, 20);
		contentPane.add(txtFechaVencimiento);
		
		txtPais_pasaporte = new JTextField();
		txtPais_pasaporte.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPais_pasaporte.setColumns(10);
		txtPais_pasaporte.setBounds(1045, 201, 147, 20);
		contentPane.add(txtPais_pasaporte);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInsertar.setBounds(346, 289, 89, 23);
		contentPane.add(btnInsertar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificar.setBounds(468, 289, 103, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.setBounds(608, 289, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeleccionar.setBounds(720, 289, 122, 23);
		contentPane.add(btnSeleccionar);
		
		JPanel panelTabla = new JPanel();
		panelTabla.setBounds(0, 330, 1206, 233);
		contentPane.add(panelTabla);
	}
}
