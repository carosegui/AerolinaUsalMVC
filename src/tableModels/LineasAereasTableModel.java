package tableModels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.aeropuerto.Aerolinea;

public class LineasAereasTableModel extends AbstractTableModel{

	private List<Aerolinea> lineasAereas;
	
	public LineasAereasTableModel() {
		lineasAereas = new ArrayList<Aerolinea>();
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
         	case 2:
         		return "NRO. LINEA AEREA";
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
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Aerolinea preguntado = lineasAereas.get(rowIndex);
		switch (columnIndex) {
	        case 0:
	            return preguntado.getNombreAerolinea();
	        case 1:
	            return preguntado.getAlianza();
	        case 2:
	        	return preguntado.getIdAerolinea();
	        default:
	            return "[no]";
		}
	}	
}
