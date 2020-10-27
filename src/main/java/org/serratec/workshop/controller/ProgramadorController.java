package org.serratec.workshop.controller;

import java.util.List;

import org.serratec.workshop.modelo.Programador;
import org.serratec.workshop.repositorio.ProgramadorPorEspecialidadeELinguagem;
import org.serratec.workshop.repositorio.ProgramadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramadorController {
	
	@Autowired
	private ProgramadorRepository programadorRepository;

	
	/*
	 * Consultar todos os desenvolvedores de uma dada linguagem
	 */
	@GetMapping("/programadores-por-linguagem")
	public List<Programador> programadoresPorLinguagem(@RequestParam String linguagem) {
		return programadorRepository.findByLinguagem(linguagem);
	}
	
	/*
	 * Consultar todos os desenvolvedores de uma dada especialidade,
	 * ordenados por linguagem crescente, e nome decrescente.
	 */
	@GetMapping("/programadores-por-especialidade")
	public List<Programador> programadoresPorEspecialidade(@RequestParam String especialidade) {
		return programadorRepository.findByEspecialidadeOrderByLinguagemAscNomeDesc(especialidade);
	}
	
	/*
	 * Consultar todos os programadores paginados.
	 * 
	 * A quantidade de registros por página deve ser parametrizado. O padrão é 10.
	 * O cliente pode solicitar qualquer página. Se não informar, deve ser exibida a primeira página.
	 */
	@GetMapping("/programadores-paginados")
	public Page<Programador> programadoresPaginados(@PageableDefault(size = 10, page = 1) Pageable paginacao) {
		return programadorRepository.findAll(paginacao);
	}
	
	/*
	 * Consultar todos os desenvolvedores por especialidade e linguagem.
	 * 
	 * Ambos parâmetros são opcionais. Se nenhum for informado, deve retornar todos os programadores
	 */
	@GetMapping("/programadores-por-especialidade-e-linguagem")
	public List<Programador> programadoresPorEspecialidadeELinguagem(
			@RequestParam(required = false) String linguagem, @RequestParam(required = false) String especialidade) {
		
		ProgramadorPorEspecialidadeELinguagem filtro = new ProgramadorPorEspecialidadeELinguagem();
		filtro.setEspecialidade(especialidade);
		filtro.setLinguagem(linguagem);
		
		return programadorRepository.findAll(filtro);
	}
	
}
