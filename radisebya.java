import java.util.*;

public class radisebya{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr = new int[a];
		for(i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}		 





/*int a = 5;
		int n = 1;
		for(int i = 1; i <= a; i++){
			n *= i;
			System.out.println(n);
		}
			int t = 8;
		boolean pros = true;
		for(int i = 2; i<=Math.sqrt(t); i++){
			if(t%i==0){
				pros = false;
				break;
			}
		}
		System.out.println(t+" is prime: "+pros);*/

		/*for(int i = 0; i <= 15; i++){
			if(i%2==0){
				continue;
			}System.out.println(i);
		}*/	

		/*Scanner scan = new Scanner(System.in);
		System.out.println("Your age: ");
		String age = scan.nextLine();
		switch(age){
			case "Zero" :
				System.out.println("you born");
				break;
			case "Seven" :
				System.out.println("u go to school");
				break;
			default:
				System.out.println("u good");
		}*/

		/*int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++){
			nums[i]=i*10;
			System.out.println(nums[i]);		

		}*/
		/*int[] str = new int[3];
		str[0] = 7;
		str[1] = 5;
		str[2] = 9;
		int a = 0;
		for(int s:str){
			a=a+s;
		}System.out.println(a);*/

		/*int[][] dvm = {{1,2,3},
					{4,5,6},
					{7,8,9}};
		for(int i = 0; i<dvm.length; i++){
			for(int j=0; j<dvm[i].length; j++){
				System.out.print(dvm[i][j] + " ");
			}
			System.out.println();
		}*/




		/*Person beka = new Person();
		 String s2 = "bikonai";
		 beka.setNameAndAge(s2,30);
		 
		 beka.speak();
		 beka.sayHello();
		 int yeaR = beka.calculateYearsToPensya();
		 System.out.println(yeaR);
	}
}
class Person{
	String name;
	int age;

	void setNameAndAge(String username, int userage){
		name = username;
		age = userage;
	}

	int calculateYearsToPensya(){
		int years = 65-age;
		return years;
	}

	void speak(){
		for(int i = 0; i<3; i++){
			System.out.println("My name is "+ name+", I'm "+ age);			
		}

	}
	void sayHello(){
		System.out.println("hello");
	}
}*/