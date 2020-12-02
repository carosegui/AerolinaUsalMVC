package cCLientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import cLogin.LoginLogic;
import vistas.FrameGeneralView;

public class ClientesEventController implements ActionListener{
	
	FrameGeneralView view;
	ClienteLogic cliente;
	public ClientesEventController( FrameGeneralView view) {
		this.view = view;
		this.cliente = new ClienteLogic();
		view.getBtnOk_ClientesForm().addActionListener(this);
	}
	

	/*String nombre,String apellido, int dni, int cuitCuil, Date fechaNacimiento, String email,
								String calle,int altura, String ciudad, int codigo_postal, String id_pais, int id_provincia, int provincia_otro,
								String personal, String celular, String laboral, int nroPasaporte, String autoridadEmision, java.sql.Date fechaEmision,
								java.sql.Date fechaVencimiento, int id_PAIS */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == view.getBtnOk_ClientesForm()) {
			//Cliente
			String nombre = view.getTextTxtNombre_ClientesForm();
			String apellido = view.getTextTxtApellidos_ClientesForm();
			int dni = Integer.parseInt(view.getTextTxtDni_ClientesForm());
			int cuitCuil = Integer.parseInt(view.getTextTxtCuitCuil_ClientesForm());
			Date fechaNacimiento = (Date) view.getDateFechaNac_ClientesForm();
			String email = view.getTextTxtEmail_ClientesForm();
			
			//Telefono
			String personal = view.getTextTxtTelefonoPersonal_ClientesForm();
			String celular = view.getTextTxtTelefonoCelular_ClientesForm();
			String laboral = view.getTextTxtTelefonoLaboral_ClientesForm();
			
			//Direccion
			String calle = view.getTextTxtDirCalle_ClientesForm();
			int altura = Integer.parseInt(view.getTextTxtDirAltura_ClientesForm());
			String ciudad = view.getTextTxtDirCiudad_ClientesForm();
			int codigo_postal = Integer.parseInt(view.getTextTxtDirCodPostal_ClientesForm());
			int id_provincia = Integer.parseInt(view.getTextTxtDirProvincia_ClientesForm());
			
			//Pasaporte 
			
			int nroPasaporte = Integer.parseInt(view.getTextTxtNumero_ClientesForm());
			String autoridadEmision = view.getTextTxtAutoridadEmision_ClientesForm();
			Date fechaEmision = (Date) view.getDateFechaEmision_ClientesForm();
			Date fechaVencimiento = (Date) view.getDateFechaVencimiento_ClientesForm();
			int id_PAIS = Integer.parseInt(view.getTextTxtPais_pasaporte_ClientesForm());
			
			cliente.CreateCliente(nombre, apellido, dni, cuitCuil, fechaNacimiento, email, calle, altura, ciudad, codigo_postal, id_PAIS, id_provincia, id_provincia, personal, celular, laboral, nroPasaporte, autoridadEmision, fechaEmision, fechaVencimiento, id_PAIS);
		}
		
	}

}
