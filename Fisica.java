package TrabalhoFinal_LP1;

public class Fisica extends Cliente {

	private String cpf;
	
	public Fisica(String novonome,String novoid, int novaidade, String cpf) {
		super (novonome, novoid, novaidade);
		this.cpf = cpf;
	}
	 public  void relatorio ()
	    {
	    	System.out.println("-------------------------");
	    	System.out.println("Cliente:");
	    	System.out.println("Nome:" +nome);
	    	System.out.println("Id:" +id);
	    	System.out.println("Idade:" +idade);
	    	System.out.println("Cpf:" +cpf);
	    	System.out.println("-------------------------");
	       
	    }
	    @Override
		public String toString() {
			return  this.nome 
					+ " | ID: " + this.id
					+ " | Idade: " + this.idade
					+ " | Cpf: " +this.cpf;
		}
	
	
	
}
