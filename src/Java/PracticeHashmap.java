package Java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class PracticeHashmap {
	
	@Test
	public void Hashmap() {
		
		TreeMap<String,Integer> hm = new TreeMap<>();
		
		hm.put("Navi", 35);
		hm.put("Ashish", 36);
		hm.put("Varinder", 34);
		
		//System.out.println(hm.get("Navi"));
		//System.out.println(hm);
		
		int val = hm.get("Ashish");
		System.out.println(val);
		
		
		for (Map.Entry<String, Integer> e:hm.entrySet()) {
			System.out.println(e);
			
		}
	}

}
