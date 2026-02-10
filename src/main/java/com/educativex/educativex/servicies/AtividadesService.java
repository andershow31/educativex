package com.educativex.educativex.servicies;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.educativex.educativex.entities.Atividades;
import com.educativex.educativex.repositories.AtividadesRepository;


@Service
public class AtividadesService {
	@Autowired
	private AtividadesRepository repo;
	
	@Transactional(readOnly=true) //a transação garante que o procedimento seja feito corretamente
	//ou não será feito (Tudo ou nada)
	public List<Atividades> findAll() {
		return repo.findAll();
	}

	@Transactional(readOnly=true)
	public Atividades findById(String id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Id não encontrado"));
	}
	public Atividades insert(Atividades obj) {
		return repo.save(obj);
	}
	public void delete(String id) throws SQLException {
		repo.deleteById(id);
	}
	public Atividades update(String id, Atividades obj){
		Atividades entity = repo.findById(id).orElseThrow(() -> new RuntimeException("Id não encontrado"));
		updateData(entity, obj);		
		return repo.save(entity);
	}
	public void updateData(Atividades entity, Atividades obj) {
		entity.setNome(obj.getNome());
		entity.setMateria(obj.getMateria());
	}
	
}
