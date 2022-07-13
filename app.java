package TrabalhoFinal_LP1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class app extends Application {
	
	public static Repositorio repositorio;
	@Override
	public void start(Stage janela) {
		try {
			Parent raiz = FXMLLoader.load(getClass().getResource("MenuInicial.fxml"));
			Scene cena = new Scene(raiz, Color.LIGHTBLUE);
			janela.setScene(cena);
			janela.setResizable(false);
			Image Icone = new Image("icon.png");
			janela.getIcons().add(Icone);
			janela.setTitle("Seu Imposto");
			janela.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		repositorio = new Repositorio();
		
		launch(args);
	}
}