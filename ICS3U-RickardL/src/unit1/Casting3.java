package unit1;

/**
* Description: Third casting assignment
* Date: October 21, 2024
* @author Liam Rickard
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    //There is no space at the quotation mark in between the 3 and 4, meaning that the 4 and 5 will continue after without spaces. 

    //Demonstrate casting a double value to a String in this way
    
    System.out.println(6.05 + " string ");
    
    //Demonstrate casting a boolean value to a String in this way
    
    System.out.println(true + " string");
    
    //Demonstrate casting a char value to a String in this way

    System.out.println('s' + " string");

    System.out.println("Part 2");
    //In order to change a String into an integer, we need another set of code

    String strNum = "-5";
    int myNum = Integer.parseInt(strNum);

    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2" No
     * "23c" No
     * "2 3" No
     * "Lol23" No
     * "-5" Yes
    */
    //What can you say about how we can use the function, Integer.parseInt()?
    //It can insert whole number values into math equations without decimals or letters


    // What do you think the code to change a String to double would look like?
    
    String strNum2 = "4.3";
    double myNum2 = Double.parseDouble (strNum2);
    System.out.println(strNum2 + " x 2 = " + (myNum2 + myNum2));
    
    
    //Similarly, test out the code and write down what instructions
  
    System.out.println(myNum2);
    

    //When do you think it might be necessary to change a string value into an integer value/double value?
    //When you are calculating with numbers with a decimal place
    //When numbers are being used instead of words 
    
    // 
  }
}