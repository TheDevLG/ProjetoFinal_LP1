package TrabalhoFinal_LP1;

public class Normal extends Imposto {

	public Normal(Cliente cliente, double valor, String descricao, int codigo, Data data) {
		super (cliente, valor, descricao, codigo, data);
	}
	
	
	public void relatorio() {
		super.relatorio();
		System.out.println("-------------------------");
		
	}

	
	
	
	
}
