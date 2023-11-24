import java.util.*;
import java.util.ArrayList;

	

public class Meiirbek_Sagimbay_230103149{
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<String> studentName = new ArrayList<>();
	public static ArrayList<Integer> studentId = new ArrayList<>();
	public static ArrayList<Integer> studentGrade = new ArrayList<>();


	public static int count = 0;


	public static void main(String[] args) {

		String username = "Meirbek";
		String password = "M123";
		System.out.print("Enter Username: ");
		String a = scan.nextLine();
		if (a.equals(username)){
			System.out.print("Enter Pasword: ");
			String b = scan.nextLine();
			if (b.equals(password)){
				menu();
				
			} else{
				System.out.println("Invalid Password");

			}
		} else{
			System.out.println("Invalid Username");
		}
		
		

	}
	public static void menu(){
		System.out.println("Main Menu");
		System.out.println("1. Add Student");
		System.out.println("2. Manage Records");
		System.out.println("3. Calculate Grades");
		System.out.println("4. View Statistics");
		System.out.println("5. Generate Reports");
		System.out.println("6. Delete Student");
		System.out.println("7. Logout and exit");

		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		switch(choice){
			case 1:
				AddStudent();
				break;
			case 2:
				ManageRecords();
				break;
			case 3:
				CalculateGrades();
				break;
			case 4:
				ViewStatistics();
				break;
			case 5:
				GenerateReports();
				break;
			case 6:
				DeleteStudent();
				break;
			case 7:
				System.exit(0);
		}
	}

	public static void AddStudent() {
    System.out.print("Enter student name: ");
    scan.nextLine();
    String name = scan.nextLine();

    int id;
    do {
        System.out.print("Enter student ID: ");
        id = scan.nextInt();
        if (studentId.contains(id)) {
            System.out.println("ID already exists. Please enter a unique ID.");
        }
    } while (studentId.contains(id));

    int grade;
    do {
        System.out.print("Enter student score (between 0 and 100): ");
        grade = scan.nextInt();
        if (grade < 0 || grade > 100) {
            System.out.println("Grade should be between 0 and 100.");
        }
    } while (grade < 0 || grade > 100);

    System.out.println("Student added successfully.");

    studentName.add(name);
    studentId.add(id);
    studentGrade.add(grade);
    count++;
    menu();
}



	public static void ManageRecords(){
		System.out.print("Enter student ID to edit: ");
		int id = scan.nextInt();
		int idm = studentId.indexOf(id);
		if (idm!=-1){
			System.out.print("Enter new test score: ");
			int grade = scan.nextInt();
			System.out.println("Student record updated succesfully.");
			studentGrade.set(idm, grade);
		}
		

		
		


		menu();
	}

	public static void CalculateGrades(){
		System.out.println("Grades Calculated");
		System.out.println("Grades Details Added");
		menu();
	}

	public static void ViewStatistics(){
		System.out.println("Total students: " + count);
		int total = 0;
		for (int grade : studentGrade){
			total += grade;
		}
		double ave = (double)total/count;
		System.out.println("Average Score: " + ave);

		int max=-1;
		for (int i = 0; i < studentGrade.size(); i++){
			if(studentGrade.get(i)>max){
				max=studentGrade.get(i);
			}
		}
		System.out.println("Highest Score: " + max);

		int min = 100;
		for (int i = 0; i<studentGrade.size(); i++){
			if(studentGrade.get(i)<min){
				min = studentGrade.get(i);
			}
		}
		System.out.println("Lowest Score: " + min);
		menu();
	}

	public static void GenerateReports(){
		System.out.print("Enter student ID to generate a report: ");
		int id = scan.nextInt();
		System.out.print("Generating report for student with ID");
		int idr = studentId.indexOf(id);
		if (idr!= -1){
			System.out.println("Student Report");
			System.out.println("Name: " + studentName.get(idr));
			System.out.println("Student ID: " + studentName.get(idr));
			System.out.println("Test score: " + studentGrade.get(idr));
			char b;
			int a = studentGrade.get(idr);
			if (a>=90){
				b = 'A';
			} else if (a>=80){
				b = 'B';
			} else if (a>=70){
				b = 'C';
			} else if (a>=50){
				b = 'D';
			} else {
				b = 'F';
			}
			System.out.println("Final Grade: " + b );
			}
		menu();
	}
	public static void DeleteStudent(){
		System.out.print("Enter student ID to delete: ");
		int id = scan.nextInt();
		int idd = studentId.indexOf(id);
		if (idd!=-1){
			studentName.remove(idd);
			studentId.remove(idd);
			studentGrade.remove(idd);

			count--;
			System.out.println("Student deleted successfully.");
			menu();
		}
		


	}


	
}
