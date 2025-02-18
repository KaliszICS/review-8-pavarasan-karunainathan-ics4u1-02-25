public class PracticeProblem {

	public static String pluralize(String word){
		if(word.toLowerCase().endsWith("ey")){
			return "eys";
		}else if(word.toLowerCase().endsWith("y")){
			return "ies";
		}else if(word.toLowerCase().endsWith("ife")){
			return "ives";
		}else{
			return "s";
		}
	}

	public static int min(int num1, int num2, int num3){
		return Math.min(Math.min(num1, num2), num3);
	}

	public static boolean isLeapYear(int year){
		if(year % 400 == 0){
			return true;
		}else if(year % 100 == 0){
			return false;
		}else if(year % 4 == 0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String args[]) {
		
	}

}
