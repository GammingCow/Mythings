import java.io.FileInputStream;
import java.io.IOException;

public class FileIOTest {
	public static void main(String[] args) {
		FileInputStream puzle;
		FileInputStream dict;
		try {
			puzle = new FileInputStream("Puzle.txt");
			dict = new FileInputStream("dict.txt");
			
			
		}catch(IOException ex){
			System.out.println("File not Found" + ex);
		}
		
		
	}
}
