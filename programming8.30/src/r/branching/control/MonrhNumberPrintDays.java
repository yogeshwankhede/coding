package r.branching.control;
import java.util.Scanner;
public class MonrhNumberPrintDays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(System.in);
	int m = sc.nextInt();
	System.out.println("Enter the month number: ");
	 
	if ( m==1 || m==3 || m==5 || m==7 ||m==8|| m==10|| m==12)
		System.out.println("31 days ");
	else if(m==4 || m==6|| m==9||m==11)
	System.out.println("30 days ");
	else if(m==2)
		System.out.println(" 28 0r 29 ");
	else
		System.out.println("invalid month number ");
	
}

}