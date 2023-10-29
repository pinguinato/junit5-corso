package it.progetti.roberto.junit5corso;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactManagerTest {

    @Test
    void shouldCreateContract() {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Roberto", "Gianotto", "0123456789");
        // assertion example
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getContactList().size());
        Assertions.assertTrue(contactManager.getAllContacts().stream()
                .anyMatch(contact -> contact.getFirstName().equals("Roberto") &&
                            contact.getLastName().equals("Gianotto") &&
                            contact.getPhoneNumber().equals("0123456789")
                ));
    }


}