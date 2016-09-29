import java.util.Scanner; //Needed for user input

//Declare class name
public class SquareRoot
{
  private static double number;
  private static double guess;
  private static double error;
  
  //Declare the main class
  public static void main(String[] args)
  {
    //Constructor of new object in class
    SquareRoot bullshit = new SquareRoot();
    
    //Needed for user input
    Scanner in = new Scanner(System.in);
    
    //Ask the user for the number they'd like to find the square root of
    System.out.println("What number would you like to find the square root of?");
    double number = in.nextDouble();
    
    //Ask the user for the amount of error they'd prefer
    System.out.println("How much error will you accept?");
    double error = in.nextDouble();
    
    //CALLING ALL METHODS!
    bullshit.getNumber();
    bullshit.getError();
    System.out.println(bullshit.findSquareRoot());
    
  }
  
  //Create the findSquareRoot method; This will obtain the square root of the number the user entered, adjusted for error.
  public static double findSquareRoot()
  {
    guess = (0.5)*number;
    
    if((number - (guess*guess)) < error)
    {
      return guess;
    }
    else
    {
      guess = (0.5)*(guess + number/guess);
      return findSquareRoot();
    }
  }
  
  public static double getNumber()
  {
    return number;
  }
  
  public static double getError()
  {
    return error;
  }
}
    
  