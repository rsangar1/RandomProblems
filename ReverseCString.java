//This program is to reverse a C style string (string with null character at end

package cci;

import java.io.CharArrayReader;
import java.util.Scanner;

public class ReverseCString {
	public static void main(String ar[]){
		String givenString ="";
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()){
			givenString = sc.next();
		}
		/*String revStr = reverseCstyleString(givenString);
		char charArr[] = new char[revStr.length()];
		for(int i = 0; i<charArr.length;i++){
			charArr[i] = revStr.charAt(i);
		}
		for(int i = 0; i<charArr.length;i++){
			System.out.print(charArr[i]);
		}*/
		System.out.println("Reverse C string:"+reverseCstyleString(givenString));
	}
	// code to reverse a C-Style String. (
	private static String reverseCstyleString(String inputString) {
		String strArr[] = new String[inputString.length()+1];
		for(int i=0;i<strArr.length-1;i++){
			char c = inputString.charAt(i);
			strArr[i]= String.valueOf(c);
		}
		strArr[inputString.length()] = "\0";
		StringBuffer revStr = new StringBuffer();
		//inputString=inputString+'a';
		//revStr.append(inputString);
		for(int i = strArr.length;i>0;i--){
			revStr.append(strArr[i-1]);
		}
		return revStr.toString();
	}

}
