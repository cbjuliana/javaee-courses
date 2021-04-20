package org.example.jpa.dao;

import org.example.jpa.modelo.Curso;

public class CursoDAO extends AbstractDAO {
	
	public void cadastrar(Curso curso) {
		em.persist(curso);
	}

}
