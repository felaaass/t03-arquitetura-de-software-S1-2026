package com.fag.lucasmartins.arquitetura_software.model.repository.jpa;

import com.fag.lucasmartins.arquitetura_software.model.repository.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoJpaRepository extends JpaRepository<ProdutoEntity, Long> {
}
