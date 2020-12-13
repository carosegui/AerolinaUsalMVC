package cVentas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;

import vistas.FrameGeneralView;

public class VentasEventController implements ActionListener {

	private FrameGeneralView view;
	private VentasLogic logic;
	public VentasEventController(FrameGeneralView view) {
		
			this.view = view;
			this.logic = new VentasLogic();
			view.btnVentas();
			view.getBtnBuscarVuelos_Ventas().addActionListener(this);
			view.getOrigenComboBox().setModel(logic.getDml());
			view.getDestinoComboBox().setModel(logic.getDml());
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == view.getBtnBuscarVuelos_Ventas()) {
			
			this.view.setTableModel_Ventas(logic.verificarVuelos(view.getTextCAeropuertoOrigen_Ventas(), view.getTextCAeropuertoDestino_Ventas()));
			view.displayVentasTable();
			
		}
		
	}
	
	
}
