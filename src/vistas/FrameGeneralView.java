package vistas;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vistas.forms.ClientesFormView;
import vistas.forms.LineasAereasFormView;
import vistas.forms.VuelosFormView;
import vistas.tables.ClientesTableView;
import vistas.tables.LineasAereasTableView;
import vistas.tables.VuelosTableView;

public class FrameGeneralView extends JFrame {

	//Panels
	private JPanel contentPane;
	//Login
	private LoginView loginPanel;
	//Vuelos
	private VuelosFormView vuelosFormPanel;
	private VuelosTableView vuelosTablePanel;
	//Clientes
	private ClientesTableView clientesTablePanel;
	private ClientesFormView clientesFormPanel;
	//Lineas Aereas
	private LineasAereasTableView lineasAereasTablePanel;
	private LineasAereasFormView lineasAereasFormPanel;
	
	//Menu Bar
	private JMenuBar menuBar;
	private JButton btnClientes;
	private JButton btnVuelos;
	private JButton btnLineasAereas;
	private JButton btnVentas;
	
	//Card Layout
	private CardLayout cardLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGeneralView frame = new FrameGeneralView();
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
	public FrameGeneralView() {
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 450, 300);
		setLocationRelativeTo(null);
		
		//TODO: Iniciar una vez q paso el Login
		initMenuBar();
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 0, 0, 0));
		contentPane.setLayout(new CardLayout(0, 0));
		initPanels();
		setContentPane(contentPane);
		displayLogin();
	}
	
	private void initMenuBar() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		btnVentas = new JButton("Ventas");
		menuBar.add(btnVentas);
		
		btnClientes = new JButton("Clientes");
		menuBar.add(btnClientes);
		
		btnVuelos = new JButton("Vuelos");
		menuBar.add(btnVuelos);
		
		btnLineasAereas = new JButton("Lineas aereas");
		menuBar.add(btnLineasAereas);
	}
	
	private void initPanels() {
		loginPanel = new LoginView();
		contentPane.add(loginPanel, "loginPanel");
		
		vuelosTablePanel = new VuelosTableView();
		contentPane.add(vuelosTablePanel, "vuelosTablePanel");
		
		vuelosFormPanel = new VuelosFormView();
		contentPane.add(vuelosFormPanel, "vuelosFormPanel");
		
		clientesTablePanel = new ClientesTableView();
		contentPane.add(clientesTablePanel, "clientesTablePanel");
		
		clientesFormPanel = new ClientesFormView();
		contentPane.add(clientesFormPanel, "clientesFormPanel");	

		lineasAereasTablePanel = new LineasAereasTableView();
		contentPane.add(lineasAereasTablePanel, "lineasAereasTablePanel");		
		
		lineasAereasFormPanel = new LineasAereasFormView();
		contentPane.add(lineasAereasFormPanel, "lineasAereasFormPanel");		
	}
	
	//Metodos eventos  LOS QUE DICEN BTN SON DE LA MENU BAR LOS OTROS SON PARA CAMBIAR DE VISTA--------------------------------------------------------------------
	public void btnVuelos() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "vuelosTablePanel");
		setBounds(new Rectangle(vuelosTablePanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void displayLogin() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "loginPanel");
		setBounds(new Rectangle(vuelosTablePanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void displayVuelosForm() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "vuelosFormPanel");
		setBounds(new Rectangle(vuelosFormPanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void btnClientes() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "clientesTablePanel");
		setBounds(new Rectangle(clientesTablePanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void displayClientesForm() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "clientesFormPanel");
		setBounds(new Rectangle(clientesFormPanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void btnLineasAereas() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "lineasAereasTablePanel");
		setBounds(new Rectangle(lineasAereasTablePanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void displayLineasAereasForm() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "lineasAereasFormPanel");
		setBounds(new Rectangle(lineasAereasFormPanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
//	public void btnVentas() {
//		cardLayout = (CardLayout) contentPane.getLayout();
//		cardLayout.show(contentPane, "vuelosTablePanel");
//		setBounds(new Rectangle(vuelosTablePanel.getPreferredSize()));
//		setLocationRelativeTo(null);
//	}
	
	//Metodos panel Login --------------------------------------------------------------------
	public void setTxtLblMensajeErrorLogin(String mensaje) {
		this.loginPanel.gettTxtLblMensajeError().setVisible(true);;
		this.loginPanel.setTxtLblMensajeError(mensaje);
	}
	
	public String getTextUsuario_Login() {
		return this.loginPanel.getTextUsuario();
	}
	
	public String getTextContrasena_Login() {
		return this.loginPanel.getTextContrasena();
	}
	
	public JButton getBtnIngresar_Login() {
		return this.loginPanel.getBtnIngresar();
	}
	
	//Metodos panel Vuelos Form --------------------------------------------------------------------
	public String getTextTxtNumeroVuelo_Vuelos() {
		return vuelosFormPanel.getTextTxtNumero();
	}
	
	public String getTextTxtCantAsientos_Vuelos() {
		return vuelosFormPanel.getTextTxtCantAsientos();
	}
	
	public String getTextTxtTiempo_Vuelos() {
		return vuelosFormPanel.getTextTxtTiempo();
	}
	
	public String getTextTxtAerolinea_Vuelos() {
		return vuelosFormPanel.getTextTxtAerolinea();
	}
	
	public String getTextTxtAeropuertoLlegada_Vuelos() {
		return vuelosFormPanel.getTextTxtAeropuertoLlegada();
	}
	
	public String getTextTxtAeropuertoSalida_Vuelos() {
		return vuelosFormPanel.getTextTxtAeropuertoSalida();
	}
	
	public Object getDateFechaSalida_Vuelos() {
		return vuelosFormPanel.getDateFechaSalida();
	}
	
	public Object getDateFechaLlegada_Vuelos() {
		return vuelosFormPanel.getDateFechaLlegada();
	}
	
	public Object[] getSelectedRow_Vuelos() {
		return this.vuelosTablePanel.getSelectedRow();
	}
	
	public void setSelectedRow_Vuelos(Object data[]) {
		this.vuelosFormPanel.setSelectedRow(data);
	}
	public JButton getBtnOk_VUelossForm() {
		return vuelosFormPanel.getBtnOk_Vuelos();
	}
	
	//Metodos panel Clientes Form --------------------------------------------------------------------
	public String getTextTxtNombre_ClientesForm() {
		return clientesFormPanel.getTextTxtNombre();
	}
	
	public String getTextTxtApellidos_ClientesForm() {
		return clientesFormPanel.getTextTxtApellidos();
	}
	
	public String getTextTxtDni_ClientesForm() {
		return clientesFormPanel.getTextTxtDni();
	}
	
	public String getTextTxtCuitCuil_ClientesForm() {
		return clientesFormPanel.getTextTxtCuitCuil();
	}
	
	public String getTextTxtEmail_ClientesForm() {
		return clientesFormPanel.getTextTxtEmail();
	}
	
	public String getTextTxtTelefonoPersonal_ClientesForm() {
		return clientesFormPanel.getTextTxtTelefonoPersonal();
	}
	
	public String getTextTxtTelefonoCelular_ClientesForm() {
		return clientesFormPanel.getTextTxtTelefonoCelular();
	}
	
	public String getTextTxtTelefonoLaboral_ClientesForm() {
		return clientesFormPanel.getTextTxtTelefonoLaboral();
	}
	
	public String getTextTxtDirCalle_ClientesForm() {
		return clientesFormPanel.getTextTxtDirCalle();
	}
	
	public String getTextTxtDirAltura_ClientesForm() {
		return clientesFormPanel.getTextTxtDirAltura();
	}
	
	public String getTextTxtDirCiudad_ClientesForm() {
		return clientesFormPanel.getTextTxtDirCiudad();
	}
	
	public String getTextTxtDirCodPostal_ClientesForm() {
		return clientesFormPanel.getTextTxtDirCodPostal();
	}
	
	public String getTextTxtDirPais_ClientesForm() {
		return clientesFormPanel.getTextTxtDirPais();
	}
	
	public String getTextTxtDirProvincia_ClientesForm() {
		return clientesFormPanel.getTextTxtDirProvincia();
	}
	
	public String getTextTxtNumero_ClientesForm() {
		return clientesFormPanel.getTextTxtNumero();
	}
	
	public String getTextTxtAutoridadEmision_ClientesForm() {
		return clientesFormPanel.getTextTxtAutoridadEmision();
	}
	
	public String getTextTxtPais_pasaporte_ClientesForm() {
		return clientesFormPanel.getTextTxtPais_pasaporte();
	}
	
	public Object getDateFechaNac_ClientesForm() {
		return clientesFormPanel.getDateFechaNac();
	}
	
	public Object getDateFechaEmision_ClientesForm() {
		return clientesFormPanel.getDateFechaEmision();
	}
	
	public Object getDateFechaVencimiento_ClientesForm() {
		return clientesFormPanel.getDateFechaVencimiento();
	}
	
	public JButton getBtnOk_ClientesForm() {
		return clientesFormPanel.getBtnOk();
	}
	
	public JButton getBtnCancelar_ClientesForm() {
		return clientesFormPanel.getBtnCancelar();
	}
	
	public Object[] getSelectedRow_Clientes() {
		return this.clientesTablePanel.getSelectedRow();
	}
	
	public void setSelectedRow_Clientes(String data[]) {
		this.clientesFormPanel.setSelectedRow(data);
	}
	
	//Metodos Lineas Aereas Form --------------------------------------------------------------------
	public String getTextTxtNombre_LineasAereas() {
		return lineasAereasFormPanel.getTextTxtNombre();
	}
	
	public String getTextTxtAlianza_LineasAereas() {
		return lineasAereasFormPanel.getTextTxtAlianza();
	}
	
	public JButton getBtnOk_LineasAereas() {
		return lineasAereasFormPanel.getBtnOk();
	}
	
	public JButton getBtnCancelar_LineasAereas() {
		return lineasAereasFormPanel.getBtnCancelar();
	}
	
	public String[] getSelectedRow_LineasAereas() {
		return this.lineasAereasTablePanel.getSelectedRow();
	}
	
	public void setSelectedRow_LineasAeereas(String data[]) {
		this.lineasAereasFormPanel.setSelectedRow(data);
	}
	//Botones menu bar --------------------------------------------------------------------
	public JButton getBtnClientes() {
		return btnClientes;
	}

	public JButton getBtnVuelos() {
		return btnVuelos;
	}

	public JButton getBtnLineasAereas() {
		return btnLineasAereas;
	}

	public JButton getBtnVentas() {
		return btnVentas;
	}

}
