package org.example.dummy;

import org.example.ifaces.ProfessorRepository;

public class DummyProfessorRepository implements ProfessorRepository {

	@Override
	public String getQualification() {
	  throw new AssertionError("Not yet Implemented");
	}

}
