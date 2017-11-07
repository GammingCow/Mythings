
public class FindPi {

	public static void main(String[] args) {
		float Pi = 0;
		int N = 100;
		
		for(int i = 1; i < N; i++) {
			if (i % 2 == 1) {
				Pi += 1/(i*2) - 1;
			}else {
				Pi -= 1/(i*2) - 1;
			}
			System.out.println("Pi at the " + i + "Th genaration is" + (Pi * 4));
		}
	}
}
