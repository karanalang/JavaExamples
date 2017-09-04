package javaExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import textgen.ListNode;

//import textgen.ListNode;

public class RegEx {

	static String str;
	
	private static List<ListNode> wordList; 
	
	// The starting "word"
	private static String starter;
	
	// The random number generator
	private static Random rnGenerator;
	
	
	public static void main(String[] args){
		
		//str = "hi how r u ? hope you are fine... ????";
		//str = "many??? Senteeeeeeeeeences are";
		//str = "%one%%two%%%three%%%%";
		//str = "one (1), two (2), three (3)";
		str = "This is a sentence.";
		
//		getNumSentences();
//		getNumWords();
//		getNumSyllables();
//		useSplit();
		
		//splitSentence();
		
		train(str);
	}
	
	
	public static void train(String sourceText)
	{
		// TODO: Implement this method
		
		System.out.println("- In train- sourceText.length " + sourceText.length());
		
		if (sourceText.length() == 0) {
			System.out.println("There is no input string!");
		} else {
			String[] sourceWords = sourceText.split("[\\s]+");
			starter = sourceWords[0];
			
			System.out.println(" starter is " + starter);
			
			String prevWord = starter;
			String w;
			ListNode node;
			for (int i = 1; i <= sourceWords.length; i++) {
				if (i == sourceWords.length) {
					w = sourceWords[0];
					
					System.out.println(" - w -" + w);
					
				} else {
					w = sourceWords[i];
				}
				
				node = findNode(prevWord);
				if (node == null) {
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
		for (ListNode node : wordList) {
			if (word.equals(node.getWord())) {
				return node;
			}
		}
		return null;
	}
	
	public static void splitSentence(){
		System.out.println(" words is " + str.split("[\\s]+"));
		
		//split by space
		String[] words = str.split("[\\s]+");
		
		for(int i=0;i<words.length;i++)
			System.out.println(words[i]);
		
	}
	
	
	
	public static int getNumSentences()
	{
		List<String> numSentences = getTokens("[^.?!]+");
		
		System.out.println(" Number of sentences is => " + numSentences.size());
		
//		for(int i=0;i<numSentences.size();i++)
//			System.out.println(numSentences.get(i));
		
		return numSentences.size();
	}
	
	
	public static int getNumWords()
	{
		List<String> numWords = getTokens("[a-zA-Z]+");
		
		System.out.println(" Number of words is => " + numWords.size());
		
//		for(int i=0;i<numWords.size();i++)
//			System.out.println(numWords.get(i));
		
		return numWords.size();
		
	}
	
	
	public static int getNumSyllables()
	{
		List<String> numSyllables = getTokens("[aeiouyAEIOUY]+");
		
		System.out.println(" Number of syllables is => " + numSyllables.size());
		
		int totalNumSyllbles = numSyllables.size();
		
	
		
		//Total Number of syllables - number of times where last letter is e
		
		for(int i=0;i<numSyllables.size();i++)
			System.out.println(numSyllables.get(i));
		
		return totalNumSyllbles;		
	}
	
	
	
	public static List<String> getTokens(String pattern)
	{
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		
		Matcher m = tokSplitter.matcher(str);
		
		while (m.find()) {
			tokens.add(m.group());
		}
		
		return tokens;
	}
	
	public static void useSplit()
	{
		String s = "%one%%two%%%three%%%%";
		//String[] sArray = s.split("[a-z]+");
		String[] sArray = s.split("[one,two,three]");
		

//		System.out.println(getTokens("[a-z()0-9]+"));
//		
//		System.out.println(getTokens("[^, ]+"));
//		
//		System.out.println(getTokens("[a-z]+|[()0-9]+"));
		
//		getTokens("[one,two,three]");	
//		
//		System.out.println(" 111 => " + getTokens("[one,two,three]"));
		
//		System.out.println(" String length is -> " + s.length());
//		
//		for(int i = 0;i<s.toCharArray().length;i++)
//		{
//			System.out.println(" sttring has => " + s.charAt(i));
//		}
	
		
		for(String sa : sArray){
			System.out.println("sa => " + sa);
		}
		
//		System.out.println(" -1- => " + s.split("%+").length);
	
	
	
	}
	
	
	public static void getFleschScore()
		{
		    // TODO: Implement this method
			
			System.out.println(" In getFleschScore ");
			//double fleschScore = 206.835 - 1.015 * getNumWords()/getNumSentences() - 84.6 * (getNumSyllables()/getNumWords());
			
			int numWords = getNumWords();
			int numSentences = getNumSentences();
			int numSyllables = getNumSyllables();
			
			System.out.println(" - numWords - "+ numWords );
			System.out.println(" - numSentences -" + numSentences);
			System.out.println(" - numSyllables - " + numSyllables);
			
			
			double fleschScore = 206.835 - 1.015 * (numWords/numSentences) - 84.6 * (numSyllables/numWords);
	
			System.out.println(" - fleschScore - " + fleschScore);
		
	}
	
	
	protected int countSyllables(String word)
	{
		int num = 0;
		String pattern = "[aeiouyAEIOUY]+";
		
		Pattern tokSplitter = Pattern.compile(pattern);
		
		Matcher m = tokSplitter.matcher(word);
		String lastToken = "";
		
		while(m.find()){
			num++;
			lastToken = m.group();
		}
		
		if(num > 1 && word.charAt(word.length() - 1) == 'e' && lastToken.equals("e"))
		{
			num--;
		}
	    
		return num;
	}
	
	
}


/** Links a word to the next words in the list 
 * You should use this class in your implementation. */
class ListNode1
{
    // The word that is linking to the next words
	private String word;
	
	// The next words that could follow it
	private List<String> nextWords;
	
	ListNode1(String word)
	{
		this.word = word;
		nextWords = new LinkedList<String>();
	}
	
	public String getWord()
	{
		return word;
	}

	public void addNextWord(String nextWord)
	{
		nextWords.add(nextWord);
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
