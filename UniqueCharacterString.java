//Program that checks if all the characters in given string are unique or not

package cci;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacterString {
	public static void main(String[] args){
		String givenString = "";
		//boolean isAllUnique = true;
		//try{
			Scanner sc = new Scanner(System.in);
			if(sc.hasNext()){
				givenString = sc.next();
			}
			/*for(int i=0;i<givenString.length()-1;i++){//O(n)
				for(int j=i+1;j<givenString.length();j++){//O(n)
					if(givenString.charAt(i)==givenString.charAt(j)){
						isAllUnique = false;
						break;
					}
				}
				if(!isAllUnique)
					break;
			}//O(n*n)
*/			if(isAllCharacterUnique(givenString)){
				System.out.println("All characters in string are unique");
			}else
				System.out.println("All characters in string are not unique");
		//catch(Exception ie){
			//System.out.println("Exception reading string"+ie.getMessage());
		//}
	}
	//method to check if all the characters in string are unique
	private static boolean isAllCharacterUnique(String inputString) {
		//StringBuffer sb = new StringBuffer("Ind");
		Set<Character> charMap = new HashSet<Character>();
		for(int i = 0; i<inputString.length();i++){//O(n)
			if(charMap.contains(inputString.charAt(i))){
				return false;
			}else 
				charMap.add(inputString.charAt(i));
		}
		return true;
		
		
	}

}
