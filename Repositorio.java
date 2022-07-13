package TrabalhoFinal_LP1;
import java.util.ArrayList;

public class Repositorio {

	ArrayList<Imposto> ImpostoBD;
	
	
	public Repositorio() {
		ImpostoBD = new ArrayList<Imposto>();
		
	}
	
	public void adicionar(Imposto imposto) {
		if (imposto != null)
			ImpostoBD.add(imposto);
	}

	public ArrayList<Imposto> ImpostoRel() {
		return ImpostoBD;
	}

}
