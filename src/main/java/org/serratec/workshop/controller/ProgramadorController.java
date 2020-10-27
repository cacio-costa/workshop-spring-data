package org.serratec.workshop.controller;

import java.util.Collections;
import java.util.List;

import org.serratec.workshop.modelo.Programador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramadorController {

	
	/*
	 * Consultar todos os desenvolvedores de uma dada linguagem
	 */
	@GetMapping("/programadores-por-linguagem")
	public List<Programador> programadoresPorLinguagem() {
		return Collections.emptyList();
	}
	
	/*
	 * Consultar todos os desenvolvedores de uma dada especialidade
	 */
	@GetMapping("/programadores-por-especialidade")
	public List<Programador> programadoresPorEspecialidade() {
		return Collections.emptyList();
	}
	
	/*
	 * Consultar todos os programadores paginados.
	 * 
	 * A quantidade de registros por página deve ser parametrizado. O padrão é 10.
	 * O cliente pode solicitar qualquer página. Se não informar, deve ser exibida a primeira página.
	 */
	@GetMapping("/programadores-paginados")
	public List<Programador> programadoresPaginados() {
		return Collections.emptyList();
	}
	
	/*
	 * Consultar todos os desenvolvedores por especialidade e linguagem.
	 * 
	 * Ambos parâmetros são opcionais. Se nenhum for informado, deve retornar todos os programadores
	 */
	@GetMapping("/programadores-por-especialidade-e-linguagem")
	public List<Programador> programadoresPorEspecialidadeELinguagem() {
		return Collections.emptyList();
	}
	
}
