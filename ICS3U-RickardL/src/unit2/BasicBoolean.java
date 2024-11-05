package unit2;

/**
* Description: Basic boolean worksheet
* Date: November 4, 2024
* @author Liam Rickard
*/

public class BasicBoolean {
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either true or false
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out true because 5 is smaller than 10
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out false because 5 is not bigger than 10
    System.out.println("2: " + (firstNum > secondNum)); 

    //this prints out true because the third number is equal to the first number
    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
    //this prints out true because the first number is equal to the third number
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: Something is larger than another number
      * < means: Something is smaller than another number
      * <= means: Something is smaller or equal to another number
      * >= means: Something is larger or equal to another number
      * == means: A number is equal to 
      * != means: A number is not equal to
    */

  }
}