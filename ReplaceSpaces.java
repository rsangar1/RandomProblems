//This program is to replace space in a string with '%20'

package cci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReplaceSpaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//scanner by default don't read space characters, we can specify by using delimiter as \\n
		//instead use bufferedreader
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\n");
		if(sc.hasNext()){
			inputString = sc.next();
		}*/
		
		String inputString = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			inputString = br.readLine();
		} catch (IOException e) {
			System.out.println("Error reading input");
			e.printStackTrace();
		}
		System.out.println("Result : "+ replaceSpace(inputString));
	}
	//method to replace all spaces in a string with ‘%20’.
	private static String replaceSpace(String inputString) {
		StringBuffer result = new StringBuffer();
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i)==' '){
				result.append("%20");
			}else{
				result.append(inputString.charAt(i));
			}
		}
		return result.toString();
	}

}
