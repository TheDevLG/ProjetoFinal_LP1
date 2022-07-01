package TrabalhoFinal_LP1;

public abstract class Imposto {

	protected Cliente cliente;
	protected String descricao;
	protected double valor;
	protected int codigo;
	
	public Imposto(Cliente cliente, double valor, String descricao, int codigo) {
		this.cliente = cliente;
		this.valor = valor;
		this.descricao = descricao;
		this.codigo = codigo;
		
	}
	public void relatorio() {
		System.out.println("-------------------------");
		System.out.println("Imposto Normal:");
		System.out.println("Valor:" +valor);
		System.out.println("Descrição:" +descricao);
		System.out.println("Código:" +codigo);
		System.out.println("-------------------------");
		
	}
}
