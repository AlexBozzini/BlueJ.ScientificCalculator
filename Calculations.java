 

public class Calculations
{
    public static double multiply(double firstNum, double secondNum)
    {
        return firstNum * secondNum;
    }
    
    public static double divide(double firstNum, double secondNum)
    {
        return firstNum / secondNum;
    }
    
    public static double add(double firstNum, double secondNum)
    {
        return firstNum + secondNum;
    }
    
    public static double subtract(double firstNum, double secondNum)
    {
        return firstNum - secondNum;
    }
    
    public static double square(double firstNum)
    {
        return firstNum * firstNum;
    }
    
    public static double sqrt(double firstNum)
    {
        return Math.sqrt(firstNum);
    }
    
    public static double pow(double firstNum, double secondNum)
    {
        return Math.pow(firstNum, secondNum);
    }
    
    public static double inverse(double firstNum)
    {
        return 1 / firstNum;
    }
    
    public static double changeSign(double firstNum)
    {
        return -firstNum;
    }
}
