import java.util.Scanner;

//public class sort {
//  public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("enter the size array: ");
//        int N = scanner.nextInt();
//
//        int[] arr = new int[N];
//
//        System.out.println("enter the elements:");
//        for (int i = 0; i < N; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        bubbleSort(arr);
//
//        System.out.println("sorted array:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//
//    static void bubbleSort(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//}
//}
//}
//
public class sort {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the size array: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];

        System.out.println("enter the elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();

        }
        selectionSort(arr);
        System.out.print("sorted array: ");
        for(int num: arr){
        	System.out.print(num+ " ");

        }
        System.out.println(" ");
        System.out.print("Enter the index to remove:");
        int index = scanner.nextInt();
        
        
    }
    static void selectionSort(int[] arr){
    	int n = arr.length;
    	for(int i = 0; i < n-1; i++){
    		int min = i;
    		for(int j = i+1; j < n; j++){
    			if(arr[j] < arr[min]){
    				min = j;
    			}
    		}
    		int value = arr[min];
    		arr[min] = arr[i];
    		arr[i] = value;
    	}
    }
}