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
		this.view.getBtnBorrar_LineasAereas().addActionListener(this);
		this.view.getBtnModificar_LineasAereas().addActionListener(this);
		this.view.getBtnInsertar_LineasAereas().addActionListener(this);
		this.view.getBtnOk_LineasAereas().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getBtnInsertar_LineasAereas()) {
			view.displayLineasAereasForm();
			
		}else if(e.getSource() == view.getBtnOk_LineasAereas()) {
			
			logic.insertar(view.getTextTxtNombre_LineasAereas());
			logic.updateLineasAereas(view);
			view.btnLineasAereas();
			
		}else if(e.getSource() == view.getBtnBorrar_LineasAereas()) {
			logic.borrarLineaAereaObject(view.getSelectedRow_LineasAereas());
			logic.updateLineasAereas(view);
		}
		
		
	}

}
