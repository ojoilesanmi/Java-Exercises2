package chapter6;

public class VariableLength {
	public static int product(int... numbers){
		int result = 1;
		for(int counter : numbers) 
			result *= counter;
		
		return result;
		
	}

}
