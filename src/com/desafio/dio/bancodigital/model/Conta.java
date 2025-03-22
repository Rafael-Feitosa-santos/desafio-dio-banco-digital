package com.desafio.dio.bancodigital.model;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int conta;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    protected void ImprimirInfoComum() {
        System.out.printf("Titular: %s%n", cliente.getNome());
        System.out.printf("Agencia: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getConta());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

    private String getNomeConta() {
        String nomeClasse = getClass().getSimpleName();
        switch (nomeClasse) {
            case "ContaCorrente":
                return "Conta Corrente";
            case "ContaPoupanca":
                return "Conta Poupança";
            default:
                return nomeClasse;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso na %s.%n", valor, getNomeConta());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso na %s.%n", valor, getNomeConta());
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.printf("Transferência de R$%.2f realizada com sucesso para a conta %d%n", valor, contaDestino.getConta());
        } else {
            System.out.println("Transferência não realizada.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
