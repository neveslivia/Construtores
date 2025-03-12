package Entities;

public class Ex_1 {
    public String marca;
    public int ano;

    public Ex_1() {
        this.marca = "Fiat";
        this.ano = 2011;
    }


    @Override
    public String toString() {
        return "Marca " + marca + "\n" +
                "Ano " + ano;
    }
}
