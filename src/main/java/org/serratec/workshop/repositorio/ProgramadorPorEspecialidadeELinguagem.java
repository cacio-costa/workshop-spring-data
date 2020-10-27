package org.serratec.workshop.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.serratec.workshop.modelo.Programador;
import org.springframework.data.jpa.domain.Specification;

public class ProgramadorPorEspecialidadeELinguagem implements Specification<Programador> {
	
	private String linguagem;
	private String especialidade;
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}


	@Override
	public Predicate toPredicate(Root<Programador> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		List<Predicate> predicates = new ArrayList<>();

        if(especialidade != null) {
            predicates.add(criteriaBuilder.equal(root.get("especialidade"), especialidade));
        }

        if(linguagem != null) {
        	predicates.add(criteriaBuilder.equal(root.get("linguagem"), linguagem));
        }

        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
	}

}
