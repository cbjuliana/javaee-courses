package org.example.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractDAO {
	
	@PersistenceContext(name = "cursos")
	EntityManager em;

}
