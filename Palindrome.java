package palindrome;
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] arg) {
//-----------Object Declaration----------------
    PalindromeTesterHamdan palin = new PalindromeTesterHamdan();
//-------Variable Declaration for Menu---------
    String response = ("");
    Scanner userInput = new Scanner(System.in);
//----------Start of menu (do/while)-----------
    do {
      System.out.println("===MENU ----Please select an option----- \n 1. Testing for Palindrome: \n 0.  Exit Program: \n --------------------------------------");
      response = userInput.nextLine();
      if (response.equals ("1"))
      {
      /*Calls on the displayResult() method when 
      * "1" is entered                        */  
        palin.displayResult();
      }
      else if (response.equals ("0"))
      {
      /*When "0" is entered a message is displayed
      * and the program ends because the while loop
      * becomes invalid                          */
        System.out.println("Good-Bye");  
      }
    }while(!response.equals ("0"));
  }//---------------end of main-----------------
}//-----------------end of class----------------

class PalindromeTesterHamdan {
  String wordEntered = "";
  public boolean palindromeTester() {   
    /* *******************************************
     * Asks the user to input a word
     * -if the word is 1 character long a response 
     * is given
     * -if the word is a palindrome, palindromeTester()
     * is made true, if not it is false
     * **************************************** */
    String wordReversed = "";
    Scanner userInput = new Scanner(System.in);
    //------------"do/while" statement----------
    do{
      System.out.println("Enter a word to test");
      wordEntered = userInput.nextLine();
      if(wordEntered.length() <= 1) {
        System.out.println("The word you've entered is not VALID");
      }
    } while(wordEntered.length() <= 1); 
    if(wordEntered.length() > 1) {
      /*-------------"for" statement--------------
       * Takes apart word entered and resassembles 
       * it in reverse                          */
      for(int a = wordEntered.length()-1; a >= 0; a--){
        wordReversed = wordReversed + wordEntered.charAt(a);
        //System.out.println("ReverseWord = " + wordReversed);
      }
    }
    if( wordEntered.equals(wordReversed))
    {
      return true;
    }
    else
      return false;
  }//-----end of palindromeTester() method------
  public void displayResult() {
    /* *******************************************
     * Calls on the palindromeTester() method and
     * then diplays an answer to the screen based
     * of it was true or false.
     * **************************************** */
    //-----------"if/else" statement-----------
    if(palindromeTester())
      System.out.println("RESULT: A PALINDROME \n");
    else
      System.out.println("RESULT: NOT A PALINDROME \n");
  }//-------end of displayResult() method-------
}//----end of class PalindromeTesterHamdan------

