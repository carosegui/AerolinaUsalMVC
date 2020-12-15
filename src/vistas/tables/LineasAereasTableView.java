package vistas.tables;

import java.awt.EventQueue;
import java.awt.FlowLayout;
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
import tableModels.LineasAereasTableModel;
import java.awt.Dimension;

public class LineasAereasTableView extends JPanel {
	
	private JLabel lblLineasAereas;
	
	private JPanel botonesPanel;
	
	private JButton btnInsertar;
	private JButton btnModificar;
	private JButton btnBorrar;
	private JButton btnSeleccionar;
	
	private JTable table;
	private LineasAereasTableModel tableModel;
	private JScrollPane scrollPane;
	private JPanel panelTabla;

	/**
	 * Create the frame.
	 */
	public LineasAereasTableView() {
		setPreferredSize(new Dimension(656, 492));
		this.setBounds(100, 100, 656, 492);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		
		initComponents();
		initTable();
	}
	
	private void initComponents() {

		lblLineasAereas = new JLabel("Lineas Aereas", JLabel.CENTER);
		lblLineasAereas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLineasAereas.setBounds(0, 0, 656, 63);
		this.add(lblLineasAereas);
		
		//Botones
		btnInsertar = new JButton("Insertar");
		btnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInsertar.setBounds(335, 74, 89, 23);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificar.setBounds(457, 74, 103, 23);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.setBounds(597, 74, 89, 23);
		
		btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeleccionar.setBounds(709, 74, 122, 23);

		botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
		botonesPanel.setBounds(0, 78, 656, 37);
		
		botonesPanel.add(btnInsertar);
		botonesPanel.add(btnModificar);
		botonesPanel.add(btnBorrar);
		botonesPanel.add(btnSeleccionar);
		this.add(botonesPanel);
		
		panelTabla = new JPanel();
		panelTabla.setBounds(0, 144, 656, 348);
		this.add(panelTabla);
	}
	
	private void initTable() {
		 tableModel = new LineasAereasTableModel();
//		 tableModel.updateModel();
		 panelTabla.setLayout(null);
		 table = new JTable(tableModel);
		 table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		 headers();
		 scrollPane = new JScrollPane(table);
		 scrollPane.setBounds(221, 11, 251, 427);
		 panelTabla.add(scrollPane);
	}
	
	private void headers() {
		//Acomodo los headers
		 JTableHeader th = table.getTableHeader();
		 ((DefaultTableCellRenderer)th.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		 
		 TableColumn tc = table.getColumnModel().getColumn(0);
		 tc.setPreferredWidth(100);
		 tc = table.getColumnModel().getColumn(1);
		 tc.setPreferredWidth(100);
	}
	
//	public void updateTable() {
//		tableModel.updateModel();
//		tableModel.fireTableDataChanged();
//	}
	
	//Usar este metodo cuando se utilice el boton SELECCIONAR
	//Toma los valores de la fila seleccionada y los devuelve en forma de Array<String>
	public String[] getSelectedRow() {
		String[] data = new String [2];
		int selectedRow = this.table.getSelectedRow();
		
		data[0] = (String) this.tableModel.getValueAt(selectedRow, 0);
		data[1] = (String) this.tableModel.getValueAt(selectedRow, 1);
		
		return data;	
	}
	
	public void setTableModel(List<Aerolinea> lista) {
		this.tableModel.setList(lista);
		this.tableModel.fireTableDataChanged();
	}

	public JButton getBtnInsertar() {
		return btnInsertar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public JButton getBtnSeleccionar() {
		return btnSeleccionar;
	}
	
	
}
