import java.util.Scanner;

public class Encription {
	int wheal1State = 0;
	int wheal2State = 0;
	int wheal3State = 0;
	char[] alfa = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	Scanner in = new Scanner(System.in);

	public void Main(String[] args) {
		System.out.println("Are you encodeing");
		boolean encode = in.nextBoolean();
		
		if (encode == true) {
			System.out.println("What would you like to encode");
			String words = in.nextLine();
		}
	}
	
	public int whealEncode(int ch, int wheal) {
		if (wheal == 1) {
			switch(wheal1State) {
			case 0: return ch + 3;
			case 1:	return ch + 5;
			case 2: return ch + 7;
			case 3: return ch + 13;
			case 4: return ch + 17;
			case 5:	return ch + 19;
			case 6: return ch + 23;
			case 7: return ch + 29;
			}
			if (wheal1State == 7) {
				wheal1State = 0;
			}else {
				wheal1State ++;
			}
		}else if (wheal == 2) {
			switch(wheal2State) {
			case 0: return ch + 3;
			case 1:	return ch + 5;
			case 2: return ch + 7;
			case 3: return ch + 13;
			case 4: return ch + 17;
			case 5:	return ch + 19;
			case 6: return ch + 23;
			case 7: return ch + 29;
			}
			if (wheal2State == 7) {
				wheal2State = 0;
			}else {
				wheal2State ++;
			}
		}else if (wheal == 3) {
			switch(wheal3State) {
			case 0: return ch + 3;
			case 1:	return ch + 5;
			case 2: return ch + 7;
			case 3: return ch + 13;
			case 4: return ch + 17;
			case 5:	return ch + 19;
			case 6: return ch + 23;
			case 7: return ch + 29;
			}
			if (wheal3State == 7) {
				wheal3State = 0;
			}
			wheal3State ++;
		}
		return (int) Math.random() * 27;
		
	}
	
	public int whealDecode(int ch, int wheal) {
		if (wheal == 1) {
			switch(wheal1State) {
			case 0: return ch - 3;
			case 1:	return ch - 5;
			case 2: return ch - 7;
			case 3: return ch - 13;
			case 4: return ch - 17;
			case 5:	return ch - 19;
			case 6: return ch - 23;
			case 7: return ch - 29;
			}
			if (wheal1State == 7) {
				wheal1State = 0;
			}else {
				wheal1State ++;
			}
		}else if (wheal == 2) {
			switch(wheal2State) {
			case 0: return ch - 3;
			case 1:	return ch - 5;
			case 2: return ch - 7;
			case 3: return ch - 13;
			case 4: return ch - 17;
			case 5:	return ch - 19;
			case 6: return ch - 23;
			case 7: return ch - 29;
			}
			if (wheal2State == 7) {
				wheal2State = 0;
			}else {
				wheal2State ++;
			}
		}else if (wheal == 3) {
			switch(wheal3State) {
			case 0: return ch - 3;
			case 1:	return ch - 5;
			case 2: return ch - 7;
			case 3: return ch - 13;
			case 4: return ch - 17;
			case 5:	return ch - 19;
			case 6: return ch - 23;
			case 7: return ch - 29;
			}
			if (wheal3State == 7) {
				wheal3State = 0;
			}else {
				wheal3State ++;
			}
		}
		return (int) Math.random() * 27;
		
	}
	
	public char intToChar(int ch) {
		ch = ch % 27;
		return alfa[ch];	
	}
	
	public int charToInt(char ch) {
		for(int i = 0; i < alfa.length; i++) {
			if (ch == alfa[i]) {
				return alfa[i];
			}
		}
		return alfa[7];
	}
	
	public char PlugBoard (char ch, char[][] plugBoard) {
		for (int i = 0; i > plugBoard.length;i++) {
			if (ch == plugBoard[i][0]) {
				return plugBoard[i][0];
			}else if (ch == plugBoard[i][1]) {
				return plugBoard[i][1];
			}
		}
		return ch;
	}
	
}