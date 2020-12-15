package cLineasAereas;

import java.util.List;

import dao.interfaces.aeropuerto.AerolineaDao;
import dao.interfaces.aeropuerto.VueloDAO;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.aeropuerto.JdbcAerolineaDao;
import dao.jdbc.aeropuerto.JdbcVueloDao;
import model.aeropuerto.Aerolinea;
import model.aeropuerto.Alianza;
import vistas.FrameGeneralView;

public class LineasAereasLogic {

	public List<Aerolinea> getLineasAreas(){
		 List<Aerolinea> listaAerolineas = null;
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			 AerolineaDao adao = f.getDao(JdbcAerolineaDao.class);
			listaAerolineas = adao.getAll();
		}
		
		return listaAerolineas;
	}
	
	
	public void insertar(String nombre){
		
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			
			AerolineaDao adao = f.getDao(JdbcAerolineaDao.class);
			
			
			
			adao.insert(new Aerolinea(nombre, Alianza.SkyTeam));
		}
		
	}
	
	public void updateLineasAereas(FrameGeneralView view) {
		
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
		
		AerolineaDao aeroLinea = f.getDao(JdbcAerolineaDao.class);
		
		view.setTableModel_LineasAereas(aeroLinea.getAll());
		}
		
	}
	
	
	public  void borrarLineaAereaObject (Object[] tablerow) {
		
		int idVuelo = (int) tablerow[0];
		
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			
			VueloDAO vueloDAO = f.getDao(JdbcVueloDao.class);
			vueloDAO.delete(idVuelo);
	
		}
		
		
		
		
	}
	
}
