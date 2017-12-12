package util;
import java.util.LinkedList;

import org.junit.Test;

import java.util.HashSet;
import junit.framework.TestCase;

public class TestChecker extends TestCase {
	
	@Test
	public void test() {
		LinkedList<String> testList = new LinkedList<String>();
		HashSet<String> testHash = new HashSet<String>();
		LinkedList<String> resultsList = new LinkedList<String>();
		testList.add("αυτοκίνητο");
		testList.add("Τραπέζι");
		testList.add("δεκα");
		testList.add("υπολοιστής");
		testHash.add("αυτοκίνητο");
		testHash.add("Τραπέζι");
		testHash.add("δεκα");
		testHash.add("υπολογιστής");		
		resultsList.add("υπολοιστής");	
		
		assertEquals(resultsList, Checker.finder(testList, testHash));
		
	}

}
