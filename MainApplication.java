import java.util.Scanner;
public class MainApplication {

    public static void main(String[] args) {
        Display.print("Input an expression: (type h for help)");
        Scanner input = new Scanner(System.in);
        
        String expression = input.nextLine();
        if (expression.equals("h")){
            Display.displayHelp();
            return;
        }
        
        Scanner expressionParser = new Scanner(expression);
        
        Double leftDouble = expressionParser.nextDouble();
        String operator = expressionParser.next();
        if (operator.equals("sq")){
            Display.print(Calculations.square(leftDouble) + "");
            return;
        } else if (operator.equals("sqrt")){
            Display.print(Calculations.sqrt(leftDouble) + "");
            return;
        } else if (operator.equals("inv")){
            Display.print(Calculations.inverse(leftDouble) + "");
            return;
        } else if (operator.equals("s+/-")){
            Display.print(Calculations.changeSign(leftDouble) + "");
            return;
        }
        Double rightDouble = expressionParser.nextDouble();
        
        if (operator.equals("+")){
            Display.print(Calculations.add(leftDouble, rightDouble) + "");
            return;
        } else if (operator.equals("-")){
            Display.print(Calculations.subtract(leftDouble, rightDouble) + "");
            return;
        } else if (operator.equals("/")){
            Display.print(Calculations.divide(leftDouble, rightDouble) + "");
            return;
        } else if (operator.equals("*")){
            Display.print(Calculations.multiply(leftDouble, rightDouble) + "");
            return;
        } else if (operator.equals("pow")){
            Display.print(Calculations.pow(leftDouble, rightDouble) + "");
            return;
        }
    }
    
    
    
    
    
}
