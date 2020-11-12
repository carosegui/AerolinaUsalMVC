package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.LoginView;

public class LoginController implements ActionListener{

	//TODO: Falta el DAO
	private LoginView view;
	
	public LoginController(LoginView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if (e.getSource() == view.getBtnIngresar()) {
	            try {
	               //TODO: Logica para validar e ingresar al sistema
	            } catch (Exception e1) { //TODO: DAO Exceptions
	                e1.printStackTrace();
	            }
	        }
	}
}
