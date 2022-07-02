package TrabalhoFinal_LP1;

public class Fisica extends Cliente {
	//Criação da variável para cliente fisico
	private String cpf;
	//extesão da classe pai para receber os metodos criados lá
	public Fisica(String novonome,String novoid, int novaidade, String cpf) {
		super (novonome, novoid, novaidade);
		this.cpf = cpf;
	}
    //Override para puxar o metodo relatório da classe pai
	@Override
	public void relatorio() {
		super.relatorio();
		//Um simples print para poder imprimir o cpf do cliente
		System.out.println("seu cpf: "+cpf);
		System.out.println("-------------------------");
	}
}
