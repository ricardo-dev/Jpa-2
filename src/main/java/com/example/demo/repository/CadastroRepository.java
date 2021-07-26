package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cadastro;
import com.example.demo.model.CadastroId;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, CadastroId>{

}
