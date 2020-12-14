package vistas;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.aeropuerto.Aerolinea;
import model.aeropuerto.Venta;
import model.aeropuerto.Vuelo;
import model.cliente.Cliente;
import vistas.forms.ClientesFormView;
import vistas.forms.LineasAereasFormView;
import vistas.forms.VentasFormView;
import vistas.forms.VuelosFormView;
import vistas.tables.ClientesTableView;
import vistas.tables.LineasAereasTableView;
import vistas.tables.VentasTableView;
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
	//Ventas
	private VentasTableView ventasTablePanel;
	private Ventas_FormaDePagoView ventas_FormaDePagoPanel;
	private VentasFormView ventasFormPanel;
	
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
	
	public void initMenuBar() {
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
	
	//Instancio los distintos paneles 
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
		
		ventasFormPanel = new VentasFormView();
		contentPane.add(ventasFormPanel, "ventasFormPanel");
		
		ventasTablePanel = new VentasTableView();
		contentPane.add(ventasTablePanel, "ventasTablePanel");
		
		ventas_FormaDePagoPanel = new Ventas_FormaDePagoView();
		contentPane.add(ventas_FormaDePagoPanel, "ventas_FormaDePagoPanel");
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
	
	public void btnVentas() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "ventasFormPanel");
		setBounds(new Rectangle(ventasFormPanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void displayVentasTable() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "ventasTablePanel");
		setBounds(new Rectangle(ventasTablePanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void displayVentasFormaDePago() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "ventas_FormaDePagoPanel");
		setBounds(new Rectangle(ventas_FormaDePagoPanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
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
	
	public void setTableModel_Vuelos(List<Vuelo> lista) { 
		this.vuelosTablePanel.setTableModel(lista);
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
	
	public void setTableModel_Clientes(List<Cliente> lista) {
		this.clientesTablePanel.setTableModel(lista);
	}
	
	//Metodos Lineas Aereas --------------------------------------------------------------------
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
	
	public void setTableModel_LineasAereas(List<Aerolinea> lista) {
		this.lineasAereasTablePanel.setTableModel(lista);
	}
	
	//Metodos Ventas Form --------------------------------------------------------------------
	public JButton getBtnBuscarVuelos_Ventas() {
		return ventasFormPanel.getBtnBuscarVuelos();
	}
	
	public String getTextCAeropuertoOrigen_Ventas() {
		return ventasFormPanel.getTextCAeropuertoOrigen();
	}
	
	public String getTextCAeropuertoDestino_Ventas() {
		return ventasFormPanel.getTextCAeropuertoDestino();
	}
	
	public JComboBox<String> getOrigenComboBox(){
		return ventasFormPanel.getAeropuetoComboBox();
	}
	
	public JComboBox<String> getDestinoComboBox(){
		return ventasFormPanel.getAeropuertoDestinoComboBox();
	}
	
	public void setTxtLblMensajeError_Ventas(String mensaje) {
		this.ventasFormPanel.setTxtLblMensajeError(mensaje);
	}
	
	//Metodos Ventas Table --------------------------------------------------------------------
	public Object[] getSelectedRow_Ventas() {
		return ventasTablePanel.getSelectedRow();
	}
	
	public void setTableModel_Ventas(List<Vuelo> lista) {
		this.ventasTablePanel.setTableModel(lista);
	}
	
	public JButton getBtnComprar_Ventas() {
		return ventasTablePanel.getBtnComprar();
	}
	
	//Metodos Ventas Forma de pago  --------------------------------------------------------------------
	public JButton getBtnConfirmarCompra_Ventas() {
		return ventas_FormaDePagoPanel.getBtnConfirmarCompra();
	}
	
	public String getSelectedButtonText_Ventas() {
		return ventas_FormaDePagoPanel.getSelectedButtonText();
	}
	
//	public String getTextRbEfectivo_Ventas() {
//		return ventas_FormaDePagoPanel.getTextRbEfectivo();
//	}
//	
//	public String getTextRbTarjeta_Ventas() {
//		return ventas_FormaDePagoPanel.getTextRbTarjeta();
//	}
	
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
