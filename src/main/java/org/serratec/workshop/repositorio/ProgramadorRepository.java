package org.serratec.workshop.repositorio;

import java.util.List;

import org.serratec.workshop.modelo.Programador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

public interface ProgramadorRepository extends Repository<Programador, Long>, JpaSpecificationExecutor<Programador> {

	List<Programador> findByLinguagem(String linguagem);
	List<Programador> findByEspecialidadeOrderByLinguagemAscNomeDesc(String especialidade);
	
	Page<Programador> findAll(Pageable paginacao);
	
}
