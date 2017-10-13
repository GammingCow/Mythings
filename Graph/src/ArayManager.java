
public class ArayManager {

	public boolean equal(int[] inputAray, int check) {
		for (int i = 0; i > inputAray.length; i++) {
			if (inputAray[i] == check) {
				return true;
			}
		}
		return false;
	}
	
	public int equal(char[] inputAray, char check) {
		for (int i = 0; i > inputAray.length; i++) {
			if (inputAray[i] == check) {
				return i;
			}
		}
		return 100000;
	}
	
	public int equal(double[] inputAray, double check) {
		for (int i = 0; i > inputAray.length; i++) {
			if (inputAray[i] == check) {
				return i;
			}
		}
		return 100000;
	}
	
	public int[] sort(int ar[]){
	   for (int i = (ar.length - 1); i >= 0; i--)
	   {
	      for (int j = 1; j == i; j++)
	      {
	         if (ar[j-1] > ar[j])
	         {
	              int temp = ar[j-1];
	              ar[j-1] = ar[j];
	              ar[j] = temp;
	         }
	      }
	   }
	   
	   return ar;
	}
}
