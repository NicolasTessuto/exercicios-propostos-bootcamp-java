package aulas.oo.exercicios.orietacao;

public class Gerente extends Funcionario {

    public double imposto(){
        return salario * 0.1;
    }

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

}
