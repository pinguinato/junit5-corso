package it.progetti.roberto.junit5corso;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactManagerTest {

    // example of testing with Assertions

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


    // example of testing Exceptions
    @Test
    @DisplayName("Shloud Not Create Contact When First Name is Null")
    void shouldThrowRuntimeExceptionWhenFirstNameIsNull() {}

    @Test
    @DisplayName("Shloud Not Create Contact When Last Name is Null")
    void shouldThrowRuntimeExceptionWhenLastNameIsNull() {}

    @Test
    @DisplayName("Shloud Not Create Contact When Phone Number is Null")
    void shouldThrowRuntimeExceptionWhenPhoneNumberIsNull() {}


}