package cVentas;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import dao.interfaces.aeropuerto.AeropuertoDAO;
import dao.interfaces.aeropuerto.VueloDAO;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.aeropuerto.JdbcAeropuertoDao;
import dao.jdbc.aeropuerto.JdbcVueloDao;
import model.aeropuerto.Aeropuerto;
import model.aeropuerto.Vuelo;

public class VentasLogic {

		
	public List<Aeropuerto> getAeropuertos(){
		List<Aeropuerto> lista = null;
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			AeropuertoDAO aeropuertoDAO = f.getDao(JdbcAeropuertoDao.class);
			lista = aeropuertoDAO.getAll();
			
		}
		
		return lista;
		
	}
	
	
	public DefaultComboBoxModel<String> getDml(){
		DefaultComboBoxModel dml= new DefaultComboBoxModel();
		for (int i = 0; i < getAeropuertos().size(); i++) {
			System.out.println(getAeropuertos().get(i).getCodigoAeropuerto());
			 dml.addElement(getAeropuertos().get(i).getCiudad());
			}
		return dml;
	}
	
	
	@SuppressWarnings("null")
	public List<Vuelo> verificarVuelos(String origen, String destino){
		
		   List<Vuelo> listaAllVuelos = null;
		   List<Vuelo> listaVuelosElegidos = null;
		   
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			
			VueloDAO vuelosDao = f.getDao(JdbcVueloDao.class);
			listaAllVuelos = vuelosDao.getAll();
			
			for (int i = 0; i < listaAllVuelos.size(); i++) {
				
				if(listaAllVuelos.get(i).getAeropuertoSalida().getCiudad().contentEquals(origen) && listaAllVuelos.get(i).getAeropuertoLlegada().getCiudad().contentEquals(destino)) 
					listaVuelosElegidos.add(listaAllVuelos.get(i));
					
				}

		}
		
		return listaAllVuelos;
		
	}
	
	
	
	
	
	
}
