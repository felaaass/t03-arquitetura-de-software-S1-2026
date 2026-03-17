package com.fag.lucasmartins.arquitetura_software.controller.mapper;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;

public class ProdutoDTOMapper {

    private ProdutoDTOMapper(){

    }

    public static ProdutoBO toBo(ProdutoDTO produtoDTO){
        return new ProdutoBO(produtoDTO.getNome(), produtoDTO.getEstoque(), produtoDTO.getPreco());
    }

    public static ProdutoDTO toDTO(ProdutoBO produtoBO){
        return new ProdutoDTO(produtoBO.getNome(), produtoBO.getEstoque(), produtoBO.getPreco());
    }
}
