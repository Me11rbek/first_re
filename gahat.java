import java.util.*;
import java.util.ArrayList.*;

public class lesson{
//	public static void main(String[] args){
//		int[] numbers = {3, 8, 12, 7, 2};
//		System.out.println("Enter the number of elements in the array: "+ numbers.length);
//		
//		for(int i = 0; i < numbers.length; i++){
//			System.out.println(numbers[i]);
//
//		}
//			System.out.println(ArrayElements);
//	}
//}
	// public static void main(String[] args) {
	// 	int[] numbers = {8, 12, 9, 19, 4};
	// 	int max =  numbers[0];
	// 	for(int i = 1; i < numbers.length; i++){
	// 		if (numbers[i]>max){
	// 			max = numbers[i];
	// 		}
	// 	}
	// 	System.out.println("maximum: " +max);
	// }
	public static void main(String[] args) {
		int[] numbers = {5, 2, 9, 1, 5};
		int n = numbers.length;
		for(int i = n-1; i>=0; i--){
			System.out.println(numbers[i]+" ");
		}
	}

}
