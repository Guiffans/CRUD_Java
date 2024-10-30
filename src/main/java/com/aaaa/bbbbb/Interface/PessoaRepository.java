package com.aaaa.bbbbb.Interface;

import com.aaaa.bbbbb.Model.Pessoa;
//jpa pro banco de dados
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}