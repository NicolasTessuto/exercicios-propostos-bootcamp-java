package aulas.oo.exercicios.orietacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class exerciciosPropostoEmAula {

    public static void main(String[] args) throws ParseException {

        Date now = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");

        String dataFormatada = formatter.format(now);

        System.out.println(dataFormatada);

    }
}
