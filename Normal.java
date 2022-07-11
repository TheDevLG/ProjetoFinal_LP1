package TrabalhoFinal_LP1;

public class Normal extends Imposto {

	public Normal(Cliente cliente, double valor, String descricao, Data data) {
		super (cliente, valor, descricao, data);
	}
	
	public void relatorio() {
		super.relatorio();
		System.out.println("-------------------------");
		
	}

	
	
	
	
}
