package com.educativex.educativex.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educativex.educativex.entities.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

}
