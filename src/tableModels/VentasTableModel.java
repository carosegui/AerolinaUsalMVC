package tableModels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import model.aeropuerto.Venta;

public class VentasTableModel extends AbstractTableModel{

	private List<Venta> ventas;
	
	public VentasTableModel() {
		this.ventas = new ArrayList<Venta>();
	}
	
//	public void updateModel() {
//		objetos.clear(); //Se hace asi o volviendo a instanciar el dao
//		objetos = dao.getAll();
//	}
	
	public void setList(List<Venta> ventas) {
		this.ventas = ventas;
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
         	default:
         		return "[no]";
		}
	}
	
	@Override
	public int getRowCount() {
		return ventas.size();
	}

	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Venta preguntado = ventas.get(rowIndex);
		switch (columnIndex) {
	        case 0:
	            return preguntado.getVuelo().getAeropuertoSalida().getCiudad();
	        case 1:
	            return preguntado.getVuelo().getAeropuertoLlegada().getCiudad();
	        case 2:
	            return preguntado.getVuelo().getFecHsSalida();
	        case 3:
	            return preguntado.getVuelo().getFecHsLlegada();
	        case 4:
	            return preguntado.getAerolinea().getNombreAerolinea();
	        default:
	            return "[no]";
		}
	}
}
