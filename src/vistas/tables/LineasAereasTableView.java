package vistas.tables;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import tableModels.ClientesTableModel;

import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;

public class LineasAereasTableView extends JPanel {
	
	private JLabel lblLineasAereas;
	
	private JPanel botonesPanel;
	
	private JButton btnInsertar;
	private JButton btnModificar;
	private JButton btnBorrar;
	private JButton btnSeleccionar;
	
	private JTable table;
//	private LienasAereasTableMoel tableModel;
	private JScrollPane scrollPane;
	private JPanel panelTabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LineasAereasTableView frame = new LineasAereasTableView();
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
	public LineasAereasTableView() {
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
	
	private void initTable(/*ClientesDAO dao*/) {
//		 tableModel = new ClientesTableModel(/*dao*/);
//		 tableModel.updateModel();
		 panelTabla.setLayout(null);
//		 table = new JTable(tableModel);
		 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//		 headers();
		 scrollPane = new JScrollPane(table);
		 scrollPane.setBounds(0, 0, 656, 348);
		 panelTabla.add(scrollPane);
	}
	
//	private void headers() {
//		//Acomodo los headers
//		 JTableHeader th = table.getTableHeader();
//		 ((DefaultTableCellRenderer)th.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
//		 
//		 TableColumn tc = table.getColumnModel().getColumn(5);
//		 tc.setPreferredWidth(100);
//		 tc = table.getColumnModel().getColumn(13);
//		 tc.setPreferredWidth(100);
//		 tc = table.getColumnModel().getColumn(15);
//		 tc.setPreferredWidth(100);
//		 tc = table.getColumnModel().getColumn(17);
//		 tc.setPreferredWidth(130);
//		 tc = table.getColumnModel().getColumn(18);
//		 tc.setPreferredWidth(110);
//		 tc = table.getColumnModel().getColumn(19);
//		 tc.setPreferredWidth(130);
//		 
//	}
	
	public void updateTable() {
//		tableModel.updateModel();
//		tableModel.fireTableDataChanged();
	}
}
