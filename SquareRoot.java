import java.util.Scanner;

public class SquareRoot
{
  private static int number;
  private static int guess;
  private static int average;
  private static int newNumber;
  
  public int getNumber()
  {
    return number;
  }
  
  public int getGuess()
  {
    return guess;
  }
  
  public void findSquareRoot()
  {
    if(number == newNumber)
    {
      guess = (1/2)*(guess + (number/guess));
      newNumber = guess*guess;
    }
  }
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public static void main(String[] args)
  {
    SquareRoot bullshit = new SquareRoot();
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("What number would you like to find the square root of?");
    number = in.nextInt();
    
    System.out.println("Please enter a number that is a guess of the square root:");
    guess = in.nextInt();
    
    bullshit.getNumber();
    bullshit.getGuess();
    bullshit.findSquareRoot();
  }
}

  
  