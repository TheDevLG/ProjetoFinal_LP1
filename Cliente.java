package TrabalhoFinal_LP1;

public abstract class Cliente {
    //Criação de variáveis
    protected  String nome;
    protected  int idade;
    protected Endereco end;


//Construtor usado para inicialização das variáveis
    public  Cliente(String novonome, int novaidade, Endereco novoend)
    {
      this.nome = novonome;
      this.idade = novaidade;
      this.end = novoend;
    }
//Metodo relatório usado para imprimir os dados do cliente
    public  void relatorio ()
    {
    	System.out.println("-------------------------");
    	System.out.println("         Cliente         ");
    	System.out.println("Nome: " +nome);
    	System.out.println("Idade: " +idade);
       
       
    }

}