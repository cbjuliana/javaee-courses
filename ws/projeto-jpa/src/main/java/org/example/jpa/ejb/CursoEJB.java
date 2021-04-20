package org.example.jpa.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.example.jpa.dao.CursoDAO;
import org.example.jpa.modelo.Curso;

@Stateless
public class CursoEJB {
	
	@Inject
    private CursoDAO cursoDAO;
	
	public void cadastrar(Curso curso) {
		cursoDAO.cadastrar(curso);
	}
	
}
