package vistas.tables;


import java.awt.BorderLayout;
import java.awt.Dimension;
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

import model.aeropuerto.Venta;
import model.aeropuerto.Vuelo;
import tableModels.VentasTableModel;


public class VentasTableView extends JPanel {

	private JTable table;
	private VentasTableModel tableModel;
	private JScrollPane scrollPane;
	
	private JPanel panelTabla;
	private JPanel panelBtn;
	
	private JButton btnComprar;
	
	public VentasTableView() {
		setPreferredSize(new Dimension(600, 500));
		
		initComponents();
		initTable();
	}

	private void initComponents() {
		
		this.setBounds(0,0, 600, 500);
		this.setBorder(new EmptyBorder(0, 0, 5, 0));
		this.setLayout(new BorderLayout(0,0));
		
		//Panel tabla
		panelTabla = new JPanel();
		panelTabla.setLayout(null);
		this.add(panelTabla, BorderLayout.CENTER);
		
		//Panel boton
		panelBtn = new JPanel();
		
		btnComprar = new JButton("Comprar");
		panelBtn.add(btnComprar);
		
		this.add(panelBtn, BorderLayout.SOUTH);
	}
	
	private void initTable() {
		this.tableModel = new VentasTableModel(/*dao*/);
//		this.tableModel.updateModel();
		this.table = new JTable(tableModel);
		this.table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
//		headers();
		this.scrollPane = new JScrollPane(table);
		this.scrollPane.setBounds(0, 0, 600, 462);
		panelTabla.add(scrollPane);
	}
	
	private void headers() {
		//Acomodo los headers
		 JTableHeader th = table.getTableHeader();
		 ((DefaultTableCellRenderer)th.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		 
		 TableColumn tc = table.getColumnModel().getColumn(0);
		 tc.setPreferredWidth(150);
		 tc = table.getColumnModel().getColumn(1);
		 tc.setPreferredWidth(150);		 
	}
	
//	public void updateTable() {
//		tableModel.updateModel();
//		tableModel.fireTableDataChanged();
//	}
	
	//Usar este metodo cuando se utilice el boton COMPRAR
	//Toma los valores de la fila seleccionada y los devuelve en forma de Array<Object>
	public Object[] getSelectedRow() {
		Object data[] = new Object [6];
		int selectedRow = this.table.getSelectedRow();
		
		data[0] = this.tableModel.getValueAt(selectedRow, 0);
		data[1] = this.tableModel.getValueAt(selectedRow, 1);
		data[2] = this.tableModel.getValueAt(selectedRow, 2);
		data[3] = this.tableModel.getValueAt(selectedRow, 3);
		data[4] = this.tableModel.getValueAt(selectedRow, 4);
		data[5] = this.tableModel.getValueAt(selectedRow, 5); //TODO: Borrar si no funciona
		
		return data;
	}
	
	public void setTableModel(List<Vuelo> lista) {
		this.tableModel.setList(lista);
		this.tableModel.fireTableDataChanged();
	}
	
	public JButton getBtnComprar() {
		return btnComprar;
	}
}
