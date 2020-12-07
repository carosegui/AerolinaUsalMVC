package cLineasAereas;

import java.util.List;

import dao.interfaces.aeropuerto.AerolineaDao;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.aeropuerto.JdbcAerolineaDao;
import model.aeropuerto.Aerolinea;

public class LineasAereasLogic {

	public List<Aerolinea> getLineasAreas(){
		 List<Aerolinea> listaAerolineas = null;
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			 AerolineaDao adao = f.getDao(JdbcAerolineaDao.class);
			listaAerolineas = adao.getAll();
		}
		
		return listaAerolineas;
	}
	
	
}
