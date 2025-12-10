package org.java.unit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmployTest {

  @Test
  public void testToString() {
    Employ employ2 = new Employ(12, "Ankit", Gender.MALE, "Java", "Programmer",99233);
    String result ="Employ{empno=12, name='Ankit', gender=MALE, dept='Java', desig='Programmer', basic=99233.0}";
    assertEquals(result,employ2.toString());
  }

  @Test
  public void testGettersAndSetters() {
    Employ employ = new Employ();
    employ.setEmpno(10);
    employ.setName("Lokesh");
    employ.setGender(Gender.MALE);
    employ.setDept("Java");
    employ.setDesig("Manager");
    employ.setBasic(99922);
    assertEquals(10, employ.getEmpno());
    assertEquals("Lokesh", employ.getName());
    assertEquals(Gender.MALE, employ.getGender());
    assertEquals("Java", employ.getDept());
    assertEquals("Manager", employ.getDesig());
    assertEquals(99922, employ.getBasic(),0);
  }

  @Test
  public void testConstructor() {
    Employ employ1 = new Employ();
    assertNotNull(employ1);
    Employ employ2 = new Employ(12, "Ankit", Gender.MALE, "Java", "Programmer",99233);
    assertEquals(12, employ2.getEmpno());
    assertEquals("Ankit", employ2.getName());
    assertEquals(Gender.MALE, employ2.getGender());
    assertEquals("Java", employ2.getDept());
    assertEquals("Programmer", employ2.getDesig());
    assertEquals(99233, employ2.getBasic(),0);
  }
}
