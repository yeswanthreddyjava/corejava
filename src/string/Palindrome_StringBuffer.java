package string;

public class Palindrome_StringBuffer{
	public static void main(String[] args) {
		String name = "Madam";
		
		StringBuffer sb1 = new StringBuffer(name);
		StringBuffer sb2 = new StringBuffer(sb1);
		sb2.reverse();
		
		if(String.valueOf(sb1).compareToIgnoreCase(String.valueOf(sb2)) == 0){
			System.out.println("Palindorme");
		} else {
			System.out.println("Not Palindrome");
		}
		
	}
}