package com.educativex.educativex.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educativex.educativex.entities.Aluno;

public interface AlunoRepository extends MongoRepository<Aluno, Long>{

}
