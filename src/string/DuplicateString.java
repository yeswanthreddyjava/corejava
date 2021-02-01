package string;

public class DuplicateString {
	public static void main(String[] args) {
		String str = "KYeswanthReddy";
		
		String findStr = "e";
		int lastIndex = 0;
		int count = 0;
		
		while(lastIndex!=-1){
			lastIndex = str.indexOf(findStr, lastIndex);
			
			if(lastIndex!=-1){
				count++;
				lastIndex = lastIndex+findStr.length();
			}
		}
		System.out.println(count);
	}
}
