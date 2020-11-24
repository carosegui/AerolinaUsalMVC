package vistas;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vistas.forms.VuelosFormView;
import vistas.tables.VuelosTableView;

public class FrameGeneralView extends JFrame {

	//Panels
	private JPanel contentPane;
	private JPanel vuelosFormPanel;
	private JPanel vuelosTablePanel;
	
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
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
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
		vuelosTablePanel = new VuelosTableView();
		contentPane.add(vuelosTablePanel, "vuelosTablePanel");
		
		vuelosFormPanel = new VuelosFormView();
		contentPane.add(vuelosFormPanel, "vuelosFormPanel");
	}
	
	//Metodos eventos --------------
	public void btnVuelos() {
		cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "vuelosTablePanel");
		setBounds(new Rectangle(vuelosTablePanel.getPreferredSize()));
		setLocationRelativeTo(null);
	}
	
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
