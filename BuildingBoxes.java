package defaultpackage;

import java.util.Arrays;

//#1739
public class BuildingBoxes {

	public static void main(String[] args) {
//		for (int n = 1; n<=1000000000; n++) {
//			System.out.println(n + ": " + minimumBoxes(n));
//		}
		
		int a = minimumBoxes(1000000000);
	}

	public static int minimumBoxes(int n) {

//		1 -> 1
//		2 -> 2
//		3 -> 3,4
//		4 -> 5
//		5 -> 6,7
//		6 -> 8,9,10
//		7 -> 11
//		8 -> 12,13
//		9 -> 14,15,16
//		10 -> 17,18,19,20
		int rowCapacity = 1; // different possible total boxes for each row/# of elements on floor
		int maxRowCapacity = 1;
		int rowNumber = 0; // each row represents the number of elements on floor
		
		int ctr = 0; //shouldn't make it to final code, just to see order
		while (n > 0) {
			rowNumber++;
			// System.out.println(rowNumber);
			n = n - rowCapacity;
			if (rowCapacity == maxRowCapacity) {
				rowCapacity = 1;
				maxRowCapacity++;
			} else
				rowCapacity++;
			
			ctr++;
			//System.out.println("counter: " + ctr + " n=" + n + " - row capacity: " + rowCapacity);
		}

		System.out.println(rowNumber);
		return rowNumber;
	}

}
