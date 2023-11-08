package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int students = sc.nextInt();
		
		Set<Integer> courseA = new HashSet<>();
		
		for (int i=0; i<students; i++) {
			int student = sc.nextInt();
			courseA.add(student);
		}
		System.out.print("How many students for course B? ");
		students = sc.nextInt();
		
		Set<Integer> courseB = new HashSet<>();
		
		for (int i=0; i<students; i++) {
			int student = sc.nextInt();
			courseB.add(student);
		}
		System.out.print("How many students for course C? ");
		students = sc.nextInt();
		
		Set<Integer> courseC = new HashSet<>();
		
		for (int i=0; i<students; i++) {
			int student = sc.nextInt();
			courseC.add(student);
		}
		
		Set<Integer> totalStudents = new HashSet<>(courseA);
		totalStudents.addAll(courseB);
		totalStudents.addAll(courseC);
		
		System.out.println("Total students: " + totalStudents.size());
		
		sc.close();
	}

}
