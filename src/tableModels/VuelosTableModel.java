package tableModels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.aeropuerto.Vuelo;

public class VuelosTableModel extends AbstractTableModel{

	private List<Vuelo> vuelos;
	
	public VuelosTableModel() {
		vuelos = new ArrayList<Vuelo>();
	}
	
//	public void updateModel() {
//		vuelos.clear(); //Se hace asi o volviendo a instanciar el dao
//		vuelos = dao.getAll();
//	}
	
	public void setList(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
         	case 0:
         		return "NUMERO";
         	case 1:
         		return "CANTIDAD ASIENTOS";
         	case 2:
         		return "FECHA SALIDA";
         	case 3:
         		return "FECHA LLEGADA";
         	case 4:
         		return "TIEMPO";
         	case 5: 
         		return "AEROLINEA";
         	case 6:
         		return "AEROPUERTO SALIDA";
         	case 7:
         		return "AEROPUERTO LLEGADA";
         	default:
         		return "[no]";
		}
	}
	
	@Override
	public int getRowCount() {
		return vuelos.size();
	}

	@Override
	public int getColumnCount() {
		return 8;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Vuelo preguntado = vuelos.get(rowIndex);
		switch (columnIndex) {
	        case 0:
	            return preguntado.getNroVuelo();
	        case 1:
	            return preguntado.getCantAsientos();
	        case 2:
	            return preguntado.getFecHsSalida();
	        case 3:
	            return preguntado.getFecHsLlegada();
	        case 4:
	            return preguntado.getTiempoVuelo();
			case 5:
				return preguntado.getAerolinea().getNombreAerolinea();
			case 6:
				return preguntado.getAeropuertoSalida().getCiudad();
			case 7:
				return preguntado.getAeropuertoLlegada().getCiudad();
	        default:
	            return "[no]";
		}
	}
	
	
}
