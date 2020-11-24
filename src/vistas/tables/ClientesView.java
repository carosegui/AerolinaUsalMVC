package vistas.tables;

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

import tableModels.ClientesTableModel;


public class ClientesView extends JFrame {

	private JPanel contentPane;
	
	private JTable table;
	private ClientesTableModel tableModel;
	private JScrollPane scrollPane;
	private JPanel panelTabla;

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
		initTable();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1220, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloClientes = new JLabel("Clientes");
		lblTituloClientes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTituloClientes.setBounds(525, 0, 110, 63);
		contentPane.add(lblTituloClientes);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInsertar.setBounds(335, 74, 89, 23);
		contentPane.add(btnInsertar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificar.setBounds(457, 74, 103, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.setBounds(597, 74, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeleccionar.setBounds(709, 74, 122, 23);
		contentPane.add(btnSeleccionar);
		
		panelTabla = new JPanel();
		panelTabla.setBounds(0, 119, 1216, 444);
		contentPane.add(panelTabla);
	}
	
	private void initTable(/*ClientesDAO dao*/) {
		 this.tableModel = new ClientesTableModel(/*dao*/);
		 this.tableModel.updateModel();
		 panelTabla.setLayout(null);
		 this.table = new JTable(tableModel);
		 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		 headers();
		 this.scrollPane = new JScrollPane(table);
		 this.scrollPane.setBounds(0, 5, 1216, 444);
		 panelTabla.add(scrollPane);
	}
	
	private void headers() {
		//Acomodo los headers
		 JTableHeader th = table.getTableHeader();
		 ((DefaultTableCellRenderer)th.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		 
		 TableColumn tc = table.getColumnModel().getColumn(5);
		 tc.setPreferredWidth(100);
		 tc = table.getColumnModel().getColumn(13);
		 tc.setPreferredWidth(100);
		 tc = table.getColumnModel().getColumn(15);
		 tc.setPreferredWidth(100);
		 tc = table.getColumnModel().getColumn(17);
		 tc.setPreferredWidth(130);
		 tc = table.getColumnModel().getColumn(18);
		 tc.setPreferredWidth(110);
		 tc = table.getColumnModel().getColumn(19);
		 tc.setPreferredWidth(130);
		 
	}
	
	public void updateTable() {
		tableModel.updateModel();
		tableModel.fireTableDataChanged();
	}

}
