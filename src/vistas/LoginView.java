package vistas;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class LoginView extends JPanel {

	private JButton btnIngresar;
	
	private JLabel lblTitulo;
	private JLabel lblUsuario;
	private JLabel lblContrasena;
	private JLabel lblMensajeError;
	
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public LoginView() {
		initComponents();
	}
	
	private void initComponents() {
		this.setBounds(100, 100, 528, 446);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));		
		this.setLayout(null);
		
		lblTitulo = new JLabel("L o g i n");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblTitulo.setBounds(191, 31, 153, 88);
		this.add(lblTitulo);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(50, 168, 89, 35);
		this.add(lblUsuario);
		
		lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasena.setBounds(50, 216, 113, 35);
		this.add(lblContrasena);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsuario.setBounds(202, 175, 280, 29);
		this.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtContrasena.setBounds(202, 223, 280, 29);
		this.add(txtContrasena);
		
		lblMensajeError = new JLabel("esta label es para un mensaje de error en caso de que el usuario o contrase\u00F1a sean incorrectos", JLabel.CENTER);
		lblMensajeError.setForeground(Color.RED);
		lblMensajeError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMensajeError.setBounds(0, 274, 528, 19);
		this.add(lblMensajeError);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIngresar.setBounds(177, 329, 150, 40);
		this.add(btnIngresar);
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public JLabel getLblUsuario() {
		return lblUsuario;
	}

	public JLabel getLblContrasena() {
		return lblContrasena;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public JPasswordField getTxtContrasena() {
		return txtContrasena;
	}

	public void setTxtLblMensajeError(String mensaje) {
		this.lblMensajeError.setText(mensaje);
	}
	
	public String getTextUsuario() {
		return txtUsuario.getText();
	}
	
	public String getTextContrasena() {
		return txtContrasena.getSelectedText();
	}
}
