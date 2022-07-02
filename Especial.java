package TrabalhoFinal_LP1;

public class Especial extends Imposto {
	private double tempo;

public Especial(Cliente cliente, double valor, String descricao, int codigo, Data data, double tempo){
	super (cliente, valor, descricao, codigo, data);
	this.tempo = tempo;
}

public void relatorio() {
	super.relatorio();
	System.out.println("Tempo:" +tempo);
	System.out.println("-------------------------");
	
}
}