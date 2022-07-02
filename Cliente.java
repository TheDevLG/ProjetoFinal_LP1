package TrabalhoFinal_LP1;

public abstract class Cliente {
    //Cria��o de vari�veis
    protected  String nome;
    protected  String id;
    protected  int idade;
    protected Endereco end;


//Construtor usado para inicializa��o das vari�veis
    public  Cliente(String novonome,String novoid, int novaidade, Endereco novoend)
    {
      this.nome = novonome;
      this.id = novoid;
      this.idade = novaidade;
      this.end = novoend;
    }
//Metodo relat�rio usado para imprimir os dados do cliente
    public  void relatorio ()
    {
    	System.out.println("-------------------------");
    	System.out.println("Cliente: ");
    	System.out.println("Nome: " +nome);
    	System.out.println("Id: " +id);
    	System.out.println("Idade: " +idade);
        System.out.println("Endere�o: "+end);
       
    }
    @Override
	public String toString() {
		return  this.nome 
				+ " | ID: " + this.id
				+ " | Idade: " + this.idade
				+ " | Endere�o: " + this.end;
	}


}