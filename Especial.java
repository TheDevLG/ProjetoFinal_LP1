package TrabalhoFinal_LP1;

public class Especial extends Imposto {
	private double tempo;

public Especial(Cliente cliente, double valor, String descricao, int codigo, double tempo){
	super (cliente, valor, descricao, codigo);
	this.tempo = tempo;
}

public void relatorio() {
	System.out.println("-------------------------");
	System.out.println("Imposto Especial:");
	System.out.println("Cliente:" +cliente);
	System.out.println("Valor:" +valor);
	System.out.println("Descri��o:" +descricao);
	System.out.println("C�digo:" +codigo);
	System.out.println("Tempo:" +tempo);
	System.out.println("-------------------------");
	
}
}