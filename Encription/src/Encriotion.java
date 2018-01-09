import java.util.Scanner;

public class Encriotion {
	
	public static void main (String[] args) {
		int key = keyExchage();
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Are you Encrypting(1) or Decrypting(2)?");
			int state = input.nextInt();
			switch(state) {
			case 2:
				System.out.println("What is the message are you decrypting");
				String mesR = "";
				mesR = input.next();
				int[] cript = stringToIntAray(mesR);
				System.out.println("the message is: " + Decryptor(cript, key));
				break;
			case 1:
				System.out.println("What is the message would you like to encrypt?");
				String mes = input.nextLine();
				System.out.println("The encrypted message is:" + Encriptor(stringToInt(mes),key));
				break;
			}
		}
	}
	
	public static String Encriptor(int[] input, int key) {
		int[] output = new int[input.length];
		
		for(int i = 0; i < input.length; i++) {
			output[i] = input[i] * key;
		}
		return intToString(output);
	}
	
	public static String Decryptor(int[] input, int key) {
		int[] output = new int[input.length];
		
		for(int i = 0; i < input.length; i++) {
			output[i] = input[i] / key;
		}
		return arrayDisplay(output);
	}
	
	public static int[] stringToIntAray(String input) {
		int length = 0;
		String value = "";
		for(int n = 0; n < input.length(); n++) {
			if(input.charAt(n) == ',') {
				length++;
			}
		}
		int[] output = new int[length];
		
		int j = 0;
		for(int i = 0; i < output.length; i++) {
			while(input.charAt(j) != ',') {
				value += input.charAt(j);
				j++;
			}
			j++;
			output[i] = Integer.parseInt(value);
			value = "";
		}
		return output;
	}
	
	public static int[] stringToInt(String input) {
		int[] output = new int[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			output[i] = (int) input.charAt(i);
		}
		return output;
	}
	
	public static String intToString(int[] input) {
		String output = "";
		
		for(int i = 0; i < input.length; i++) {
			output += (char) input[i];
		}
		
		return output;
	}

	public static String arrayDisplay(int[] input) {
		String output = "";
		
		for(int i = 0; i < input.length; i++) {
			output += input[i] + ",";
		}
		return output;
	}

	public static int keyExchage() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the public vareable G?");
		int g = input.nextInt();
		
		System.out.println("What in the public vareable N?");
		int n = input.nextInt();
		
		int a = (int) (Math.random() * n);
		
		int ag = (int) Math.pow(a, g) % n;
		System.out.println("Send this number to your recever:" + ag);
		
		System.out.println("What number have you been sent");
		int bg = input.nextInt();
		
		int key = (int) (Math.pow(bg, a) % n);
		
		System.out.println("The key has been set");
		
		return key;
	}
}
