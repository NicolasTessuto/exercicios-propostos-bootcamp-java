package aulas.oo.exercicios.orietacao;

public class Atendente extends Funcionario {


    public double imposto(){
        return salario * 0.01;
    }

    public Atendente(String nome, Double salario) {
        super(nome, salario);
    }
}
