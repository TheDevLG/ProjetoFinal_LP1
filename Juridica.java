package TrabalhoFinal_LP1;

public class Juridica extends  Cliente{
    //Cria��o da vari�vel cnpj para cliente juridico
    private String cnpj;
    //extens�o da classe pai para receber os metodos criados l�
    public Juridica(String novonome, String novoid, int novaidade, Endereco novoend, String cnpj) {
        super(novonome, novoid, novaidade, novoend);
        this.cnpj = cnpj;
    }
    //Override para puxar o metodo relat�rio da classe pai
    @Override
    public void relatorio() {
        super.relatorio();
        //Um simples print para conseguir imprimir o cnpj do cliente
        System.out.println("seu cnpj: "+cnpj);
        System.out.println("-------------------------");
    }
    @Override
  		public String toString() {
  			return  this.nome 
  					+ " | ID: " + this.id
  					+ " | Idade: " + this.idade
  					+ " | Cnpj: " +this.cnpj;
  		}
}