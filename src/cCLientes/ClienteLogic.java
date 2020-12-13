package cCLientes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import dao.interfaces.cliente.ClienteDAO;
import dao.jdbc.DaoManager;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.cliente.JdbcClienteDao;
import dao.jdbc.cliente.JdbcPasajeroFrecuenteDao;
import dao.jdbc.direccion.JdbcPaisDao;
import dao.jdbc.direccion.JdbcProvinciaDao;
import model.aeropuerto.Aerolinea;
import model.cliente.Cliente;
import model.cliente.PasajeroFrecuente;
import model.cliente.Pasaporte;
import model.cliente.Telefono;
import model.direccion.Direccion;
import model.direccion.Pais;
import model.direccion.Provincia;

public class ClienteLogic {

	public void CreateCliente(String nombre,String apellido, int dni, int cuitCuil, Date fechaNacimiento, String email,
								String calle,int altura, String ciudad, int codigo_postal, int id_pais, int id_provincia, int provincia_otro,
								String personal, String celular, String laboral, int nroPasaporte, String autoridadEmision, java.sql.Date fechaEmision,
								java.sql.Date fechaVencimiento, int id_PAIS) {
		
		try(JdbcDaoFactory f = new JdbcDaoFactory()){
			
			
			//Pasajero frecuente
			JdbcPasajeroFrecuenteDao pf = f.getDao(JdbcPasajeroFrecuenteDao.class);
			PasajeroFrecuente pasajeroFrecuente = pf.get(1);
			
			//Pais
			JdbcPaisDao paisDao = f.getDao(JdbcPaisDao.class);
			Pais pais = paisDao.get(id_PAIS);
			
			//Creo pasporte
			Pasaporte pasaporte = new Pasaporte(nroPasaporte, autoridadEmision, fechaEmision, fechaVencimiento, pais);
			//Telefono
			Telefono telefono = new Telefono(personal, celular, laboral);
			
			JdbcProvinciaDao provinciaDao = f.getDao(JdbcProvinciaDao.class);
			Provincia provincia = provinciaDao.get(id_provincia);
			
			Direccion direccion = new Direccion(calle, altura, ciudad, codigo_postal, pais, provincia, Integer.toString(id_provincia));
			
			
			Cliente cliente = new Cliente(nombre, apellido, dni, cuitCuil, fechaNacimiento, email, direccion, telefono, pasaporte, pasajeroFrecuente);
			
			JdbcClienteDao clienteDao =  f.getDao(JdbcClienteDao.class);
			clienteDao.insert(cliente);Cliente c = new Cliente(nombre, apellido, dni, cuitCuil, fechaNacimiento, email, direccion, telefono, pasaporte, pasajeroFrecuente);			
		}
		
//		PasajeroFrecuente pf = new PasajeroFrecuente("test", 112, "test", );
//		Pasaporte p = new Pasaporte(nroPasaporte, autoridadEmision, fechaEmision, fechaVencimiento, pais);
//		Pais p = new Pais(codigoPais, nombrePais, codigoTelefono);
//		Provincia p = new Provincia(nombre);
//		Direccion d = new Direccion(calle, altura, ciudad, codigoPostal, pais, provincia, provinciaOtro);
//		Telefono t = new Telefono(personal, celular, laboral)
//		Cliente c = new Cliente(nombre, apellido, dni, cuitCuil, fechaNacimiento, email, direccion, telefono, pasaporte, pasajeroFrecuente);
	}
	
		public List<Cliente> getAllClientes(){
		
			List<Cliente> allClientes = new ArrayList<Cliente>();
		
			try(JdbcDaoFactory f = new JdbcDaoFactory()){
				
				ClienteDAO clienteDao = f.getDao(JdbcClienteDao.class);
				
				allClientes = clienteDao.getAll();
				
			}
		
			return allClientes;
	}
	
	
}
