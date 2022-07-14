package TrabalhoFinal_LP1;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AppController {

	private Stage janela;
	private Scene cena;
	private Parent raiz;
	@FXML
	private TextField NomeF, IdadeF, CpfF, LogradouroF, NumeroF, CepF, CnpjJ, ValorI, DescricaoI, TempoI, DiaI, MesI, AnoI;
	private Fisica ClienteF;
	private Juridica ClienteJ;
	private Normal Imposto;
	private Especial ImpostoE;
	
	public void LoginFisico(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("ClienteFisico.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	public void LoginJuridico(ActionEvent e) throws IOException {
	
		raiz = FXMLLoader.load(getClass().getResource("ClienteJuridico.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	public void LoginImposto(ActionEvent e) throws IOException {
		
		String Nome = NomeF.getText();
		int Idade = Integer.parseInt(IdadeF.getText());
		String Cpf = CpfF.getText();
		String Logra = LogradouroF.getText();
		int Numero = Integer.parseInt(NumeroF.getText());
		int Cep = Integer.parseInt(CepF.getText());
		
		Endereco endereco = new Endereco(Logra, Numero, Cep);
		Fisica clienteF = new Fisica(Nome, Idade, endereco, Cpf );
		this.ClienteF = clienteF;
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	
	}
	public void LoginImposto1(ActionEvent e) throws IOException {
		
		String Nome = NomeF.getText();
		int Idade = Integer.parseInt(IdadeF.getText());
		String Logra = LogradouroF.getText();
		int Numero = Integer.parseInt(NumeroF.getText());
		int Cep = Integer.parseInt(CepF.getText());
		String Cnpj = CnpjJ.getText();
		
		Endereco endereco = new Endereco(Logra, Numero, Cep);
		Juridica clienteJ = new Juridica(Nome, Idade, endereco, Cnpj);
		this.ClienteJ = clienteJ;
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
		ClienteJ.relatorio();
	}
	public void CenaInserir(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("CenaInserir.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	public void LoginImposto2(ActionEvent e) throws IOException {
		
		double Valor = Integer.parseInt(ValorI.getText());
		String Descricao = DescricaoI.getText();
		String Tempo = TempoI.getText();
		int Dia = Integer.parseInt(DiaI.getText());
		String Mes = MesI.getText();
		int Ano = Integer.parseInt(AnoI.getText());
		
		
		
		Data Data = new Data(Dia, Mes, Ano);
		Normal imposto = new Normal(ClienteF, Valor, Descricao, Data);
		Especial impostoE = new Especial(ClienteF, Valor, Descricao, Data, Tempo);
		Normal imposto1 = new Normal(ClienteJ, Valor, Descricao, Data);
		Especial impostoE1 = new Especial(ClienteJ, Valor, Descricao, Data, Tempo);
		
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
		
		this.Imposto = imposto;
		this.Imposto = imposto1;
		this.ImpostoE = impostoE;
		this.ImpostoE = impostoE1;
		
		imposto.relatorio();
		imposto1.relatorio();
		impostoE.relatorio();
		impostoE1.relatorio();
	}	
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
