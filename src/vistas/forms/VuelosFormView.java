package vistas.forms;

import java.awt.Dimension;
import java.awt.Font;
import java.sql.Date;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePickerImpl;

import util.datePicker.DatePicker;

public class VuelosFormView extends JPanel {
	
	private JLabel lblTitle;
	private JLabel lblNumero;
	private JLabel lblCantAsientos;
	private JLabel lblFechaSalida;
	private JLabel lblFechaLlegada;
	private JLabel lblTiempo;
	private JLabel lblAerolinea;
	private JLabel lblAeropuertoLlegada;
	private JLabel lblAeropuertoSalida;
	
	private JTextField txtNumero;
	private JTextField txtCantAsientos;
//	private JTextField txtFechaSalida;
//	private JTextField txtFechaLlegada;
	private JTextField txtTiempo;
	private JTextField txtAerolinea;
	private JTextField txtAeropuertoLlegada;
	private JTextField txtAeropuertoSalida;
	
	private DatePicker dateFechaSalida;
	private DatePicker dateFechaLlegada;
	
	private JButton btnOk;
	private JButton btnCancelar;

	/**
	 * Create the panel.
	 */
	public VuelosFormView() {
		setMinimumSize(new Dimension(520, 390));
		setPreferredSize(new Dimension(520, 450));
		initComponents();
	}

	private void initComponents() {
		
		Font f = new Font("Tahoma", Font.PLAIN, 15);
		
		//Row 1 ------
		Box hb = Box.createHorizontalBox();
		
		lblTitle = new JLabel("Vuelos");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		hb.add(lblTitle);
		
		//Row 2 ------
		Box hb1 = Box.createHorizontalBox();
		
		lblNumero = new JLabel("Numero:",JLabel.TRAILING);
		lblNumero.setPreferredSize(new Dimension(135, 14));
		lblNumero.setFont(f);
		
		txtNumero = new JTextField();
		hb1.add(lblNumero);
		hb1.add(Box.createHorizontalStrut(15));
		hb1.add(txtNumero);
		
		//Row 3 ------
		Box hb2 = Box.createHorizontalBox();
		
		lblCantAsientos = new JLabel("Cantidad asientos:",JLabel.TRAILING);
		lblCantAsientos.setPreferredSize(new Dimension(135, 14));
		lblCantAsientos.setFont(f);
		
		txtCantAsientos = new JTextField();
		
		hb2.add(lblCantAsientos);
		hb2.add(Box.createHorizontalStrut(15));
		hb2.add(txtCantAsientos);
		
		//Row 4 ------
		Box hb3 = Box.createHorizontalBox();
		
		lblFechaSalida = new JLabel("Fecha salida:",JLabel.TRAILING);
		lblFechaSalida.setPreferredSize(new Dimension(135, 14));
		lblFechaSalida.setFont(f);
		
		dateFechaSalida = DatePicker.getDatePicker();
		
		hb3.add(lblFechaSalida);
		hb3.add(Box.createHorizontalStrut(15));
		hb3.add(dateFechaSalida.getDatePickerImpl());
		
		//Row 5 ------
		Box hb4 = Box.createHorizontalBox();
		
		lblFechaLlegada = new JLabel("Fecha llegada:",JLabel.TRAILING);
		lblFechaLlegada.setPreferredSize(new Dimension(135, 14));
		lblFechaLlegada.setFont(f);
		
		dateFechaLlegada = DatePicker.getDatePicker();
		
		hb4.add(lblFechaLlegada);
		hb4.add(Box.createHorizontalStrut(15));
		hb4.add(dateFechaLlegada.getDatePickerImpl());
		
		//Row 6 ------
		Box hb5 = Box.createHorizontalBox();
		
		lblTiempo = new JLabel("Tiempo:",JLabel.TRAILING);
		lblTiempo.setPreferredSize(new Dimension(135, 14));
		lblTiempo.setFont(f);
		
		txtTiempo = new JTextField();
		
		hb5.add(lblTiempo);
		hb5.add(Box.createHorizontalStrut(15));
		hb5.add(txtTiempo);
		
		//Row 7 ------
		Box hb6 = Box.createHorizontalBox();
		
		lblAerolinea = new JLabel("Aerolinea:",JLabel.TRAILING);
		lblAerolinea.setPreferredSize(new Dimension(135, 14));
		lblAerolinea.setFont(f);
		
		txtAerolinea = new JTextField();
		
		hb6.add(lblAerolinea);
		hb6.add(Box.createHorizontalStrut(15));
		hb6.add(txtAerolinea);
		
		//Row 8 ------
		Box hb7 = Box.createHorizontalBox();
		
		lblAeropuertoSalida = new JLabel("Aeropuerto salida:",JLabel.TRAILING);
		lblAeropuertoSalida.setPreferredSize(new Dimension(135, 14));
		lblAeropuertoSalida.setFont(f);
		
		txtAeropuertoSalida = new JTextField();
		
		hb7.add(lblAeropuertoSalida);
		hb7.add(Box.createHorizontalStrut(15));
		hb7.add(txtAeropuertoSalida);
		
		//Row 9 ------
		Box hb8 = Box.createHorizontalBox();
		
		lblAeropuertoLlegada = new JLabel("Aeropuerto llegada:",JLabel.TRAILING);
		lblAeropuertoLlegada.setPreferredSize(new Dimension(135, 14));
		lblAeropuertoLlegada.setFont(f);
		
		txtAeropuertoLlegada = new JTextField();
		
		hb8.add(lblAeropuertoLlegada);
		hb8.add(Box.createHorizontalStrut(15));
		hb8.add(txtAeropuertoLlegada);
		
		//Row 10 ------
		Box hb9 = Box.createHorizontalBox();
		
		btnOk = new JButton("OK");
		btnOk.setMaximumSize(new Dimension(85, 23));
		btnOk.setPreferredSize(new Dimension(85, 23));
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setPreferredSize(new Dimension(85, 23));
		
		hb9.add(btnOk);
		hb9.add(Box.createHorizontalStrut(30));
		hb9.add(btnCancelar);
		
		//Columns
		Box vb = Box.createVerticalBox();
		
		vb.add(hb);
		vb.add(Box.createRigidArea(new Dimension(300,40)));
		vb.add(hb1);
		vb.add(Box.createVerticalStrut(5));
		vb.add(hb2);
		vb.add(Box.createVerticalStrut(5));
		vb.add(hb3);
		vb.add(Box.createVerticalStrut(5));
		vb.add(hb4);
		vb.add(Box.createVerticalStrut(5));
		vb.add(hb5);
		vb.add(Box.createVerticalStrut(5));
		vb.add(hb6);
		vb.add(Box.createVerticalStrut(5));
		vb.add(hb7);
		vb.add(Box.createVerticalStrut(5));
		vb.add(hb8);
		vb.add(Box.createVerticalStrut(40));
		vb.add(hb9);
		
		this.add(vb);
		
	}	
	
	//Usar este metodo cuando se utiliza el boton SELECCIONAR
	//Llena los JTextFields con los datos correspondientes
	public void setSelectedRow(Object data[]) {
		txtNumero.setText((String) data[0]);
		txtCantAsientos.setText((String) data[1]);
		
		dateFechaSalida.setModelValue((Date) data[2]); //TODO: Ver si funciona
		dateFechaLlegada.setModelValue((Date) data[3]);
		
		txtTiempo.setText((String) data[4]);
		txtAerolinea.setText((String) data[5]);
		txtAeropuertoSalida.setText((String) data[6]);
		txtAeropuertoLlegada.setText((String) data[7]);
	}
	
	public String getTextTxtNumero() {
		return txtNumero.getText();
	}
	
	public String getTextTxtCantAsientos() {
		return txtCantAsientos.getText();
	}
	
	public String getTextTxtTiempo() {
		return txtTiempo.getText();
	}
	
	public String getTextTxtAerolinea() {
		return txtAerolinea.getText();
	}
	
	public String getTextTxtAeropuertoLlegada() {
		return txtAeropuertoLlegada.getText();
	}
	
	public String getTextTxtAeropuertoSalida() {
		return txtAeropuertoSalida.getText();
	}
	
	public Object getDateFechaSalida() {
		return dateFechaSalida.getDatePickerImpl().getModel().getValue();
	}
	
	public Object getDateFechaLlegada() {
		return dateFechaLlegada.getDatePickerImpl().getModel().getValue();
	}
	
	public JButton getBtnOk_Vuelos() {
		return btnOk;
	}
}
