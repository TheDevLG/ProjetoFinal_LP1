package TrabalhoFinal_LP1;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

//Controlador Geral
public class AppController implements Initializable{

	private Stage janela;
	private Scene cena;
	private Parent raiz;
	@FXML
	private TableView<Imposto> ImpostoTA;
	@FXML
	private TableColumn<Imposto, String> Imp, NomeImp, ValorImp, DescImp, DiaImp, MesImp, AnoImp ;
	@FXML
	private TextField NomeF, IdadeF, CpfF, LogradouroF, NumeroF, CepF, CnpjJ, ValorI, DescricaoI, TempoI, DiaI, MesI, AnoI;
	
	@FXML
	private TextField NomeAlt, ValorAlt, DescAlt, DiaAlt, MesAlt, AnoAlt;
	@FXML
	private TextField CampoPesquisa;
	@FXML
	private static Cliente Cliente;
	@FXML
	private static int Idade, Numero, Cep;
	@FXML
	private static String Nome, Cpf, Logra;
	
	Repositorio repositorio = new Repositorio();
	
	@FXML
	//método de troca de cena caso a opção "Física" tenha sido escolhida
	public void LoginFisico(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("ClienteFisico.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	//método idem ao anterior porém para a opção "Jurídica"
	public void LoginJuridico(ActionEvent e) throws IOException {
	
		raiz = FXMLLoader.load(getClass().getResource("ClienteJuridico.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	//método para Receber os dados do Cliente Fisico e avançar para a tela Principal do programa
	public void LoginImposto(ActionEvent e) throws IOException {
		
		Nome = NomeF.getText();
		Idade = Integer.parseInt(IdadeF.getText());
		Cpf = CpfF.getText();
		Logra = LogradouroF.getText();
		Numero = Integer.parseInt(NumeroF.getText());
		Cep = Integer.parseInt(CepF.getText());
		
		Endereco endereco = new Endereco(Logra, Numero, Cep);
		Fisica clienteF = new Fisica(Nome, Idade, endereco, Cpf );
		Cliente = clienteF;
		
		Alert confirmacao = new Alert(Alert.AlertType.INFORMATION);
		confirmacao.setTitle("Cadastro de Cliente");
		confirmacao.setHeaderText("Confirmação");
		confirmacao.setContentText("Novo cliente cadastrado!");
		confirmacao.showAndWait();
		
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
		
	}
	//método idem ao anterior porém para o Juridico
	public void LoginImposto1(ActionEvent e) throws IOException {
		
		String Nome = NomeF.getText();
		int Idade = Integer.parseInt(IdadeF.getText());
		String Logra = LogradouroF.getText();
		int Numero = Integer.parseInt(NumeroF.getText());
		int Cep = Integer.parseInt(CepF.getText());
		String Cnpj = CnpjJ.getText();
		
		Endereco endereco = new Endereco(Logra, Numero, Cep);
		Juridica clienteJ = new Juridica(Nome, Idade, endereco, Cnpj);
		Cliente = clienteJ;
		
		Alert confirmacao = new Alert(Alert.AlertType.INFORMATION);
		confirmacao.setTitle("Cadastro de Cliente");
		confirmacao.setHeaderText("Confirmação");
		confirmacao.setContentText("Novo cliente cadastrado!");
		confirmacao.showAndWait();
		
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();	
	}
	
	//método para mudança de tela caso a opção "Inserir seja escolhida"
	public void CenaInserir(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("CenaInserir.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
		
	}
	//método para receber o Imposto e adicioná-lo ao ArrayList
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
		Cliente.relatorio();
		imposto.relatorio();
		
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
	
	//método para voltar ao menu principal sem executar ação alguma dentro das opções
	public void Voltar(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("CenaImposto.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	// método que leva à tela de relatório que está em conjunto com a função alterar
	public void ImpostoRelatorio(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("CenaRel.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	//método que leva para a tela de remoção de Imposto
	public void RemoverCena(ActionEvent e) throws IOException {
		raiz = FXMLLoader.load(getClass().getResource("CenaRemover.fxml"));
		janela = (Stage)((Node)e.getSource()).getScene().getWindow();
		Scene cena = new Scene(raiz);
		janela.setScene(cena);
		janela.show();
	}
	//método para fazer a busca
	public void BuscarImp(ActionEvent e) {
		if(CampoPesquisa.getText().equals("")) {
			CompletaDados(app.repositorio.ImpostoRel());
		}else {
			ArrayList<Imposto> Pesquisa = new ArrayList<>();
				for(Imposto a: app.repositorio.ImpostoRel()) {
					if( a.getCliente().getNome().equals(CampoPesquisa.getText()))
						Pesquisa.add(a);
				}
				CompletaDados(Pesquisa);
		}
	}
	//método para preencher as células da tabela (com defeitos)
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	public void CompletaDados(ArrayList<Imposto> rep) {
		ObservableList<Imposto> data = FXCollections.observableArrayList(rep);
	
		NomeImp.setCellValueFactory(campo -> new SimpleStringProperty(campo.getValue().getCliente().getNome()));
		DescImp.setCellValueFactory(campo -> new SimpleStringProperty(campo.getValue().getDesc()));
		ValorImp.setCellValueFactory(campo -> new SimpleStringProperty(String.valueOf(campo.getValue().getValor())));
		DiaImp.setCellValueFactory(campo -> new SimpleStringProperty(String.valueOf(campo.getValue().getData().getDia())));
		MesImp.setCellValueFactory(campo -> new SimpleStringProperty(campo.getValue().getData().getMes()));
		AnoImp.setCellValueFactory(campo -> new SimpleStringProperty(String.valueOf(campo.getValue().getData().getAno())));
		
		ImpostoTA.setItems(data);
	}
	//método para preencher os text fields com as informações atuais do imposto selecionado para que possam ser alteradas
	public void PreencherCampos(MouseEvent e) { 
		int i = ImpostoTA.getSelectionModel().getSelectedIndex();

		Imposto imposto = (Imposto) ImpostoTA.getItems().get(i);

		NomeAlt.setText(imposto.getCliente().getNome());
		ValorAlt.setText(String.valueOf(imposto.getValor()));
		DescAlt.setText(imposto.getDesc());
		DiaAlt.setText(String.valueOf(imposto.getData().getDia()));
		MesAlt.setText(imposto.getData().getMes());
		AnoAlt.setText(String.valueOf(imposto.getData().getAno()));

	}
	//Altera de fato os valores do imposto selecionado
	public void AlterarImp(ActionEvent event) { 

		String Nome = NomeAlt.getText();
		double valor = Double.parseDouble(ValorAlt.getText());
		String desc = DescAlt.getText();
		int Dia = Integer.parseInt(DiaAlt.getText());
		String Mes = MesAlt.getText();
		int Ano = Integer.parseInt(AnoAlt.getText());
		

		for (int i = 0; i < app.repositorio.ImpostoRel().size(); i++)
			if (Nome.equals(app.repositorio.ImpostoRel().get(i).getCliente().getNome())) {

				app.repositorio.ImpostoRel().get(i).setValor(valor);
				app.repositorio.ImpostoRel().get(i).setDesc(desc);
				app.repositorio.ImpostoRel().get(i).getData().setDia(Dia);
				app.repositorio.ImpostoRel().get(i).getData().setMes(Mes);
				app.repositorio.ImpostoRel().get(i).getData().setAno(Ano);


				break;
			}
	}
	
}
