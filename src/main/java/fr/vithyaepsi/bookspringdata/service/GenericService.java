package fr.vithyaepsi.bookspringdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class GenericService<T extends CrudRepository<E, Long>, E> {

	@Autowired
	protected T repository;

	public T getRepository() {
		return repository;
	}

	public void setRepository(T repository) {
		this.repository = repository;
	}
	
	public List<E> findAll(){
		return (List<E>) repository.findAll();
	}
}
