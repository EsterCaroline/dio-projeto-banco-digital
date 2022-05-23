package com.projeto_sistema_bancario;

public interface IConta {

    void sacar(double valor) ;
    void depositar(double valor) ;
    void transferir(double valor ,Conta contaDestino);
    void pegarEmprestado(double valor , double juros,double prazo);
    void imprimirExtrato();

}
