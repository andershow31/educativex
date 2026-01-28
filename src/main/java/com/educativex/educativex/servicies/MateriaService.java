package com.educativex.educativex.servicies;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.educativex.educativex.entities.Aluno;
import com.educativex.educativex.entities.Materia;
import com.educativex.educativex.entities.Professor;
import com.educativex.educativex.entities.Usuario;
import com.educativex.educativex.repositories.MateriaRepository;


@Service
public class MateriaService {
	@Autowired
	private MateriaRepository repo;
	
	@Transactional(readOnly=true) //a transação garante que o procedimento seja feito corretamente
	//ou não será feito (Tudo ou nada)
	public List<Materia> findAll() {
		return repo.findAll();
	}

	@Transactional(readOnly=true)
	public Materia findById(String id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Id não encontrado"));
	}
	public Materia insert(Materia obj) {
		return repo.save(obj);
	}
	public void delete(String id) throws SQLException {
		repo.deleteById(id);
	}
	public Materia update(String id, Materia obj){
		Materia entity = repo.findById(id).orElseThrow(() -> new RuntimeException("Id não encontrado"));
		updateData(entity, obj);		
		return repo.save(entity);
	}
	public void updateData(Materia entity, Materia obj) {
		entity.setNome_materia(obj.getNome_materia());
		entity.setAnoEscolar(obj.getAnoEscolar());
		entity.setProfessor(obj.getProfessor());
		entity.addAluno(obj.getListaAlunos());
	}
	
	public Materia deleteAluno(String id, Materia obj, int num) {
		Materia entity = repo.findById(id).orElseThrow(() -> new RuntimeException("Id da matéria não encontrado"));
		try {
			entity.deletarAluno(num);
		}catch (RuntimeException e) {
			throw new RuntimeException("Aluno não existe na lista da matéria");
		}		
		
		return repo.save(entity);
	
	}
	
}
