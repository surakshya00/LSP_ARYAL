package org.howard.edu.lsp.FinalExam.junit;

import org.howard.edu.lsp.FinalExam.Implementation.*;

import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 



public class MapUtilitiesTest {
	@Test
	@DisplayName("When the test cases are of equal length and share common key/value pairs")
	public void testequalKeyValuePairs() throws NullMapException {
		HashMap<String, String> map1= new HashMap<>();
		HashMap<String, String> map2= new HashMap<>();
		
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecastic");
		map1.put("Chuck", "Fine");
		map1.put("Bob", "Happy");
		map1.put("Felix", "Sick");
		
		map2.put("Mary", "Ecastic");
		map2.put("Felix", "Healthy");
		map2.put("Ricardo", "Subperb");
		map2.put("Tam", "Fine");
		map2.put("Bob", "Happy");
		
		assertEquals(2, MapUtilities.commonKeyValuePairs(map1, map2));
	}
	@Test
	@DisplayName("When Test cases size are unequal")
	public void testunequalKeyValuePairs() throws NullMapException {
		HashMap<String, String> map1= new HashMap<>();
		HashMap<String, String> map2= new HashMap<>();
		
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecastic");
		map1.put("Chuck", "Fine");
		map1.put("Bob", "Happy");
		map1.put("Felix", "Sick");
		
		map2.put("Mary", "Ecastic");
		map2.put("Tam", "Fine");
		assertEquals(1, MapUtilities.commonKeyValuePairs(map1, map2));
	}
		
	@Test
	@DisplayName("When one or two of the test cases are empty")
	public void testEmptyKeyValuePairs() throws NullMapException {
		HashMap<String, String> map1= new HashMap<>();
		HashMap<String, String> map2= new HashMap<>();
		HashMap<String, String> map3= new HashMap<>();
		HashMap<String, String> map4= new HashMap<>();
		
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecastic");
		map1.put("Chuck", "Fine");
		map1.put("Bob", "Happy");
		map1.put("Felix", "Sick");
		
		
		assertEquals(0, MapUtilities.commonKeyValuePairs(map1, map2));
		assertEquals(0, MapUtilities.commonKeyValuePairs(map3, map4));
		
		
	}
	@Test
	@DisplayName("When one or two of the given hashmaps are null")
	public void testNullKeyValuePairs() throws NullMapException{
		HashMap<String, String> map1= new HashMap<>();
		HashMap<String, String> map2= null;
		HashMap<String, String> map3= null;
		HashMap<String, String> map4= null;
		
		String errorMessage="Check your input, one or both of them are null";
		Exception e= assertThrows(NullMapException.class, ()->{
			MapUtilities.commonKeyValuePairs(map1, map2);
		});
		String printerror= e.getMessage();		
		assertTrue(printerror.contains(errorMessage));
		
		Exception ex=assertThrows(NullMapException.class, ()->{
			MapUtilities.commonKeyValuePairs(map3, map4);	
		});
		String printerror2= ex.getMessage();		
		assertTrue(printerror2.contains(errorMessage));
	}


}
