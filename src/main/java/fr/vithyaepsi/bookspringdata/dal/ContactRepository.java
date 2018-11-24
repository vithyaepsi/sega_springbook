package fr.vithyaepsi.bookspringdata.dal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.vithyaepsi.bookspringdata.domain.Contact;

@RepositoryRestResource(path="contacts-list")
public interface ContactRepository extends CrudRepository<Contact, Long> {

	public Contact findByEmail(@Param("email") String email);
	//public List<Contact> findByProximite();
}
