package com.objectOriented;
import java.util.Scanner;

class Student {
	private String studentName;
	private String courseName;
	private static Scanner scan = new Scanner(System.in);
	
	public void acceptDetails() {
		System.out.println("enter student name : ");
		this.studentName = scan.nextLine();
		System.out.println("enter course name : ");
		this.courseName = scan.nextLine();
		
	}
	
	public void displayDetails() {
		System.out.println("---------Student information-----------");
		System.out.println("student name " + this.studentName);
		System.out.println("student course " +  this.courseName);
		
		}
}
class marks extends Student {
	
	private float objectiveMarks;
	private float subjectiveMarks;
	private static Scanner scan = new Scanner(System.in);
	
	public void getDetails() {
		System.out.println("enter student name : ");
		this.objectiveMarks = scan.nextFloat();
		System.out.println("enter course name : ");
		this.subjectiveMarks = scan.nextFloat();
		
	}
	
	public void putDetails() {
		System.out.println("---------Student information-----------");
		System.out.println("student name " + this.objectiveMarks);
		System.out.println("student course " +  this.subjectiveMarks);
		
		}
}
public class Inheritance {

	public static void main(String[] args) {
		
		marks marks = new marks();
		marks.acceptDetails();
		marks.displayDetails();
		marks.getDetails();
		marks.putDetails();
		
		

	}

}
