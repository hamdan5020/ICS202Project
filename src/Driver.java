// this class will be the driver of the project (method calls, Tire initializations, etc...) and will interact with the user
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) throws IOException {
		Scanner keyb = new Scanner(System.in);
		File dataBase = new File("words.txt");
		FileInputStream dct = new FileInputStream(dataBase);
		Scanner words = new Scanner(dct);
		System.out.println(words.next());
		Trie s = new Trie();
		s.insert("STOP");
		System.out.println(s.root.children.get(3).children);
		//System.out.println(s.isEmpty());
		//System.out.println(s.size());
		//System.out.println(s.contain("OP"));
		//s.clear();
		//System.out.println(s.isEmpty());
	}	

}
