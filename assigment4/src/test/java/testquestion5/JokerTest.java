package testquestion5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import subjectquestion5.Joker;

public class JokerTest {
	@Test
	public void answercheck() {
          Joker j = new Joker();
          String s = j.DanceDiwaneJoker("Joker1","Salsa");
          System.out.println(s);
          assertEquals("Joker no Joker1 Performing Salsa", s);
          
          int a = j.DanceDiwaneJoker(10);
          System.out.println("The age of the jocker is: "+a);
          assertEquals(10, a);
          
	}
}
