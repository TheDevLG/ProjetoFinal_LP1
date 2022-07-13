package TrabalhoFinal_LP1;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AppController {

	private Stage janela;
	private Scene cena;
	private Parent raiz;
	@FXML
	private TextField NomeF, IdadeF, CpfF, LogradouroF, NumeroF, CepF, CnpjJ, ValorI, DescricaoI, TempoI, DiaI, MesI, AnoI;
	private Cliente Cliente;
	
	
	Repositorio repositorio = new Repositorio();
	@FXML
	public void LoginFisico(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("ClienteFisico.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	@FXML
	public void LoginJuridico(ActionEvent e) throws IOException {
	
		raiz = FXMLLoader.load(getClass().getResource("ClienteJuridico.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	@FXML
	public void LoginImposto(ActionEvent e) throws IOException {
		
		String Nome = NomeF.getText();
		int Idade = Integer.parseInt(IdadeF.getText());
		String Cpf = CpfF.getText();
		String Logra = LogradouroF.getText();
		int Numero = Integer.parseInt(NumeroF.getText());
		int Cep = Integer.parseInt(CepF.getText());
		
		Endereco endereco = new Endereco(Logra, Numero, Cep);
		Fisica clienteF = new Fisica(Nome, Idade, endereco, Cpf );
		this.Cliente = clienteF;
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
		Cliente.relatorio();
	}
	@FXML
	public void LoginImposto1(ActionEvent e) throws IOException {
		
		String Nome = NomeF.getText();
		int Idade = Integer.parseInt(IdadeF.getText());
		String Logra = LogradouroF.getText();
		int Numero = Integer.parseInt(NumeroF.getText());
		int Cep = Integer.parseInt(CepF.getText());
		String Cnpj = CnpjJ.getText();
		
		Endereco endereco = new Endereco(Logra, Numero, Cep);
		Juridica clienteJ = new Juridica(Nome, Idade, endereco, Cnpj);
		this.Cliente = clienteJ;
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
		Cliente.relatorio();
	}
	@FXML
	public void CenaInserir(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("CenaInserir.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	@FXML
	public void InserirImposto(ActionEvent e) throws IOException {
		
		double Valor = Integer.parseInt(ValorI.getText());
		String Descricao = DescricaoI.getText();
		String Tempo = TempoI.getText();
		int Dia = Integer.parseInt(DiaI.getText());
		String Mes = MesI.getText();
		int Ano = Integer.parseInt(AnoI.getText());
		
		Data Data = new Data(Dia, Mes, Ano);
		Normal imposto = new Normal(Cliente, Valor, Descricao, Data);
		Especial impostoE = new Especial(Cliente, Valor, Descricao, Data, Tempo);
		
		app.repositorio.adicionar(imposto);
		
		Alert confirmacao = new Alert(Alert.AlertType.INFORMATION);
		confirmacao.setTitle("Inserido com sucesso");
		confirmacao.setHeaderText("Confirmação!");
		confirmacao.setContentText("Novo imposto inserido!");
		confirmacao.showAndWait();
		
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	@FXML
	public void Voltar(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
/*	public void inserir(ActionEvent e) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CenaImposto.fxml"));
		raiz = loader.load();
		Repositorio repositorio = loader.getController();
		repositorio.inserir(Imposto);
		repositorio.inserir(ImpostoE);
		repositorio.relatorio();
		
	}*/
}
