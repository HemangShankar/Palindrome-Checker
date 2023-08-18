 public class PalindromeChecker{

   private String line;
   private String reverseLine;
   
  public PalindromeChecker(String s){
    //Convert every character to lower case
    line = s.toLowerCase();
    //Remove all non-alphanumeric characters
    line = line.replaceAll("[^0-9a-z]", "");
    reverseLine="";
  }

  public boolean isPalindrome(){
    //Loop through every character of the string to create a reverse string
    for(int i = line.length() - 1; i >=0; i--){
      reverseLine = reverseLine + line.charAt(i);
    }

    //Determine if string is a palindrome by comparing with reversed string
    if(line.equals(reverseLine)){
      return true;
    }
    else{
      return false;
    }
  }
}
