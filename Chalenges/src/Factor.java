import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		
		int a = 0;
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.println("What number would you like to factor");
		a = input.nextInt();
		
		System.out.print("The fators of " + a + " are: ");
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				System.out.print(i + ", ");
			}
		}
	}
	
	public static boolean isPrime(int N) {
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				return false;
			}
		}
		return true;
	}
}