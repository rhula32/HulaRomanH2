import java.util.Scanner; //Needed for user input

//Declare class name
public class SquareRoot
{
  //Declare the main class
  public static void main(String[] args)
  {
    //Constructor
    SquareRoot newNumber = new SquareRoot();
    
    //Create a scanner object to accept input from the user
    Scanner in = new Scanner(System.in);
    
    //Ask the user for the number they'd like to find the square root of
    System.out.println("What number would you like to find the square root of?");
    double desiredNumber = in.nextDouble();
    
    //Ask the user for the amount of error the want
    System.out.println("How much error will you accept?");
    double desiredError = in.nextDouble();
    
    //Declare & initiate the inital guess variable for the first condition of the algorithm
    double initialGuess = desiredNumber/2;
    
    //Print out the output, which should be the square root of the number entered.
    System.out.println("The square root is: " + findSquareRoot(desiredNumber, initialGuess, desiredError));
  }
  
  //Create the findSquareRoot method; This will find the square root of the number the user entered
  //It will also account for the error specified by the user
  //"Math.abs" is used to avoid having a negative number run through the if statement test
  //If a negative number were to run through, the recursive method would stop calling itself
  public static double findSquareRoot(double number, double guess, double error)
  { 
    if(Math.abs(number - guess*guess) <= error)
    {
      return guess;
    }
    else
    {
      guess = (0.5)*(guess + number/guess);
      return findSquareRoot(number, guess, error);
    }
  }
}

  