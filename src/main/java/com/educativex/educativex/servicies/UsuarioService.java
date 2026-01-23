package com.educativex.educativex.servicies;
import java.sql.SQLException;
import java.util.List;

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
	public Usuario findById(String id) {
		return usuarioRepo.findById(id).orElseThrow(() -> new RuntimeException("Id não encontrado"));
	}
	public Usuario insert(Usuario obj) {
		return usuarioRepo.save(obj);
	}
	public void delete(String id) throws SQLException {
		usuarioRepo.deleteById(id);
	}
	public Usuario update(String id, Usuario obj){
		Usuario entity = usuarioRepo.findById(id).orElseThrow(() -> new RuntimeException("Id não encontrado"));
		updateData(entity, obj);		
		return usuarioRepo.save(entity);
	}
	public void updateData(Usuario entity, Usuario obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		entity.setSenha(obj.getSenha());
		entity.setTipo_usuario(obj.getTipo_usuario());
	}
	
}
