package r.patterns;

import java.util.Scanner;

public class MainPtrn5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter value: ");
	int n = sc.nextInt();
	int k=1;
			for(int i= 1; i<=n; i++) {
				for
				(int j=1; j<=n;j++) {
					System.out.print(k%2+"");
					k++;
				}
		System.out.println();	
		}
}
}
