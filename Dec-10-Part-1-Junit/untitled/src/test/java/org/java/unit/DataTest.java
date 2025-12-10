package org.java.unit;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DataTest {

  static Data data;

  @BeforeAll
  public static void setup() {
    data = new Data();
    System.out.println("Program Started...Welcome to Test Cases");
  }

  @BeforeEach
  public void beforeEach() {
    System.out.println("Test Case Started...");
  }

  @AfterEach
  public void afterEach() {
    System.out.println("Test Case Ended...");
  }

  @AfterAll
  static void cleanUp() {
    data = null;
    System.out.println("Program Ended...");
  }

  @Test
  public void testShowNames() {
    List<String > names = data.showNames();
    assertAll(
      () -> assertEquals(3, names.size()),
      () -> assertTrue(names.contains("Lokesh")),
      () -> assertTrue(names.contains("Sekhar")),
      () -> assertFalse(names.contains("Z"))
    );
  }

  @Test
  public void testEvenOdd() {
    assertTrue(data.evenOdd(2));
    assertFalse(data.evenOdd(1));
  }

  @Test
  public void testNull() {
    Data d = null;
    assertNull(d);
  }

  @Test
  public void testArithmeticException() {
    Exception exception = assertThrows(ArithmeticException.class, () -> data.division(5,0));
    assertEquals("/ by zero", exception.getMessage());
  }

  @Test
  public void testDivision() {
    assertEquals(2, data.division(5, 2));
  }

  @Test
  public void testMax3() {
    assertEquals(5, data.max3(5,2,3));
    assertEquals(5, data.max3(2,5,3));
    assertEquals(5, data.max3(3,2,5));
  }

  @Test
  public void testSum() {
    assertEquals(5, data.sum(2, 3));
  }

  @Test
  public void testSayHello() {
    assertEquals("Welcome to Junit Programming...", data.sayHello());
  }

}
