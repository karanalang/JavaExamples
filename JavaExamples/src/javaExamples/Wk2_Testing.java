package javaExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wk2_Testing {

	private static int numWords;  // The number of words in the document
	private static int numSentences;  // The number of sentences in the document
	private static int numSyllables;  // The number of syllables in the document
	private static String text = "The Project Gutenberg EBook of War and Peace, by Leo Tolstoy 9 , ! hi there";
	
	
	public static void main(String[] args){
	
		System.out.println(" - In main, calling processText() - ");
		//processText();
		
		
		
	}
	
	
	private static boolean isWord(String tok)
	{
	    // Note: This is a fast way of checking whether a string is a word
	    // You probably don't want to change it.
		return !(tok.indexOf("!") >=0 || tok.indexOf(".") >=0 || tok.indexOf("?")>=0);
	}

	
	private static void processText()
	{
		// Provide this first line in the starter code.  
		// Words are only strings of letters.  No numbers.
		
		System.out.println("..In processText..");
		
		List<String> tokens = getTokens("[!?.]+|[a-zA-Z]+");
	
		numWords = 0;
		numSentences = 0;
		numSyllables = 0;
		
		int index = 0;
		
		for(String token : tokens){
			index += 1;
			if(isWord(token)){
				numWords += 1;
				numSyllables += countSyllables(token);
				if(index == tokens.size()){
					System.out.println(" Incrementing number of sentences .. called Once at the End");
					numSentences += 1;
				}	
			}else {
				System.out.println(" Incrementing number of sentences .. called every time we see !.?");
				numSentences += 1;
			}
			
		}
		
		System.out.println(" numWords => " + numWords);
		System.out.println(" numSentences => " + numSentences);
		System.out.println(" numSyllables => " + numSyllables);
		
		// TODO: Finish this method.  Remember the countSyllables method from 
		// Document.  That will come in handy here.
	}
	
	
	protected static List<String> getTokens(String pattern)
	{
		System.out.println("- In getTokens - ");

		System.out.println("- In getTokens - text  " + text);	
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		
		Matcher m = tokSplitter.matcher(text);
		
		
		while (m.find()) {
			tokens.add(m.group());
		}
		
		System.out.println("tokens is " + tokens);
		
		for(String tok : tokens){
			System.out.println("token is => " + tok);
		}
			
		
		return tokens;
	}
	
	
	protected static int countSyllables(String word)
	{
		// TODO: Implement this method so that you can call it from the 
	    // getNumSyllables method in BasicDocument (module 1) and 
	    // EfficientDocument (module 2).
		
		int num = 0;
		String pattern = "[aeiouyAEIOUY]+";
		
		Pattern tokSplitter = Pattern.compile(pattern);
		
		Matcher m = tokSplitter.matcher(word);
		
		//System.out.println("m is -> " + m);
		
		
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
