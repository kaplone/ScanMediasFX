package application;

import java.util.ArrayList;
import java.util.Arrays;

public class Normalize {

	public static String normalize (String s ){
		
		return s.replace('\'', '_')
		        .replace('\n', '_')
		        .replace(' ', '_');
	}
	
}
