package com.fag.lucasmartins.arquitetura_software.model.bo;

public class ProdutoBO {
    private String nome;
    private Integer estoque;
    private double preco;


    private double precoFinal;

    public ProdutoBO(String nome, Integer estoque, double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        precoFinal = 0;
    }

    public ProdutoBO(String nome, Integer estoque, double preco, double precoFinal) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.precoFinal = precoFinal;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }


    public void verificarPrecoEPremium(){
        if (nome.toLowerCase().contains("premium") && preco < 100.0) {
            throw new RuntimeException("Erro: Produtos Premium não podem custar menos de R$ 100,00.");
        }
    }

    public void calcularPrecoFinal(){
        if (estoque != null && estoque >= 50) {
            precoFinal = preco - (preco * 0.10); // 10%
        }
    }


}
