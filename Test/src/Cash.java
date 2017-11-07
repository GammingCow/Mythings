
import java.util.*;
public class Cash {

	public static void main(String[] args) {
		int cash = 0;
		Scanner input = new Scanner(System.in);
		
		cash = input.nextInt();
		printArray(whatCoin(cash));
		
	}
	public static int[] whatCoin(int cash) {
		int[] denom = {25,10,5,1};
		int[] result = {0,0,0,0};
		
		for(int i = 0; i < denom.length; i++) {
			result[i] =  (int) (cash / denom[i]);
			cash -= (int) (cash / denom[i]);
			i++;
		}
		return result;
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
