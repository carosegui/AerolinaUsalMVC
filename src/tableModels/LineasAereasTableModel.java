package tableModels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.aeropuerto.Aerolinea;

public class LineasAereasTableModel extends AbstractTableModel{

	private List<Aerolinea> lineasAereas = new ArrayList<>();
	
	public LineasAereasTableModel() {
	}
	
//	public void updateModel() {
//		lineasAereas.clear();
//		lineasAereas = dao.getAll();
//	}
	
	public void setList(List<Aerolinea> lineasAereas) {
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
		Aerolinea preguntado = lineasAereas.get(rowIndex);
		switch (columnIndex) {
	        case 0:
	            return preguntado.getNombreAerolinea();
	        case 1:
	            return preguntado.getAlianza();
	        default:
	            return "[no]";
		}
	}	
}
