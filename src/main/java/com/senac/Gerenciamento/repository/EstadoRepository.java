package com.senac.Gerenciamento.repository;

import com.senac.Gerenciamento.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

    List<Estado> findByNome(String nome);

    List<Estado> findBySigla(String sigla);

}
