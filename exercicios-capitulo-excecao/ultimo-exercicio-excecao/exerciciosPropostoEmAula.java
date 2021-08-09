package aulas.oo.exercicios.orietacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class exerciciosPropostoEmAula {

    public static void main(String[] args) {
        try {
            String DataUser = "2010-05-15";
            Date dataConvertida = ConverteStringParaData(DataUser);
            System.out.println(dataConvertida);
        }
        catch (ParseException e){
            System.out.println("Entrada não permitida, codigo de erro:" + e);
        }
    }

    public static Date ConverteStringParaData(String data) throws ParseException{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date dataConvertida = sdf.parse(data);
            return dataConvertida;
    }
}
