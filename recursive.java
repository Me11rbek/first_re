import java.util.*

public class recursive{
	public static int sumNum(int n){
		System.out.println("Enter a positive integer (n): "+ n)
		if (n<=0){
			return 0:
		}else{
			return n +sumNum(n-1);
		}
	}
	public static void main(String[] args) {
		int n = 5;
		int result = sumNum;
		System.out.println("Sum of numbers from 1 to "+ n +"is: "+ sumNum);
	}
}