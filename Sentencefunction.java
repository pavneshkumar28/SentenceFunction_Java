
import java.util.Scanner;

 public class Sentencefunction{
    public static void main(String args[]){  


    Scanner myObj = new Scanner(System.in);

//write the sentence line 
    System.out.println("The sentence you entered:");
    String sentence = myObj.nextLine();
    System.out.println("Sentence is: " + sentence);
    
//write the letter 
    System.out.println("The letter you entered");
    String Letter = myObj.nextLine();
    System.out.println("Letter is: " + Letter);
    

//logic for afterLetter print 

	if (sentence.indexOf(Letter)==-1){
	  System.out.println("Letter does not exist in the sentence");
	}
	else{
		String afterLetter = sentence.substring(sentence.indexOf(Letter)+1);

	  System.out.println("Result: " + afterLetter);
	  }


    }
}
