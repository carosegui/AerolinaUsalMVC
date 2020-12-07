package tableModels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class LineasAereasTableModel extends AbstractTableModel{

	private List<?> lineasAereas = new ArrayList<>();
	
	public LineasAereasTableModel() {
	}
	
//	public void updateModel() {
//		lineasAereas.clear();
//		lineasAereas = dao.getAll();
//	}
	
	public void setList(List<?> lineasAereas) {
		this.lineasAereas = lineasAereas;
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
		return lineasAereas.size();
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
