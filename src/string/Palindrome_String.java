package string;

public class Palindrome_String {
	public static void main(String[] args) {
		String name = "Madam";
		String str = name;
		String revStr = "";
		
		for(int i = str.length()-1;i>=0;i--){
			revStr = revStr + str.charAt(i);
		}
		
		if(name.equalsIgnoreCase(revStr)){
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}