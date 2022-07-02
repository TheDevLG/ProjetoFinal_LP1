public class Endereco {
    private string logradouro;
    private int numero;
    private int cep;

    public Endereco(string logradouro, int numero, int cep) {
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
}