package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;

import Model.Album;
import Model.Formato;

public class AlbumController {

	
	@FXML
	TextField txtNombre,txtArtista,txtAnno,txtMeta;
	@FXML
	Button btnAceptar;
	@FXML
	RadioButton vinilo;
	
	static List<Album>  almbumes= new ArrayList<Album>();
	
	
	public Album createAlbum() {
		boolean valido;
		
		String artista= txtArtista.getText();
		String nombre= txtNombre.getText();
		Formato f =  Formato.VINILO ;
		String anyo=txtAnno.getText();
		if(anyo==null || nombre==null || artista==null) {
			valido=false;
			return null;
			
		}else {
			valido=true;
			Album a = new Album(artista, nombre, anyo, f);
			return a;	
		
		}
		
	
	}
	
	@FXML
	public void crearAlbum(ActionEvent actionEvent) {
		
		Album a = createAlbum();
		almbumes.add(a);
		if(a==null) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle(" ERROR ");
			alert.setContentText(" COMPLETA LOS DATOS");
			alert.showAndWait();
			
		}else {
			for (Album alm : almbumes) {
				System.out.println(alm.toString());
			}
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle(" MENSAJE ");
			alert.setContentText(" ALBUM AÑADIDO SATISFACOTIRAMENTE ");
			alert.showAndWait();
			
		}
		
		
		
	}
	
	
}
