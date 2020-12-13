package tableModels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.aeropuerto.Aerolinea;
import model.cliente.Cliente;

public class ClientesTableModel extends AbstractTableModel{
	
	private List<Cliente> clientes;

	public ClientesTableModel() {
		this.clientes = new ArrayList<Cliente>();
	}
	
//	public void updateModel() {
//		clientes.clear();
//		clientes = dao.getAll();
//	}
	
	public void setList(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
	     	case 0:
	     		return "NOMBRE";
	     	case 1:
	     		return "APELLIDOS";
	     	case 2:
	     		return "DNI";
	     	case 3:
	     		return "CUIT-CUIL";
	     	case 4:
	     		return "FECHA NAC";
	     	case 5: 
	     		return "EMAIL";
	     	case 6: 		//Telefono
	     		return "PERSONAL";
	     	case 7:
	     		return "CELULAR";
	    	case 8:
	     		return "LABORAL";
	     	case 9:		//Direccion
	     		return "CALLE";
	     	case 10:
	     		return "ALTURA";
	     	case 11:
	     		return "CIUDAD";
	     	case 12:
	     		return "COD POSTAL";
	     	case 13:
	     		return "PAÍS";
	     	case 14: 
	     		return "PROVINCIA";
	     	case 15: 		//Pasaporte
	     		return "NÚMERO";
	     	case 16:
	     		return "AUTORIDAD EMISIÓN";
	     	case 17:
	     		return "FECHA EMISIÓN";
	     	case 18:
	     		return "FECHA VENCIMIENTO";
	     	case 19:
	     		return "PAÍS";
	     	default:
	     		return "[no]";
		}
	}
	
	@Override
	public int getRowCount() {
		return clientes.size();
	}
	
	@Override
	public int getColumnCount() {
		return 20;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		Cliente preguntado = clientes.get(rowIndex);
    	switch (columnIndex) {
	      case 0:
	          return preguntado.getNombre();   
	      case 1:
	          return preguntado.getApellido();
	      case 2:
	          return preguntado.getDni();
	      case 3:
	          return preguntado.getCuitCuil();
	      case 4:
	          return preguntado.getFechaNacimiento();
			case 5:
				return preguntado.getEmail();
			case 6:
				return preguntado.getTelefono().getPersonal();
			case 7:
				return preguntado.getTelefono().getCelular();
			case 8:
				return preguntado.getTelefono().getLaboral();
			case 9:
	          return preguntado.getDireccion().getCalle();
	      case 10:
	          return preguntado.getDireccion().getAltura();
	      case 11:
	          return preguntado.getDireccion().getCiudad();
	      case 12:
	          return preguntado.getDireccion().getCodigoPostal();
			case 13:
				return preguntado.getDireccion().getPais();
			case 14:
				return preguntado.getDireccion().getProvincia();
			case 15:
				return preguntado.getPasaporte().getNroPasaporte();
			case 16:
				return preguntado.getPasaporte().getAutoridadEmision();
    		case 17:
	          return preguntado.getPasaporte().getFechaEmision();
	      case 18:
	          return preguntado.getPasaporte().getFechaVencimiento();
			case 19:
				return preguntado.getPasaporte().getPais();
	      default:
	            return "[no]";
		 }
	}
}
