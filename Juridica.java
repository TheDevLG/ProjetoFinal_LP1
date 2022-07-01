package TrabalhoFinal_LP1;

public class Juridica extends  Cliente{
    //Criação da variável cnpj para cliente juridico
    private String cnpj;
    //extesão da classe pai para receber os metodos criados lá
    public Juridica(String novonome, String novoid, int novaidade,String cnpj) {
        super(novonome, novoid, novaidade);
        this.cnpj = cnpj;
    }
    //Override para puxar o metodo relatório da classe pai
    @Override
    public void relatorio() {
        super.relatorio();
        //Um simples print para conseguir imprimir o cnpj do cliente
        System.out.println("seu cnpj: "+cnpj);
        System.out.println("-------------------------");
    }
}
