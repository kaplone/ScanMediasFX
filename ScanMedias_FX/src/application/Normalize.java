package application;

import java.util.ArrayList;
import java.util.Arrays;

public class Normalize {

	public static String normalize (String s ){
		
		ArrayList<String> splitted2 = new ArrayList<>();
		
		String [] splitted1 = s.trim().split(" ");
		
		for (String s2 : splitted1){
			splitted2.addAll(Arrays.asList(s2.split("\'")));
		}
		
		return String.join("_", splitted2);
	}
	
}
