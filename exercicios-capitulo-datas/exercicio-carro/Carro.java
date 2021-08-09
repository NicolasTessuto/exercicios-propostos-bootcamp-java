package aulas.oo.exercicios.orietacao;

public class Carro {

    private String nome = "Celta";

    private int qtePessoas = 4;

    public void addPessoas(int qte){

        qtePessoas += qte;
        System.out.printf("Dados atualizados, tem " + qtePessoas + " pessoas no carro!");

    }
    public void removePessoas(int qte){

        qtePessoas -= qte;
        System.out.printf("Dados atualizados, tem " + qtePessoas + " pessoas no carro!");

    }




}
