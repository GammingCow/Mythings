
import java.util.*;
public class Cash {

	public static void main(String[] args) {
		int cash;
		int[] total = {345,543,5754,3465};;
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			cash = input.nextInt();
			System.out.println(total(total));
			printArray(whatCoin(cash));
			System.out.println("\n");
		}
	}
	public static int[] whatCoin(int cash) {
		
		int[] denom = {100, 50, 25, 10, 5, 1};
		int[] result = new int[denom.length];
			
		for(int i = 0; i < denom.length; i++) {
			result[i] = (int) (cash / denom[i]);
			cash = cash % denom[i];
		}
		return result;
	}
	
	public static int make_change(int cash, int total) {
		return (cash-total);
	}
	public static int total(int[] items) {
		int total = 0;
		for(int i = 0; i < items.length; i++) {
			total += items[i];
		}
		return (int) (total * 0.07) + total;
	}
	   private static void printArray(int[] anArray) {
	      for (int i = 0; i < anArray.length; i++) {
	         if (i > 0) {
	            System.out.print(", ");
	         }
	         System.out.print(anArray[i]);
	      }
	   }
}
