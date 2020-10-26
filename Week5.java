import java.util.Scanner;
import java.io.*;
import hsa_ufa.Console;

public class Week5 {
	static Console c = new Console();
	public static void main(String[] args) {
		
		String text;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		text = in.nextLine();
		System.out.println("You entered: " + text);
		c.print("Enter your favorite computer part: ");
		String part = c.readLine();
		c.print("Cool! " + text + " likes " + part);

	}
}
