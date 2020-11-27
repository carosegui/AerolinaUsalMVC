package util.datePicker;

import java.util.Properties;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;


public class DatePicker {
	private SqlDateModel model; 
	private JDatePanelImpl datePanel;
	private JDatePickerImpl datePicker;
	
	public DatePicker() {
		Properties p = new Properties();
		p.put("text.day", "Day");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		
		this.model = new SqlDateModel(); 
		this.datePanel = new JDatePanelImpl(model, p);
		this.datePicker = new JDatePickerImpl(datePanel, new CustomDateFormat());
	}
	
	public static JDatePickerImpl getDatePicker() {
		return new DatePicker().datePicker;
	}
}
