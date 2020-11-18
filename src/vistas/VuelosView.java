package vistas;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import tableModels.VuelosTableModel;

public class VuelosView extends JFrame {

	private JPanel contentPane;
	private JTextField txt_id;
	private JTextField txtNumero;
	private JTextField txtCantAsientos;
	private JTextField txtFechaSalida;
	private JTextField txtFechaLlegada;
	private JTextField txtTiempo;
	private JTextField txtAerolinea;
	private JTextField txtAeropuertoLlegada;
	private JTextField txtAeropuertoSalida;
	
	private JTable table;
	private VuelosTableModel tableModel;
	private JScrollPane scrollPane;
	private JPanel panelInferior;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VuelosView frame = new VuelosView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VuelosView() {
		initComponents();
		initTable();
	}
	
	private void initComponents() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 598);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Vuelos");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitle.setBounds(344, 11, 97, 44);
		contentPane.add(lblTitle);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumero.setBounds(10, 109, 122, 14);
		contentPane.add(lblNumero);
		
		JLabel lblCantAsientos = new JLabel("Cantidad asientos:");
		lblCantAsientos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCantAsientos.setBounds(10, 134, 131, 14);
		contentPane.add(lblCantAsientos);
		
		JLabel lblFechaSalida = new JLabel("Fecha salida:");
		lblFechaSalida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaSalida.setBounds(10, 159, 122, 14);
		contentPane.add(lblFechaSalida);
		
		JLabel lblFechaLlegada = new JLabel("Fecha llegada:");
		lblFechaLlegada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaLlegada.setBounds(10, 184, 122, 19);
		contentPane.add(lblFechaLlegada);
		
		txt_id = new JTextField();
		txt_id.setBounds(142, 84, 155, 20);
		contentPane.add(txt_id);
		txt_id.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(142, 108, 155, 20);
		contentPane.add(txtNumero);
		
		txtCantAsientos = new JTextField();
		txtCantAsientos.setColumns(10);
		txtCantAsientos.setBounds(141, 133, 155, 20);
		contentPane.add(txtCantAsientos);
		
		txtFechaSalida = new JTextField();
		txtFechaSalida.setColumns(10);
		txtFechaSalida.setBounds(141, 159, 155, 20);
		contentPane.add(txtFechaSalida);
		
		txtFechaLlegada = new JTextField();
		txtFechaLlegada.setColumns(10);
		txtFechaLlegada.setBounds(142, 183, 155, 20);
		contentPane.add(txtFechaLlegada);
		
		JLabel lbl_id = new JLabel("ID:");
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_id.setBounds(10, 85, 122, 14);
		contentPane.add(lbl_id);
		
		JLabel lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTiempo.setBounds(392, 85, 122, 14);
		contentPane.add(lblTiempo);
		
		JLabel lblAerolinea = new JLabel("Aerolinea:");
		lblAerolinea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAerolinea.setBounds(392, 109, 122, 14);
		contentPane.add(lblAerolinea);
		
		JLabel lblAeropuertoLlegada = new JLabel("Aeropuerto llegada:");
		lblAeropuertoLlegada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAeropuertoLlegada.setBounds(393, 159, 142, 20);
		contentPane.add(lblAeropuertoLlegada);
		
		txtTiempo = new JTextField();
		txtTiempo.setColumns(10);
		txtTiempo.setBounds(541, 84, 155, 20);
		contentPane.add(txtTiempo);
		
		txtAerolinea = new JTextField();
		txtAerolinea.setColumns(10);
		txtAerolinea.setBounds(541, 108, 155, 20);
		contentPane.add(txtAerolinea);
		
		txtAeropuertoLlegada = new JTextField();
		txtAeropuertoLlegada.setColumns(10);
		txtAeropuertoLlegada.setBounds(541, 159, 155, 20);
		contentPane.add(txtAeropuertoLlegada);
		
		txtAeropuertoSalida = new JTextField();
		txtAeropuertoSalida.setColumns(10);
		txtAeropuertoSalida.setBounds(541, 134, 155, 20);
		contentPane.add(txtAeropuertoSalida);
		
		JLabel lblAeropuertoSalida = new JLabel("Aeropuerto salida:");
		lblAeropuertoSalida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAeropuertoSalida.setBounds(393, 134, 142, 19);
		contentPane.add(lblAeropuertoSalida);
		
		JButton btnIngresar = new JButton("Insertar");
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIngresar.setBounds(142, 235, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificar.setBounds(264, 235, 103, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.setBounds(404, 235, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeleccionar.setBounds(516, 235, 122, 23);
		contentPane.add(btnSeleccionar);
		
		panelInferior = new JPanel();
		panelInferior.setBounds(0, 285, 735, 288);
		panelInferior.setLayout(null);
		contentPane.add(panelInferior);
	}
	
	//TODO: Arreglar tamaño de la tabla
	private void initTable(/*VuelosDAO dao*/) {
		//TODO: Logica de la tabla
		 this.tableModel = new VuelosTableModel(/*dao*/);
		 this.tableModel.updateModel();
		 this.table = new JTable(tableModel);
		 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		 headers();
		 this.scrollPane = new JScrollPane(table);
		 this.scrollPane.setBounds(0, 0, 735, 432);
		 panelInferior.add(scrollPane);
	}
	
	private void headers() {
		//Acomodo los headers
		 JTableHeader th = table.getTableHeader();
		 ((DefaultTableCellRenderer)th.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		 
		 TableColumn tc = table.getColumnModel().getColumn(0);
		 tc.setPreferredWidth(70);
		 tc = table.getColumnModel().getColumn(1);
		 tc.setPreferredWidth(80);
		 tc = table.getColumnModel().getColumn(2);
		 tc.setPreferredWidth(140);
		 tc = table.getColumnModel().getColumn(3);
		 tc.setPreferredWidth(110);
		 tc = table.getColumnModel().getColumn(4);
		 tc.setPreferredWidth(110);
		 tc = table.getColumnModel().getColumn(5);
		 tc.setPreferredWidth(70);
		 tc = table.getColumnModel().getColumn(6);
		 tc.setPreferredWidth(90);
		 tc = table.getColumnModel().getColumn(7);
		 tc.setPreferredWidth(150);
		 tc = table.getColumnModel().getColumn(8);
		 tc.setPreferredWidth(160);
		 
	}
	
	public void updateTable() {
		tableModel.updateModel();
		tableModel.fireTableDataChanged();
	}

	public JTextField getTxt_id() {
		return txt_id;
	}

	public void setTxt_id(JTextField txt_id) {
		this.txt_id = txt_id;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JTextField getTxtCantAsientos() {
		return txtCantAsientos;
	}

	public void setTxtCantAsientos(JTextField txtCantAsientos) {
		this.txtCantAsientos = txtCantAsientos;
	}

	public JTextField getTxtFechaSalida() {
		return txtFechaSalida;
	}

	public void setTxtFechaSalida(JTextField txtFechaSalida) {
		this.txtFechaSalida = txtFechaSalida;
	}

	public JTextField getTxtFechaLlegada() {
		return txtFechaLlegada;
	}

	public void setTxtFechaLlegada(JTextField txtFechaLlegada) {
		this.txtFechaLlegada = txtFechaLlegada;
	}

	public JTextField getTxtTiempo() {
		return txtTiempo;
	}

	public void setTxtTiempo(JTextField txtTiempo) {
		this.txtTiempo = txtTiempo;
	}

	public JTextField getTxtAerolinea() {
		return txtAerolinea;
	}

	public void setTxtAerolinea(JTextField txtAerolinea) {
		this.txtAerolinea = txtAerolinea;
	}

	public JTextField getTxtAeropuertoLlegada() {
		return txtAeropuertoLlegada;
	}

	public void setTxtAeropuertoLlegada(JTextField txtAeropuertoLlegada) {
		this.txtAeropuertoLlegada = txtAeropuertoLlegada;
	}

	public JTextField getTxtAeropuertoSalida() {
		return txtAeropuertoSalida;
	}

	public void setTxtAeropuertoSalida(JTextField txtAeropuertoSalida) {
		this.txtAeropuertoSalida = txtAeropuertoSalida;
	}
}
