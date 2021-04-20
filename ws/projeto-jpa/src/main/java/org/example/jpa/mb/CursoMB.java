package org.example.jpa.mb;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.example.jpa.ejb.CursoEJB;
import org.example.jpa.modelo.Curso;

@Named
@RequestScoped
public class CursoMB {
	
	private Curso curso;
	
	@Inject
	private CursoEJB cursoEJB;
	
	@PostConstruct
	public void init() {
		curso = new Curso();
	}
	

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void cadastrar() {
		cursoEJB.cadastrar(curso);
	}
	
	

}
