package com.desafio.dio.bancodigital;

import com.desafio.dio.bancodigital.model.*;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Rafael");


        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

        contaCorrente.depositar(300);
        contaPoupanca.depositar(500);

        System.out.println("======================================");

        contaCorrente.transferir(300, contaPoupanca);

        System.out.println("======================================");
        contaCorrente.ImprimirExtrato();
        contaPoupanca.ImprimirExtrato();
    }
}
