import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class FizzBuzzTest {

	
Fizzbuzz underTest = new Fizzbuzz();
	
   @Test 
   public void shouldRespondOneForOne () {
         //Arrange
	     Fizzbuzz underTest = new Fizzbuzz();
         //Act - this is the data going into the method - see public int response in fizzbuzz.java
	   String check = underTest.response(1);
	     //Assert
	     assertEquals("1", check);
	}

   @Test 
   public void shouldRespondTwoForTwo () {
	  String check = underTest.response(2);
	     assertEquals("2", check); 
       
}
   
   @Test 
   public void shouldRespondFizzForThree () {
	    String check = underTest.response(3);
	     assertEquals("fizz", check); 
   }
   
   @Test 
   public void shouldRespondFizzForFive () {
	    String check = underTest.response(5);
	     assertEquals("buzz", check);
    
   }  
   
   @Test 
   public void shouldRespondFizzForSix () {
	    String check = underTest.response(6);
	     assertEquals("fizz", check);
   
   }
   @Test 
   public void shouldRespondFizzForTen () {
	    String check = underTest.response(10);
	     assertEquals("buzz", check);
   
   }  
   
   @Test 
   public void shouldRespondFizzForFifteen () {
	    String check = underTest.response(15);
	     assertEquals("fizzbuzz", check);
   
   
   } 
   
   @Test 
   public void shouldRespondErrorForValues0orBelow () {
	    String check = underTest.response(-1);
	     assertEquals("error", check);
   
   }
}
