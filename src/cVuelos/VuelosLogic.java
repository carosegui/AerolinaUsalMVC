package cVuelos;

import java.security.Timestamp;

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

public class VuelosLogic {

	//METODO PARA INSERTAR VUELOS
	public void InsertarVuelo(String nro_vuelo, int cant_asientos, java.sql.Date fecha_salida, java.sql.Date fecha_llegada,
								int tiempo_vuelo, int id_aerolinea, int id_aeropuertoSalida, int id_aeropuertoLlegada) {
		

		try(JdbcDaoFactory f = new JdbcDaoFactory()){
    		DaoManager manager = new DaoManager(f);
    		final VueloDAO vueloDao = new JdbcVueloDao(manager);
    		
    		final AerolineaDao aerolineaDao = new JdbcAerolineaDao(manager);
    		final AeropuertoDAO aeropuertoDao = new JdbcAeropuertoDao(manager);
    		
    		Aerolinea aerolinea = aerolineaDao.get(id_aerolinea);
    		Aeropuerto salida = aeropuertoDao.get(id_aeropuertoSalida);
    		Aeropuerto llegada = aeropuertoDao.get(id_aeropuertoLlegada);
    		
    	
    		java.sql.Timestamp fechaSalida = new java.sql.Timestamp(fecha_salida.getTime());
    		java.sql.Timestamp fechaLlegada= new java.sql.Timestamp(fecha_llegada.getTime());
    		
	  		Vuelo vuelo = new Vuelo(nro_vuelo,cant_asientos,fechaSalida,fechaLlegada,tiempo_vuelo,aerolinea, salida,llegada);
	  		
	  		vueloDao.insert(vuelo);

		
		}
		
	}
	
	
}
