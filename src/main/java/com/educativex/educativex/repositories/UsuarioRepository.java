package com.educativex.educativex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.educativex.educativex.entities.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Long>, JpaRepository<Usuario, Long>{

}
