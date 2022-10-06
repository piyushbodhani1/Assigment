package testquestion7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import subjectquestion7.SetManipulations;

public class SetManipulationsTest {
   @Test
   public void answerSet() {
	   SetManipulations  ob = new SetManipulations ();
	   int check = ob.last();
	   System.out.println("The last element is "+check);
	   assertEquals(15, check);
   }
}
