package application;

import java.util.Locale;
import java.util.Scanner;

import etities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Student student = new Student();
		
		System.out.println("ENTER STUDENT NAME: ");
		student.name = sc.nextLine();
		System.out.println("ENTER FIRST GRADE: ");
		student.grade1 = sc.nextDouble();
		System.out.println("ENTER SECOND GRADE: ");
		student.grade2 = sc.nextDouble();
		System.out.println("ENTER THIRD GRADE: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f\n", student.finalGrade());
		
		if (student.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
