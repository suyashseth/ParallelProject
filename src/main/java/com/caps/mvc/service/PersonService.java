package com.caps.mvc.service;

import java.util.List;

import com.caps.mvc.dto.Person;

public interface PersonService {

	public boolean createPerson(Person person);

	public Person login(int id,String password);

	public boolean updatePerson(Person person);

	public boolean deletePerson(int id,String password);

	public List<Person> getAllPerson();
}
