package aulas.oo.exercicios.orietacao;
import java.text.ParseException;
import java.time.LocalDateTime;

public class exerciciosPropostoEmAula {


    public static void main(String[] args) throws ParseException {

        LocalDateTime data = LocalDateTime.of(2010,05,15,10,00,00);

        data = data.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(data);
    }
}
