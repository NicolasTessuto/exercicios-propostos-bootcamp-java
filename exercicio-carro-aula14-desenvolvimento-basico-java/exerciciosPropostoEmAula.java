package aulas.oo.exercicios.orietacao;
import java.util.Scanner;
public class exerciciosPropostoEmAula {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("DESEJA ADD(D) ou RR(R) pessoas ao carro?:");
        char x = scanner.next().charAt(0);

        if (x == 'D' || x == 'd') {
            System.out.println("Quantas pessoas deseja add ao carro?");
            int qte = scanner.nextInt();
            scanner.close();
            carro.addPessoas(qte);
        }
        else{
            System.out.println("Quantas pessoas deseja remover do carro?");
            int qte = scanner.nextInt();
            scanner.close();
            carro.removePessoas(qte);
        }
    }
}
