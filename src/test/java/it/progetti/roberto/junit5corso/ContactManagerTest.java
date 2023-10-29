package it.progetti.roberto.junit5corso;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContactManagerTest {

    private ContactManager contactManager;

    // example of @BeforeAll e @BeforeEach
    @BeforeAll
    public void setupAll() {
        System.out.println("Shloud Print Before All Tests");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Shloud Print after each test");
        contactManager = new ContactManager();
    }



    // example of testing with Assertions

    @Test
    void shouldCreateContract() {
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
    void shouldThrowRuntimeExceptionWhenFirstNameIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact(null, "Gianotto", "0123456789");
        });
    }

    @Test
    @DisplayName("Shloud Not Create Contact When Last Name is Null")
    void shouldThrowRuntimeExceptionWhenLastNameIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("Roberto", null, "0123456789");
        });
    }

    @Test
    @DisplayName("Shloud Not Create Contact When Phone Number is Null")
    void shouldThrowRuntimeExceptionWhenPhoneNumberIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("Roberto", "Gianotto", null);
        });
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Should Execute after each test");
    }

    @AfterAll
    public void tearDownAll() {
        System.out.println("Should Execute at the end of the Test");
    }
}