package test.java;

import org.junit.*;
import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {

   String message = "Robert";	

   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
   
   }
}
