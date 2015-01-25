//This program checks if two strings are anagrams or not

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CheckAnagrams {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		str1 = sc.next();
		str2 = sc.next();
		if(areAnagrams(str1,str2))
			System.out.println("Angrams");
		else
			System.out.println("Not anagrams");
	}
	//method to decide if two strings are anagrams or not.
	private static boolean areAnagrams(String str1, String str2) {
		boolean isAnagram = false;
		if(str1.length()!=str2.length())
			return isAnagram;
		else{
			
			Map<Character, Integer> map1 = new HashMap<Character, Integer>();
			Map<Character, Integer> map2 = new HashMap<Character, Integer>();
			for(int i=0;i<str1.length();i++){
				if(map1.containsKey(str1.charAt(i))){
					int count = map1.get(str1.charAt(i));
					map1.put(str1.charAt(i), count+1);
				}else
					map1.put(str1.charAt(i), 1);
				if(map2.containsKey(str2.charAt(i))){
					int count = map2.get(str2.charAt(i));
					map2.put(str2.charAt(i), count+1);
				}else
					map2.put(str2.charAt(i), 1);
			}
			for(char ch: map1.keySet()){
				if(map2.containsKey(ch)){
					if(map2.get(ch)== map1.get(ch)){
						isAnagram = true;
					}else{
						isAnagram = false;
						break;
					}
				}
			}
			// you can use iterator also
			/*Iterator iter1 = map1.keySet().iterator();
			while(iter1.hasNext()){
				Object ch = iter1.next();
				if(map2.containsKey(ch)){
					if(map2.get(ch)== map1.get(ch)){
						isAnagram = true;
					}
				}
			}*/
		}
		return isAnagram;
	}
}
