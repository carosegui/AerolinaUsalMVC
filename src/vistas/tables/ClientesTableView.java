package vistas.tables;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import model.aeropuerto.Aerolinea;
import model.cliente.Cliente;
import tableModels.ClientesTableModel;
import java.awt.Dimension;


public class ClientesTableView extends JPanel {
	
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
					ClientesTableView frame = new ClientesTableView();
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
	public ClientesTableView() {
		setPreferredSize(new Dimension(1220, 600));
		initComponents();
		initTable();
	}
	
	private void initComponents() {
		this.setBounds(0, 0, 1220, 600);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		
		JLabel lblTituloClientes = new JLabel("Clientes");
		lblTituloClientes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTituloClientes.setBounds(525, 0, 110, 63);
		this.add(lblTituloClientes);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInsertar.setBounds(335, 74, 89, 23);
		this.add(btnInsertar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificar.setBounds(457, 74, 103, 23);
		this.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.setBounds(597, 74, 89, 23);
		this.add(btnBorrar);
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeleccionar.setBounds(709, 74, 122, 23);
		this.add(btnSeleccionar);
		
		panelTabla = new JPanel();
		panelTabla.setBounds(0, 119, 1216, 444);
		this.add(panelTabla);
	}
	
	private void initTable(/*ClientesDAO dao*/) {
		 this.tableModel = new ClientesTableModel(/*dao*/);
//		 this.tableModel.updateModel();
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
	
//	public void updateTable() {
//		tableModel.updateModel();
//		tableModel.fireTableDataChanged();
//	}

	//Usar este metodo cuando se utilice el boton SELECCIONAR
	//Toma los valores de la fila seleccionada y los devuelve en forma de Array<String>
	public Object[] getSelectedRow() {
		Object data[] = new Object [8];
		int selectedRow = this.table.getSelectedRow();
		
		data[0] = this.tableModel.getValueAt(selectedRow, 0);
		data[1] = this.tableModel.getValueAt(selectedRow, 1);
		data[2] = this.tableModel.getValueAt(selectedRow, 2);
		data[3] = this.tableModel.getValueAt(selectedRow, 3);
		data[4] = this.tableModel.getValueAt(selectedRow, 4);
		data[5] = this.tableModel.getValueAt(selectedRow, 5);
		data[6] = this.tableModel.getValueAt(selectedRow, 6);
		data[7] = this.tableModel.getValueAt(selectedRow, 7);
		data[8] = this.tableModel.getValueAt(selectedRow, 8);
		data[9] = this.tableModel.getValueAt(selectedRow, 9);
		data[10] = this.tableModel.getValueAt(selectedRow, 10);
		data[11] = this.tableModel.getValueAt(selectedRow, 11);
		data[12] = this.tableModel.getValueAt(selectedRow, 12);
		data[13] = this.tableModel.getValueAt(selectedRow, 13);
		data[14] = this.tableModel.getValueAt(selectedRow, 14);
		data[15] = this.tableModel.getValueAt(selectedRow, 15);
		data[16] = this.tableModel.getValueAt(selectedRow, 16);
		data[17] = this.tableModel.getValueAt(selectedRow, 17);
		data[18] = this.tableModel.getValueAt(selectedRow, 18);
		data[19] = this.tableModel.getValueAt(selectedRow, 19);
		
		return data;
	}
	
	public void setTableModel(List<Cliente> lista) {
		this.tableModel.setList(lista);
		this.tableModel.fireTableDataChanged();
	}
}
