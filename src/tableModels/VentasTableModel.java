package tableModels;

import javax.swing.table.AbstractTableModel;

public class VentasTableModel extends AbstractTableModel{

//	private TODO: implementar LineasAereasDAO
//	private List<Object> objetos = new ArrayList<Object>(); TODO: implementar
	
	public VentasTableModel() {
//		this.dao = dao;
	}
	
	public void updateModel() {
//		objetos.clear(); //Se hace asi o volviendo a instanciar el dao
//		objetos = dao.getAll();
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
		return 0; //objetos.size(); TODO: Implementar
	}

	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
//		Object preguntado = objetos.get(rowIndex);
		return null;
//		switch (columnIndex) {
//	        case 0:
//	            return preguntado.get    TODO
//	        case 1:
//	            return preguntado.get
//	        default:
//	            return "[no]";
//		}
	}
}
