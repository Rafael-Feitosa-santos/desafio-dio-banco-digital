package com.desafio.dio.bancodigital.model;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getConta() {
        return conta;
    }

    public void setConta(List<Conta> conta) {
        this.conta = conta;
    }

}
