package cMenuPpal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cVuelos.VuelosEventController;
import vistas.FrameGeneralView;

public class MenuPpalEvenController implements ActionListener{
	
	private FrameGeneralView view;
	
	public MenuPpalEvenController(FrameGeneralView view) {
		this.view = view;
		view.displayVuelosForm();
		view.getBtnVentas().addActionListener(this);
		view.getBtnClientes().addActionListener(this);
		view.getBtnVuelos().addActionListener(this);
		view.getBtnLineasAereas().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == view.getBtnVentas()) {
			System.out.println("Ventas");
	}else if(e.getSource() == view.getBtnClientes()) {
		System.out.println("Clientes");
		view.displayClientesForm();
	}else if(e.getSource() == view.getBtnVuelos()) {
		System.out.println("Vuelos");
		VuelosEventController v = new VuelosEventController(view);
		view.displayVuelosForm();
	}else if(e.getSource() == view.getBtnLineasAereas()) {
		System.out.println("Lineas");
		view.displayLineasAereasForm();
	}

}
}
