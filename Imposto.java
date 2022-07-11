package TrabalhoFinal_LP1;

public abstract class Imposto {

	protected Cliente cliente;
	protected String descricao;
	protected double valor;
	protected int codigo;
	protected Data data;
	
	public Imposto(Cliente cliente, double valor, String descricao, Data data) {
		this.cliente = cliente;
		this.valor = valor;
		this.descricao = descricao;
		this.data = data;
	}
	void relatorio() {
		System.out.println("-------------------------");
		System.out.println("         Imposto         ");
		System.out.println("Valor:" +valor);
		System.out.println("Descrição:" +descricao);
		data.ImprimirData();
		
		
	}
}
