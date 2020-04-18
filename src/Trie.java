import javax.swing.text.AsyncBoxView.ChildLocator;

// this class will be the place for all the methods and attributes of the Tire.
public class Trie {
	String ltrs;
	public TrieNode root;

	public Trie() {
		ltrs = "";
	}

	public Trie(String ltrs) {
		this.ltrs = ltrs;
	}

	public boolean contain(String s) {
		String[] tmp = new String[s.length()];
		for (int i = 0; i < root.children.length; i++) {
			tmp[i] = s.substring(i, i + 1);
		}
		if (isEqual(tmp, root.children))
			return true;
		else
			return false;

	}

	public static boolean isEqual(String[] a1, TrieNode[] a2) {
		boolean isEqual = true;
		if (a1.length != a2.length) {
			return false;
		} else {
			for (int i = 0; i < a1.length; i++) {
				for (int j = 0; j < a1.length; j++) {
					if (!a1[i].equalsIgnoreCase(a2[j].letter) && i == j) {
						isEqual = false;
					}
				}
			}
		}
		return isEqual;
	}

	public boolean isPrefix(String s) {
		return false;
	}

	public void insert(String s) {
		root = new TrieNode(s, s.length());
		for (int i = 0; i < s.length(); i++) {
			root.children[i] = new TrieNode(s.substring(i, i + 1), s.length());

		}
		for (int i = 0; i < root.children.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				root.children[i].children[j] = new TrieNode(s.substring(j, j + 1), s.length());
			}
		}
	}

	public void delete(String s) {

	}

	public boolean isEmpty() {
		return root == null;
	}

	public void clear() {
		root = null;
	}

	public int size() {
		int size = 0;
		if (!isEmpty()) {
			for (int i = 0; i < root.children.length; i++) {
				for (int j = 0; j < root.children[i].children.length; j++) {
					size++;
				}
			}
		}
		return size;
	}

	public String[] allWordsPrefix(String s) {
		return null;
	}

}
