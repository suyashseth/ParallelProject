package com.caps.mvc.service;

import java.util.List;

import com.caps.mvc.dao.PersonDAOJavaImpl;
import com.caps.mvc.dto.Person;

public class PersonServiceImpl implements PersonService {

	PersonDAOJavaImpl impl = new PersonDAOJavaImpl();

	@Override
	public boolean createPerson(Person person) {
		boolean result = impl.createPerson(person);
		return result;
	}

	@Override
	public Person login(int id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePerson(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePerson(int id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return null;
	}

}
