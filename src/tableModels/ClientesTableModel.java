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
	     		return "NOMBRE";
	     	case 1:
	     		return "APELLIDOS";
	     	case 2:
	     		return "DNI";
	     	case 3:
	     		return "CUIT-CUIL";
	     	case 4:
	     		return "FECHA NAC";
	     	case 5: 
	     		return "EMAIL";
	     	case 6: 		//Telefono
	     		return "PERSONAL";
	     	case 7:
	     		return "CELULAR";
	    	case 8:
	     		return "LABORAL";
	     	case 9:		//Direccion
	     		return "CALLE";
	     	case 10:
	     		return "ALTURA";
	     	case 11:
	     		return "CIUDAD";
	     	case 12:
	     		return "COD POSTAL";
	     	case 13:
	     		return "PAÍS";
	     	case 14: 
	     		return "PROVINCIA";
	     	case 15: 		//Pasaporte
	     		return "NÚMERO";
	     	case 16:
	     		return "AUTORIDAD EMISIÓN";
	     	case 17:
	     		return "FECHA EMISIÓN";
	     	case 18:
	     		return "FECHA VENCIMIENTO";
	     	case 19:
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
		return 20;
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
