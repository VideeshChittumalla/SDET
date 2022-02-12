public class Assignment3NumberFormatException
{
  public static void main(String args[])
  {
    try
    {
      String str= "welcome";
      int y = Integer.parseInt(str);
    }
    catch(NumberFormatException e)
    {
      System.err.println("please handle the number format exception " + e);
    }
  }
}
