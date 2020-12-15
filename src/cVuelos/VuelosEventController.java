package cVuelos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Timestamp;

import vistas.FrameGeneralView;

public class VuelosEventController implements ActionListener  {
	
	private FrameGeneralView view;
	private VuelosLogic logic;
	public VuelosEventController(FrameGeneralView view) {
		this.view = view;
		this.logic = new VuelosLogic();
		this.view.setTableModel_Vuelos(this.logic.getAllvuelos());
		view.btnVuelos();
		view.getBtnOk_VUelossForm().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getBtnOk_VUelossForm()) {
			String nro_vuelo = view.getTextTxtNumeroVuelo_Vuelos();
			int cant_asientos = Integer.parseInt(view.getTextTxtCantAsientos_Vuelos());
			System.out.println("LLEGO");
			java.sql.Date fecha_salida = (Date) view.getDateFechaSalida_Vuelos();
			java.sql.Date fecha_llegada = (Date) view.getDateFechaLlegada_Vuelos();
			System.out.println("LLEGO");
			int tiempo_vuelo = Integer.parseInt(view.getTextTxtTiempo_Vuelos());
			int id_aerolinea = Integer.parseInt(view.getTextTxtAerolinea_Vuelos());
			int id_aeropuerto_salida = Integer.parseInt(view.getTextTxtAeropuertoSalida_Vuelos());
			int id_aeropuerto_llegada = Integer.parseInt(view.getTextTxtAeropuertoLlegada_Vuelos());	
			
			logic.InsertarVuelo(nro_vuelo, cant_asientos, fecha_salida, fecha_llegada, tiempo_vuelo, id_aerolinea, id_aeropuerto_salida, id_aeropuerto_llegada);
		}
		
		
		
	}

}
