package tableModels;

import javax.swing.table.AbstractTableModel;

public class ClientesTableModel extends AbstractTableModel{
//	private TODO: implementar ClientesDAO
//	private List<Cliente> clientes = new ArrayList<Cliente>(); TODO: implementar

	public ClientesTableModel() {
//		this.dao = dao;
	}
	
	public void updateModel() {
//		clientes.clear();
//		clientes = dao.getAll();
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
	     	case 0:
	     		return "ID";
	     	case 1:
	     		return "NOMBRE";
	     	case 2:
	     		return "APELLIDOS";
	     	case 3:
	     		return "DNI";
	     	case 4:
	     		return "CUIT-CUIL";
	     	case 5:
	     		return "FECHA NAC";
	     	case 6: 
	     		return "EMAIL";
	     	case 7: 		//Telefono
	     		return "PERSONAL";
	     	case 8:
	     		return "CELULAR";
	    	case 9:
	     		return "LABORAL";
	     	case 10:		//Direccion
	     		return "CALLE";
	     	case 11:
	     		return "ALTURA";
	     	case 12:
	     		return "CIUDAD";
	     	case 13:
	     		return "COD POSTAL";
	     	case 14:
	     		return "PAÍS";
	     	case 15: 
	     		return "PROVINCIA";
	     	case 16: 		//Pasaporte
	     		return "NÚMERO";
	     	case 17:
	     		return "AUTORIDAD EMISIÓN";
	     	case 18:
	     		return "FECHA EMISIÓN";
	     	case 19:
	     		return "FECHA VENCIMIENTO";
	     	case 20:
	     		return "PAÍS";
	     	default:
	     		return "[no]";
		}
	}
	
	@Override
	public int getRowCount() {
		return 0; //Clientes.size(); TODO: Implementar
	}
	
	@Override
	public int getColumnCount() {
		return 21;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
		
//		Cliente preguntado = clientes.get(rowIndex);
    //	switch (columnIndex) {
	//      case 0:
	//          return preguntado.get   
	//      case 1:
	//          return preguntado.get
	//      case 2:
	//          return preguntado.get
	//      case 3:
	//          return preguntado.get
	//      case 4:
	//          return preguntado.get
	//		case 5:
	//			return preguntado.get
	//		case 6:
	//			return preguntado.get
	//		case 7:
	//			return preguntado.get
	//		case 8:
	//			return preguntado.get
	//		case 9:
	//          return preguntado.get
	//      case 10:
	//          return preguntado.get
	//      case 11:
	//          return preguntado.get
	//      case 12:
	//          return preguntado.get
	//		case 13:
	//			return preguntado.get
	//		case 14:
	//			return preguntado.get
	//		case 15:
	//			return preguntado.get
	//		case 16:
	//			return preguntado.get
    //		case 17:
	//          return preguntado.get
	//      case 18:
	//          return preguntado.get
	//		case 19:
	//			return preguntado.get
	//		case 20:
	//			return preguntado.get
	//      default:
	//            return "[no]";
	//	 }
	}
}
