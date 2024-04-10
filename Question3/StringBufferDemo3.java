package Question3;

public class StringBufferDemo3 {
	
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		int threadNum = 3;
		
		Thread[] thread = new Thread[threadNum];
		
		for(int i = 0 ; i< threadNum ; i++) {
			thread[i] = new Thread(new AlphawateConecter(buffer , (char)('A'+i)));
			thread[i].start();
		}
		  for (Thread thread1 : thread) {
	            try {
	                thread1.join();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        // Print the final contents of the buffer
	        System.out.println("Final StringBuffer contents: " + buffer.toString());
	}

}

class AlphawateConecter implements Runnable {
	
	private final StringBuffer buffer ;
	private final char alphawate;
	
	AlphawateConecter(StringBuffer buffer , char alphawate) {
		this.buffer = buffer;
		this.alphawate = alphawate;
	}
	

	@Override
	public void run() {
		synchronized (buffer) {
			for(int i =0 ; i<1000 ; i++) {
				buffer.append(alphawate);
			}
		}
		
	}
	
}
