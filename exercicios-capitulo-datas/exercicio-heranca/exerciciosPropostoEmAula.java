package aulas.oo.exercicios.orietacao;
import java.util.Scanner;
public class exerciciosPropostoEmAula {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciar apenas com construtor completo (S/N):");
        char escolha = sc.nextLine().charAt(0);
        if (escolha == 'S' || escolha == 's') {
            System.out.println("Iniciando construtor completo....");
            System.out.println("Informe o modelo do veículo: ");
            String auxModelo = sc.nextLine();
            System.out.println("Informe o nome do veículo: ");
            String auxMarca = sc.nextLine();
            System.out.println("Informe o ano do veículo: ");
            int auxAno = sc.nextInt();
            sc.nextLine();
            System.out.println("Informe a variante veículo: ");
            String auxVariante = sc.nextLine();
            Carro carro = new Carro(auxModelo, auxMarca, auxAno, auxVariante);
            System.out.println(carro);
            sc.close();
        }
        else{
            System.out.println("Iniciando construtor com apenas uma argumento....");
            System.out.println("Valor da variante: ");
            String auxVariante = sc.nextLine();
            Carro carro = new Carro(auxVariante);
            System.out.println(carro);
        }


            Carro carro new Carro()
            Carro carro new Carro(auxModelo, auxMarca, auxAno)      TENTATIVAS DE INSTANCIAÇÃO DE UM
            Carro carro new Carro(auxMarca)                     OBJ COM UM CONSTRUTOR NÃO CORRESPONDENTE...
            Carro carro new Carro(auxAno)
            Carro carro new Carro(auxVariante) */

        Atendente atendente = new Atendente("Vitor", 1000.00);
        Gerente gerente = new Gerente("Microbo", 1000.00);
        Supervisor supervisor = new Supervisor("Dudu", 1000.00);

        System.out.println("O imposto que o atendente devera parar é: " + atendente.imposto());
        System.out.println("O imposto que o gerente devera parar é: " + gerente.imposto());
        System.out.println("O imposto que o supervisor devera parar é: " + supervisor.imposto());
    }

}
