// this class specifies the main attributes and methods of the Trie Node.
public class TrieNode {
	public String letter;
	public TrieNode[] children;
	public TrieNode(String letter, int length) {
		this.letter = letter;
		children = new TrieNode[length];
		
	}
	
	
}
