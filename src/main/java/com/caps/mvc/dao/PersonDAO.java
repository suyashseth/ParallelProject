package com.caps.mvc.dao;

import java.util.List;

import com.caps.mvc.dto.Person;

public interface PersonDAO {

	public boolean createPerson(Person person);
	
	public Person login(int id,String password);
	
	public boolean updatePerson(Person person);
	
	public boolean deletePerson(int id,String password);
	
	public List<Person> getAllPerson();
}
