package TrabalhoFinal_LP1;

public class Normal extends Imposto {

	public Normal(Cliente cliente, double valor, String descricao, int codigo) {
		super (cliente, valor, descricao, codigo);
	}
	
	
	public void relatorio() {
		System.out.println("-------------------------");
		System.out.println("Imposto Normal:");
		System.out.println("Cliente:" +cliente);
		System.out.println("Valor:" +valor);
		System.out.println("Descri��o:" +descricao);
		System.out.println("C�digo:" +codigo);
		System.out.println("-------------------------");
		
	}

	
	
	
	
}
