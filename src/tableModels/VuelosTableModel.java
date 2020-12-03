package tableModels;

import javax.swing.table.AbstractTableModel;

public class VuelosTableModel extends AbstractTableModel{

//	private TODO: implementar VuelosDAO
//	private List<Vuelo> vuelos = new ArrayList<Vuelo>(); TODO: implementar
	
	public VuelosTableModel() {
		// this.dao = dao;
	}
	
	public void updateModel() {
//		vuelos.clear(); //Se hace asi o volviendo a instanciar el dao
//		vuelos = dao.getAll();
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
		return 0; //vuelos.size(); TODO: Implementar
	}

	@Override
	public int getColumnCount() {
		return 8;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
//		Vuelo preguntado = vuelos.get(rowIndex);
		return null;
//		switch (columnIndex) {
//	        case 0:
//	            return preguntado.get    TODO
//	        case 1:
//	            return preguntado.get
//	        case 2:
//	            return preguntado.get
//	        case 3:
//	            return preguntado.get
//	        case 4:
//	            return preguntado.get
//			case 5:
//				return preguntado.get
//			case 6:
//				return preguntado.get
//			case 7:
//				return preguntado.get
//			case 8:
//				return preguntado.get
//	        default:
//	            return "[no]";
//		}
	}
	
	
}
