package aulas.oo.exercicios.orietacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class exerciciosPropostoEmAula {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a data da fatura: ");
        String dataDaFatura = sc.nextLine(); //LENDO DATA DA FATURA
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date dataDaFaturaFormatada = sdf.parse(dataDaFatura); //Convertendendo de String para data
        long dataDaFaturalMl = dataDaFaturaFormatada.getTime();  //Armazenando esse valor em milisegundos.
        dataDaFaturalMl += 864000000; //Adcionando 864.000 a data da fatura em milisegundos (valor referente a 10 dias)
        long dataAtualMl = System.currentTimeMillis(); //Pegando a data atual em milisegundos

        if(dataAtualMl > dataDaFaturalMl){
            System.out.println("Não da mais tempo de pagar");
        }
        else{
            System.out.println("Ainda da tempo de pagar");
        }
         /* Nessa comparação há uma falha! caso a data de pagamento vença no dia em que o usuário está fazendo o teste,
            O programa dira que não da mais tempo de pagar.
            O programa nao faz a verificação de finais de semana! */

    }
}
