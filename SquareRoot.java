public class SquareRoot
{
  private int square;
  private int error;
  private int figures;
  
  public SquareRoot(int square, int error, int figures)
  {
    this.square = square;
    this.error = error;
    this.figures = figures;
  }
  
  public int findSquareRoot()
  {
    for(int x = 0; x < this.square;)
    {
      x = figures*(10)^2;
      x = (1/2)*(x + (square/x));
    }
    return this.square;
  }
  
  public static void main(String[] args)
  {
    SquareRoot bullshit = new SquareRoot(144, 2, 4);
    
    System.out.println(bullshit.findSquareRoot());
  }
}
  
  