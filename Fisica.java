package TrabalhoFinal_LP1;

public class Fisica extends Cliente {

	private String cpf;
	
	public Fisica(String novonome, int novaidade, Endereco novoend, String cpf) {
		super (novonome, novaidade, novoend);
		this.cpf = cpf;
	}
	 public String getCpf() {
		return cpf;
	}

	 public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	 public  void relatorio ()
	    {
	    	super.relatorio();
	    	System.out.println("Cpf:" +cpf);
	    	 end.imprimirEnd();
	    	System.out.println("-------------------------");
	       
	    }
	
}
