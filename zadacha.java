import java.util.*;
//public class zadacha{
	//public static boolean isPerfectSquare(int num){
	//	if (num < 0){
	//		return false;
	//	}
	//	int sqrt =  (int) Math.sqrt(num);

	//	return sqrt*sqrt == num;
	//}

	//public static void main(String[] args) {
	//	int number = 24;
	//	boolean isPerfect = isPerfectSquare(number);
	//	System.out.println("Is " + number+ " a perfect perfect square? " + isPerfect);

	//}
	



	//public static void main(String[] args) {
	//	int num = 4;
	//	boolean isEven = isEven(num);
	//	System.out.println(isEven);
	//}
	//public static boolean isEven(int num){
	//	return num % 2 == 0;	
	//}
//
//
//
//	public static void main(String[] args) {
//		double a = 60;
//		double b = 1.80;
//		System.out.println(BMI);		
//	}
//	public static double calculateBMI(double BMI){
//		double BMI = a/ (b * b);

//	}
	
//}
public class Solution {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        int d = 5;
        if(a % b == 0 && a % c == 0 && a % d == 0){
            System.out.println(a+ "isdivisible by"+ 235);
        }
        else if(a % b == 0 && a % c == 0 && a % d != 0){
            System.out.println(a+ " isdivisible by 23, "+ "and not divisible by 5.");
        }
        else if(a % b == 0 && a % c != 0 && a % d != 0){
            System.out.println(a+ " isdivisible by 2, "+  "and not divisible by 5 nor by 3.");
        }
        else if(a % b != 0 && a % c != 0 && a % d == 0){
            System.out.println(a+ " isdivisible by 5, "+  "and not divisible by 2 nor by 3.");
        }
        else if(a % b != 0 && a % c == 0 && a % d != 0){
            System.out.println(a+ " isdivisible by 3, "+  "and not divisible by 2 nor by 5.");
        }
        else if(a % b != 0 && a % c == 0 && a % d == 0){
            System.out.println(a+ " isdivisible by 35, "+ "and not divisible by 2.");
        }
        else if(a % b == 0 && a % c != 0 && a % d == 0){
            System.out.println(a+ " isdivisible by 25, "+ "and not divisible by 3.");
        }
        else{
            System.out.println("MAYBE PRIME if it is not divisible by 2 or 3 or 5.");
        }
    }
}