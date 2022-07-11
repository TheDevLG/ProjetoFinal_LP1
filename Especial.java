package TrabalhoFinal_LP1;

public class Especial extends Imposto {
	private String tempo;

public Especial(Cliente cliente, double valor, String descricao, Data data, String tempo){
	super (cliente, valor, descricao, data);
	this.tempo = tempo;
}

public void relatorio() {
	super.relatorio();
	System.out.println("Tempo:" +tempo);
	System.out.println("-------------------------");
	
}
}