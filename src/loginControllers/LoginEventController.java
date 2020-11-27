package loginControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.FrameGeneralView;
import vistas.LoginView;

public class LoginEventController implements ActionListener{
	//TODO: Falta el DAO
	private FrameGeneralView view;
	private LoginLogic logic;
	public LoginEventController(FrameGeneralView view) {
		this.view = view;
		System.out.println("CONSTRUCTOR");
		this.logic = new LoginLogic(); 
		view.getBotonlogn().addActionListener(this);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		 if (e.getSource() == view.getBotonlogn()) {
			 
	            try {
	            
	            		String user = view.getTextUsuarioLogin();
	            		System.out.println(user);
		            	String clave = view.getTextContrasenaLogin();
		            	System.out.println(clave);
		            	
		            	if(logic.verificarLogin(user, clave)) {
		            		view.disable();
		            	}else {
		            		view.setTxtLblMensajeErrorLogin("Usuario o contraseña incorrecto");
		            	}
	            	
	            } catch (Exception e1) { //TODO: DAO Exceptions
	                e1.printStackTrace();
	            }
	        }
	} 
}
