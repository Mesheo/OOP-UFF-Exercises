package ex02;

public class ContaCorrente{
    private float limite;
    private float saldo;
    private float valorLimte;

    public ContaCorrente(float limite, float saldo) {
        this.limite = limite;
        this.saldo = saldo;
        this.valorLimte = limite;
    }

    public void sacar(float valor){
        if (valor < 0  || valor > this.saldo) {
            throw new IllegalArgumentException("valor invalido");
        }
        this.saldo -= valor;
    }

    public void depositar(float valor){
        if (valor <0 ){
            throw new IllegalArgumentException("valor invalido");
        }
        this.saldo += valor;
    }

    public void setValorLimite(float valor){
        if (valor <0 ){
            throw new IllegalArgumentException("valor invalido");
        }
        this.valorLimte = valor;
        this.limite -= valor;
    }
}
