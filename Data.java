package TrabalhoFinal_LP1;

import java.util.Scanner;

public class Data{
   
	private int Dia;
	private String Mes;
	private int Ano;
   
	public Data(int Dia, String Mes, int Ano) {
      this.Dia = Dia;
      this.Mes = Mes;
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
