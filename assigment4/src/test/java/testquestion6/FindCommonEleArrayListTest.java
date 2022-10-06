package testquestion6;

import org.junit.Test;

import subjectquestion6.FindCommonEleArrayList;

import static org.junit.Assert.assertEquals;

public class FindCommonEleArrayListTest {
	@Test
	public void answer() {
		FindCommonEleArrayList f = new FindCommonEleArrayList();
		int w = f.ans();
		assertEquals(3, w);
		
	}
}
