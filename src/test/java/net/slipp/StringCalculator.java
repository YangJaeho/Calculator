package net.slipp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class StringCalculator {

	public int add(String text) {
		if(text.isEmpty()){
		return 0;
		}
		
        if (text.startsWith("//"))
        {
        	Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        	m.find();
        
        	return sum(m.group(2), m.group(1));
        	
        }
			return sum(text, ",|\n");

	}

	private int sum(String text, String delimeter) {
		String[] numbers = text.split(delimeter);
		int sum = 0;
		
		for (int i= 0; i < numbers.length; i++)
		{ 
			sum += toInt(numbers[i]);
		}
		return sum;
	}
	
	private int toInt(String text){
		int result = Integer.parseInt(text);
		if(result < 0){
			throw new RuntimeException("음수는  사용할 수 없습니다");
		}
		return result;
	}
}
