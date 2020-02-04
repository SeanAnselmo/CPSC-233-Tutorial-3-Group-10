public class BasicJava3 {
	public static boolean isDigit(char aChar) {
		if (aChar >='A' && aChar <= 'z') 
			return false;
		else;
		return true;
	}
	public static double computePolynomial(double x) {
		return ((0.5*((x-1)*(x-1)))-((4)*(11-x))+10);
	}
	public static double afterDecimal(double num) {
		int guy = (int)(num);
				return num-guy;
		
	}
	public static int count(String str, String chars) {
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			for(int j=0; j<chars.length(); j++) {
				if (str.charAt(i) == chars.charAt(j)) {
					count++;
				}
				
			}
			}
		return count;
			
		
	}
	public static int smallestDigit(int num) {
		return 0;
	}
}