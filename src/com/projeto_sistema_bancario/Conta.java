package com.projeto_sistema_bancario;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL =1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double divida;
    protected double juros;


    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    @Override
    public void pegarEmprestado(double valor,double taxa,double prazo){
     juros = (valor * taxa )* prazo;
     divida -= juros + valor;
     saldo += valor;

    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getDivida(){
        return divida;
    }

    protected void imprimirAtributos() {
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
        System.out.println(String.format("Saldo dividas: %.2f",this.divida));
    }


}
