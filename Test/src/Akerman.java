
public class Akerman {
	
	public void Main(String[] args) {
		for(int a = 0; a > 6; a++) {
			for(int b = 0; b > 6; b++) {
				System.out.println("Ackerman of " + a + "/" + b + "=" + ack(a,b));
			}
		}
	}
	
	public int ack(int m, int n) {
		if(m == 0) {
			return n + 1;
		}else if (n == 0) {
			return ack(m-1, 1);
		}else {
			return ack(m - 1, ack(m, n - 1));
		}
	}

}
