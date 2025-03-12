package Entities;

public class Ex_4 {
    public String nome;
    public double preco;


    public Ex_4(String nome, double preco) {
        this.nome = nome;
        if (preco < 0){
            this.preco += 0.0;
        }else{
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Preço: " + preco;
    }
}
