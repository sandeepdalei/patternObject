package testcases;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LearnhashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		char[] array = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i])) {
				Integer cnt = map.get(array[i]);
				map.put(array[i], cnt+1);
			} else {
				map.put(array[i], 1);
			}
			

		}
		System.out.println(map.entrySet());
	}

}
