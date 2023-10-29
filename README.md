# Corso Junit 5

Link you tube del corso: https://www.youtube.com/watch?v=flpmSXVTqBI&ab_channel=freeCodeCamp.org

What is Junit? 

Junit is a simple testing framework to write repeatable tests

**Subjects under test** is the class to test

**Junit test class** is the junit class test file

**Junit** is composed by 3 components:

- Junit Platform
- Junit Jupiter
- Junit Vintage

## Junit lifecycle

When a Junit test start firt create an instance of test class:

- first method is **@BeforeAll** (executed at first time, first of all test methods)
- second is **@BeforeEach** is executed before each **@Test** class method
- then **@AfterEach**
- final **@AfterAll**

In order:
1) @BeforeAll
2) @BeforeEach
3) @Test
4) @AfterEach
5) @AfterAll

1 and 2 perform initialization tasks for tests

4 and 5 used to perform cleanup tasks for tests



