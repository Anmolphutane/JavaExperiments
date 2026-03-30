package conn.Mypack;
import java.util.Scanner;
public class Multiplication_table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int square = number * number;
		System.out.println("Square of " + number + " is: " + square);
		System.out.println("Multiplication Table of " + number + ":");
		for(int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		sc.close();
		}
}













































