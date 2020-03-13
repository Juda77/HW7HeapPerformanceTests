import java.util.concurrent.TimeUnit;
public class MaxHeapPerformanceTest {
	
	
	public static void main(String[] args) {
		
		
		int[] performanceTestSizes = {1, 100, 1000, 10000, 1000000, 10000000};

		boolean wantNLogNBuild = false; //if true, display O(nlogn) method build times. If false, display O(n) method build times
		
		//*****PERFORMANCE TEST CODE
				
		
		for (int i = 0; i < performanceTestSizes.length; i++) {
			
			Integer[] testArray = new Integer[performanceTestSizes[i]];
			for (int j = 0; j < testArray.length; j++) {		
				testArray[j] = j;
			}
			MaxHeap testHeap = new MaxHeap(testArray.length);
			long startTime = System.nanoTime();
			
			if (wantNLogNBuild == true) {
				testHeap.MaxHeapLogN(testArray);
			} else {
				testHeap.MaxHeapN(testArray);
			}
			long endTime = System.nanoTime();
		    long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
		    System.out.println("nlogn build for size: " + performanceTestSizes[i] + " --> " + durationInMillis + " millis");
			
			
		}
		
	
		
	}

}
