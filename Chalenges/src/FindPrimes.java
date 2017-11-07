import java.util.Scanner;

public class FindPrimes {

	public static void main(String[] args) {
		int N = 0;
		int f = 0;
		Scanner input;
		input = new Scanner(System.in);
		N = input.nextInt();
		
		for(int i = 1; i < N; i++) {
			if(isPrime(2 * i - 1)) {
				System.out.print(i + ", ");
			}
	}
}
	public static boolean isPrime(int N) {
		for(int i = 2; i <= N; i++) {
			if(N % i == 0) {
				return false;
			}
		}
		return true;
	}
}