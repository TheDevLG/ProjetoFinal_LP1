package TrabalhoFinal_LP1;

public class Repositorio {	
	 // � o reposit�rio deste problema
	    private int indice;
	    private Imposto [] BD;

	    public Repositorio(){ //construtor
	        BD = new Imposto[20]; //40 � o numero maximo de posi��es do array
	        indice = 0;
	    }

	    public void inserir(Imposto c){ //metodo de inser��o de cartas
	        BD[indice] = c;
	        indice++;
	    }

	    public void remover(Imposto c){ //metodo de remo��o de cartas, verificando se a carta coresponde
	        for(int i = 0; i < indice; i++){ //loop que percorre o deck de cartas
	            if(BD[i] == c){ // verifica se o deck da posi��o � igual a carta procurada
	                BD[i] = BD[indice-1]; //atribui o valor do deck a posi��o especificada
	                BD[indice-1] = null; //atribui o valor null a posi��o especificada
	                indice--; //decrementa a posi��o
	            }
	        }
	    }

	    public void procurar(Imposto c){ //metodo 1 de procura de cartas
	        for(int i = 0; i < indice; i++){ //loop que percorre o deck de cartas
	            if(BD[i] == c){ // verifica se o deck da posi��o � igual a carta procurada
	                c.relatorio(); //se sim, imprime a carta em quest�o
	            }
	        }
	    }

	   public void relatorio() {
		  for(int i = 0; i < indice; i++) {
			  BD[i].relatorio();
		  }
	   }

	  
}
