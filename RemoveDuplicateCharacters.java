//This file contains code to remove duplicate characters in given string

package cci;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String givenString ="";
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()){
			givenString = sc.next();
		}
		//removeDupChar(givenString);
		removeDuplicatesEff(givenString.toCharArray());
		//System.out.println("New String:"+givenString);
	}
	//this method also removes duplicate characters but with O(n*n) complexity
	private static String removeDupChar(String inputString) {
		// TODO 
		// have to check how to reduce complexity, in this case it is o(n*n)
		/*StringBuffer newStr = new StringBuffer();
		for(int i=0;i<inputString.length();i++){
			boolean repeated = false;
			for(int j=0;j<newStr.length();j++){
				if(newStr.charAt(j)==inputString.charAt(i)){
					repeated = true;
					break;
				}else
					continue;
			}
			if(!repeated)
				newStr.append(inputString.charAt(i));
		}*/
		//by using set
		//StringBuffer newStr = new StringBuffer();
		Set<Character> st = new LinkedHashSet<Character>();
		for(int i=0;i<inputString.length();i++){
			st.add(inputString.charAt(i));
		}
		//Object[] ch = st.toArray();
		String newStr="";
		for(char c:st)
			newStr = newStr+c;
		return newStr;
	}
	//effective method to remove duplicate character in given string
	public static void removeDuplicatesEff(char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;
		boolean[] hit = new boolean[256];
		for (int i = 0; i < 256; ++i) {
			hit[i] = false;
		}
		hit[str[0]] = true;
		int tail = 1;
		for (int i = 1; i < len; ++i) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		str[tail] = 0;
		for(int i=0;i<tail;i++){
			System.out.print(str[i]);
		}
	}
}
