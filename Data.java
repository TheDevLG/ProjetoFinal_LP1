package TrabalhoFinal_LP1;

import java.util.Scanner;

public class Data {
   
	private int Dia;
	private String Mes;
	private int Ano;
   
	public Data(int Dia, String Mes, int Ano) {
      this.Dia = Dia;
      this.Mes = Mes;
      this.Ano = Ano;
		
   } 
   /*
     Scanner entrada = new Scanner(System.in);     
     //M�todo para o usu�rio dar o input nos dados
        public void ReadData(){
            do{
                System.out.println("digite o dia");
                Dia = entrada.nextInt();

                System.out.println("digite o M�s por extenso ");
                Mes = entrada.next();

                System.out.println("digite o ano");
                Ano = entrada.nextInt();
                if(!(0<Dia<<32)  || Ano >2023||Ano<1000|| Mes.isEmpty()){
                    System.out.println("ERRO!! Cheque as informa��es novamente");
                }
            }while(!(0<Dia<<32)  || Ano >2023|| Ano<1000 || Mes.isEmpty());

        }
        */
        //sa�da dos dados do usu�rio
        public void ImprimirData(){
            System.out.print(Dia);
            System.out.print(" / ");
            System.out.print(Mes);
            System.out.print(" / ");
            System.out.print(Ano + "\n");
           
        }
        @Override
    	public String toString() {
    		return  this.Dia 
    				+ "/" + this.Mes
    				+ "/" + this.Ano;
    				
    	}
    }
