package org.howard.edu.lsp.FinalExam.Implementation;

import java.util.*;

public class MapUtilities {
	/**
	 * @param map1
	 * @param map2
	 * @return the total count of common key/value pair between the given two hashmaps
	 * @throws NullMapException if there exits a hashmap that is null
	 */
    public static int commonKeyValuePairs(
        HashMap<String, String> map1,
        HashMap<String, String> map2)throws NullMapException {
// implementation
    	int total=0;
    	//condition when any of the given hashmaps is empty
    	if (map1.isEmpty() || map2.isEmpty()) {
    		System.out.println("It's am empty case");
    		return total;
    	}
    	
    	//second condition if any of the given hashmaps is null
    	if (map1==null || map2==null) {
    		throw new NullMapException();
    	}
    	
    	if (map1.size()>map2.size()) {
    		for (String key_map1: map1.keySet()) {
    			if (map2.get(key_map1)==map1.get(key_map1)) {
    				total+=1;
    			}
    		}
    	}
    	else {
    		for (String key_map2: map2.keySet()) {
    			if (map2.get(key_map2)==map1.get(key_map2)) {
    				total+=1;
    			}
    		}
    	}
    	return total;
    }
}
