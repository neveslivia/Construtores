package Entities;

public class Ex_2 {
    public String nome;
    public int idade;

    public Ex_2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Ex_2() {
        this.idade = 0;
        this.nome = "Desconhecido";
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Idade:" + idade ;
    }
}
