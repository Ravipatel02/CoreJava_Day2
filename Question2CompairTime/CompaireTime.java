package Question2CompairTime;

public class CompaireTime {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		String str = "";
		for(int i =0 ; i<10000 ; i++) {
			str += "a";
		}
		long endTime = System.nanoTime();
		
		long durationString = endTime - startTime;
		
		
		long startTimeBui = System.nanoTime();
		
		StringBuilder str1 = new StringBuilder();
		for(int i =0 ; i<10000 ; i++) {
			str1.append("a");
		}
		
		long endTimeBui = System.nanoTime();
		
		long durationTimeStringBuilder = endTimeBui - startTimeBui;
		
       long startTimeBuf = System.nanoTime();
		
		StringBuffer str2 = new StringBuffer();
		for(int i =0 ; i<10000 ; i++) {
			str1.append("a");
		}
		
		long endTimeBuf = System.nanoTime();
		
		long durationTimeStringBuffer = endTimeBuf - startTimeBuf;
		
		System.out.println("String time Duration :"+ durationString);
		System.out.println("StringBuilder time Duration :"+ durationTimeStringBuilder);
		System.out.println("StringBuffer time Duration :"+ durationTimeStringBuffer);
		
		
	}

}
