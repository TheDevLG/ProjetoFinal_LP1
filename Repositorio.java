package TrabalhoFinal_LP1;

public class Repositorio {	
	 // é o repositório deste problema
	    private int indice;
	    private Imposto [] BD;

	    public Repositorio(){ 
	        BD = new Imposto[20]; 
	        indice = 0;
	    }

	    public void inserir(Imposto c){ 
	        BD[indice] = c;
	        indice++;
	    }

	    public void remover(Imposto c){ 
	        for(int i = 0; i < indice; i++){ 
	            if(BD[i] == c){ 
	                BD[i] = BD[indice-1]; 
	                BD[indice-1] = null; 
	                indice--; 
	            }
	        }
	    }

	    public void procurar(Imposto c){ 
	        for(int i = 0; i < indice; i++){ 
	            if(BD[i] == c){ 
	                c.relatorio(); 
	            }
	        }
	    }

	   public void relatorio() {
		  for(int i = 0; i < indice; i++) {
			  BD[i].relatorio();
		  }
	   }

	  
}
