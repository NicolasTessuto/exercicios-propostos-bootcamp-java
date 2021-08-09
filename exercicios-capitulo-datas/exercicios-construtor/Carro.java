package aulas.oo.exercicios.orietacao;

public class Carro {

        public String marca;
        public String modelo;
        public Integer ano;
        public String variante;

        public Carro(String modelo, String marca, Integer ano, String variante){
                this.modelo = modelo;
                this.marca = marca;
                this.ano = ano;
                this.variante = variante;
        }

        public Carro(String variante){ this.variante = variante; }

        @Override
        public String toString() {
                return "Carro{" +
                        "marca='" + marca +
                        ", modelo='" + modelo +
                        ", ano=" + ano +
                        ", variante='" + variante +
                        '}';
        }
}
