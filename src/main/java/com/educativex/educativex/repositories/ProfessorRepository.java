package com.educativex.educativex.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educativex.educativex.entities.Professor;

public interface ProfessorRepository extends MongoRepository<Professor, Long>{

}
