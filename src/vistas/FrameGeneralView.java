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
	private JPanel vuelosFormPanel;
	private JPanel vuelosTablePanel;
	//Clientes
	private JPanel clientesTablePanel;
	private JPanel clientesFormPanel;
	//Lineas Aereas
	private JPanel lineasAereasTablePanel;
	private JPanel lineasAereasFormPanel;
	
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
		btnVuelos();
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
	
	//Metodos eventos --------------
	public void btnVuelos() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "vuelosTablePanel");
		setBounds(new Rectangle(vuelosTablePanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void btnClientes() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "clientesTablePanel");
		setBounds(new Rectangle(clientesTablePanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
	public void btnLineasAereas() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "lineasAereasTablePanel");
		setBounds(new Rectangle(lineasAereasTablePanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
//	public void btnVentas() {
//		cardLayout = (CardLayout) contentPane.getLayout();
//		cardLayout.show(contentPane, "vuelosTablePanel");
//		setBounds(new Rectangle(vuelosTablePanel.getPreferredSize()));
//		setLocationRelativeTo(null);
//	}
	
	//Metodos panel Login
	public void setTxtLblMensajeErrorLogin(String mensaje) {
		this.loginPanel.setTxtLblMensajeError(mensaje);
	}
	
	public String getTextUsuarioLogin() {
		return this.loginPanel.getTextUsuario();
	}
	
	public String getTextContrasenaLogin() {
		return this.loginPanel.getTextContrasena();
	}
	
	//Botones menu bar
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
