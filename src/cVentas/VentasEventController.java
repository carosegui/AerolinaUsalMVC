package cVentas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.aeropuerto.Vuelo;
import vistas.FrameGeneralView;

public class VentasEventController implements ActionListener {

	private FrameGeneralView view;
	private VentasLogic logic;
	private List<String> vuelo;
	public VentasEventController(FrameGeneralView view) {
		
			this.view = view;
			this.logic = new VentasLogic();
			view.btnVentas();
			view.getBtnBuscarVuelos_Ventas().addActionListener(this);
			view.getOrigenComboBox().setModel(logic.getDml());
			view.getDestinoComboBox().setModel(logic.getDml());
			view.getBtnConfirmarCompra_Ventas().addActionListener(this);
			view.getBtnOk_VUelossForm().addActionListener(this);
			view.getBtnComprar_Ventas().addActionListener(this);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == view.getBtnBuscarVuelos_Ventas()) {
			
			
			List<Vuelo> list = logic.verificarVuelos(view.getTextCAeropuertoOrigen_Ventas(), view.getTextCAeropuertoDestino_Ventas());
			if(!list.isEmpty()) {
			this.view.setTableModel_Ventas(list);
			view.displayVentasTable();
			}else
		
			this.view.setTxtLblMensajeError_Ventas("No existen vuelos para esa combinación.");
			
			
		}else if(e.getSource() == view.getBtnComprar_Ventas()) {
			vuelo = logic.seleccionarVuelo(view.getSelectedRow_Ventas());
			view.displayVentasFormaDePago();
			
		}else if(e.getSource() == view.getBtnConfirmarCompra_Ventas()) {
			logic.crearVenta(vuelo, view.getSelectedButtonText_Ventas());
			
		}
		}
		
	}
	
	








