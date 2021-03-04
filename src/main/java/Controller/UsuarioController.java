package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UsuarioController {
	static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	@FXML
	TextField txtName,txtEmail;
	@FXML
	Button btnAceptar,btnCancelar;
	@FXML
	PasswordField txtPass;
	
	@FXML 
	public void cancelarDatos(ActionEvent actionEvent) {
		txtName.setText(" ");
		txtEmail.setText(" ");
		txtPass.setText(null);
		
	}
	
	@FXML
	public void aceptarUser(ActionEvent actionEvent) {
		Usuario u = crearUser();
		usuarios.add(u);
		for (Usuario user : usuarios) {
			System.out.println(user.toString());
		}
		
	}
	
	public Usuario crearUser() {
		Usuario user=null;
		int id = 654;
		String name= txtName.getText();
		String email = txtEmail.getText();
		String pass= txtPass.getText();
		user= new Usuario(name, email, pass);
		return user;
		
		
	}

}
