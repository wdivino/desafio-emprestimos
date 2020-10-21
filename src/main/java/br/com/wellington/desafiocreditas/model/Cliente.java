package br.com.wellington.desafiocreditas.model;

import java.math.BigDecimal;

public class Cliente {

    private String nome;
    private String cpf;
    private String localizacao;
    private int idade;
    private BigDecimal renda;

    public boolean comRendaMaiorQue(int rendaLimite) {
        return this.renda.compareTo(new BigDecimal(rendaLimite)) > 0;
    }

    public boolean comRendaMenorOuIgual(int rendaLimite) {
        return this.renda.compareTo(new BigDecimal(rendaLimite)) <= 0;
    }

    public boolean comIdadeMaiorQue(int idadeLimite) {
        return this.idade > idadeLimite;
    }

    public boolean comIdadeMenorQue(int idadeLimite) {
        return this.idade < idadeLimite;
    }

    public boolean resideEm(String localizacao) {
        return this.localizacao.toUpperCase().equalsIgnoreCase(localizacao.toUpperCase());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }
}
