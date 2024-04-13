package encapsulamento;

public class ContaCorrente {
    private int numero;
    private double saldo;

    private ContaCorrente(){}

    public ContaCorrente(int numeroConta){
        this.numero = numeroConta;
        this.saldo  = 0;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}