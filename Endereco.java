package TrabalhoFinal_LP1;

public class Endereco {
    private String logradouro;
    private int numero;
    private int cep;

    public Endereco(String logradouro, int numero, int cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

  public void imprimirEnd(){
      System.out.println("-------------------------");
      System.out.println("Logradouro: "+logradouro);
      System.out.println("Numero: " +numero);
      System.out.println("Cep: " +cep);

  }
  @Override
	public String toString() {
		return  this.logradouro 
				+ " | Numero: " + this.numero
				+ " | CEP: " + this.cep;
				
	}
}