package com.junit.JUnit;

public class CheckA {  

	public String remove(String string) {
		String result="";
		int stringLength = string.length();
		if(stringLength == 1 && (char)string.charAt(0) != 'A'){
			result = string;
		}
		if(stringLength == 2 ){
			char firstChar = string.charAt(0);
			char secondChar = string.charAt(1);
			if(firstChar == 'A' && secondChar == 'A'){
				return result;
			}
			else if(firstChar == 'A'){
				result = string.substring(1,2);
			}
			else if (secondChar == 'A'){
				result = string.substring(0,1);
			}
		}
		if(stringLength > 2){
			char firstChar = string.charAt(0);
			char secondChar = string.charAt(1);
			if(firstChar == 'A' && secondChar == 'A'){
				result = string.substring(2,stringLength);
			}
			else if(firstChar == 'A'){
				result = string.substring(1,stringLength);
			}
			else if(secondChar == 'A'){
				result = firstChar+string.substring(2,stringLength);
			}
			else{
				result = string;
			}
		}
		return result;
	}  
}  