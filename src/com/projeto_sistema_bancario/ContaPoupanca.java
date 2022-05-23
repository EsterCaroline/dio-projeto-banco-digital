package com.projeto_sistema_bancario;

public class ContaPoupanca extends Conta{
    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirAtributos();
    }

}
