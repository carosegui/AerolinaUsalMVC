package cTest;

import cLogin.LoginEventController;
import test.TestJdbcDaos;
import vistas.FrameGeneralView;
import vistas.LoginView;

public class Test {
	public static void main(String[] args) {
//		TestJdbcDaos.TestDAO();
		
		FrameGeneralView lo = new FrameGeneralView();
		lo.setVisible(true);
		
		LoginEventController lc = new LoginEventController(lo);

	}
}
