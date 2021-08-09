package aulas.oo.exercicios.orietacao;
import java.text.ParseException;
import java.time.LocalDateTime;

public class exerciciosPropostoEmAula {


    public static void main(String[] args) throws ParseException {

        try{
            int n = 10;
            n = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage() + " Ihhhhh tem parada errada ai mermão!!!"); // Teste de exceção
        }
    }
}
