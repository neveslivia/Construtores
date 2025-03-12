package Entities;

public class Ex_3 {
    public String titular;
    public double saldo;
    public String tipoConta;

    public Ex_3(String titular, double saldo, String tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public Ex_3(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.tipoConta = "Corrente";
    }

    @Override
    public String toString() {
        return "Titular : " + titular + "\n" +
                "Saldo: " + saldo + "\n"+
                "Tipo de Conta: " + tipoConta;
    }
}
