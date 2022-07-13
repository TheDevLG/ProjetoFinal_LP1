package TrabalhoFinal_LP1;

public class Data{
   
	private int Dia;
	private String Mes;
	private int Ano;
   
	public Data(int Dia, String Mes, int Ano) {
      this.Dia = Dia;
      this.Mes = Mes;
      this.Ano = Ano;
		
   } 
	 public int getDia() {
		return Dia;
	}

	 public void setDia(int Dia) {
		this.Dia = Dia;
	}
	 public String getMes() {
		return Mes;
	}

	 public void setMes(String Mes) {
		this.Mes = Mes;
	}
	 public int getAno() {
		return Ano;
	}

	 public void setAno(int Ano) {
		this.Ano = Ano;
	}
        //saída dos dados do usuário
        public void ImprimirData(){
            System.out.print(Dia);
            System.out.print(" / ");
            System.out.print(Mes);
            System.out.print(" / ");
            System.out.print(Ano + "\n");
           
        }
       
    }
