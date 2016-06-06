package test.java;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Classe de Teste que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2016-05-31
 *
 */
 
public class testtes {

  /**
   * Preparação antes dos testes
   */
  @Before
  public void setUp() {
     // TODO
  }


  @Test
  public void sumTest() {
    assertEquals(2, 1+1);
  }

  /**
   * Limpeza após os testes
   */
  @After
  public void tearDown() {
     // TODO
  }

}
