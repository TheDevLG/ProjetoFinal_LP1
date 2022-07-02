package TrabalhoFinal_LP1;

public class Data {
    import java.util.Scanner;

    class Data{
        Scanner entrada = new Scanner(System.in);

        int Dia;
        String Mes;
        int Ano;
        //Método para o usuário dar o input nos dados
        public void ReadData(){
            do{
                System.out.println("digite o dia");
                Dia = entrada.nextInt();

                System.out.println("digite o Mês por extenso ");
                Mes = entrada.next();

                System.out.println("digite o ano");
                Ano = entrada.nextInt();
                if(!(0<Dia<<32)  || Ano >2023||Ano<1000|| Mes.isEmpty()){
                    System.out.println("ERRO!! Cheque as informações novamente");
                }
            }while(!(0<Dia<<32)  || Ano >2023|| Ano<1000 || Mes.isEmpty());

        }

        //saída dos dados do usuário
        public void PrintData(){
            System.out.print(Dia);
            System.out.print(" / ");
            System.out.print(Mes);
            System.out.print(" / ");
            System.out.print(Ano);


        }
    }
}
