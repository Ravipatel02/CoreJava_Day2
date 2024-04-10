package Question4;

public class MoreEfficiance {
	
	public static void main(String[] args) {
		String str = "ravipatel";
		String ans = reverseString(str);
		System.out.println(ans);
		String ans1 =reverseStringWithStringBuilder(str);
		System.out.println(ans1);
		
		String ans2 = reverseStringWithStringBuffer(str);
		System.out.println(ans2);
		
		
	}
	
	public static String reverseString(String str) {
	    String reversedString = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
	        reversedString += str.charAt(i);
	    }
	    return reversedString;
	}
	
	public static String reverseStringWithStringBuilder(String str) {
	    StringBuilder reversedStringBuilder = new StringBuilder(str);
	    return reversedStringBuilder.reverse().toString();
	}
	
	public static String reverseStringWithStringBuffer(String str) {
	    StringBuffer reversedStringBuffer = new StringBuffer(str);
	    return reversedStringBuffer.reverse().toString();
	}

}
