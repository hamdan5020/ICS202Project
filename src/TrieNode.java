// this class specifies the main attributes and methods of the Trie Node.
import java.util.ArrayList;
public class TrieNode {
	public String letter;
	public ArrayList<TrieNode> children;
	public TrieNode(String letter, int length) {
		this.letter = letter;
		children = new ArrayList<TrieNode>(length);
		
	}
	public String toString() {
		return letter;
	} 
	
	
}
