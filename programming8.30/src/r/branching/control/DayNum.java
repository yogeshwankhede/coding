package r.branching.control;
import java.util.Scanner;
public class DayNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day number: ");
		int d = sc.nextInt();
		if(d == 1)
			System.out.println("Sunday");
		else if(d == 2)
			System.out.println("Monday");
		else if(d == 3)
			System.out.println("Tuesday");
		else if(d == 4)
			System.out.println("Wednsday");
		else if(d == 5)
			System.out.println("Thursday");
		else if(d == 6)
			System.out.println("Friday");
		else if(d == 7)
			System.out.println("Saturday");
	}

}
