package cVuelos;

import java.security.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import dao.interfaces.aeropuerto.AerolineaDao;
import dao.interfaces.aeropuerto.AeropuertoDAO;
import dao.interfaces.aeropuerto.UsuarioDAO;
import dao.interfaces.aeropuerto.VueloDAO;
import dao.jdbc.DaoManager;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.aeropuerto.JdbcAerolineaDao;
import dao.jdbc.aeropuerto.JdbcAeropuertoDao;
import dao.jdbc.aeropuerto.JdbcUsuarioDao;
import dao.jdbc.aeropuerto.JdbcVueloDao;
import model.aeropuerto.Aerolinea;
import model.aeropuerto.Aeropuerto;
import model.aeropuerto.Vuelo;
import vistas.FrameGeneralView;

public class VuelosLogic {
	
	public int idVuelo;

	//METODO PARA INSERTAR VUELOS
	public void InsertarVuelo(String nro_vuelo, int cant_asientos, java.sql.Date fecha_salida, java.sql.Date fecha_llegada,
								int tiempo_vuelo, int id_aerolinea, int id_aeropuertoSalida, int id_aeropuertoLlegada) {
		

		try(JdbcDaoFactory f = new JdbcDaoFactory()){
    		
    		final VueloDAO vueloDao = f.getDao(JdbcVueloDao.class);
    		final AerolineaDao aerolineaDao = f.getDao(JdbcAerolineaDao.class);
    		final AeropuertoDAO aeropuertoDao = f.getDao(JdbcAeropuertoDao.class);
    		
    		Aerolinea aerolinea = aerolineaDao.get(id_aerolinea);
    		Aeropuerto salida = aeropuertoDao.get(id_aeropuertoSalida);
    		Aeropuerto llegada = aeropuertoDao.get(id_aeropuertoLlegada);
    		
    	
    		java.sql.Timestamp fechaSalida = new java.sql.Timestamp(fecha_salida.getTime());
    		java.sql.Timestamp fechaLlegada= new java.sql.Timestamp(fecha_llegada.getTime());
    		
	  		Vuelo vuelo = new Vuelo(nro_vuelo,cant_asientos,fechaSalida,fechaLlegada,tiempo_vuelo,aerolinea, salida,llegada);
	  		
	  		vueloDao.insert(vuelo);

		
		}
		
	}
	
	
	public List<Vuelo> getAllvuelos() {
		
		List<Vuelo> allVuelos = new ArrayList<Vuelo>();
		
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			
			final VueloDAO vueloDao = f.getDao(JdbcVueloDao.class);
	
			allVuelos = vueloDao.getAll();
			
		}
			return allVuelos;
		
	}
	
	public void borrarVuelo(Object [] tablerow) {
		
		int idVuelo = (int) tablerow[0];
		
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			
			VueloDAO vueloDAO = f.getDao(JdbcVueloDao.class);
			vueloDAO.delete(idVuelo);
	
		}
		
		
		
		
	}
	
	
	public void modificarVuelo(FrameGeneralView view, Object [] tablerow) {
		
		this.idVuelo = (int) tablerow[0];
		view.setSelectedRow_VuelosModificar(view.getSelectedRow_Vuelos());
		
	}
	
	public void OKmodificar(String nro_vuelo, int cant_asientos, java.sql.Date fecha_salida, java.sql.Date fecha_llegada,
			int tiempo_vuelo) {
		
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
		
			final VueloDAO vueloDao = f.getDao(JdbcVueloDao.class);
    		final AerolineaDao aerolineaDao = f.getDao(JdbcAerolineaDao.class);
    		final AeropuertoDAO aeropuertoDao = f.getDao(JdbcAeropuertoDao.class);
    		
    		
    		
    		Aerolinea aerolinea = aerolineaDao.get(vueloDao.get(idVuelo).getAerolinea().getIdAerolinea());
    		Aeropuerto salida = aeropuertoDao.get(vueloDao.get(idVuelo).getAeropuertoSalida().getIdAeropuerto());
    		Aeropuerto llegada = aeropuertoDao.get(vueloDao.get(idVuelo).getAeropuertoLlegada().getIdAeropuerto());
    		
    	
    		java.sql.Timestamp fechaSalida = new java.sql.Timestamp(fecha_salida.getTime());
    		java.sql.Timestamp fechaLlegada= new java.sql.Timestamp(fecha_llegada.getTime());
    		
	  		Vuelo vuelo = new Vuelo(nro_vuelo,cant_asientos,fechaSalida,fechaLlegada,tiempo_vuelo,aerolinea, salida,llegada);
			
			
	
			vueloDao.update(idVuelo, vuelo);
			
			
		}
	}
	
	
	
	//ACTUALIZA LA VISTA
	public void updateVuelos(FrameGeneralView view) {
		
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
		
		VueloDAO vueloDAO = f.getDao(JdbcVueloDao.class);
		
		view.setTableModel_Vuelos(vueloDAO.getAll());
		}
		
	}



	
	
}
