import java.util.Scanner; //Import the Scanner Class
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.IOException; 

class Main {
  public static void main(String[] args) throws IOException
  {
    //Creates a Scanner Object
    Scanner inFile = new Scanner(new File("PalindromeFile.txt"));	;
    
    System.out.println("\nWelcome to Palindrome checker\n");

    //Read every line from the file
    while(inFile.hasNextLine()){
      String Line = inFile.nextLine();
      PalindromeChecker myObj = new PalindromeChecker(Line);

      //Print the original string in the line and if it is a palindrome or not
      if(myObj.isPalindrome()){
        System.out.println(Line + " is a palindrome.");
      }
      else{
        System.out.println(Line + " is not a palindrome.");
      }
    }
  }
}

///////////////////////
//  Test Case Output //
///////////////////////
/*
Welcome to Palindrome checker

kayak is a palindrome.
RAceCar is a palindrome.
speaker is not a palindrome.
racecars is not a palindrome.
ma'am is a palindrome.
123454321 is a palindrome.
12645 is not a palindrome.
Madam, in Eden, I'm Adam. is a palindrome.
5/29/1925 is a palindrome.
2@34#432... is a palindrome.
3*2*3*2 is not a palindrome.
ABCabc is not a palindrome.
A man, a plan, a canal -- Panama! is a palindrome.
()$%#&^#*&()%_)$#%>>!? is a palindrome.
()(x) is a palindrome.
  ra * C e ! +cAR is a palindrome.
 1  4 9 2 is not a palindrome.
1 6 4 * + 61 is a palindrome.
Madam, in Eden, I’m Adam!! is a palindrome.
Igftfligbl.gbf is not a palindrome.
Dad is a palindrome.
q is a palindrome.
*/