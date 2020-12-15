package tableModels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.aeropuerto.Venta;
import model.aeropuerto.Vuelo;

public class VentasTableModel extends AbstractTableModel{

	private List<Vuelo> lista;
	
	public VentasTableModel() {
		this.lista = new ArrayList<Vuelo>();
	}
	
//	public void updateModel() {
//		objetos.clear(); //Se hace asi o volviendo a instanciar el dao
//		objetos = dao.getAll();
//	}
	
	public void setList(List<Vuelo> lista) {
		this.lista = lista;
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
         	case 0:
         		return "AEROPUERTO SALIDA";
         	case 1:
         		return "AEROPUERTO LLEGADA";
         	case 2:
         		return "FECHA SALIDA";
         	case 3:
         		return "FECHA LLEGADA";
         	case 4:
         		return "AEROLINEA";
		}
		return null;
	}
	
	@Override
	public int getRowCount() {
		return lista.size();
	}

	@Override
	public int getColumnCount() {
		return 6;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Vuelo preguntado = lista.get(rowIndex);
		switch (columnIndex) {
	        case 0:
	            return preguntado.getAeropuertoSalida().getCiudad();
	        case 1:
	            return preguntado.getAeropuertoLlegada().getCiudad();
	        case 2:
	            return preguntado.getFecHsSalida();
	        case 3:
	            return preguntado.getFecHsLlegada();
	        case 4:
	            return preguntado.getAerolinea().getNombreAerolinea();
	        case 5: 
	        	return preguntado.getIdVuelo(); //TODO: Borrar si no funciona
	        default:
	            return "[no]";
		}
	}
}
