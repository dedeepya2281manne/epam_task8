package com.junit.JUnit;

public class CheckA {  

	public String remove(String string) {
		String result="";
		int stringLength = string.length();
		if(stringLength == 1 && (char)string.charAt(0) != 'A'){
			result = string;
		}
		if(stringLength == 2 ){
			if((char)string.charAt(0) == 'A'&&(char)string.charAt(1) == 'A'){
				return result;
			}
			else if((char)string.charAt(0) == 'A'){
				result = string.substring(1,2);
			}
			else if ((char)string.charAt(1) == 'A'){
				result = string.substring(0,1);
			}
		}
		if(stringLength > 2){
			if((char)string.charAt(0) == 'A' && (char)string.charAt(1) == 'A'){
				result = string.substring(2,stringLength);
			}
			else if((char)string.charAt(0) == 'A'){
				result = string.substring(1,stringLength);
			}
			else if((char)string.charAt(1) == 'A'){
				result = string.substring(0,1)+string.substring(2,stringLength);
			}
			else{
				result = string;
			}
		}
		return result;
	}  
}  