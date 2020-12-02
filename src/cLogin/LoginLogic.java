package cLogin;

import dao.interfaces.aeropuerto.UsuarioDAO;
import dao.jdbc.DaoManager;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.aeropuerto.JdbcUsuarioDao;
import model.aeropuerto.Usuario;
import vistas.FrameGeneralView;


public class LoginLogic {

	// CAMBIAR A CONTROLLER
	public boolean verificarLogin(String usuario, String clave){
		
		
		boolean verificado = false;
		Usuario user = null;
	
	
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
    		
			final UsuarioDAO usuarioDao = f.getDao(JdbcUsuarioDao.class);
    		
    		user = usuarioDao.getByNamePassword(usuario, clave);
    		//SELECT * FROM usuarios WHERE clave = ? AND nombre_usuario = ? 
    		
    
    		
    		System.out.println(user);
    		if(user != null) {
    			verificado = true;
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		return verificado;
		
		
		
		
	}
	
}
