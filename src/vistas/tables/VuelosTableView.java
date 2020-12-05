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

import org.jdatepicker.impl.JDatePickerImpl;

import tableModels.VuelosTableModel;

public class VuelosTableView extends JPanel{

	
	private JTable table;
	private VuelosTableModel tableModel;
	private JScrollPane scrollPane;
	private JPanel panelInferior;
	
	private JButton btnIngresar;
	private JButton btnModificar;
	private JButton btnBorrar;
	private JButton btnSeleccionar;

	public VuelosTableView() {
		initComponents();
		initTable();
	}
	
	private void initComponents() {
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		setLayout(null);
//		setLocationRelativeTo(null);
//		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("Vuelos");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitle.setBounds(290, 5, 87, 37);
		add(lblTitle);
		
		btnIngresar = new JButton("Insertar");
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIngresar.setBounds(129, 60, 93, 27);
		add(btnIngresar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificar.setBounds(232, 60, 105, 27);
		add(btnModificar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.setBounds(345, 60, 83, 27);
		add(btnBorrar);
		
		btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeleccionar.setBounds(438, 60, 130, 27);
		add(btnSeleccionar);
		
		panelInferior = new JPanel();
		panelInferior.setBounds(0, 130, 700, 470);
		panelInferior.setLayout(null);
		add(panelInferior);
	}
	
	private void initTable(/*VuelosDAO dao*/) {
		 this.tableModel = new VuelosTableModel(/*dao*/);
		 this.tableModel.updateModel();
		 this.table = new JTable(tableModel);
		 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//		 headers();
		 this.scrollPane = new JScrollPane(table);
		 this.scrollPane.setBounds(0, 0, 690, 470);
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
		
		return data;
	}
}
