package cLineasAereas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.FrameGeneralView;

public class LineasAereasEventController implements ActionListener{

	LineasAereasLogic logic;
	FrameGeneralView view;
	
	public LineasAereasEventController(FrameGeneralView view ) {
	
		this.logic = new LineasAereasLogic();
		this.view = view;
		this.view.setTableModel_LineasAereas(this.logic.getLineasAreas());
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

}
