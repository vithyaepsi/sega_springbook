package fr.vithyaepsi.bookspringdata.dal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.vithyaepsi.bookspringdata.domain.Contact;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactRepositoryTest {

	@Autowired
	ContactRepository repository;
	
	//	Executé une seule fois avant les autres méthodes
	@BeforeClass
	public static void initDesTrucs() {
		
	}
	
	//	Exécuté avant chaque test
	@Before
	public void initEachTime() {
		
	}
	
	@Test
	public void testFindByEmail() {
		Contact contact = repository.save(new Contact("philippe", "risoli", "philippe@risoli.com"));
		assertThat( contact.getFirstName(), is(repository.findByEmail("philippe@risoli.com").getFirstName()) );
		repository.delete(contact);
	}

}
