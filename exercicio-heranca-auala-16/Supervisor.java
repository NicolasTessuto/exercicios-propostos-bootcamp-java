package aulas.oo.exercicios.orietacao;

public class Supervisor extends Funcionario{

    public double imposto(){
        return salario * 0.05;
    }

    public Supervisor(String nome, Double salario) {
        super(nome, salario);
    }


}
