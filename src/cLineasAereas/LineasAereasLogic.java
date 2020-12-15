package cLineasAereas;

import java.util.List;

import dao.interfaces.aeropuerto.AerolineaDao;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.aeropuerto.JdbcAerolineaDao;
import model.aeropuerto.Aerolinea;
import model.aeropuerto.Alianza;

public class LineasAereasLogic {

	public List<Aerolinea> getLineasAreas(){
		 List<Aerolinea> listaAerolineas = null;
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			 AerolineaDao adao = f.getDao(JdbcAerolineaDao.class);
			listaAerolineas = adao.getAll();
		}
		
		return listaAerolineas;
	}
	
	
	public void insertar(String nombre, String alianza){
		
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			
			AerolineaDao adao = f.getDao(JdbcAerolineaDao.class);
			
			
			
			adao.insert(new Aerolinea(nombre, Alianza.SkyTeam));
		}
		
	}
	
	
}
