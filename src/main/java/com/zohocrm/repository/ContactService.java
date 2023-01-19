package com.zohocrm.repository;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> getContacts();

	public Contact getContactById(long id);
}
