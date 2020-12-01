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
    		DaoManager manager = new DaoManager(f);
    		final UsuarioDAO usuarioDao = new JdbcUsuarioDao(manager);
    		
    		
    		//SELECT * FROM usuarios WHERE clave = ? AND nombre_usuario = ? 
    		
    		user = usuarioDao.getByName(usuario);
    		System.out.println(user);
    		if(clave.contentEquals(user.getClave())) {
    			verificado = true;
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		return verificado;
		
		
		
		
	}
	
}
