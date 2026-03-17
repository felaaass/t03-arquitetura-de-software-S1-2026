package com.fag.lucasmartins.arquitetura_software.controller;

import com.fag.lucasmartins.arquitetura_software.controller.mapper.ProdutoDTOMapper;
import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.service.ProdutoService;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }


    @PostMapping
    public ResponseEntity<?> cadastrarProduto(@RequestBody ProdutoDTO produtoDTO) {
        try {
            if (produtoDTO.getNome() == null){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro: Nome do produto não pode ser null");
            }

            ProdutoBO produtoBO = ProdutoDTOMapper.toBo(produtoDTO);
            ProdutoBO produtoCalculadoBO = produtoService.salvarProduto(produtoBO);

            ProdutoDTO produtoDTOResponse = ProdutoDTOMapper.toDTO(produtoCalculadoBO);

            return ResponseEntity.status(HttpStatus.CREATED).body(produtoDTOResponse);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao processar requisição: " + e.getMessage());
        }
    }
}