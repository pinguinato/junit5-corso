package it.progetti.roberto.junit5corso;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ContactManagerTest {

    @Test
    void shouldCreateContract() {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Roberto", "Gianotto", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
    }

}