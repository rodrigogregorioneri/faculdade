package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

/**
 * Classe de Teste que representa um aglomerado de testes unitários.
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0s
 * @since 2016-05-31
 *
 */
 
@RunWith(Suite.class)
@SuiteClasses({ 
 TestJunit1.class,
   TestJunit2.class
})
public class  Testes {
  
     public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Testes.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}

