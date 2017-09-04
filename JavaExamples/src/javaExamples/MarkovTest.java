package javaExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import textgen.ListNode;

public class MarkovTest {

		static String str;
		
		private static List<ListNode> wordList = new LinkedList<ListNode>();
		
		// The starting "word"
		private static String starter;
		
		// The random number generator
		private static Random rnGenerator;
		
		
		public static void main(String[] args){
			
			//str = "hi how r u ? hope you are fine... ????";
			//str = "many??? Senteeeeeeeeeences are";
			//str = "%one%%two%%%three%%%%";
			//str = "one (1), two (2), three (3)";
			str = "This is This is";
			
			train(str);
		}
		
		
		public static void train(String sourceText)
		{
			
			System.out.println("- In train- sourceText.length => " + sourceText.length());
			
			if (sourceText.length() == 0) {
				System.out.println("There is no input string!");
			} else {
				String[] sourceWords = sourceText.split("[\\s]+");
				
				//System.out.println(" sourceWords.length is " + sourceWords.length);
				
				starter = sourceWords[0];
				
				System.out.println(" starter is => " + starter);
				
				String prevWord = starter;
				String w;
				ListNode node;
				
				System.out.println(" am here, sourceWords.length => " + sourceWords.length);
				
				for (int i = 1; i <= sourceWords.length; i++) {
					
					System.out.println(" am here123 ");
					
					if (i == sourceWords.length) {
						w = sourceWords[0];
						
						System.out.println(" - w ->" + w);
						
					} else {
						w = sourceWords[i];
					}
					
					//checks if there is a node with word
					
					node = findNode(prevWord);
					if (node == null) {
						
						System.out.println(" after findNode, node == null -- creating new ListNode ");
						
						node = new ListNode(prevWord);
						node.addNextWord(w);
						wordList.add(node);
					} else {
						node.addNextWord(w);
					}
					prevWord = w;
					
				}
			}
		}
		

		private static ListNode findNode(String word) {
			
			System.out.println(" in findNode, checking for Node with word => " + word);
			
			for (ListNode node : wordList) {
				if (word.equals(node.getWord())) {
					return node;
				}
			}
			return null;
		}

	
}
	
	
	/** Links a word to the next words in the list 
	 * You should use this class in your implementation. */
	class ListNode
	{
	    // The word that is linking to the next words
		private String word;
		
		// The next words that could follow it
		private List<String> nextWords;
		
		ListNode(String word)
		{
			this.word = word;
			nextWords = new LinkedList<String>();
			System.out.println(" - created new ListNode with word => " + word);	
		
		}
		
		public String getWord()
		{
			return word;
		}

		public void addNextWord(String nextWord)
		{
			nextWords.add(nextWord);
			
			System.out.println(" nextWord added => " + nextWord + " word is => " + word);
			
		}
		
		public String getRandomNextWord(Random generator)
		{
			// TODO: Implement this method
		    // The random number generator should be passed from 
		    // the MarkovTextGeneratorLoL class
			int size = nextWords.size();
			int index = generator.nextInt(size);
			
			
		    return nextWords.get(index);
		}

		public String toString()
		{
			String toReturn = word + ": ";
			for (String s : nextWords) {
				toReturn += s + "->";
			}
			toReturn += "\n";
			return toReturn;
		}
		
	}

