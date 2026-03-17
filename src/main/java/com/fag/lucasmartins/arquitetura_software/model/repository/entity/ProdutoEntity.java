package com.fag.lucasmartins.arquitetura_software.model.repository.entity;


import javax.persistence.*;

@Entity
@Table(name = "produto")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer estoque;
    private double preco;
    private double preco_final;

    public ProdutoEntity(){}

    public ProdutoEntity(String nome, Integer estoque, double preco, double preco_final) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.preco_final = preco_final;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getPreco_final() {
        return preco_final;
    }

    public void setPreco_final(double preco_final) {
        this.preco_final = preco_final;
    }
}
