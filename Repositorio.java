package TrabalhoFinal_LP1;

public class Repositorio {	
	 // é o repositório deste problema
	    private int indice;
	    private Imposto [] BD;

	    public Repositorio(){ //construtor
	        BD = new Imposto[20]; //40 é o numero maximo de posições do array
	        indice = 0;
	    }

	    public void inserir(Imposto c){ //metodo de inserção de cartas
	        BD[indice] = c;
	        indice++;
	    }

	    public void remover(Imposto c){ //metodo de remoção de cartas, verificando se a carta coresponde
	        for(int i = 0; i < indice; i++){ //loop que percorre o deck de cartas
	            if(BD[i] == c){ // verifica se o deck da posição é igual a carta procurada
	                BD[i] = BD[indice-1]; //atribui o valor do deck a posição especificada
	                BD[indice-1] = null; //atribui o valor null a posição especificada
	                indice--; //decrementa a posição
	            }
	        }
	    }

	    public void procurar(Imposto c){ //metodo 1 de procura de cartas
	        for(int i = 0; i < indice; i++){ //loop que percorre o deck de cartas
	            if(BD[i] == c){ // verifica se o deck da posição é igual a carta procurada
	                c.relatorio(); //se sim, imprime a carta em questão
	            }
	        }
	    }

	   public void relatorio() {
		  for(int i = 0; i < indice; i++) {
			  BD[i].relatorio();
		  }
	   }

	  
}
