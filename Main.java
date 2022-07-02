package TrabalhoFinal_LP1;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main{
	public static void main(String[] args) throws Exception {
		Repositorio BD = new Repositorio();
		Endereco e1 = new Endereco("Tiradentes", 450, 45000450);
		Fisica c1 = new Fisica("lucas", "ewqf", 55, e1, "213124443");
		Normal a1 = new Normal(c1, 250.00, "ipva", 2343);
		BD.inserir(a1);
		BD.relatorio();
		c1.relatorio();
	}
}
