package com.campus.mybatis.mapper;

import java.util.*;

import com.campus.mybatis.beans.*;

public interface ContactoMapper {
	Contacto			getContactoById(String id);
	List<Contacto>		getAllContactos();
	
	ContactoCstm		getContactoCstmById(String id);
	List<ContactoCstm>	getAllContactosCstm();
	
	List<String>		getEmailsContactoById(String id);
	
	List<String>		getIdCursosContactoById(String id);
	
	List<Contacto>		getContactoByLike(Map<String, Object> map);

}
