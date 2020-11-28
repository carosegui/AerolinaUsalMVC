package tableModels;

import javax.swing.table.AbstractTableModel;

public class LineasAereasTableModel extends AbstractTableModel{

//	private TODO: implementar LineasAereasDAO
//	private List<LineasAereas> lineasAereas = new ArrayList<LineasAereas>(); TODO: implementar
	
	public LineasAereasTableModel() {
//		this.dao = dao;
	}
	
	public void updateModel() {
//		lineasAereas.clear(); //Se hace asi o volviendo a instanciar el dao
//		lineasAereas = dao.getAll();
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
         	case 0:
         		return "NOMBRE";
         	case 1:
         		return "ALIANZA";
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
		return 2;
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
//	        default:
//	            return "[no]";
//		}
	}
}
