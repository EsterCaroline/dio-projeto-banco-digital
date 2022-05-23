package com.projeto_sistema_bancario;

public class Main {

    public static void main(String[] args) {

            Conta cc = new ContaCorrente();
            Conta poupanca = new ContaPoupanca();

            cc.depositar(100);
            cc.transferir(100,poupanca);
            cc.pegarEmprestado(5200,0.10,4);
            cc.imprimirExtrato();

            poupanca.imprimirExtrato();
    }

}
