package TrabalhoFinal_LP1;

public abstract class Imposto {

	protected Cliente cliente;
	protected String descricao;
	protected double valor;
	protected Data data;
	
	public Imposto(Cliente cliente, double valor, String descricao, Data data) {
		this.cliente = cliente;
		this.valor = valor;
		this.descricao = descricao;
		this.data = data;
	}
	 public Cliente getCliente() {
		return cliente;
	}

	 public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	 public String getDesc() {
		return descricao;
	}

	 public void setDesc(String descricao) {
		this.descricao = descricao;
	}
	 public double getValor() {
		return valor;
	}

	 public void setValor(double valor) {
		this.valor = valor;
	}
	 public Data getData() {
		return data;
	}

	 public void setData(Data data) {
		this.data = data;
	}
	
	void relatorio() {
		System.out.println("-------------------------");
		System.out.println("         Imposto         ");
		System.out.println("Valor:" +valor);
		System.out.println("Descrição:" +descricao);
		cliente.relatorio();
		data.ImprimirData();
		
		
	}
}
