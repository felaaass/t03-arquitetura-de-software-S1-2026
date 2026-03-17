package com.fag.lucasmartins.arquitetura_software.model.repository.mapper;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.entity.ProdutoEntity;

public class ProdutoEntityMapper {

    public static ProdutoEntity toEntity(ProdutoBO produtoBO)  {
        return new ProdutoEntity(produtoBO.getNome(), produtoBO.getEstoque(), produtoBO.getPreco(), produtoBO.getPrecoFinal());
    }

    public static ProdutoBO toBo(ProdutoEntity produtoEntity){
        return new ProdutoBO(produtoEntity.getNome(), produtoEntity.getEstoque(), produtoEntity.getPreco(), produtoEntity.getPreco_final());
    }
}
