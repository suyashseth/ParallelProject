package com.caps.mvc.dao;

import java.util.HashMap;
import java.util.List;

import com.caps.mvc.dto.Person;

public class PersonDAOJavaImpl implements PersonDAO{

	HashMap<Integer, Person>map = new HashMap<Integer, Person>();
	
	
	
	@Override
	public boolean createPerson(Person person) {
	
		if(person!=null)
		{
		    map.put(person.getId(),person);
		    return true;
		}
		return false;
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
