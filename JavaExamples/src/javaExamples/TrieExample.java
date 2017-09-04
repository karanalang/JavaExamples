package javaExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import spelling.Dictionary;


public class TrieExample {

	static AutoCompleteDictionaryTrie emptyDict;
	static AutoCompleteDictionaryTrie smallDict;
	static AutoCompleteDictionaryTrie largeDict;
	
public static void main(String[] args){
	
	emptyDict = new AutoCompleteDictionaryTrie();
	smallDict = new AutoCompleteDictionaryTrie();
	largeDict = new AutoCompleteDictionaryTrie();

	smallDict.addWord("Hello");
	smallDict.addWord("HElLo");
	smallDict.addWord("help");
	smallDict.addWord("he");
	smallDict.addWord("hem");
	smallDict.addWord("hot");
	smallDict.addWord("hey");
	smallDict.addWord("a");
	smallDict.addWord("subsequent");
	
}

public static void loadDictionary(Dictionary d, String filename)
{
    // Dictionary files have 1 word per line
    BufferedReader reader = null;
    try {
        String nextWord;
        reader = new BufferedReader(new FileReader(filename));
        while ((nextWord = reader.readLine()) != null) {
            d.addWord(nextWord);
        }
    } catch (IOException e) {
        System.err.println("Problem loading dictionary file: " + filename);
        e.printStackTrace();
    }
    
}


}


/** 
 * Represents a node in a Trie
 * @author UC San Diego Intermediate Programming MOOC Team
 *
 */
class TrieNode {
	private HashMap<Character, TrieNode> children; 
	private String text;  // Maybe omit for space
	private boolean isWord;
	
	/** Create a new TrieNode */
	public TrieNode()
	{
		children = new HashMap<Character, TrieNode>();
		text = "";
		isWord = false;
	}
	
	/** Create a new TrieNode given a text String to store in it */
	public TrieNode(String text)
	{
		this();
		this.text = text;
	}
	
	/** Return the TrieNode that is the child when you follow the 
	 * link from the given Character 
	 * @param c The next character in the key
	 * @return The TrieNode that character links to, or null if that link
	 *   is not in the trie.
	 */
	public TrieNode getChild(Character c)
	{
		return children.get(c);
	}
	
	/** Inserts this character at this node.
	 * Returns the newly created node, if c wasn't already
	 * in the trie.  If it was, it does not modify the trie
	 * and returns null.
	 * @param c The character that will link to the new node
	 * @return The newly created TrieNode, or null if the node is already 
	 *     in the trie.
	 */
	public TrieNode insert(Character c)
	{
		if (children.containsKey(c)) {
			return null;
		}
		
		TrieNode next = new TrieNode(text + c.toString());
		children.put(c, next);
		return next;
	}
	
	/** Return the text string at this node */
    public String getText()
	{
		return text;
	}
	
    /** Set whether or not this node ends a word in the trie. */
	public void setEndsWord(boolean b)
	{
		isWord = b;
	}
	
	/** Return whether or not this node ends a word in the trie. */
	public boolean endsWord()
	{
		return isWord;
	}
	
	/** Return the set of characters that have links from this node */
	public Set<Character> getValidNextCharacters()
	{
		return children.keySet();
	}

}


class AutoCompleteDictionaryTrie {

    private TrieNode root;
    private int size;
    

    public AutoCompleteDictionaryTrie()
	{
		root = new TrieNode();
		size = 0;
	}
	
	
	/** Insert a word into the trie.
	 * For the basic part of the assignment (part 2), you should ignore the word's case.
	 * That is, you should convert the string to all lower case as you insert it. */
	/*
	 * Start from the TrieNode root,
	 * navigate  
	 * */
    
    public boolean addWord(String word)
	{
	    //TODO: Implement this method.
		String wordToAdd = word.toLowerCase();
		TrieNode node = root;
		for(int i =0;i<wordToAdd.length();i++)
		{
			char c = wordToAdd.charAt(i);
			if (node.getValidNextCharacters().contains(c)) {
				node = node.getChild(c);
			} else {
				node = node.insert(c);
			}
		}
		if (!node.endsWord()) {
			node.setEndsWord(true);
			size++;
			return true;
		}
		return false;
	}
	
	/** 
	 * Return the number of words in the dictionary.  This is NOT necessarily the same
	 * as the number of TrieNodes in the trie.
	 */
	public int size()
	{
	    //TODO: Implement this method
		return size;
	    //return 0;
	}
	
	
	/** Returns whether the string is a word in the trie */
	//@Override
	public boolean isWord(String s) 
	{
	    // TODO: Implement this method
		String sToCheck = s.toLowerCase();
		TrieNode node = root;
		for (int i = 0; i < sToCheck.length(); i++) {
			char c = sToCheck.charAt(i);
			if (node.getValidNextCharacters().contains(c)) {
				node = node.getChild(c);
			} else {
				return false;
			}
		}
		if (node.endsWord()) {
			return true;
		}
		return false;
	}

	/** 
	 *  * Returns up to the n "best" predictions, including the word itself,
     * in terms of length
     * If this string is not in the trie, it returns null.
     * @param text The text to use at the word stem
     * @param n The maximum number of predictions desired.
     * @return A list containing the up to n best predictions
     */
	//@Override
     public List<String> predictCompletions(String prefix, int numCompletions) 
     {
    	 // TODO: Implement this method
    	 // This method should implement the following algorithm:
    	 // 1. Find the stem in the trie.  If the stem does not appear in the trie, return an
    	 //    empty list
    	 // 2. Once the stem is found, perform a breadth first search to generate completions
    	 //    using the following algorithm:
    	 //    Create a queue (LinkedList) and add the node that completes the stem to the back
    	 //       of the list.
    	 //    Create a list of completions to return (initially empty)
    	 //    While the queue is not empty and you don't have enough completions:
    	 //       remove the first Node from the queue
    	 //       If it is a word, add it to the completions list
    	 //       Add all of its child nodes to the back of the queue
    	 // Return the list of completions
    	 
    	 String prefixToCheck = prefix.toLowerCase();
    	 List<String> result = new LinkedList<String>();
    	 TrieNode node = root;
    	 for (int i = 0; i < prefixToCheck.length(); i++) {
    		 char c = prefixToCheck.charAt(i);
    		 if (node.getValidNextCharacters().contains(c)) {
 				node = node.getChild(c);
 			} else {
 				return result;
 			}
    	 }
    	 int count = 0;
    	 if (node.endsWord()) {
    		 result.add(node.getText());
    		 count++;
    	 }
    	 
    	 List<TrieNode> nodeQueue = new LinkedList<TrieNode>();
    	 List<Character> childrenC = new LinkedList<Character>(node.getValidNextCharacters());
    	 
    	 for (int i = 0; i < childrenC.size(); i++) {
    		 char c = childrenC.get(i);
    		 nodeQueue.add(node.getChild(c));
    	 }
    	 while (!nodeQueue.isEmpty() && count < numCompletions) {
    		 TrieNode tn = nodeQueue.remove(0);
    		 if (tn.endsWord()) {
    			 result.add(tn.getText());
    			 count++;
    		 }
    		 
    		 List<Character> cs = new LinkedList<Character>(tn.getValidNextCharacters());
        	 for (int i = 0; i < cs.size(); i++) {
        		 char c = cs.get(i);
        		 nodeQueue.add(tn.getChild(c));
        	 }
    	 }
         return result;
    	 
    	 
     }

 	// For debugging
 	public void printTree()
 	{
 		printNode(root);
 	}
 	
 	/** Do a pre-order traversal from this node down */
 	public void printNode(TrieNode curr)
 	{
 		if (curr == null) 
 			return;
 		
 		System.out.println(curr.getText());
 		
 		TrieNode next = null;
 		for (Character c : curr.getValidNextCharacters()) {
 			next = curr.getChild(c);
 			printNode(next);
 		}
 	}
 	

	
}

