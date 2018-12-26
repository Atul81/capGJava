package hronlinr;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;
	protected String firstName;
	protected String lastName;
	protected Integer id;
	int count = 0;

	public Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = identification;
	}

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here
	public String calculate() {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.testScores.length; i++) {
			count += this.testScores[i];
		}
		count = count / this.testScores.length;
		if (count >= 90 && count <= 100)
			return "O";
		else if (count >= 80 && count < 90)
			return "E";
		else if (count >= 70 && count < 80)
			return "A";
		else if (count >= 55 && count < 70)
			return "P";
		else if (count >= 40 && count < 50)
			return "D";
		else
			return "T";
	}

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	// Write your method here
}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}