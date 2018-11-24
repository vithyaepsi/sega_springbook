package fr.vithyaepsi.bookspringdata.service;

import java.util.List;

import fr.vithyaepsi.bookspringdata.dal.ContactRepository;
import fr.vithyaepsi.bookspringdata.domain.Contact;


public class ContactService extends GenericService<ContactRepository, Contact>{
	public Contact findByEmail(String email) {
		return this.repository.findByEmail(email);
	}
	
	public int getContactBirthYear(Contact contact) {
		//	Traitement de récupération et parsing de la date
		return 1;
	}
	
	/*public List<Contact> getListeByProximite(float lat, float lon){
		this.repository.find
		
		return null;
	}*/
}
