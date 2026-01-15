package com.educativex.educativex.servicies;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.educativex.educativex.entities.Aluno;
import com.educativex.educativex.entities.Professor;
import com.educativex.educativex.entities.Usuario;
import com.educativex.educativex.repositories.AlunoRepository;
import com.educativex.educativex.repositories.ProfessorRepository;
import com.educativex.educativex.repositories.UsuarioRepository;


@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepo;
	@Autowired
	private AlunoRepository alunoRepo;
	@Autowired
	private ProfessorRepository professorRepo;
	
	@Transactional(readOnly=true) //a transação garante que o procedimento seja feito corretamente
	//ou não será feito (Tudo ou nada)
	public List<Usuario> findAll() {
		return usuarioRepo.findAll();
	}
	@Transactional(readOnly=true)
	public List<Aluno> findAluno(){
		return alunoRepo.findAll();
	}
	@Transactional(readOnly=true)
	public List<Professor> findProfessor(){
		return professorRepo.findAll();
	}
	@Transactional(readOnly=true)
	public Optional<Usuario> findById(Long id) {
		return usuarioRepo.findById(id);
	}
	public Usuario insert(Usuario obj) {
		return usuarioRepo.save(obj);
	}
}
